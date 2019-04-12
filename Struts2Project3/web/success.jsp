<%--
  Created by IntelliJ IDEA.
  User: lyd20
  Date: 2019/3/13
  Time: 18:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%--根元素数据 value ognl表达式   取栈顶--%>
    <s:property value="name"/>

    <%--取非根元素数据  ognl表达式 --%>
    <s:property value="#reqName"/>
    <s:property value="#session.sessionName"/>
    <s:property value="#applicationName.ApplicationName"/>
    <br/>
    <%--在页面中使用ogml调用方式 普通方法--%>
    <s:property value="'hello'.length()"/>
    <br/>
    <%--调用静态的方法--%>
    <s:property value="@java.lang.Math@random()"/>

    <%--写这个标签之前记得在配置文件打开常量--%>
    <s:debug></s:debug>
    <h1>Success</h1>

</body>
</html>
