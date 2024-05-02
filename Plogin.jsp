<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Patient Login</title>

<%@include file="/Components/Css.jsp"%>

  <style>

    .login-form {
      max-width: 400px;

      margin: 50px auto;
      padding: 20px;
      background-color: #fff;
      border-radius: 10px;
      box-shadow: 0px 0px 20px rgba(0, 0, 0, 0.1);
    }
    .login-form h2 {
      color: #333;
      margin-bottom: 30px;
      text-align: center;
    }
    .login-form label {
      font-weight: bold;
    }
    .login-form input[type="text"],
    .login-form input[type="password"] {
      padding: 12px;
      border-radius:15px;
      border: 1px solid #ddd;
      margin-bottom: 20px;
      width:75%;
    }
    .login-form input[type="text"]:focus,
    .login-form input[type="password"]:focus {
      outline: none;
      border-color: #007bff;
      box-shadow: 0px 0px 10px rgba(0, 123, 255, 0.3);
    }
    .login-form .btn-primary {
      background-color: #007bff;
      border: none;
    }
    .login-form .btn-primary:hover {
      background-color: #0056b3;
    }
  </style>
</head>
<body>
<%@include file="/Components/navbar.jsp"%>

<div class="container">
  <div class="row justify-content-center">
    <div class="col-md-6">
      <div class="login-form">
        <h2>Patient Login</h2>

        <form action="PatientLogin" method="post">
          <div class="mb-3">
            <label for="username" class="form-label">Username</label>
            <input type="text" class="form-control" id="username" name="username" required>
          </div>
          <div class="mb-3">
            <label for="password" class="form-label">Password</label>
            <input type="password" class="form-control" id="password" name="password" required>
          </div>
          <div class="d-grid">
            <button type="submit" class="btn btn-primary btn-block">Login</button>
          </div>
        </form>

         <div class="text-center mt-3">
                  <p>Don't have an account? <a href="register.jsp">Register here</a></p>
                </div>
      </div>
    </div>
  </div>
</div>

<%@include file="/Components/footer.jsp"%>
</body>
</html>

