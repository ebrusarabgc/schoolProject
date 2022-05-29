public abstract class Student implements Lecturable{
    protected String name;
    protected double GPA;
    double studentLimit = 100.0;

    public Student(String name, double GPA){
        this.name = name;
        this.GPA = GPA;
    }

    public double getGPA() {
        return GPA;
    }

    @Override
    public boolean isQualified() {
        return calculateAchievement() > studentLimit;
    }
}
