<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="<%=request.getContextPath()%>/css/css.css" rel="stylesheet">
<script type="text/javascript" src="<%=request.getContextPath()%>/js/jquery-1.8.2.min.js"></script>
</head>
<body>
	<form action="#" method="post">
		宿舍号：<input type="text" readonly="readonly" name="infos.sid"><br>
		老  师：<select name="cid" id="cc">
			<option value="">请选择老师</option>
			
		</select><br>
		状  态：<select name="infos.status">
			<option value="">请选择状态</option>
			<option value="1">已拥有</option>
			<option value="0">未拥有</option>
		</select><br>
		<input type="submit" value="收被">
	</form>
</body>
</html>