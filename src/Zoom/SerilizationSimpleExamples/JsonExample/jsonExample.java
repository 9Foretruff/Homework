package Zoom.SerilizationSimpleExamples.JsonExample;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class jsonExample {
    public static void main(String[] args) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();

        SomeData someData = new SomeData();
        someData.setParam1(15);
        someData.setParam2(true);
        someData.setParam3("Hello word!");
        someData.setParam4(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9});
        InnerObject innerObject = new InnerObject("Maksim","Rokitko");
        someData.setInnerObject(innerObject);

        objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
        String result = objectMapper.writeValueAsString(someData);
        System.out.println(result);

        SomeData someData1 = objectMapper.readValue(result, SomeData.class);
        System.out.println(someData1);
    }
}
