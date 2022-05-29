public class Administrative extends Personal{

    public Administrative(String name, int id, String department) {
        super(name, id, department);
    }

    @Override
    public double calculateAchievement() {
        return 0;
    }
}
