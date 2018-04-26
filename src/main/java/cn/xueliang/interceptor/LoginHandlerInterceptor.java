package cn.xueliang.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;



public class LoginHandlerInterceptor extends HandlerInterceptorAdapter{
	private static final String LOGIN_URL = "/login"; 
	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		Object obj = request.getSession().getAttribute("user");
		
		if(obj!=null){//ÒÑµÇÂ¼×´Ì¬
			
			return true;
		}else{//Î´µÇÂ¼
			//response.sendRedirect(LOGIN_URL);
			return true;
		}
		
	}
}
