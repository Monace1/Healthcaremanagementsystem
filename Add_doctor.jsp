<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Admin Panel</title>
    <%@include file="/Components/Css.jsp"%>
    <style>
    .container{

     margin:auto;
     padding: 20px;
     border-radius: 10px;
     box-shadow: 0px 0px 20px rgba(0, 0, 0, 0.1)
    }
    </style>
</head>

<body>
<%@include file="/Components/Adnavbar.jsp"%>
<br>
<br>
    <div class="container">
<form action="AddDoctorServlet" method="post">
 <input type="text" name="doctorName" placeholder="Doctor Name" required>
 <input type="text" name="specialization" placeholder="Specialization" required>
 <input type="text" name="username" placeholder="Username" required>
 <input type="password" name="password" placeholder="Password" required>
 <button type="submit">Add Doctor</button>
  </form>

<div class="message">
   <% if (request.getParameter("addSuccess") != null) { %>
    <p>Doctor added successfully!</p>
    <% }%>

    <% if (request.getParameter("addError") != null) { %>
    <p>Error adding doctor. Please try again.</p>
    <% } %>

     </div>
    </div>
    <%@include file="/Components/footer.jsp"%>
</body>
</html>