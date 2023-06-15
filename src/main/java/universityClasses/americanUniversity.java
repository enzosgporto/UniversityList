package universityClasses;

import locationClasses.country;

public class americanUniversity extends university {
    public static country unitedStates = new country("United States", "North America");
    boolean SAToptional;
    boolean acceptsACT;

    public americanUniversity(String name, String city, String state, boolean financialAid) {
        super(name, unitedStates, city, state, financialAid);
    }

    public void setAcceptsACT(boolean acceptsACT) {
        this.acceptsACT = acceptsACT;
    }

    public void setSAToptional(boolean SAToptional) {
        this.SAToptional = SAToptional;
    }

    public boolean acceptsACT() {
        return acceptsACT;
    }

    public boolean isSAToptional() {
        return SAToptional;
    }
}
