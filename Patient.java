package pojo;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Patient {

    @JsonProperty("ID")
    private long id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("birth")
    private String birth;

    @JsonProperty("policy")
    private String policy;

    public Patient() {
    }

    public Patient(long id, String name, String birth, String policy) {
        this.id = id;
        this.name = name;
        this.birth = birth;
        this.policy = policy;

    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public void setPolicy(String policy) {
        this.policy = policy;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getBirth() {
        return birth;
    }

    public String getPolicy() {
        return policy;
    }

    @Override
    public String toString() {
        return "\nPatient{ id: " + id + "}"
                + "\n name: " + name + 
                "\n birth: " + birth + 
                "\n policy: " + policy + '}';
    }
}
