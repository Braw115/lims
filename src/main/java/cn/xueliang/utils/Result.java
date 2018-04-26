package cn.xueliang.utils;

public class Result {
	private String flag;
	private String message;
	
	public Result(String flag, String message) {
		super();
		this.flag = flag;
		this.message = message;
	}
	public String getFlag() {
		return flag;
	}
	public void setFlag(String flag) {
		this.flag = flag;
	}
	public Result() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
}
