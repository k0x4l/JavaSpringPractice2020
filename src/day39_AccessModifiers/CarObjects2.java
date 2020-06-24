package day39_AccessModifiers;

public class CarObjects2 {
    public static void main(String[] args) {
        Car2 car1 = new Car2("Toyota");
        System.out.println(car1);

        Car2 car2 = new Car2("BMW","X6");
        System.out.println(car2);

        Car2 car3 = new Car2("Mercedes","E200",2019);
        System.out.println(car3);

        Car2 car4 = new Car2("Ford","Mustang",2020,15000);
        System.out.println(car4);
    }
}
