class Parent {
    Parent() {
        System.out.println("Parent class constructor");
    }
}

class Child extends Parent {
    Child() {
        super(); // ✅ Calls Parent class constructor
        System.out.println("Child class constructor");
    }
}

public class Test {
    public static void main(String[] args) {
        Child obj = new Child();
    }
}
