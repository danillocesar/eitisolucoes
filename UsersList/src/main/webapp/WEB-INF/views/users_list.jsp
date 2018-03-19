<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<table class="table">
	<thead class="thead-dark">
    	<tr>
	      <th scope="col">#</th>
	      <th scope="col">Username</th>
	      <th scope="col">Name</th>
	      <th scope="col">Surname</th>
	      <th scope="col">Email</th>
	      <th scope="col">Phone</th>
	      <th scope="col">Register Date</th>
	      <th scope="col">Active</th>
    	</tr>
  	</thead>
  	<tbody>
	<c:forEach items="${users}" var="user">
		<tr>
	         <td><c:out value="${user.id}"/></td>
	         <td><c:out value="${user.username}"/></td>
	         <td><c:out value="${user.name}"/></td>
	         <td><c:out value="${user.surname}"/></td>
	         <td><c:out value="${user.email}"/></td>
	         <td><c:out value="${user.phone}"/></td>
	         <td><c:out value="${user.registerDate}"/></td>
             <td><c:out value="${user.isEnabled?'Yes':'No'}"/></td>
         </tr>
	</c:forEach>
	</tbody>
</table>