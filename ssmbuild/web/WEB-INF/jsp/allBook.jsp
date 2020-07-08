<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page isELIgnored="false"%>
<%--
  Created by IntelliJ IDEA.
  User: wang
  Date: 2020/7/2
  Time: 9:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>book</title>
    <%--BootStrap--%>
    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet"/>
</head>
<body>
    <div class="container">
        <div class="row clearfix">
            <div class="col-md-12 column">
                <div class="page-header">
                    <h1>
                        <small>书籍列表——————————显示所有书籍</small>
                    </h1>
                </div>
            </div>
            <div class="row">
                <div class="col-md-4 column">
                    <a class="btn btn-primary" href="${pageContext.request.contextPath}/book/toAddBook">新增书籍</a>
                </div>

                <div class="col-md-4 column">
                    <form action="${pageContext.request.contextPath}/book/queryBook" method="post" class="form-inline">
                        <input type="text" name="bookName" class="form-control" placeholder="请输入书籍名称"/>
                        <input type="submit" value="提交" class="btn btn-primary" />
                    </form>
                </div>
            </div>
        </div>


        <div class="row clearfix">
            <div class="col-md-12 column">
                <table class="table table-hover table-striped">
                    <thead>
                        <tr>
                            <th>书籍编号</th>
                            <th>书籍名称</th>
                            <th>书籍数量</th>
                            <th>描述</th>
                            <th>操作</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach var="book" items="${requestScope.get('book')}">
                            <tr>
                                <td>${book.id}</td>
                                <td>${book.bookName}</td>
                                <td>${book.bookCount}</td>
                                <td>${book.detail}</td>
                                <td>
                                    <a href="${pageContext.request.contextPath}/book/to/updateBook?id=${book.id}">修改</a>
                                    &nbsp;|&nbsp;
                                    <a href="${pageContext.request.contextPath}/book/deleteBook/${book.id}">删除</a>
                                </td>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>
            </div>
        </div>
    </div>
</body>
</html>
