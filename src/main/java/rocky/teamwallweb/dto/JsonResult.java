package rocky.teamwallweb.dto;

import java.util.List;

import rocky.teamwallweb.entity.Tag;

//封装所有ajax请求返回的json结果
public class JsonResult<T> {

	private boolean success;
	private T data;
	private String error;
	
	public JsonResult(boolean success, T data) {
		this.success = success;
		this.data = data;
	}

	public JsonResult(boolean success, String error) {
		this.success = success;
		this.error = error;
	}

	
	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}
}