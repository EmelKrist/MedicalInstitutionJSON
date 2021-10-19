package pojo;

import com.fasterxml.jackson.annotation.*;

@JsonRootName(value = "tests")
@JsonIgnoreProperties
public class Test {

    @JsonProperty("Patient_ID")
    private long id;

    @JsonProperty("date")
    private String date;

    @JsonProperty("type")
    private String type;

    @JsonProperty("precision")
    private String precision;

    @JsonProperty("lab")
    private String lab;

    @JsonProperty("result")
    private String result;

    public Test() {
    }

    public Test(long id, String date, String type, String precision, String lab, String result) {
        this.id = id;
        this.date = date;
        this.type = type;
        this.precision = precision;
        this.lab = lab;
        this.result = result;
    }

    public long getId() {
        return id;
    }

    public String getDate() {
        return date;
    }

    public String getType() {
        return type;
    }

    public String getPrecision() {
        return precision;
    }

    public String getLab() {
        return lab;
    }

    public String getResult() {
        return result;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPrecision(String precision) {
        this.precision = precision;
    }

    public void setLab(String lab) {
        this.lab = lab;
    }

    public void setResult(String result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "\nTest{Patient_ID=" + id
                + "}\n date: " + date + "\n type: " + type
                + "\n precision: " + precision + "\n lab: "
                + lab + "\n result: " + result;
    }

}
