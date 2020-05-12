<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %><%--
  Created by IntelliJ IDEA.
  User: wang
  Date: 12/5/2020 AD
  Time: 08:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Simple Dictionary</title>
</head>
<body>
<%!
    Map<String, String> dic = new HashMap<>();

%>
<%
    dic.put("hello", "xin chao");
    dic.put("how", "the nao");
    dic.put("book", "quyen vo");
    dic.put("computer", "may tinh");
    dic.put("bye", "tam biet");
    String search = request.getParameter("search");
    String result = dic.get(search);
    if (result != null) {
        out.println("word: " + search);
        out.println("result: " + result);
    } else {
        out.println("not found");
    }
%>
</body>
</html>
