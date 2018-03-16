package paket;

public class Cat extends AbstractPet implements ISoundable {

    public void breathe() {
        System.out.println("Я дышу легкими");
    }

    public void sound() {
        System.out.println("Я мяукаю");
    }
}
