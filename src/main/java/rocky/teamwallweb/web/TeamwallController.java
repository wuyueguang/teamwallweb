package rocky.teamwallweb.web;

import java.util.List;
import java.util.Vector;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import rocky.teamwallweb.entity.Tag;

@Controller
@RequestMapping("/tag")
public class TeamwallController {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@RequestMapping(value = "/{uid}/list", method = RequestMethod.GET)
	public String list(@PathVariable("uid")String uid, Model model){
		//调用RESTful API，获取列表
		List<Tag> list = new Vector<Tag>();
		Tag tag1 = new Tag(uid, "hello1");
		Tag tag2 = new Tag(uid, "world2");
		list.add(tag1);
		list.add(tag2);
		
		//装配model传递给jsp
		model.addAttribute("list", list);
		
		//根据spring-web.xml配置，返回jsp
		//taglist.jsp + model = ModelAndView
		return "list";//WEB-INF/jsp/"list".jsp
	}
}
