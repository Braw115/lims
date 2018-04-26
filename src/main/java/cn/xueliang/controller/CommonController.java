package cn.xueliang.controller;

import java.io.IOException;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import cn.xueliang.utils.CaptchaUtil;

@Controller
public class CommonController {
	/**
	 * ��ʾ��ҳ
	 * @return
	 */
	@RequestMapping("/s_index")
	@ResponseBody
	public ModelAndView showSindex(){
		ModelAndView model = new ModelAndView();
		model.setViewName("s_index");
		return model;
	}
	
	@RequestMapping("/t_index")
	@ResponseBody
	public ModelAndView showTindex(){
		ModelAndView model = new ModelAndView();
		model.setViewName("t_index");
		return model;
	}
	/**
	 * ��¼ҳ��
	 * @return
	 */
	@RequestMapping("/login")
		@ResponseBody
		public ModelAndView doLogin(){
			ModelAndView model = new ModelAndView();
			model.setViewName("login");
			return model;
	}
	/**
	 * ������֤��ͼƬ��Controller
	 * @param request
	 * @param response
	 * @throws IOException
	 */
	@RequestMapping("/createCode")
	public void createCode(HttpServletRequest request,HttpServletResponse response) throws IOException{  
	     //֪ͨ�������Ҫ����  
	     response.setHeader("Expires","-1");//���ƻ����ʧЧ����  
	     response.setHeader("Cache-Control","no-cache");//�������������ȷ�Ϸ��ص���Ӧ�Ƿ񱻸��ģ�Ȼ�����ʹ�ø���Ӧ�����������ͬһ����ַ������  
	     response.setHeader("Pragma","-1");  
	     CaptchaUtil util=CaptchaUtil.Instance();  
	     // ����֤�����뵽session�У�������֤    
	     String code=util.getString();  
	     request.getSession().setAttribute("code",code);  
	    // �����webҳ��    
	     ImageIO.write(util.getImage(), "jpg", response.getOutputStream());  
	 }
	
}
