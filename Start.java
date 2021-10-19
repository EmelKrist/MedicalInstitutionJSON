package medicalinstitutionjson;

import java.io.IOException;
import java.util.Arrays;
import java.util.stream.Stream;
import pojo.Patient;
import pojo.Test;

public class Start {

    public Start() throws IOException {
        try {
            //Массив пациентов
            Patient[] PatientsList = Stream.of(
               new Patient(12, "Emelyanova Kristina Artemovna", "10.10.1997", "9066591267825145"),
               new Patient(13, "Tarasova Marina Anatolievna", "14.09.1976", "932625591223472")
            ).toArray(Patient[]::new);
            //Конвертируем данные в пациента в xml
            Converter.toXML(PatientsList);
            //Конвертируем данные из xml файла 
            Patient[] patient = Converter.XMLtoJavaObject();
            //выводим результат десереализации 
            Arrays.stream(patient).forEach(System.out::println);
            
            //Массив тестов
            Test[] TestsList = Stream.of(
                    new Test(12, "10.10.2021", "lgM", "quantitative", "12", "positive"),
                    new Test(13, "19.07.2020", "lgG", "quantitative", "7", "negative")
            ).toArray(Test[]::new);
            //Конвертируем данные теста  в json
            Converter.toJSON(TestsList);
            //Конвертируем данные из json файла 
            Test[] test = Converter.JSONtoJavaObject();
            //выводим результат десереализации 
            Arrays.stream(test).forEach(System.out::println);

            //обработчик ошибок
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }

    }

}
