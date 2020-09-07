<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>

<body>

<h3>Student Information</h3>

<p>First name: ${student.firstname}</p>  <!-- call getFirstname() -->

<p>Last name: ${student.lastname}</p>    <!-- call getLastname() -->

<p>Country: ${student.country}</p>		<!-- call getCountry() -->

<p>Favorite Language: ${student.favoritelanguage} <!-- call getFavoriteLanguage() -->

<p>Operating Systems:</p>
<ul>
	<c:forEach var="os" items="${student.operationSystems}">
		<li> ${os} </li>
	</c:forEach>
</ul>

</body>

</html>