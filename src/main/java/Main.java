import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.reflect.TypeToken;
import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.util.List;

import universityClasses.university;

public class Main {
    //create Gson object
    public static Gson gson = new Gson();
    public static void main(String[] args) throws IOException {
        //sets Json Array to hold university list
        JsonArray main = new JsonArray();
        Type uniList = new TypeToken<List<university>>() {}.getType();
        List<university> list = gson.fromJson(loadFileFromClasspath("universityList.json"), uniList);

    }

    public static List writeUniToFile(List parameterList) throws IOException {
        return gson.<List<university>>fromJson(loadFileFromClasspath("universityList.json"), (Type) parameterList);
    }

    public static String loadFileFromClasspath(String fileName) throws IOException {
        ClassLoader classLoader = Main.class.getClassLoader();
        try (InputStream inputStream = classLoader.getResourceAsStream(fileName)) {
            // common-io
            assert inputStream != null;
            return IOUtils.toString(inputStream, StandardCharsets.UTF_8);
        }
    }

    public static void printJson(List list){
        System.out.println(gson.toJson(list));
    }

}
