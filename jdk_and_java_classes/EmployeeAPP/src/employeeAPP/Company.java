package employeeAPP;

public class Company
{
    private static int maxId = 0;
    public final static double match401K = 0.05;  // final - once a value is set it cannot be changed

    // public - anyone can set these fields

    public int id;
    public String name;
    public int debt;

    public Company(String name, int debt)
    {
        maxId++;
        this.id = maxId;
        this.name = name;
        this.debt = debt;
    }
}