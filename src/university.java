public class university {
    //final information set in constructor regarding universities -> does not change
    final String name;
    final String country;
    final String[] location;
    final boolean financialAid;

    //byte information for liberal arts and research university types
    byte uniType;
    public final static byte liberalArts=0;
    public final static byte research=1;

    //user the information should be able to constantly input
    String[] strengths;
    String[] weaknesses;

    public university(String name, String country, String city, String state, boolean financialAid) {
        this.name = name;
        this.country = country;
        this.location = new String[]{city, state};
        this.financialAid = financialAid;
    }

    public String[] getStrengths() {
        return strengths;
    }

    public String[] getWeaknesses() {
        return weaknesses;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
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
}
