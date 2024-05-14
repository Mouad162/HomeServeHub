<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
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

        form {
            max-width: 500px;
            margin: auto;
            padding: 20px;
            border: 1px solid #ccc;
            border-radius: 5px;
        }

        form div {
            margin-bottom: 10px;
        }

        label {
            display: block;
            font-weight: bold;
            margin-bottom: 5px;
        }

        input[type="text"],
        input[type="email"],
        input[type="password"],
        select {
            width: 100%;
            padding: 10px;
            border: 1px solid #ccc;
            border-radius: 5px;
        }

        input[type="submit"] {
            width: 100%;
            padding: 10px;
            background-color: #007bff;
            color: #fff;
            border: none;
            border-radius: 5px;
            cursor: pointer;
        }

        input[type="submit"]:hover {
            background-color: #0056b3;
        }
    </style>
    <title>User Edition</title>
</head>
<body>
<header>
    <h1>User Edition</h1>
</header>
<main>
    <form action="updateUser" method="post">
        <div>
            <label for="userId">Id : </label>
            <input type="text" id="userId" name="userId" value="${userVue.userId}">
        </div>
        <div>
            <label for="name">Name : </label>
            <input type="text" id="name" name="Name" value="${userVue.name}">
        </div>
        <div>
            <label for="email">Email : </label>
            <input type="email" id="email" name="Email" value="${userVue.email}">
        </div>
        <div>
            <label for="password">password : </label>
            <input type="text" id="password" name="Password" value="${userVue.password}">
        </div>
        <div>
            <label for="address">Address : </label>
            <input type="text" id="address" name="Address" value="${userVue.address}">
        </div>
        <div>
            <label for="phoneNumber">Number : </label>
            <input type="text" id="phoneNumber" name="PhoneNumber" value="${userVue.name}">
        </div>
        <div>
            <label for="userType">Type : </label>
            <input type="text" id="userType" name="UserType" value="${userVue.userType}">
        </div>
        <div>
            <label for="userState">State : </label>
            <input type="text" id="userState" name="UserState" value="${userVue.userState}">
        </div>
        <div>
            <input type="submit" value="Update">
        </div>
    </form>
</main>
<footer>
    <a href="userList">Users List</a>
</footer>
</body>
</html>
