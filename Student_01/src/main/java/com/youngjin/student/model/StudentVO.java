package com.youngjin.student.model;

import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class StudentVO {

	private Long st_seq;
	private String st_name;	
	private int st_grade;//	INT
	private String st_tel;//	VARCHAR(20)
	private String st_addr;//	VARCHAR(125)
	private String st_dept;//	VARCHAR(125)

	
}
