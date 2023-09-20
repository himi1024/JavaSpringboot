package io.java.isthesiteup.controllers;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class urlCheckController {
    @GetMapping("/check")
    public String getUrlStatusMessaage(@RequestParam String url) {
        String returnMessage = "";
        
        try{
            URL urlObj = new URL(url);
            // HTTP connection
            HttpURLConnection connect = (HttpURLConnection) urlObj.openConnection();
            connect.setRequestMethod("GET");
            connect.connect();
            // Check the response status
            if (connect.getResponseCode() != 200) {
                returnMessage = "Something went wrong";
            } else {
                returnMessage = "The server is running well!";
            }

        } catch(MalformedURLException e) {
            returnMessage = "wrong url";
        } catch (IOException e) {
            returnMessage = "The server is Down";
        }
        

        return returnMessage;
    }

}
