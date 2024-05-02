<body>
<%@include file="/Components/Adnavbar.jsp"%>
<br>
    <div class="container">
        <h2>Book Appointment</h2>

        <form action="AdminAppointmentServlet" method="post">
            <input type="text" name="doctorName" placeholder="Doctor Name" required>
            <input type="text" name="doctorName" placeholder="Doctor Name" required>
            <input type="datetime-local" name="dateTime" required>
            <button type="submit">Book Appointment</button>
        </form>
    </div>
    <%@include file="/Components/footer.jsp"%>
</body>
</html>
