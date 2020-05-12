<%@ page import="java.util.ArrayList" %>
<%@ page import="Model.Customer" %><%--
  Created by IntelliJ IDEA.
  User: wang
  Date: 11/5/2020 AD
  Time: 11:05
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <div>
    <div>
      <h1>Danh sach Khach Hang </h1>
    </div>
   <table>
     <td width="200"><h3>Ten</h3></td>
     <td width="200"><h3>Ngay Sinh</h3></td>
     <td width="200"><h3>Dia Chi</h3></td>
     <td width="200"><h3>Anh</h3></td>

     <%
         ArrayList<Customer> arrayList =new ArrayList<Customer>();
       arrayList.add(new Customer("Quang","15/02/1991","DN","https://loremflickr.com/640/360"));
       arrayList.add(new Customer("Quang","15/02/1991","DN","https://loremflickr.com/640/360"));
       arrayList.add(new Customer("Quang","15/02/1991","DN","https://loremflickr.com/640/360"));
       arrayList.add(new Customer("Quang","15/02/1991","DN","https://loremflickr.com/640/360"));
     out.print(arrayList.size());
         request.setAttribute("arrayList", arrayList);
     %>

       <c:forEach var="i" begin="0" end="${arrayList.size()-1}">
           <tr>
               <td><c:out value="${arrayList.get(i).ten}"/></td>
               <td><c:out value="${arrayList.get(i).ngaySinh}"/></td>
               <td><c:out value="${arrayList.get(i).diaChi}"/></td>
               <td><img src="<c:out value="${arrayList.get(i).anh}"/>" width="50px" height="50px"></td>
           </tr>
       </c:forEach>
   </table>

  </div>
  </body>
</html>
