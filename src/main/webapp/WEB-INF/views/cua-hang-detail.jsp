<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
          integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <title>Title</title>
</head>
<body>
<h2>Thong tin cua hang</h2>
<form:form modelAttribute="cuaHang" action="/cua-hang/update/${cuaHang.id}" method="post">
    <%--    <div class="form-group">--%>
    <%--        <label>id</label>--%>
    <%--        <form:input path="id"/>--%>
    <%--        <form:errors path="id"/>--%>
    <%--    </div>--%>
    <div class="form-group">
        <label>Ma</label>
        <form:input class="form-control" path="ma"/>
        <form:errors path="ma"/>
    </div>
    <div class="form-group">
        <label>Ten</label>
        <form:input class="form-control" path="ten"/>
    </div>
    <div class="form-group">
        <label>Dia Chi</label>
        <form:input class="form-control" path="diaChi"/>
    </div>

    <div class="form-group">
        <label>Thanh Pho</label>
        <form:input class="form-control" path="thanhPho"/>
    </div>

    <div class="form-group">
        <label>Quoc Gia</label>
        <form:input class="form-control" path="quocGia"/>
    </div>

    <button type="submit" class="btn btn-primary">Submit</button>
</form:form>
</body>
