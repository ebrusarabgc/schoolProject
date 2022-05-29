public class Erasmus extends Student{
    protected String country;

    public Erasmus(String name, double GPA, String country) {
        super(name, GPA);
        this.country = country;
    }

    @Override
    public double calculateAchievement() {
        return 0;
    }
}
