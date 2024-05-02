<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Patient Registration</title>
    <%@include file="/Components/Css.jsp"%>
    <style>
        .register-form {
            max-width: 400px;
            margin: 50px auto;
            padding: 20px;
            background-color: #fff;
            border-radius: 10px;
            box-shadow: 0px 0px 20px rgba(0, 0, 0, 0.1); /* Added box-shadow */
        }
        .register-form h2 {
            color: #333;
            margin-bottom: 30px;
            text-align: center;
        }
        .register-form label {
            font-weight: bold;
        }
        .register-form input[type="text"],
        .register-form input[type="email"],
        .register-form input[type="password"] {
            padding: 15px;
            border-radius: 15px;
            border: 1px solid #ddd;
            margin-bottom: 20px;
            width: 90%;
        }
        .register-form input[type="text"]:focus,
        .register-form input[type="email"]:focus,
        .register-form input[type="password"]:focus {
            outline: none;
            border-color: #007bff;
            box-shadow: 0px 0px 10px rgba(0, 123, 255, 0.3);
        }
        .register-form .btn-primary {
            background-color: #007bff;
            border: none;
        }
        .register-form .btn-primary:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>
    <%@include file="/Components/navbar.jsp"%>
    <div class="container">
        <div class="row justify-content-center">
            <div class="col-md-6">
                <div class="register-form">
                    <h2>Patient Registration</h2>
                    <form action="PatientRegister" method="post">
                        <div class="mb-3">
                            <label for="username" class="form-label">Username</label>
                            <input type="text" class="form-control" id="username" name="username" required>
                        </div>
                        <div class="mb-3">
                            <label for="email" class="form-label">Email</label>
                            <input type="email" class="form-control" id="email" name="email" required>
                        </div>
                        <div class="mb-3">
                            <label for="password" class="form-label">Password</label>
                            <input type="password" class="form-control" id="password" name="password" required>
                        </div>
                        <div class="mb-3">
                            <label for="confirmPassword" class="form-label">Confirm Password</label>
                            <input type="password" class="form-control" id="confirmPassword" name="confirmPassword" required>
                        </div>
                        <div class="d-grid">
                            <button type="submit" class="btn btn-primary btn-block">Register</button>
                        </div>
                    </form>
                    <div class="text-center mt-3">
                        <p>Already have an account? <a href="Plogin.jsp">Login here</a></p>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <%@include file="/Components/footer.jsp"%>
</body>
</html>
