package org.example.sevices;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.model.JsonModel;

import java.io.IOException;

public class JSONMapper {
    ObjectMapper objectMapper = new ObjectMapper();
    public JsonModel[] getModels(String json) throws IOException {
        return objectMapper.readValue(json, JsonModel[].class);

    }
}
