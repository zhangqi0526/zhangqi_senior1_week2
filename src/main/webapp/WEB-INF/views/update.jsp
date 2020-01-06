<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="/css/index3.css">
<script type="text/javascript" src="/js/jquery-1.8.3.js"></script>
</head>
<body>
	<table>
		<tr>
			<td>keyWords</td>
			<td>
				<input type="text" name="keyWords" value="${list.keyWords }">
			</td>
		</tr>
		<tr>
			<td>companyName</td>
			<td>
				<input type="text" name="companyName" value="${list.companyName }">
			</td>
		</tr>
		<tr>
			<td>mainGoods</td>
			<td>
				<input type="text" name="mainGoods" value="${list.mainGoods }">
			</td>
		</tr>
		<tr>
			<td>address</td>
			<td>
				<input type="text" name="address" value="${list.address }">
			</td>
		</tr>
		<tr>
			<td>numPrice</td>
			<td>
				<input type="text" name="numPrice" value="${list.numPrice }">
			</td>
		</tr>
		<tr>
			<td>startDate</td>
			<td>
				<input type="text" name="startDate" value="${list.startDate }">
			</td>
		</tr>
		<tr>
			<td>checkDate</td>
			<td>
				<input type="text" name="checkDate" value="${list.checkDate }">
			</td>
		</tr>
		<tr>
			<td>status</td>
			<td>
				<input type="text" name="status" value="${list.status }">
			</td>
		</tr>
	</table>
</body>
</html>