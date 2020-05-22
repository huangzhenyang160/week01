<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="<%=request.getContextPath()%>/css/css.css" rel="stylesheet">
<script type="text/javascript"
	src="<%=request.getContextPath()%>/js/jquery-1.8.2.min.js"></script>
</head>
<body>
	<form action="queryAll" method="post">
		<select name="cname">
			<option>请选择老师</option>
			<c:forEach items="${cc}" var="x">
				<option value="${x.cid}">${x.cname}</option>
			</c:forEach>
		</select>
		<select name="status">
			<option value="">请选择状态</option>
			<option value="1">已拥有</option>
			<option value="0">未拥有</option>
		</select>
		宿舍号：<input type="text" name="sid">
		<input type="submit" value="查询">
	</form>
	<a href="add.jsp"><input type="button" value="添加"></a>
	<table>
		<tr>
			<th>I D</th>
			<th>宿舍号</th>
			<th>负责老师</th>
			<th>凉被时间</th>
			<th>状态</th>
			<th>操作</th>
		</tr>
		<c:forEach items="${page.list}" var="u">
			<tr>
				<td>${u.id}</td>
				<td>${u.sid}</td>
				<td>${u.cname}</td>
				<td>${u.uptime}</td>
				<td>${u.status==1?"已拥有":"未拥有"}</td>
				<td>
					<input type="button" value="查看">
					<a href="update?id=i.id"></a><input type="button" value="收被">
				</td>
			</tr>
		</c:forEach>
		<tr>
		<td colspan="10">
		当前${page.pageNum}页,总${page.pages}页
			<a href="?pageNum=${pageNum}">首页</a>
			<a href="?pageNum=${page.pageNum-1<1?page.pageNum:page.pageNum-1}">上一页</a>
			<a href="?pageNum=${page.pageNum+1>page.pages?page.pageNum:page.pageNum+1}">下一页</a>
			<a href="?pageNum=${page.pages}">尾页</a>
		</td>
		</tr>
	</table>

</body>
</html>