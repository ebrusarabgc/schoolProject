public class UnderGraduate extends Student{
    protected double credit;

    public UnderGraduate(String name, double GPA, double credit) {
        super(name, GPA);
        this.credit = credit;
    }

    @Override
    public double calculateAchievement() {
        return 50 * credit * getGPA();
    }
}
