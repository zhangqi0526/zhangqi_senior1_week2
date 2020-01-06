<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="/css/index3.css">
<script type="text/javascript" src="/js/jquery-1.8.3.js"></script>
<script type="text/javascript" src="/My97DatePicker/WdatePicker.js"></script>
<script type="text/javascript">
	function goPage(page){
		location="/list?page="+page;
	}
	//回显
	function xiangqing(id){
		location="/update?id="+id;
	}
</script>
</head>
<body>
<form action="/list">
	关键字：<input type="text" name="keyWords" value="${year.keyWords }">
	描述：<input type="text" name="description" value="${year.description }">
	公司名称：<input type="text" name="companyName" value="${year.companyName }"></br>
	注册资本：<input type="text" name="numPrice" value="${year.numPrice }">
	成立时间：<input type="text" name="startDate" value="${year.startDate }" onclick="WdatePicker()">
	年检日期：<input type="text" name="checkDate" value="${year.checkDate }" onclick="WdatePicker()">
	年检状态：<input type="text" name="status" value="${year.status }">
	<button>查询</button>
</form>
	<table>
		<tr>
			<td>编号</td>
			<td>keywords</td>
			<td>description</td>
			<td>公司名称</td>
			<td>主营产品</td>
			<td>地址</td>
			<td>注册资本</td>
			<td>成立时间</td>
			<td>年检日期</td>
			<td>年检状态</td>
			<td>操作</td>
		</tr>
		<c:forEach items="${pageInfo.list }" var="y">
			<tr>
				<td>${y.id }</td>
				<td>${y.keyWords }</td>
				<td>${y.description }</td>
				<td>${y.companyName }</td>
				<td>${y.mainGoods }</td>
				<td>${y.address }</td>
				<td>${y.numPrice }</td>
				<td>${y.startDate }</td>
				<td>${y.checkDate }</td>
				<td>${y.status }</td>
				<td>
					<button onclick="xiangqing(${y.id})">编辑</button>
				</td>
			</tr>
		</c:forEach>
		<tr>
			<td colspan="1000">
				<jsp:include page="pages2.jsp"></jsp:include>
			</td>
		</tr>
	</table>
</body>
</html>