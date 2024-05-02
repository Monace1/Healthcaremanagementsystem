<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Payment Form</title>
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
                max-width: 400px;
                margin: 50px auto;
                padding: 20px;
                border-radius: 8px;
                box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            }
            h2 {
                text-align: center;
                color: #007bff;
                margin-bottom: 20px;
            }
            form {
                text-align: center;
            }
            label {
                font-weight: bold;
                display: block;
                margin-bottom: 5px;
            }
            input[type="text"],
            input[type="submit"] {
                width: calc(100% - 22px);
                padding: 10px;
                margin: 5px 0 20px;
                border: 1px solid #ccc;
                border-radius: 4px;
                box-sizing: border-box;
                display: inline-block;
            }

            input[type="text"]:focus {
                outline: none;
                border-color: #007bff;
            }

            .amount-container {
                margin-bottom: 20px;
                text-align: center;
            }
            .amount-label {
                font-weight: bold;
            }
            .amount-view {
                color: #007bff;
                margin-left: 10px;
            }
            input[type="submit"] {
                background-color: #007bff;
                color: #fff;
                border: none;
                cursor: pointer;
                font-size: 16px;
                transition: background-color 0.3s;
            }
            input[type="submit"]:hover {
                background-color: #0056b3;
            }

    .total-amount {
            text-align: center;
            margin-bottom: 20px;
            font-weight: bold;
            font-size: 18px;
    }
    </style>
</head>
<body>

<%@include file="/Components/Pnavbar.jsp"%>

<br>

<div class="total-amount"><%= totalAmount %></div>
<div class="container">
    <h2>Mpesa Payment</h2>
    <form action="MpesaAction" method="post">
        <label for="mpesaPhoneNumber">Phone Number:</label>
        <input type="text" id="mpesaPhoneNumber" name="phoneNumber" required>
        <label for="mpesaAmount">Amount:</label>
        <input type="text" id="mpesaAmount" name="amount" required>
        <input type="submit" value="Pay Now">
    </form>
</div>

<br>

<div class="container">
    <h2>Credit Card Payment</h2>
    <form action="CreditCardAction" method="post">
        <label for="creditCardNumber">Credit Card Number:</label>
        <input type="text" id="creditCardNumber" name="creditNumber" required>
        <label for="creditCardAmount">Amount:</label>
        <input type="text" id="creditCardAmount" name="amount" required> <!-- Added amount field -->
        <input type="submit" value="Pay Now">
    </form>
</div>

<br>

<div class="container">
    <h2>Insurance Cover</h2>
    <form action="InsuranceAction" method="post">
        <label for="insurancePlan">Insurance Plan:</label>
        <input type="text" id="insurancePlan" name="insurance" required>
        <label for="insuranceAmount">Amount:</label>
        <input type="text" id="insuranceAmount" name="amount" required> <!-- Added amount field -->
        <input type="submit" value="Pay Now">
    </form>

</div>
<%@include file="/Components/footer.jsp"%>
</body>
</html>
