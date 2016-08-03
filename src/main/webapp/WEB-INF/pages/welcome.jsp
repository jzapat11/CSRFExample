<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>
<body>
	<h1>Example Form</h1>
	<p>Please send your name<p>
	<form:form action="register" method="POST">
		<input type="text" name="name" value="" />
		<br/>
		<input type="submit" value="Submit" />
	</form:form>
</body>
</html>