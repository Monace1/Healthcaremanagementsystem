package com.servlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

@WebServlet("/MpesaAction")
public class MpesaAction extends BaseAction {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String amount = req.getParameter("amount");
        String phoneNumber =  req.getParameter("phoneNumber");

        String endPoint = "http://localhost:8080/HealthCareManagement/mpesa_bill/push?amount="+amount+"&phoneNumber="+phoneNumber+"";
        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder()
                .url(endPoint)
                .build();

        try {
            Response response = client.newCall(request).execute();


            int statusCode = response.code();
            System.out.println("Response Code: " + statusCode);


            String responseData = response.body().string();
            System.out.println("Response Data: " + responseData);

        } catch (IOException e) {
            e.printStackTrace();
        }
        resp.sendRedirect(endPoint);
    }

}
