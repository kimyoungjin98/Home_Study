<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<style>
table {
	border: 2px solid gray;
	border-collapse: collapse;
	color: linear-gradient(to bottom, gray, white);
	text-align: center;
	width: 50%;
	margin: auto;
}

table th {
	background-color: lightgray;
}

table tr:hover {
	cursor: pointer;
	background-color: lightgray;
}
</style>
<body>
	<%@ include file="/WEB-INF/views/main.jsp" %>
	
	<table>

		<tr>
			<%--  <th>��ȣ</th> --%>
			<th>��ȣ</th>
			<th>�г�</th>
			<th>�л��̸�</th>
			<th>�а�</th>
			<th>�ּ�</th>
			<th>��ȭ��ȣ</th>
		</tr>
			<tr data-seq="${ST.st_seq}">
				<td>${ST.st_seq}</td>
				<td>${ST.st_grade}</td>
				<td>${ST.st_name}</td>
				<td>${ST.st_dept}</td>
				<td>${ST.st_addr}</td>
				<td>${ST.st_tel}</td>

			</tr>

</body>
</html>