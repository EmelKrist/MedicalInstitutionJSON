package medicalinstitutionjson;

import com.fasterxml.jackson.databind.*;
import pojo.*;
import java.io.*;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator;

public class Converter {

    private final static String FileJSON = "Tests.json";
    private final static String FileXML = "Patients.xml";

    /**
     * Метод для сереализации json
     *
     * @param test - объект класса Test
     * @throws java.io.IOException
     */
    public static void toJSON(Test[] test) throws IOException {
        try {
            ObjectMapper mapper = new ObjectMapper();
            //mapper.configure(SerializationFeature.WRAP_ROOT_VALUE, true);
            mapper.writeValue(new File(FileJSON), test);
            System.out.println("\njson created!");
            //обработчик ошибок
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    /**
     * Метод для десереализации json
     *
     * @return объект класса Test
     * @throws java.io.IOException
     */
    public static Test[] JSONtoJavaObject() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
       // mapper.configure(DeserializationFeature.UNWRAP_ROOT_VALUE, true);
        return mapper.readValue(new File(FileJSON), Test[].class);
    }

    /**
     * Метод для сереализации xml
     *
     * @param patient - объект класса Patient
     * @throws java.io.IOException
     */
    public static void toXML(Patient[] patient) throws IOException {
        try {
            XmlMapper mapper = new XmlMapper();
            mapper.configure(ToXmlGenerator.Feature.WRITE_XML_DECLARATION, true);
            mapper.writeValue(new File(FileXML), patient);
            System.out.println("\nxml created!");
            //обработчик ошибок
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    /**
     * Метод для десереализации xml
     *
     * @return объект класса Patient
     * @throws java.io.IOException
     */
    public static Patient[] XMLtoJavaObject() throws IOException {
        XmlMapper mapper = new XmlMapper();
        return mapper.readValue(new File(FileXML), Patient[].class);
    }

}
