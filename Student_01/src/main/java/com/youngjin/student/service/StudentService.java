package com.youngjin.student.service;

import java.util.List;

import com.youngjin.student.model.StudentVO;

public interface StudentService {

	public List<StudentVO> selectAll();
	
	public StudentVO findById(Long st_seq);
	
	public Integer insert(StudentVO stVO);
	
	public Integer update(StudentVO stVO);
	
	public Integer delete(Long st_seq);
	
}
