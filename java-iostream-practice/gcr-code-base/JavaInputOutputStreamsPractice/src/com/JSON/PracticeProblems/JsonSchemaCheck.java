package com.JSON.PracticeProblems;

import java.io.File;
import java.util.Set;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import com.networknt.schema.JsonSchema;
import com.networknt.schema.JsonSchemaFactory;
import com.networknt.schema.SpecVersion;
import com.networknt.schema.ValidationMessage;

public class JsonSchemaCheck {

    public static void main(String[] args) throws Exception {

        ObjectMapper mapper = new ObjectMapper();

        JsonNode schemaNode = mapper.readTree(new File("data/schema.json"));
        JsonNode jsonNode   = mapper.readTree(new File("data/user.json"));

        JsonSchemaFactory factory =
                JsonSchemaFactory.getInstance(SpecVersion.VersionFlag.V7);

        JsonSchema schema = factory.getSchema(schemaNode);

        Set<ValidationMessage> errors = schema.validate(jsonNode);

        if (errors.isEmpty()) {
            System.out.println("JSON Valid");
        } else {
            System.out.println("JSON Invalid");
            errors.forEach(e -> System.out.println(e.getMessage()));
        }
    }
}
