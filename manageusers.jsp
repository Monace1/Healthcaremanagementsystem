<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Admin Panel</title>
    <%@include file="/Components/Css.jsp"%>
    <style>
        .container {
            max-width: 800px;
            margin: auto;
            padding: 20px;
            border-radius: 10px;
            box-shadow: 0px 0px 20px rgba(0, 0, 0, 0.1);
            text-align: center;
        }
        .welcome-message {
            text-align: center;
            margin-bottom: 20px;
        }
        .logout-button {
            background-color: #dc3545;
            color: #fff;
            border: none;
            padding: 10px 20px;
            border-radius: 5px;
            cursor: pointer;
            transition: background-color 0.3s;
            margin-top: 20px;
        }
        .logout-button:hover {
            background-color: #c82333;
        }
        .choice-buttons {
            display: flex;
            justify-content: center;
            margin-top: 30px;
        }
        .choice-button {
            background-color: #007bff;
            color: #fff;
            border: none;
            padding: 10px 20px;
            border-radius: 5px;
            cursor: pointer;
            transition: background-color 0.3s;
            margin: 0 10px;
        }
        .choice-button:hover {
            background-color: #0056b3;
        }
    </style>
</head>

<body>

    <div class="container">
        <h2 class="welcome-message">Welcome Admin</h2>


        <div class="choice-buttons">
            <button class="choice-button" onclick="location.href='manage-doctors.jsp'">Manage Doctors</button>
            <button class="choice-button" onclick="location.href='/manage-patients'">Manage Patients</button>
        </div>


        <form action="AdminLogoutServlet" method="post">
            <button class="logout-button" type="submit">Logout</button>
        </form>
    </div>

    <%@include file="/Components/footer.jsp"%>
</body>
</html>
