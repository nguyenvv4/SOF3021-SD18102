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
<%--<form action="/sinh-vien/add" , method="post">--%>
<%--    <div class="form-group">--%>
<%--        <label>id</label>--%>
<%--        <input class="form-control" name="id">--%>
<%--    </div>--%>
<%--    <div class="form-group">--%>
<%--        <label>Username</label>--%>
<%--        <input class="form-control" id="" name="username">--%>
<%--    </div>--%>
<%--    <div class="form-group">--%>
<%--        <label>Dia chi</label>--%>
<%--        <input class="form-control" name="diaChi">--%>
<%--    </div>--%>
<%--    <div>--%>
<%--        <label>Gioi Tinh</label><br>--%>
<%--        <input type="radio" id="contactChoice2" name="gioiTinh" value="Nam"/>--%>
<%--        <label for="contactChoice2">Nam</label>--%>
<%--        <input type="radio" id="contactChoice3" name="gioiTinh" value="Nu"/>--%>
<%--        <label for="contactChoice3">Nu</label>--%>
<%--    </div>--%>
<%--    <button type="submit" class="btn btn-primary">Submit</button>--%>
<%--</form>--%>

<%--<form:form modelAttribute="sinhVien" action="/sinh-vien/add" method="post">--%>
<%--    <div class="form-group">--%>
<%--        <label>id</label>--%>
<%--        <form:input path="id"/>--%>
<%--        <form:errors path="id"/>--%>
<%--            &lt;%&ndash;        <p>${error}</p>&ndash;%&gt;--%>
<%--    </div>--%>
<%--    <div class="form-group">--%>
<%--        <label>Username</label>--%>
<%--        <form:input path="username"/>--%>
<%--        <form:errors path="username"/>--%>
<%--    </div>--%>
<%--    <div class="form-group">--%>
<%--        <label>Dia chi</label>--%>
<%--        <form:input path="diaChi"/>--%>
<%--    </div>--%>
<%--    <div>--%>
<%--        <label>Gioi Tinh</label><br>--%>
<%--        <label>Nam</label>--%>
<%--        <form:radiobutton path="gioiTinh" value="Nam"/>--%>
<%--        <label>Nu</label>--%>
<%--        <form:radiobutton path="gioiTinh" value="Nu"/>--%>
<%--    </div>--%>
<%--    <button type="submit" class="btn btn-primary">Submit</button>--%>
<%--</form:form>--%>

<table class="table">
    <thead>
    <tr>
        <th scope="col">id</th>
        <th scope="col">ma</th>
        <th scope="col">ten</th>
        <th scope="col">dia chi</th>
        <th scope="col">thanh pho</th>
        <th scope="col">quoc gia</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${list}" var="cuaHang">
        <tr>
            <td>${cuaHang.id}</td>
            <td>${cuaHang.ma}</td>
            <td>${cuaHang.ten}</td>
            <td>${cuaHang.diaChi}</td>
            <td>${cuaHang.thanhPho}</td>
            <td>${cuaHang.quocGia}</td>
            <td><a href="/cua-hang/delete/${cuaHang.id}" class="btn btn-primary">Xoa</a></td>
            <td><a href="/cua-hang/detail/${cuaHang.id}" class="btn btn-primary">Detail</a></td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>