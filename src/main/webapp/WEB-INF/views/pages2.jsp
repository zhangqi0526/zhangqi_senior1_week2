<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<input type="button" onclick="goPage(${pageInfo.navigateFirstPage})"
	value="首页">
<input type="button"
	onclick="goPage(${pageInfo.prePage==0?1:pageInfo.prePage })" value="上一页">
<input type="button"
	onclick="goPage(${pageInfo.nextPage ==0?pageInfo.pages:pageInfo.nextPage})"
	value="下一页">
<input type="button" onclick="goPage(${pageInfo.navigateLastPage})"
	value="尾页">
第${pageInfo.pageNum }/${pageInfo.pages }页     &nbsp;  共${pageInfo.total }条
