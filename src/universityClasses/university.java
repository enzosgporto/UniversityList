package universityClasses;

import java.util.ArrayList;
import locationClasses.country;

public class university {
    //final information set in constructor regarding universities -> does not change
    final String name;
    final country country;
    final String[] location;
    final boolean financialAid;

    //byte information for liberal arts and research university.university types
    byte uniType;
    public final static byte liberalArts=0;
    public final static byte research=1;

    //user the information should be able to constantly input
    ArrayList<String> strengths;
    ArrayList<String> weaknesses;

    public university(String name, country country, String city, String state, boolean financialAid) {
        this.name = name;
        this.country = country;
        this.location = new String[]{city, state};
        this.financialAid = financialAid;
    }

    public ArrayList<String> getStrengths() {
        return strengths;
    }

    public ArrayList<String> getWeaknesses() {
        return weaknesses;
    }

    public String getName() {
        return name;
    }

    public country getCountry() {
        return country;
    }

    public boolean hasFinancialAid() {
        return financialAid;
    }

    public void setUniType(byte uniType) {
        this.uniType = uniType;
    }

    public String[] getLocation() {
        return location;
    }

    public void addStrengths(String strength){
        this.strengths.add(strength);
    }

    public void addWeaknesses(String weakness){
        this.weaknesses.add(weakness);
    }
}
