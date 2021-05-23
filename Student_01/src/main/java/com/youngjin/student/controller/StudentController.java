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
public class StudentController extends HttpServlet {

	protected StudentService stService;

	public StudentController() {

		stService = new StudentServiceImplV1();

	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String path = req.getPathInfo();

		if (path.equals("/info")) {

			String strSeq = req.getParameter("st_seq");
			Long st_seq = Long.valueOf(strSeq);

			StudentVO stVO = stService.findById(st_seq);

			req.setAttribute("ST", stVO);

			RequestController.reqController(req, resp, "info");

		} else if (path.equals("/insert")) {

			RequestController.reqController(req, resp, "insert");
			
		}

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String path = req.getPathInfo();

		if (path.equals("/insert")) {
			
			StudentVO stVO = new StudentVO();
			
			String strSeq = req.getParameter("st_seq");
			Long st_seq = Long.valueOf(strSeq);
			String strGrade = req.getParameter("st_grade");
			int st_grade = Integer.valueOf(strGrade);
			String st_addr = req.getParameter("st_addr");
			String st_tel = req.getParameter("st_tel");
			String st_name = req.getParameter("st_name");
			String st_dept = req.getParameter("st_dept");
			
			stVO.setSt_addr(st_addr);
			stVO.setSt_dept(st_dept);
			stVO.setSt_grade(st_grade);
			stVO.setSt_name(st_name);
			stVO.setSt_seq(st_seq);
			stVO.setSt_tel(st_tel);
			
			stService.insert(stVO);
			
			resp.sendRedirect("/");

			
			RequestController.reqController(req, resp, "insert");
			
		}

	}

}
