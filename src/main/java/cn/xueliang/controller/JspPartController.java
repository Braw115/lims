package cn.xueliang.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JspPartController {

	// ����session�д��ѧ����Ϣ����jspƬ��
	@RequestMapping("/showStuInfo")
	public String showStuInfo(HttpServletRequest request) {

		return "showStuInfo";
	}

	// ����ѧ�������jspƬ��
	@RequestMapping("/stuManage")
	public String stuManage() {
		return "stuManage";
	}

	// ����ʵ���ҹ����jspƬ��
	@RequestMapping("/labManage")
	public String labManage() {
		return "labManage";
	}

	// �����豸�����jspƬ��
	@RequestMapping("/devManage")
	public String devManage() {
		return "devManage";
	}

	// ���غĲĹ����jspƬ��
	@RequestMapping("/matManage")
	public String matManage() {
		return "matManage";
	}

	// ���ض�ý��γ̹���jspƬ��
	@RequestMapping("/technologyCourse")
	public String technologyCourse() {
		return "technologyCourse";
	}

	// ��������γ̹���jspƬ��
	@RequestMapping("/physicsCourse")
	public String physicsCourse() {
		return "physicsCourse";
	}

	// ���ػ�ѧ�γ̹���jspƬ��
	@RequestMapping("/chemistryCourse")
	public String chemistryCourse() {
		return "chemistryCourse";
	}

	// ��������γ̹���jspƬ��
	@RequestMapping("/biologyCourse")
	public String biologyCourse() {
		return "biologyCourse";
	}

	// ����ҽѧ�γ̹���jspƬ��
	@RequestMapping("/medicineCourse")
	public String medicineCourse() {
		return "medicineCourse";
	}

	// �������ʵ������ϢjspƬ��
	@RequestMapping("/hireLabInfo")
	public String hireLabInfo() {
		return "hireLabInfo";
	}

	// ��������豸��ϢjspƬ��
	@RequestMapping("/hireDevInfo")
	public String hireDevInfo() {
		return "hireDevInfo";
	}

	// �������Ĳ���ϢjspƬ��
	@RequestMapping("/hireMatInfo")
	public String hireMatInfo() {
		return "hireMatInfo";
	}
	//���ط�������jspƬ��
	@RequestMapping("/notice")
	public String notice() {
		return "notice";
	}
	
}
