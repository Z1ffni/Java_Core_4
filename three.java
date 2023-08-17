class Amphibia {
    public void eat() {
        System.out.println("Amphibia is eating");
    }

    public void sleep() {
        System.out.println("Amphibia is sleeping");
    }

    public void swim() {
        System.out.println("Amphibia is swimming");
    }

    public void walk() {
        System.out.println("Amphibia is walking");
    }
}

class Frog extends Amphibia {
    
}

public class three {
    public static void main(String[] args) {
        Frog frog = new Frog(); 

        
        Amphibia amphibian = frog;

        
        amphibian.eat();
        amphibian.sleep();
        amphibian.swim();
        amphibian.walk();
    }
}