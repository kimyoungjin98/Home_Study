<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set value="${pageContext.request.contextPath}" var="rootPath" />
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<script>

document
.addEventListener("DOMContentLoaded", function(ev){
	
	document
	.querySelector("table#stList")
	.addEventListener("click", function(ev){
	
		let tag_name = ev.target.tagName;
		
		if(tag_name == "TD"){
			let st_seq = ev
			.target
			.closest("TR")
			.dataset.seq
			
		document.location.href
		="${rootPath}/student/info?st_seq=" + st_seq
		}
		
		})
		
		document
		.querySelector("button")
		.addEventListener("click",function(ev){
		
			let name = ev.target.tagName;
			
			if(name == "BUTTON"){
				
				document
				.location
				.href = "${rootPath}/student/insert"
				
			}
		
	})
		
})

	
</script>
<style>
table#stList {
	border: 2px solid gray;
	border-collapse: collapse;
	color: linear-gradient(to bottom, gray, white);
	text-align: center;
	width: 50%;
	margin: auto;
}

table#stList th {
	background-color: #E8CBC0;
}

table#stList tr:hover {
	cursor: pointer;
	background-color: #E8CBC0;
}


button {
	font-size: 15px;
	margin-left:25%;
	padding:8px;
	background-color:#E8CBC0; 
}

button:hover{
	cursor:pointer;
	background-color:#636FA4;
}
</style>
<body>

	<button>학생정보 입력</button>

	<table id="stList">

		<tr>
			<%--  <th>번호</th> --%>
			<th>번호</th>
			<th>학년</th>
			<th>학생이름</th>
			<th>학과</th>
			<th>주소</th>
			<th>전화번호</th>
		</tr>
		<c:forEach items="${STLIST}" var="ST">
			<tr data-seq="${ST.st_seq}">
				<td>${ST.st_seq}</td>
				<td>${ST.st_grade}</td>
				<td>${ST.st_name}</td>
				<td>${ST.st_dept}</td>
				<td>${ST.st_addr}</td>
				<td>${ST.st_tel}</td>

			</tr>
		</c:forEach>

	</table>

</body>
</html>