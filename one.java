abstract class Pet {
    public abstract void voice();
}

class Cow extends Pet {
    @Override
    public void voice() {
        System.out.println("Я корова - Мууу-Мууу");
    }
}

class Cat extends Pet {
    @Override
    public void voice() {
        System.out.println("Я кіт - Мяууу-Мяууу");
    }
}

class Dog extends Pet {
    @Override
    public void voice() {
        System.out.println("Я пес - Гаууу-Гаууу");
    }
}

public class one {
    public static void main(String[] args) {
        Pet cow = new Cow();
        Pet cat = new Cat();
        Pet dog = new Dog();

        cow.voice();
        cat.voice();
        dog.voice();
    }
}