package day02_Variables;

public class StringPractice {

    public static void main(String[] args) {

        String ssn = "123";
        String employeeName1 = "Sha Rejebov";
        String CompanyName = "Bank Of America";

        System.out.println(employeeName1);
        System.out.println(CompanyName);

        System.out.println(employeeName1+" works at "+CompanyName);

        System.out.println("========================================================");

        String employeeName = "k3r3m";
        String companyName = "Chase";
        int employeeID = 672;
        String Jobtitle = "Manager";
        double salary = 10000;
        int SSN = 987456321;

        System.out.println("Employee Name : "+employeeName);
        System.out.println("Company Name : "+companyName);
        System.out.println("Employee ID : "+employeeID );
        System.out.println("Job Title : "+Jobtitle);
        System.out.println("Salary of "+employeeName+" : "+salary);
        System.out.println("SSN : "+SSN+"\n");
        System.out.println(employeeName+" works at "+companyName+" as a "+Jobtitle+"\nwith "+salary+"$ salary and his/her SSN number is "+SSN+".");
        System.out.println("========================================================");



    }
}
