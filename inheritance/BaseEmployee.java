package CS5800HW1.inheritance;

public class BaseEmployee extends Employee
{
    private String baseSalary;
    public BaseEmployee(String firstName, String lastName, String sSNumber, String baseSalary)
    {
        super(firstName, lastName, sSNumber);
        this.baseSalary = baseSalary;
    }
    
    public String getBaseSalary()
    {
        return baseSalary;
    }
    public void setBaseSalary(String baseSalary)
    {
        this.baseSalary = baseSalary;
    }
}
