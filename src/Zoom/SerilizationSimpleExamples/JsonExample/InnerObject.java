package Zoom.SerilizationSimpleExamples.JsonExample;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class InnerObject {
    private String param1;
    private String param2;

    @JsonCreator
    public InnerObject(@JsonProperty("param1") String param1, @JsonProperty("param2") String param2) {
        this.param1 = param1;
        this.param2 = param2;
    }

    public String getParam1() {
        return param1;
    }

    public void setParam1(String param1) {
        this.param1 = param1;
    }

    public String getParam2() {
        return param2;
    }

    public void setParam2(String param2) {
        this.param2 = param2;
    }
}
