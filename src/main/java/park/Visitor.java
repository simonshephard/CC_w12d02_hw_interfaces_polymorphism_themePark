package park;

public class Visitor {

    private int age;
    private double height;
    private double money;

    public Visitor(int age, double height, double money) {
        this.age = age;
        this.height = height;
        this.money = money;
    }


    public int getAge() {
        return this.age;
    }
    public double getHeight() {
        return this.height;
    }
    public double getMoney() {
        return this.money;
    }

}
