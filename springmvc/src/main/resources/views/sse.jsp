<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3c//DTD HTML 4.01 Transitional//EN" 
"http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta content="text/html;charset=UTF-8" http-equiv="Content-Type">
<title>Insert title here</title>

</head>
<body>
	<div id="msgFrompPush"></div>
	<input type="button" onclick="test();"/>
	<script type="text/javascript" src='assets/js/jquery.js'></script>
	<script type="text/javascript">
	function test (){
		

		if(!!window.EventSource){
			var source = new EventSource('push');
			s = "";
			source.addEventListener('message',function(e){
				s+=e.data+"<br/>";
				$("#msgFrompPush").html(s);
				source.close();
				
			});
			
			source.addEventListener('open',function(e){
				console.log("连接打开");
			});
			
			source.addEventListener('error',function(e){
				if(e.readyState == EventSource.CLOSED){
					console.log("连接关闭");
				}else{
					console.log(e.readyState);
				}
			},false);
		}else{
			console.log("你 的浏览器不支持SSE");
		}
	}
	</script>
</body>
</html>