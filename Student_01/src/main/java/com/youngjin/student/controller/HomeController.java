package com.youngjin.student.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.youngjin.student.model.StudentVO;
import com.youngjin.student.service.StudentService;
import com.youngjin.student.service.StudentServiceImplV1;

@WebServlet("/")
public class HomeController extends HttpServlet{

	protected StudentService stService;
	
	public HomeController() {
		
		stService = new StudentServiceImplV1();
		
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		List<StudentVO> stList = stService.selectAll();
		
		req.setAttribute("STLIST", stList);
		
		RequestController.reqController(req, resp, "home");
		
	}

	
	
}
