interface basicAnimal {
    void eat();
    void sleep();
}

class monkey {
    void jump() {
        System.out.println("Jumping...");
    }
    void bite() {
        System.out.println("Biting...");
    }
}

class human extends monkey implements basicAnimal {
    void speak() {
        System.out.println("Speeking...");
    }

    @Override
    public void eat() {
        System.out.println("Eating...");
    }
    @Override
    public void sleep() {
        System.out.println("Sleeping...");
    }
}

public class polymorphismThird {
    public static void main(String[] args) {
        monkey mayank = new human();
        // mayank.speak();       // Error
        mayank.jump();

        basicAnimal mino = new human();
        // mino.speak();         // Error
        mino.sleep();
    }
}