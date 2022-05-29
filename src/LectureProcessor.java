public class LectureProcessor {
    public static void doIt(Lecturable lecturable) {
        if (lecturable.isQualified()) {
            System.out.println("can lecture...");
        }else {
            System.out.println("cannot lecture");
        }
    }
}

