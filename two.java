class MyClass {
    private int value1;
    private int value2;

    public MyClass(int value) {
        this(value, 0); 
    }

    public MyClass(int value1, int value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public void displayValues() {
        System.out.println("Value1: " + value1 + ", Value2: " + value2);
    }
}

public class two {
    public static void main(String[] args) {
        MyClass obj1 = new MyClass(10);
        obj1.displayValues(); 

        MyClass obj2 = new MyClass(20, 30);
        obj2.displayValues(); 
    }
}