<%--
  Created by IntelliJ IDEA.
  User: wang
  Date: 2020/7/8
  Time: 8:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet"/>
</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>修改书籍</small>
                </h1>
            </div>
        </div>

    </div>

    <form action="${pageContext.request.contextPath}/book/updateBook" method="post">
        <input type="text" value="${book.id}" name="id" />
        <div class="form-group">
            <label for="bookName">书籍名称</label>
            <input class="form-control" name="bookName" id="bookName" value="${book.bookName}" placeholder="书籍名称" required>
        </div>
        <div class="form-group">
            <label for="bookCount">书籍数量</label>
            <input class="form-control" name="bookCount" id="bookCount" value="${book.bookCount}" placeholder="书籍数量" required>
        </div>
        <div class="form-group">
            <label for="detail">书籍描述</label>
            <input class="form-control" name="detail" id="detail" value="${book.detail}" placeholder="书籍描述" required>
        </div>
        <button type="submit" class="btn btn-default">Submit</button>
    </form>
</div>
</body>
</html>
