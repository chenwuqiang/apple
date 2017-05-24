package com.cwq.apple.controller;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cwq.apple.model.Student;
import com.cwq.apple.respositroy.StudentRespositroy;

@Controller
public class LoginController {
	@Resource StudentRespositroy studentRepository;
    @RequestMapping("/")
    public String home(){
    	return "index";
    }
    /*@RequestMapping(value="/web")
    public String test(){
    	return "apple";
    }*/
    @RequestMapping(value="/testdb")
    public String testDataBase(Map<String, Object> model){
        Integer id = (int) 1;
        Student stu = studentRepository.findStudentById(id);
        model.put("student", stu);
        return "testDataBase";
    }
}
