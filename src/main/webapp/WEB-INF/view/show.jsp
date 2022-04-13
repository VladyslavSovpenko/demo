<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isELIgnored="false" %>

<!DOCTYPE HTML>
<html>
<head>
    <meta charset="UTF-8" />
    <title>List of residents</title>
</head>

<body>
<h2>All Residents!</h2>

<br><br>

<table>

    <tr>
        <th>Id</th>
        <th>Name</th>
        <th>Surname</th>
        <th>Enabled</th>
        <th>Authority</th>
        <th>Buttons</th>
    </tr>

    <c:forEach var="res" items="${residents}">

        <tr>
            <td>${res.id}</td>
            <td>${res.name}</td>
            <td>${res.surname}</td>
            <td>${res.enabled}</td>
            <td>${res.authorityList}</td>
            <td>
                <div class="btn-toolbar" role="toolbar" aria-label="Toolbar with button groups">
                    <div class="btn-group mr-2" role="group" aria-label="First group">
                        <a href="/edit/${res.id} "type="button" class="btn btn-warning">Edit</a>
                        <a href="/delete/${res.id}"type="button" class="btn btn-danger">Remove</a>
                    </div>
                </div>

            </td>
        </tr>

    </c:forEach>

</table>

<a href="/new">Add new residents</a>

<div class="row">
        <div class="btn-toolbar" role="toolbar" aria-label="Toolbar with button groups">
            <div class="btn-group me-2" role="group" aria-label="Second group">
            <a href="/new" type="button" class="btn btn-primary">New record</a>
        </div>
</div>



</body>

</html>
