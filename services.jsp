<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Services</title>
  <%@include file="/Components/Css.jsp"%>
  <style>

    .module {
      margin-bottom: 30px;
    }
    .module h3 {
      color: #333333;
    }
    .module p {
      color: #666666;
    }
  </style>
</head>
<body>
  <%@include file="/Components/navbar.jsp"%>

  <div class="container">
    <div class="module">
      <h3>Patient Portal</h3>
      <p>Access your medical records, schedule appointments,<br>Billing Made Convinient,Give feedback.</p>
    </div>

    <div class="module">
      <h3>Appointment Scheduling</h3>
      <p>Book and manage appointments</p>
    </div>

     <div class="module">
          <h3>Appointment viewing</h3>
          <p>View appointments</p>
        </div>


  </div>

  <%@include file="/Components/footer.jsp"%>
</body>
</html>
