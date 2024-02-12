package com.driver;

public class Main {

    public static class A {

        public String meth() {
            String str = "Invoking method from class A";
            return str;
        }
    }
    public static class B extends A{

        @Override
        public String meth(){
            String str = "Method is overridden in Extendend class B";
            return str;
        }
    }
        public void main(String[] args) {
            B obj1 = new B();
            String s = obj1.meth();

            B obj2 = new B();
            String str = obj2.meth();

            System.out.println(s);
            System.out.println(str);
        }

}
