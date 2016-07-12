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
import org.springframework.web.client.RestTemplate;

import com.alibaba.fastjson.JSON;

import rocky.teamwallweb.dto.JsonResult;
import rocky.teamwallweb.dto.TagDTO;
import rocky.teamwallweb.entity.Tag;

@Controller
@RequestMapping("/tag")
public class TeamwallController {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@RequestMapping(value = "/{uid}/list", method = RequestMethod.GET)
	public String list(@PathVariable("uid")String uid, Model model){
		//调用RESTful API，获取列表
		String url = "http://127.0.0.1:8080/teamwall/tag/"+uid+"/taglist";
		RestTemplate restTemplate = new RestTemplate();
		
		JsonResult<List<Tag>> dto = restTemplate.getForObject(url, JsonResult.class);
		List<Tag> list = dto.getData();
		
		//装配model传递给jsp
		model.addAttribute("list", list);
		
		//根据spring-web.xml配置，返回jsp
		//taglist.jsp + model = ModelAndView
		return "list";//WEB-INF/jsp/"list".jsp
	}
}
