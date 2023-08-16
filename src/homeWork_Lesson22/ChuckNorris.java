package homeWork_Lesson22;

public class ChuckNorris extends Robot {
    public ChuckNorris(String model, String material, int level) {
        super(model, material, level);
    }

    public String toString() {
        return "ChuckNorris" + super.getModel() + " " + super.getMaterial() + " " + super.getLevel();
    }

    public void Action() {
        System.out.println("This is ChuckNorris, model" + super.getModel() + ". I'm immortal'");
    }

    public void Extra() {
        System.out.println("I can do everything, bro!");
    }

    public void checkIfCanTalk() {
        System.out.println("Robot model " + super.getModel() + ", " + super.getMaterial() + " Robot." + " Level is: " + super.getLevel() + ", can talk with alive and dead");
    }
}

