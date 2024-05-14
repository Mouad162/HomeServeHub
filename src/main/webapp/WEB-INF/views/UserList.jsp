<%@ page pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <link rel="stylesheet" type="text/css" href="webjars/bootstrap/5.3.3/css/bootstrap-grid.min.css">
    <style>
        header {
            background-color: #f0f0f0;
            padding: 20px;
            text-align: center;
        }

        main {
            padding: 20px;
        }

        footer {
            background-color: #f0f0f0;
            padding: 20px;
            text-align: center;
        }

        table {
            width: 100%;
            border-collapse: collapse;
        }

        th, td {
            padding: 8px;
            text-align: left;
            border-bottom: 1px solid #ddd;
        }

        th {
            background-color: #f2f2f2;
        }

        tr:hover {
            background-color: #f5f5f5;
        }
    </style>
    <title>Users List</title>
</head>
<body>
<header>
    <h1>Users List</h1>
</header>
<main>
    <table class="table table-striped">
        <thead>
        <tr>
            <th scope="col">Id</th>
            <th scope="col">Name</th>
            <th scope="col">Email</th>
            <th scope="col">Password</th>
            <th scope="col">Address</th>
            <th scope="col">Phone Number</th>
            <th scope="col">User Type</th>
            <th scope="col">User State</th>
            <th scope="col">Actions</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${userVue}" var="user" >
            <tr>
                <td>${user.userId}</td>
                <td>${user.name}</td>
                <td>${user.email}</td>
                <td>${user.password}</td>
                <td>${user.address}</td>
                <td>${user.phoneNumber}</td>
                <td>${user.userType}</td>
                <td>${user.userState}</td>
                <td>
                    <a class="btn bg-danger"
                       onclick="return confirm('Are you sure to delete this user ?')"
                       href="deleteUser?id=${user.userId}">
                        Delete
                    </a>
                </td>
                <td>
                    <a class="btn bg-success"
                            href="editUser?id=${user.userId}">
                        Edit
                    </a>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</main>
<footer>
    <a href="createUser">User Creation</a>
    <div>Copyright : www.homeservehub.ma</div>
</footer>
</body>
</html>
