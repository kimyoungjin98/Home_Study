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
				<label>��ȣ</label> 
				<input name="st_seq"  value="${ST.st_seq}">
			</div>

			<div>
				<label>�г�</label> 
				<input name="st_grade" type="number" value="${ST.st_grade}">
			</div>

			<div>
				<label>�̸�</label> 
				<input name="st_name" type="text" value="${ST.st_name}">
			</div>

			<div>
				<label>�а�</label> 
				<input name="st_dept" type="text" value="${ST.st_dept}">
			</div>

			<div>
				<label>�ּ�</label> 
				<input name="st_addr" type="text" value="${ST.st_addr}">
			</div>
			
			<div>
				<label>��ȭ��ȣ</label> 
				 <input name="st_tel" type="tel" value="${ST.st_tel}">
			</div>
			
			<div>
			<label></label>
			<button class="btn_save" type="button">����</button>
			<button type="reset">�ٽ��ۼ�</button>
			<button class="btn_home" type="button">ó������</button>
			</div>
			
		</form>
</body>
</html>