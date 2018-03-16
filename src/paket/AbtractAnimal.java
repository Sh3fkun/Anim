package paket;

public abstract class AbtractAnimal {

    private double weight;

    private int age;

    public void eat() {
        System.out.println("Я ем");    
    }

    public void setWeight(double weiht) {
        this.weight=weiht;
    }

    public double getWeight() {
        return this.weight;
    }

    public void setAge(int age) {
        this.age=age;
    }

    public int getAge() {
        return this.age;
    }

    public abstract void breathe();
}
