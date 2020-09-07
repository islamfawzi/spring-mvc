<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<body>


	<form:form action="/student/confirm" method="POST" modelAttribute="student">  <!-- defined and added to the model in the controller -->

		First name: <form:input path="firstname" />   <!-- property of Student class, call student.getFirstname() -->
		<br><br> 
		
		Last name: <form:input path="lastname" />     <!-- property of Student class, call student.getLastname() -->
		<br><br>
		
		Country: 
		<form:select path="country">
			
			<form:options items="${student.countries}" /> <!-- call getCountries() -->
			
			<%-- 
			<form:option value="Saudi Arabia" label="Saudi Arabia" />
			<form:option value="Germany" label="Germany" />
			<form:option value="UK" label="UK" /> 
			--%>
			
		</form:select>
		<br><br>
		
		Favorite Language:
		<form:radiobuttons path="favoritelanguage" items="${student.favoritelanguages}" />
		
		<%-- 
		<form:radiobutton path="favoritelanguage" value="Java" />Java
		<form:radiobutton path="favoritelanguage" value="C#" />C#
		<form:radiobutton path="favoritelanguage" value="PHP" />PHP
		<form:radiobutton path="favoritelanguage" value="Ruby" />Ruby
		 --%>
		<br><br>
		
		
		Operating Systems:
		<form:checkboxes items="${student.opSys}" path="operationSystems"/>
		
		<%-- 
		<form:checkbox path="operationSystems" value="Windows"/>Windows
		<form:checkbox path="operationSystems" value="Linux"/>Linux
		<form:checkbox path="operationSystems" value="Mac"/>Mac 
		--%>
		<br><br>
		
		<input type="submit" value="Submit" />  <!-- when submit, call setter methods -->
		
		
		

	</form:form>

</body>
</html>