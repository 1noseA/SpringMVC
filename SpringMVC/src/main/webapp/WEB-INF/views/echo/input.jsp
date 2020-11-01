<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Input</title>
</head>
<body>
	<h2>入力画面</h2>
	<form:form action="${submitUrl}" modelAttribute="echoForm">
		<div>テキストを入力してください：</div>
		<div>
			<form:input path="text" />
			<%-- <form:errors path="text" /> --%>
		</div>
		<div>
			<form:button>送信</form:button>
		</div>
	</form:form>
</body>
</html>