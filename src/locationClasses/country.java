package locationClasses;
import universityClasses.university;

import java.util.ArrayList;

public class country {
    final String name;
    final String continent;

    //array list for universities in the country
    ArrayList<university> universityList = new ArrayList<>();

    //List for pros and cons for the country
    ArrayList<String> pros;
    ArrayList<String> cons;

    public country(String name, String continent){
        this.name = name;
        this.continent = continent;
    }

    public void addUniversity(university university){
        this.universityList.add(university);
    }

    public ArrayList<university> getUniversityList() {
        return universityList;
    }

    public ArrayList<String> getCons() {
        return cons;
    }

    public ArrayList<String> getPros() {
        return pros;
    }

    public void addPros(String pro){
        this.pros.add(pro);
    }

    public void addCons(String con){
        this.cons.add(con);
    }
}
