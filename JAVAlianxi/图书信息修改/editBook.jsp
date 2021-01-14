<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>编辑书籍</title>
</head>
<body>
<form action="/bookServlet?type=save" method="post">
    <input type="hidden" name="bookId" value="${book.bookId}" value="${bookId}">
    <label>书籍</label>
    <input type="text" name="bookName" value="${book.bookName}"><br>
    <label>作者</label>
    <input type="text" name="authorName" value="${book.authorName}"><br>
    <input type="submit" value="提交">
</form>
</body>
</html>
