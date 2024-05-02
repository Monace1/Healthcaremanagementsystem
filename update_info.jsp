<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Update Personal Information</title>
    <%@include file="/Components/Css.jsp"%>
    <style>
    .container{
    max-width: 400px;

    margin: 50px auto;
    padding: 20px;

    border-radius: 10px;
    box-shadow: 0px 0px 20px rgba(0, 0, 0, 0.1)
    }

    label {
    display: block;
    margin-bottom: 10px;
    }
    input[type="text"], input[type="email"], input[type="date"], select {
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
<div class="nav1">
<%@include file="/Components/Pnavbar.jsp"%>
</div>
<br>
    <div class="container">

        <h2>Patient Personal Records</h2>
        <form action="SubmitServlet" method="post">
            <label for="name">Full Name:</label>
            <input type="text" id="name" name="name" required>

            <label for="dob">Date of Birth:</label>
            <input type="date" id="dob" name="dob" required>

            <label for="gender">Gender:</label>
            <select id="gender" name="gender" required>
                <option value="">Select Gender</option>
                <option value="male">Male</option>
                <option value="female">Female</option>
                <option value="other">Other</option>
            </select>

            <label for="email">Email:</label>
            <input type="email" id="email" name="email" required>

            <label for="phone">Phone Number:</label>
            <input type="text" id="phone" name="phone" required>

            <label for="address">Address:</label>
            <textarea id="address" name="address" rows="4" required></textarea>

            <label for="blood_type">Blood Type:</label>
            <input type="text" id="blood_type" name="blood_type">

            <label for="medical_conditions">Medical Conditions (if any):</label>
            <textarea id="medical_conditions" name="medical_conditions" rows="4"></textarea>

            <label for="allergies">Allergies (if any):</label>
            <textarea id="allergies" name="allergies" rows="4"></textarea>

            <label for="medications">Current Medications:</label>
            <textarea id="medications" name="medications" rows="4"></textarea>

            <label for="height">Height (in centimeters):</label>
            <input type="number" id="height" name="height">

            <label for="weight">Weight (in kilograms):</label>
            <input type="number" id="weight" name="weight">

            <label for="emergency_contact">Emergency Contact:</label>
            <input type="text" id="emergency_contact" name="emergency_contact">

            <label for="insurance_provider">Insurance Provider:</label>
            <input type="text" id="insurance_provider" name="insurance_provider">

            <label for="insurance_number">Insurance Number:</label>
            <input type="text" id="insurance_number" name="insurance_number">

            <input type="submit" value="Submit">
        </form>

<div class="footer">
<%@include file="/Components/footer.jsp"%>
</div>
</body>
</html>
