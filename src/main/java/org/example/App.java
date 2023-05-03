package org.example;

import org.example.model.JsonModel;
import org.example.model.User;
import org.example.sevices.JSONMapper;
import org.example.sevices.RestService;
import org.example.sevices.SQLService;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class App {

    public static void main( String[] args ) throws IOException {


        RestService restService = new RestService();
        JSONMapper jsonMapper = new JSONMapper();
        String response = restService.run("https://cat-fact.herokuapp.com/facts");
        //System.out.println(response);
        JsonModel[] jsonModels = jsonMapper.getModels(response);
        StringBuilder sb = new StringBuilder();
        for (JsonModel model : jsonModels ){
            sb.append(model + "\n");
        }
        FileWriter fw = new FileWriter("test.txt");
        for (int i = 0; i<sb.length(); i++){
            fw.write(sb.charAt(i));
            System.out.print(sb.charAt(i));
        }
        fw.close();


    }
}
