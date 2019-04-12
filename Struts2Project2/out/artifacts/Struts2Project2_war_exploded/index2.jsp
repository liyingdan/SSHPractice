<%--
  Created by IntelliJ IDEA.
  User: lyd20
  Date: 2019/3/12
  Time: 19:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>lyd</title>
  </head>
  <body>
  <%--List集合接收参数--%>
      <form action="${pageContext.request.contextPath}/myform6.action">
          名称:<input type="text" placeholder="请输入商品名称" name="goodslist[0].name"><br>
          价格:<input type="text" placeholder="请输入商品价格" name="goodslist[0].price"><br>
          <hr>
          名称:<input type="text" placeholder="请输入商品名称" name="goodslist[1].name"><br>
          价格:<input type="text" placeholder="请输入商品价格" name="goodslist[1].price"><br>
          <input type="submit" value="提交">
      </form>

    <hr>
  <%--Map集合接收参数--%>
  <form action="${pageContext.request.contextPath}/myform7.action">
      名称:<input type="text" placeholder="请输入商品名称" name="goodsMap['one'].name"><br>
      价格:<input type="text" placeholder="请输入商品价格" name="goodsMap['one'].price"><br>
      <hr>
      名称:<input type="text" placeholder="请输入商品名称" name="goodsMap['two'].name"><br>
      价格:<input type="text" placeholder="请输入商品价格" name="goodsMap['two'].price"><br>
      <input type="submit" value="提交">
  </form>
  </body>
</html>
