<%@ include file="/WEB-INF/jsp/includes.jsp" %>
<%@ include file="/WEB-INF/jsp/header.jsp" %>

<h2>Pets:</h2>

<table>
  <thead>
    <th>Name</th>
  </thead>
  <c:forEach var="pet" items="${petList}">
    <tr>
      <td>${pet.name}</td>
    </tr>
  </c:forEach>
</table>

<%@ include file="/WEB-INF/jsp/footer.jsp" %>
