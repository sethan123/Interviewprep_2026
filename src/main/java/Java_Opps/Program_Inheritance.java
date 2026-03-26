package Java_Opps;

class Demo {
    void demo() {
        System.out.println("Executing Demo");
    }
}

class Test extends Demo {
    void test() {
        System.out.println("Executing Test");
    }
}

public class Program_Inheritance {
    public static void main(String[] args) {
        Test t = new Test();
        t.test();
        t.demo();
    }
}