
<!DOCTYPE html>
   <html lang="en">
      <head>
       <meta charset="UTF-8">
     <meta name="viewport" content="width=device-width, initial-scale=1.0">
       <title>Manage Doctors</title>
                    <%@include file="/Components/Css.jsp"%>
                    <style>
                        .container {
                            max-width: 1200px;
                            margin: auto;
                            padding: 20px;
                            border-radius: 10px;
                            box-shadow: 0px 0px 20px rgba(0, 0, 0, 0.1);

                        }
                        h2 {
                            text-align: center;
                            margin-bottom: 20px;
                        }
                        .table-container {
                            overflow-x: auto;
                        }
                        table {
                            width: 100%;
                            border-collapse: collapse;
                        }
                        th, td {
                            padding: 10px;
                            border-bottom: 1px solid #ccc;
                            text-align: left;
                        }
                        .action-buttons {
                            text-align: center;
                            margin-top: 20px;
                        }
                        .action-button {
                            background-color: #007bff;
                            color: #fff;
                            border: none;
                            padding: 10px 20px;
                            border-radius: 5px;
                            cursor: pointer;
                            transition: background-color 0.3s;
                            margin: 0 5px;
                        }
                        .action-button:hover {
                            background-color: #0056b3;
                        }

                    </style>
                </head>
                <body>
                    <%@include file="/Components/Adnavbar.jsp"%>
                    <br>
                    <br>
                    <div class="container">
                        <h2>Manage Doctors</h2>

                        <div class="table-container">
                            <table>
                                <thead>
                                    <tr>
                                        <th>ID</th>
                                        <th>Name</th>
                                        <th>Specialization</th>
                                        <th>Email</th>
                                        <th>Phone</th>
                                    </tr>
                                </thead>
                                <tbody>
                                 <c:forEach var="doctor" items="${doctors}">
                                  <tr>
                                   <td>${doctor.id}</td>
                                    <td>${doctor.name}</td>
                                    <td>${doctor.specialization}</td>
                                     <td>${doctor.email}</td>
                                     <td>${doctor.phone}</td>

                                 </tr>
                                 </c:forEach>
</tbody>
</table>
</div>
</div>
<%@include file="/Components/footer.jsp"%>



</body>
</html>


