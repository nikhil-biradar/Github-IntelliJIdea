package oops.polymorphism;

class SuperClass {
    public Object m1(){
        System.out.println("m1 - SuperClass");
        return null;
    }
}

class SubClass extends SuperClass {
    @Override
    public String m1() {
        System.out.println("m1 - SubClass");
        return null;
    }
}

public class CovariantType {
    public static void main(String[] args) {
        SuperClass obj = new SubClass();
        obj.m1();
    }
}
