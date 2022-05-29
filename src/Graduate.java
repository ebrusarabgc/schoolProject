public class Graduate extends Student{
    protected int numberOfPaper;

    public Graduate(String name, double GPA, int numberOfPaper) {
        super(name, GPA);
        this.numberOfPaper = numberOfPaper;
    }

    @Override
    public double calculateAchievement() {
        return numberOfPaper * 30 + getGPA() * 20;
    }
}
