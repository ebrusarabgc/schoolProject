public abstract class Personal implements Lecturable{
    protected String name;
    protected int birthYear;
    protected String department;
    double personalLimit = 1.0;

    public Personal(String name, int birthYear, String department) {
        this.name = name;
        this.birthYear = birthYear;
        this.department = department;
    }

    public int getBirthYear() {
        return birthYear;
    }

    @Override
    public boolean isQualified() {
        return calculateAchievement() > personalLimit;
    }

}
