<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Patient Feedback</title>
   <%@include file="/Components/Css.jsp"%>

   <style>

   </style>

</head>
<body>
  <%@include file="/Components/Pnavbar.jsp"%>
    <div class="container">
        <h2>Submit Feedback</h2>
        <form action="/SubmitFeedbackServlet" method="post">
            <textarea name="feedback" id="feedback" rows="5" placeholder="Enter your feedback or complaint"></textarea><br><br>
            <button type="submit">Submit Feedback</button>
        </form>
    </div>

      <%@include file="/Components/footer.jsp"%>
</body>
</html>
