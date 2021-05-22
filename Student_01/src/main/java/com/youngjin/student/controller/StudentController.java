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

@WebServlet("/student/*")
public class StudentController extends HttpServlet{
	
	protected StudentService stService;
	
	public StudentController() {
		
		stService = new StudentServiceImplV1();
		
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String path = req.getPathInfo();
		
		if(path.equals("/info")) {
			
			String strSeq = req.getParameter("st_seq");
			Long st_seq = Long.valueOf(strSeq);

			
			StudentVO stVO = stService.findById(st_seq);
			
			req.setAttribute("ST", stVO);
			
			RequestController.reqController(req, resp, "info");
		}
		
		
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String path = req.getPathInfo();
		
		
	}

	
	
}
