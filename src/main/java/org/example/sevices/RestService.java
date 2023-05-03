package org.example.sevices;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

public class RestService {
    OkHttpClient okHttpClient = new OkHttpClient();
    public String run(String url){
        Request request = new Request.Builder().url(url).build();
        String message = null;
        try(Response response = okHttpClient.newCall(request).execute()) {
            System.out.println(response.code());
            if (response.isSuccessful()){
                message = response.body().string();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return message;
    }
}
