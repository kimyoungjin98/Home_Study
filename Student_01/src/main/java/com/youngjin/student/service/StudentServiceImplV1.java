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

	@Override
	public Integer insert(StudentVO stVO) {
		// TODO Auto-generated method stub
		
		String sql = " INSERT INTO tbl_student( ";
		sql +=  "	st_name, "
				+ "st_grade, "
				+ "	st_tel,"
				+ "	st_addr,"
				+ "	st_dept)";
		sql += " VALUES(?,?,?,?,?) ";
		
		PreparedStatement pStr = null;
		try {
			pStr = dbConn.prepareStatement(sql);
			pStr.setString(1, stVO.getSt_name());
			pStr.setInt(2, stVO.getSt_grade());
			pStr.setString(3, stVO.getSt_tel());
			pStr.setString(4, stVO.getSt_addr());
			pStr.setString(5, stVO.getSt_dept());
			
			return pStr.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return null;
	}

	@Override
	public Integer update(StudentVO stVO) {
		// TODO Auto-generated method stub
		
		String sql = " UPDATE tbl_student SET ";
		sql += " st_name = ?,";
		sql += " st_grade = ?,";
		sql += " st_tel = ?,";
		sql += " st_addr = ?,";
		sql += " st_dept = ?,";
		sql += " WHERE gb_seq = ?";
		
		PreparedStatement pStr = null;
		try {
			pStr = dbConn.prepareStatement(sql);
			pStr.setString(1, stVO.getSt_name());
			pStr.setInt(2, stVO.getSt_grade());
			pStr.setString(3, stVO.getSt_tel());
			pStr.setString(4, stVO.getSt_addr());
			pStr.setString(5, stVO.getSt_dept());
			
			return pStr.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public Integer delete(Long st_seq) {
		// TODO Auto-generated method stub
		
		String sql = " DELETE tbl_student ";
		sql += " WHERE st_seq = ? ";
		
		PreparedStatement pStr = null;
		try {
			pStr = dbConn.prepareStatement(sql);
			pStr.setLong(1, st_seq);
			return pStr.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

}

