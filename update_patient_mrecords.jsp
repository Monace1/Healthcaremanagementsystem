<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Update Patient Records</title>
    <%@include file="/Components/Css.jsp">
</head>
<body>
 <%@include file="/Components/Dnavbar.jsp">

    <div class="container">
        <h2>Update Patient Records</h2>
        <form action="/UpdatePatientMedicalRecordsServlet" method="post">
            <input type="hidden" name="patientId" value="123"> <!-- Replace with dynamic patient ID -->
            <textarea name="updatedInfo" rows="5" placeholder="Enter updated patient information"></textarea><br><br>
            <button type="submit">Update Records</button>
        </form>
    </div>
  <%@include file="/Components/footer.jsp">
</body>
</html>
