<%--
  Created by IntelliJ IDEA.
  User: wang
  Date: 11/5/2020 AD
  Time: 15:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Product Discount Calculator</title>
    <style>
        #content{
            width: 450px;
            margin: 0 auto;
            padding: 0px 20px 20px;
            background: aliceblue;
            border: solid navy 2px;
        }
        label{
            width: 10em;
            padding-right:1em;
            float: left;
        }
        #data input{
            float: left;
            width: 15em;
            margin-bottom: .5em;
        }
    </style>
</head>
<body>
<div id="content">
    <h2>Product Discount Calculator</h2>
    <form action="/display-discount" method="post">
        <div id="data">
            <label> Product description</label>
            <input type="text" name="description"/>
            <br>
            <label> Price </label>
            <input type="text" name="price"/>
            <br>
            <label> Discount percent</label>
            <input type="text" name="discount"/>

        </div>
        <div>
            <br>
            <input type="submit" value="Discount Product">

        </div>
    </form>
</div>

</body>
</html>
