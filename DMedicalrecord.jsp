<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Medical Record Form</title>
    <%@include file="Components/Css.jsp"%>
    <style>
        label {
            display: block;
            margin-bottom: 10px;
        }
        input[type="text"], input[type="date"], textarea {
            width: 100%;
            padding: 8px;
            margin-top: 5px;
            margin-bottom: 10px;
            border: 1px solid #ccc;
            border-radius: 4px;
            box-sizing: border-box;
        }
        input[type="submit"] {
            background-color: #4CAF50;
            color: white;
            padding: 10px 20px;
            border: none;
            border-radius: 4px;
            cursor: pointer;
            font-size: 16px;
        }
        input[type="submit"]:hover {
            background-color: #45a049;
        }
    </style>
</head>
<body>
<%@include file="Components/Dnavbar.jsp"%>

    <h2>Medical Record Form</h2>
    <form action="SubmitMedicalRecordServlet" method="post">
        <label for="patient_name">Patient Name:</label>
        <input type="text" id="patient_name" name="patient_name" required>

        <label for="date_of_visit">Date of Visit:</label>
        <input type="date" id="date_of_visit" name="date_of_visit" required>

        <label for="symptoms">Symptoms:</label>
        <textarea id="symptoms" name="symptoms" rows="4" required></textarea>

        <label for="diagnosis">Diagnosis:</label>
        <textarea id="diagnosis" name="diagnosis" rows="4" required></textarea>

        <label for="prescriptions">Prescriptions:</label>
        <textarea id="prescriptions" name="prescriptions" rows="4"></textarea>

        <label for="notes">Notes:</label>
        <textarea id="notes" name="notes" rows="4"></textarea>

        <label for="height">Height (in cm):</label>
        <input type="number" id="height" name="height">

        <label for="weight">Weight (in kg):</label>
        <input type="number" id="weight" name="weight">

        <label for="blood_pressure">Blood Pressure:</label>
        <input type="text" id="blood_pressure" name="blood_pressure">

        <label for="temperature">Temperature (in Celsius):</label>
        <input type="number" id="temperature" name="temperature">

        <input type="submit" value="Submit">
    </form>
    <%@include file="Components/footer.jsp"%>
</body>
</html>
