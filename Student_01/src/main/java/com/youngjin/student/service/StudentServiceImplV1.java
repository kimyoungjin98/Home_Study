package com.youngjin.student.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.youngjin.student.config.MysqlConnect;
import com.youngjin.student.model.StudentVO;

public class StudentServiceImplV1 implements StudentService {
	
	protected Connection dbConn;
	
	public StudentServiceImplV1() {
		
		dbConn = MysqlConnect.getDBC();
		
	}

	protected List<StudentVO> select(PreparedStatement pStr) throws SQLException {

		ResultSet rSet = pStr.executeQuery();

		List<StudentVO> stList = new ArrayList<StudentVO>();

		while (rSet.next()) {
			StudentVO stVO = new StudentVO();
			stVO.setSt_addr(rSet.getString("st_addr"));
			stVO.setSt_dept(rSet.getString("st_dept"));
			stVO.setSt_grade(rSet.getInt("st_grade"));
			stVO.setSt_name(rSet.getString("st_name"));
			stVO.setSt_seq(rSet.getLong("st_seq"));
			stVO.setSt_tel(rSet.getString("st_tel"));
			stList.add(stVO);
		}

		return stList;
	}

	@Override
	public List<StudentVO> selectAll() {

		String sql = " SELECT * FROM tbl_student ";

		PreparedStatement pStr = null;
		try {
			pStr = dbConn.prepareStatement(sql);
			List<StudentVO> stList = this.select(pStr);
			pStr.close();
			
			return stList;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}

	@Override
	public StudentVO findById(Long st_seq) {
		// TODO Auto-generated method stub
		
		String sql = " SELECT * FROM tbl_student ";
		sql += " WHERE st_seq = ? ";
		
		PreparedStatement pStr = null;
		try {
			pStr = dbConn.prepareStatement(sql);
			pStr.setLong(1, st_seq);

			
			List<StudentVO> stList = this.select(pStr);
			
			if(stList != null && stList.size() >0) {
				System.out.println(stList.toString());
				return stList.get(0);
			}
			pStr.close();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

}
