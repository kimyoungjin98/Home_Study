<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set value="${pageContext.request.contextPath}" var="rootPath"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%@ include file="/WEB-INF/views/main.jsp" %>
<form method="post">
	<div>
				<label>번호</label> 
				<input name="st_seq"  value="${ST.st_seq}">
			</div>

			<div>
				<label>학년</label> 
				<input name="st_grade" type="number" value="${ST.st_grade}">
			</div>

			<div>
				<label>이름</label> 
				<input name="st_name" type="text" value="${ST.st_name}">
			</div>

			<div>
				<label>학과</label> 
				<input name="st_dept" type="text" value="${ST.st_dept}">
			</div>

			<div>
				<label>주소</label> 
				<input name="st_addr" type="text" value="${ST.st_addr}">
			</div>
			
			<div>
				<label>전화번호</label> 
				 <input name="st_tel" type="tel" value="${ST.st_tel}">
			</div>
			
			<div>
			<label></label>
			<button class="btn_save" type="button">저장</button>
			<button type="reset">다시작성</button>
			<button class="btn_home" type="button">처음으로</button>
			</div>
			
		</form>
</body>
</html>