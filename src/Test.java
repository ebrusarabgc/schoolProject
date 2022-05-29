public class Test {

    public static void main(String[] args) {
        
        Academic ac1 = new Academic("david", 1965, "CEng", 23, 37);
        Academic ac2 = new Academic("ian", 1977, "math", 10, 4);

        Administrative ad1 = new Administrative("sue", 1985, "manage");

        Preparatory p1 = new Preparatory("joe", 1.8, 2);
        Preparatory p2 = new Preparatory("kelly", 3.2, 2);
        Preparatory p3 = new Preparatory("larry", 3.5, 3);

        Graduate g1 = new Graduate("kim", 2.2, 1);
        Graduate g2 = new Graduate("jenny", 2.6, 7);
        Graduate g3 = new Graduate("william", 3.8, 2);

        UnderGraduate u1 = new UnderGraduate("bob", 4.0, 0.77);
        UnderGraduate u2 = new UnderGraduate("frank", 2.5, 0.92);
        UnderGraduate u3 = new UnderGraduate("sarah", 1.9, 0.25);

        Erasmus e1 = new Erasmus("lee", 2.9, "South Korea");
        Erasmus e2 = new Erasmus("yong", 3.6, "China");

        Object[] o = {ac1, ac2, ad1, p1, p2, p3, g1, g2, g3, u1, u2, u3, e1, e2};

        for (Object value : o) {
            LectureProcessor.doIt((Lecturable) value);
        }
    }

}

