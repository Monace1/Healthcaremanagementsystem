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
        .content-section {
            margin-top: 30px;
        }
        .content-section h3 {
            color: #333;
            border-bottom: 1px solid #ccc;
            padding-bottom: 10px;
        }
        .action-link {
            display: block;
            padding: 10px 0;
            color: #007bff;
            text-decoration: none;
            transition: color 0.3s;
        }
        .action-link:hover {
            color: #0056b3;
        }
    </style>
</head>

<body>

    <br>
    <div class="container">
        <h2 class="welcome-message">Welcome Admin</h2>

        <div class="content-section">
            <h3>Actions</h3>
            <ul>
                <li><a class="action-link" href="manageusers.jsp">Manage Users</a></li>
                <li><a class="action-link" href="managedata.jsp">Manage Data</a></li>

            </ul>
        </div>

        <form action="AdminLogoutServlet" method="post">
            <button class="logout-button" type="submit">Logout</button>
        </form>
    </div>

    <%@include file="/Components/footer.jsp"%>
</body>
</html>
