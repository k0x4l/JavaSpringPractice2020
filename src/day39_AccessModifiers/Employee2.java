package day39_AccessModifiers;

public class Employee2 {

    String name;
    String jobtitle;
    int ID;
    double salary;

    public Employee2(String name){
        this.name = name;
    }

    public Employee2(String name,String jobtitle){
        this(name);
        this.jobtitle = jobtitle;
    }

    public Employee2(String name, String jobtitle, int ID){
        this(name, jobtitle);
        this.ID=ID;
    }

    public Employee2(String name, String jobtitle, int ID, double salary){
        this(name, jobtitle, ID);
        this.salary=salary;
    }

    public String toString(){
        return name+" "+jobtitle+" "+ID+" "+" $"+salary;
    }
 }
