<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isELIgnored="false" %>

<!DOCTYPE html>
<html lang="en">
<head>

    <title>View resident`s page</title>

</head>

<body>


<h2>Please enter/ your name</h2>

<br>
<br>

<form:form method="POST" action="saveResident" modelAttribute = "resident">

<form:hidden path="id"/>

Name <form:input path ="name"/>
<form:errors path="name"/>

<br><br>
Surname <form:input path = "surname"/>
<form:errors path="surname"/>

<br><br>
Authority <form:input path = "authorityList"/>
<form:errors path="authorityList"/>

<br><br>
<input type="submit" value="Add/Update">
</form:form>


</body>
</html>