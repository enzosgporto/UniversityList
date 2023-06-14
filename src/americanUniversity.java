public class americanUniversity extends university{
    boolean SAToptional;
    boolean acceptsACT;

    public americanUniversity(String name, String city, String state, boolean financialAid) {
        super(name, "USA", city, state, financialAid);
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
