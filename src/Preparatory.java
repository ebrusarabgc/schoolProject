public class Preparatory extends Student{
    protected int levelOfEnglish;

    public Preparatory(String name, double GPA, int levelOfEnglish){
        super(name, GPA);
        this.levelOfEnglish = levelOfEnglish;
    }

    @Override
    public double calculateAchievement() {
        return levelOfEnglish * 10 * getGPA();
    }
}
