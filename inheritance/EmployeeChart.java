package CS5800HW1.inheritance;
import java.util.Scanner;

public class EmployeeChart 
{
    public static void main(String[] args) 
    {
        SalariedEmployee employee = new SalariedEmployee("Joe", "Jones", "111-11-1111", "$2,500");

        HourlyEmployee employee2 = new HourlyEmployee("Stephanie", "Smith", "222-22-2222", "$25", 32);

        HourlyEmployee employee3 = new HourlyEmployee("Mary", "Quinn", "333-33-3333", "$19", 47);

        CommisionEmployee employee4 = new CommisionEmployee("Nicole", "Dior", "444-44-4444", "15%", "$50,000");

        SalariedEmployee employee5 = new SalariedEmployee("Renwa", "Chanel", "555-55-555", "$1,700");

        BaseEmployee employee6 = new BaseEmployee("Mike", "Davenport", "666-66-6666", "$95,000");

        CommisionEmployee employee7 = new CommisionEmployee("Mahnaz", "Vaziri", "777-77-7777", "22%", "$40,000");

        System.out.println(employee);
        System.out.println(employee2);
        System.out.println(employee3);
        System.out.println(employee4);
        System.out.println(employee5);
        System.out.println(employee6);
        System.out.println(employee7);
        
        
        
        
        
        
    }
}
