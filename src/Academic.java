import java.util.Calendar;

public class Academic extends Personal{
    protected int numberOfPaper;
    protected int numberOfSymposium;

    public Academic(String name, int birthYear, String department, int numberOfPaper, int numberOfSymposium){
        super(name, birthYear, department);
        this.numberOfPaper = numberOfPaper;
        this.numberOfSymposium = numberOfSymposium;
    }

    public int Age() {
        Calendar calendar = Calendar.getInstance();
        return calendar.get(Calendar.YEAR) - getBirthYear();
    }

    @Override
    public double calculateAchievement() {
        return ((3 * numberOfPaper) + (2 * numberOfSymposium)) / Age();
    }
}
