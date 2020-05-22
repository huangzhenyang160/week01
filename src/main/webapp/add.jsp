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
	
	<script type="text/javascript">
		$(function(){
			var str="";
			$.post("cxtea",function(da){
				for(var i in da){
					str+="<option value='"++da[i].cid"'>"+da[i].cname+"</option>";
				}
				$("#cc").append(str);
			})
		})
	</script>
</head>
<body>
	<form action="add" method="post">
		宿舍号：<input type="text" name="sid"><br>
		老  师：<select name="cid" id="cc">
			<option value="">请选择老师</option>
			
		</select><br>
		状  态：<select name="status">
			<option value="">请选择状态</option>
			<option value="1">已拥有</option>
			<option value="0">未拥有</option>
		</select><br>
		<input type="submit" value="添加">
	</form>
</body>

</html>