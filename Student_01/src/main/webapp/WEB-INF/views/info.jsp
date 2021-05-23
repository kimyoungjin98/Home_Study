<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set value="${pageContext.request.contextPath}" var="rootPath"/> 
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<script >
document.addEventListener("DOMContentLoaded", function(ev){
	
	document
	.querySelector("div.view_btn")
	.addEventListener("click", function(ev){

		let name = ev.target.className;
		
		if(name == "btn_home"){
			
			document
			.location
			.href = "${rootPath}";
			
		} else if (name == "btn_update"){
			
			
		} else if (name == "btn_delete"){
				
		}
	})
	
})


</script>
<style>

table {
	border: 2px solid gray;
	border-collapse: collapse;
	text-align: center;
	width: 50%;
	margin: auto;
	font-size: 30px;
}

table th {
	background: linear-gradient(to right, #E8CBC0, #636FA4);
	color:white;
}

table tr{
	border:1px solid lightgray;
}

div.view_btn {
		width:40%;
		margin-left:57%;
}

div.view_btn button{
	font-size:20px;
	margin:5px;
	background-color: White;
	padding:8px;
	text-align: right;
	
}

div.view_btn button:hover{
	background-color:#E8CBC0;
	color:white;
	cursor:pointer;
}



</style>
<body>
	<%@ include file="/WEB-INF/views/main.jsp" %>
	
	<table>

		<tr>
			<th>��ȣ</th><td>${ST.st_seq}</td>
		</tr>
		<tr>
			<th>�г�</th><td>${ST.st_grade}</td>
		</tr>	
		<tr>
			<th>�л��̸�</th><td>${ST.st_name}</td>
		</tr>	
		<tr>
			<th>�а�</th><td>${ST.st_dept}</td>
		</tr>	
		<tr>
			<th>�ּ�</th><td>${ST.st_addr}</td>
		</tr>	
		<tr>
			<th>��ȭ��ȣ</th><td>${ST.st_tel}</td>
		</tr>	
			
			</table>
			
			<div class="view_btn">
				<button class="btn_home">ó������</button>
				<button class="btn_update">�����ϱ�</button>
				<button class="btn_delete">�����ϱ�</button>
			</div>
</body>
</html>