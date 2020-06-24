package day39_AccessModifiers;

public class EmployeeObjects2 {

    public static void main(String[] args) {
        Employee2 per1 = new Employee2("Jack");
        System.out.println(per1);

        Employee2 per2 = new Employee2("John","QA");
        System.out.println(per2);

        Employee2 per3 = new Employee2("Mike","SDET",12);
        System.out.println(per3);

        Employee2 per4 = new Employee2("John","PO",43,120000);
        System.out.println(per4);







    }
}
