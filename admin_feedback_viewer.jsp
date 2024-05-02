<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Admin Feedback Viewer</title>
    <%@include file="/Components/Css.jsp"%>

    <style>
     .container{
        max-width: 400px;
         margin:auto;
         padding: 20px;
         border-radius: 10px;
         box-shadow: 0px 0px 20px rgba(0, 0, 0, 0.1)
        }
    </style>

</head>
<body>

 <%@include file="/Components/Adnavbar.jsp"%>
    <div class="container">
        <h2>Feedback Viewer </h2>
        <div id="feedbackList">

        </div>
    </div>
     <%@include file="/Components/footer.jsp"%>
</body>
</html>
