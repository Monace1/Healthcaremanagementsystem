<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Book Appointment</title>
    <%@include file="/Components/Css.jsp"%>
    <style>
    .container {
        max-width: 1200px;
        margin:auto;
        padding: 20px;
        border-radius: 10px;
        box-shadow: 0px 0px 20px rgba(0, 0, 0, 0.1);
    }
    </style>
</head>
<body>
<%@include file="/Components/Pnavbar.jsp"%>
<br>
    <div class="container">
        <h2>Book Appointment</h2>

        <form action="BookAppointmentServlet" method="post">
            <input type="text" name="username" placeholder="Patient  Name" required>
            <input type="text" name="doctorName" placeholder="Doctor Name" required>
            <!-- Set min attribute to block past dates -->
            <input type="datetime-local" name="dateTime" required min="<%= getCurrentDateTime() %>">
            <button type="submit">Book Appointment</button>
        </form>
    </div>
    <%@include file="/Components/footer.jsp"%>

    <%!
        public String getCurrentDateTime() {
            java.util.Date date = new java.util.Date();
            java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd'T'HH:mm");
            return sdf.format(date);
        }
    %>
</body>
</html>
