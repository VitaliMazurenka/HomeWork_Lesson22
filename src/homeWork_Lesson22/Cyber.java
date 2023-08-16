package homeWork_Lesson22;

public class Cyber extends Robot {
    public Cyber(String model, String material, int level) {
        super(model, material, level);
    }

    public String toString() {
        return "Cyber" + super.getModel() + " " + super.getMaterial() + " " + super.getLevel();
    }

    public void Action() {
        System.out.println("This is Cyber, model" + super.getModel() + ". I can fight");

    }

    @Override
    public void checkIfCanTalk() {
        System.out.println("Robot model " + super.getModel() + ", " + super.getMaterial() + " Robot." + " Level is: " + super.getLevel() + ", can talk");
    }
}
