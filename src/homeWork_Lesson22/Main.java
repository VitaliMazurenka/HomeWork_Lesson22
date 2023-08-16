package homeWork_Lesson22;

import inheritanceDemo.Employee;

public class Main {
    public static void main(String[] args) {
        Robot c1 = new Robot("T-101", "steel", 1);
        Cyber c2 = new Cyber("T-1000", "Liquid metal", 2);
        ChuckNorris c3 = new ChuckNorris("One of a mankind", "plasma", 88);

        c1.checkIfCanTalk();
        c2.checkIfCanTalk();
        c3.checkIfCanTalk();

        c2.Action();
        c3.Extra();

        Robot[] robots = {c1, c2, c3};
        for (Robot e : robots)
            e.checkIfCanTalk();

    }
}
