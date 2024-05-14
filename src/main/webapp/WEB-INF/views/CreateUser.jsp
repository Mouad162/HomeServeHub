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
    <title>User Creation</title>
</head>
<body>
<header>
    <h1>User Creation</h1>
</header>
<main>
    <form action="saveUser" method="post">
        <div>
            <label for="name">Name : </label>
            <input type="text" id="name" name="name">
        </div>
        <div>
            <label for="email">Email : </label>
            <input type="email" id="email" name="email">
        </div>
        <div>
            <label for="password">Password : </label>
            <input type="password" id="password" name="password">
        </div>
        <div>
            <label for="address">Address : </label>
            <input type="text" id="address" name="address">
        </div>
        <div>
            <label for="phoneNumber">Phone Number : </label>
            <input type="text" id="phoneNumber" name="phoneNumber">
        </div>
        <div>
            <label for="userType">User Type : </label>
            <select id="userType" name="userType">
                <option value="Regular">Regular</option>
                <option value="Premium">Premium</option>
            </select>
        </div>
        <div>
            <input type="submit" value="Save">
        </div>
    </form>
</main>
<footer>
    <a href="userList">Users List</a>
</footer>
</body>
</html>
