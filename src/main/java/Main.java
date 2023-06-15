import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.reflect.TypeToken;
import locationClasses.country;
import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Scanner;

import universityClasses.americanUniversity;
import universityClasses.university;

public class Main {
    //create Gson object
    public static Gson gson = new Gson();
    public static void main(String[] args) throws IOException {
        //sets Json Array to hold university list
        JsonArray main = new JsonArray();
        Type uniList = new TypeToken<List<university>>() {}.getType();
        List<university> list = gson.fromJson(loadFileFromClasspath("universityList.json"), uniList);

        //loop for adding universities
        Scanner sc = new Scanner(System.in);
        System.out.println("Do you wish to add a university or an american university?");
        String universityToAdd = sc.nextLine();

        if(universityToAdd.equalsIgnoreCase("university")){
            //allows user to add input for the university details
            System.out.println("What is the name of this university?");
            String uniName = sc.nextLine();

            System.out.println("What is the city this university is located");
            String uniCity = sc.nextLine();

            System.out.println("In which state is this university located");
            String uniState = sc.nextLine();

            System.out.println("Does this university accept financial aid: (y/n)");
            String fa = sc.nextLine();
            Boolean answer = false;
            if(fa.equalsIgnoreCase("y")){
                answer = true;
            }
            university university = new university(uniName, new country("Yes", "Yes"), uniCity, uniState, answer);
            list.add(university);

        } else if (universityToAdd.equalsIgnoreCase("american university")) {
            //allows user to add input for the university details
            System.out.println("What is the name of this university?");
            String uniName = sc.nextLine();

            System.out.println("What is the city this university is located");
            String uniCity = sc.nextLine();

            System.out.println("In which state is this university located");
            String uniState = sc.nextLine();

            System.out.println("Does this university accept financial aid: (y/n)");
            String fa = sc.nextLine();
            Boolean answer = false;
            if(fa.equalsIgnoreCase("y")){
                answer = true;
            }

            //create american university and add it to the list
            university university = new americanUniversity(uniName, uniCity, uniState, answer);
            list.add(university);
        }

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
