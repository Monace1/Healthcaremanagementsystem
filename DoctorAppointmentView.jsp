<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>View Appointments</title>
    <%@include file="/Components/Css.jsp"%>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f5f5f5;
            color: #333;
            margin: 0;
            padding: 0;
        }
        .container {
            max-width: 1200px;
            margin: 20px auto;
            padding: 20px;
            border-radius:30px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }
        h1 {
            text-align: center;
            color: aqua;
            margin-bottom: 20px;
        }
        table {
            width: 100%;
            border-collapse: collapse;
            border: 1px solid #ccc;
            margin-top: 20px;
        }
        th, td {
            padding: 12px;
            border: 1px solid #ccc;
            text-align: left;
        }
        th {
            background-color: aqua;
            color: #fff;
        }
        tr:nth-child(even) {
            background-color: #f9f9f9;
        }
    </style>
</head>
<body>
  <%@include file="/Components/Dnavbar.jsp"%>
<br>
<div class="container">
    <h1>Appointments</h1>
    <table>
        <thead>
            <tr>
                <th>Appointment ID</th>
                <th>Patient Name</th>
                <th>Doctor Name</th>
                <th>Appointment Time</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="appointment" items="$appointments">
                <tr>
                    <td>${appointment.appointment_id}</td>
                    <td>${appointment.patient_name}</td>
                    <td>${appointment.doctor_name}</td>
                    <td>${appointment.appointment_time}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</div>
  <%@include file="/Components/footer.jsp"%>
</body>
</html>
