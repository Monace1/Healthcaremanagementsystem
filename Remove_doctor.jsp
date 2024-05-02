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

        <form action="RemoveDoctorServlet" method="GET">
            <input type="text" name="doctorName" placeholder="Doctor Name to Remove" required>
            <button type="submit">Remove Doctor</button>
        </form>

            <% if (request.getParameter("removeSuccess") != null) { %>
                <p>Doctor removed successfully!</p>
            <% } %>

            <% if (request.getParameter("removeError") != null) { %>
                <p>Error removing doctor. Please try again.</p>
            <% } %>
        </div>
    </div>
    <%@include file="/Components/footer.jsp"%>
</body>
</html>