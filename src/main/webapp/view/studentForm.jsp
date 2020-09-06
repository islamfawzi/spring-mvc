<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<body>


	<form:form action="/student/confirm" method="POST" modelAttribute="student">  <!-- defined and added to the model in the controller -->

		First name: <form:input path="firstname" />   <!-- property of Student class, call student.getFirstname() -->
		<br><br> 
		Last name: <form:input path="lastname" />     <!-- property of Student class, call student.getLastname() -->
		<br><br>
		<input type="submit" value="Submit" />  <!-- when submit, call setter methods -->

	</form:form>

</body>
</html>