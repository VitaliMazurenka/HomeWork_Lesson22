package homeWork_Lesson22;

public class Robot {

    private String model;
    private String material;

    private int level;


    public Robot(String model, String material, int level) {
        this.model = model;
        this.material = material;
        this.level = level;
    }

    public String getModel() {
        return model;
    }

    public String getMaterial() {
        return material;
    }

    public int getLevel() {
        return level;
    }

    public String toString() {
        return model + " " + material + " " + level;
    }

    public void checkIfCanTalk() {
        System.out.println("Robot model " + model + ", " + material + " Robot." + " Level is: " + level + ", can't talk");
    }
}
