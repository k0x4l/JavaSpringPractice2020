package day43_2;

 public class methodOverriding {

    public  void method1(){
        System.out.println("super class");
    }

}

class Test extends methodOverriding{

    @Override
    public  void method1(){
         System.out.println("sub class");
     }

    public static void main(String[] args) {

        methodOverriding obj1 = new methodOverriding();
        obj1.method1();

        System.out.println("====");

        Test obj2 = new Test();
        obj2.method1();

    }


}
