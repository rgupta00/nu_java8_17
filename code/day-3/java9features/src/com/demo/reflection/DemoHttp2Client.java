package com.demo.reflection;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class DemoHttp2Client {
    public static void main(String[] args) {

        try {
            // Create a HttpClient
            HttpClient httpClient
                    = HttpClient.newHttpClient();

            // create a HttpRequest object with the URL
            HttpRequest httpRequest
                    = HttpRequest
                    .newBuilder()
                    .uri(new URI("https:// www.geeksforgeeks.org/about/"))
                    .GET()
                    .build();
            // Synchronous send() method
            // to process the HTTP request.
            // HttpResponse.BodyHandler.asString() handles
            // the body of the response as a String.
//            HttpResponse<String> httpResponse
//                    = httpClient.send(
//                    httpRequest,
//                    HttpResponse.BodyHandler.asString());

            // statusCode() returns the status code
            // for this response.
//            System.out.println(
//                    "Status of operation performed:"
//                            + httpResponse.statusCode());
        }
        catch (Exception e) {
            System.out.println("Exception" + e);
        }


//        //https://www.google.co.in/
//        HttpClient client=HttpClient.newHttpClient();
//
//        HttpRequest request=HttpRequest.newBuilder().uri(URI.create("https://www.google.co.in/")).build();
//
//        HttpResponse<String> response=client.send(request, HttpResponse.BodyHandler.);

    }
}
