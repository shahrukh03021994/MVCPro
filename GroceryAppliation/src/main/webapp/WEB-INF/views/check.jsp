<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <table>
  <c:forEach items="${user}" var="product">
    <tr>
      <td><c:out value="${product.name}" /></td>
      <td><c:out value="${product.password}" /></td>
      <td><c:out value="${product.contact}" /></td>
            <td><c:out value="${product.role}" /></td>
            <td><c:out value="${product.id}" /></td>
      
    </tr>
  </c:forEach>
</table>
</body>
</html>