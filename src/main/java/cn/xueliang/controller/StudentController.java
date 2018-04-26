package cn.xueliang.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.xueliang.pojo.Student;
import cn.xueliang.service.StudentService;
import cn.xueliang.utils.EasyUIDataGridResult;
import cn.xueliang.utils.Result;

@Controller
@RequestMapping("/student")
public class StudentController {
	@Autowired
	private StudentService studentService;

	//����sid��ѯstudent
	@RequestMapping("/{sid}")
	@ResponseBody
	public Student findStudent(@PathVariable("sid") String sid) {
		Student student = studentService.SelectStudentBySid(sid);
		return student;
	}

	//���ѧ���û�
	@RequestMapping("/addStu")
	@ResponseBody
	public Result addStudent(Student student){
		try{
			studentService.addStudent(student);

		}catch(Exception e){
			return new Result("a","���ʧ�ܣ�");

		}
		return new Result("1","��ӳɹ���");
	}

	//ɾ��ѧ���û�
	@RequestMapping("/delStu")
	public int delStudent(String sid){
		int result = studentService.delStudent(sid);
		return result;
	}

	//�޸�ѧ���û���Ϣ
	@RequestMapping("/updateStu")
	public int updateStudent(Student student){
		int result = studentService.updateStudent(student);
		return result;
	}
	//��ҳ��ѯ����ѧ��
	@RequestMapping("/list")
	@ResponseBody
	public EasyUIDataGridResult getUserList(Integer page,Integer rows){
		EasyUIDataGridResult result = studentService.getStudentList(page, rows);
		return result;

	}
}
