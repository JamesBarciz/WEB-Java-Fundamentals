package employeeAPP;

public class Employee
{
    // fields - variables

    private static int maxId = 0;  // initialize at '0' so no value till it's assigned
    private int id;                // don't instantiate the id - will be generated (fixed)
    private String fname;
    private String lname;
    private double salary;         // real number - float
    private boolean has401K;
    private int companyId;
    private int healthPlanId;

    // constructor - same name as class but no return type
    // initial state of the object - current value of all of the fields
    // these values go away at the end of the method

    public Employee(String fname, String lname, double salary, boolean has401K, int companyId, int healthPlanId)
    {
        maxId++; // adding a number for each id created

        id = maxId;

        this.fname = fname;
        this.lname = lname;
        this.salary = salary;
        this.has401K = has401K;
        this.companyId = companyId;
        this.healthPlanId = healthPlanId;
    }

    // methods - getters and setters - don't worry about the order
    public int getId() // must include parenthesis even though there is nothing assigned
    {
        return id;
    }

    public void setFname(String fname) // setter
    {
        this.fname = fname; // returnType is void so nothing is returned - 'this' refers to the current object
    }

    public String getFname() // capitalize the field name inside methods - getter (do something before sending it out)
    {
        return fname;
    }

    public void setLname(String lname)
    {
        this.lname = lname;
    }

    public String getLname()
    {
        return lname;
    }

    public void setSalary(double salary)
    {
        this.salary = salary;
    }

    public double getSalary()
    {
        return salary;
    }

    public void setHas401K(boolean has401K)
    {
        this.has401K = has401K;
    }

    public boolean getHas401K()
    {
        return has401K;
    }

    public void setCompanyId(int companyId)
    {
        this.companyId = companyId;
    }

    public int getCompanyId()
    {
        return companyId;
    }

    public void setHealthPlanId(int healthPlanId)
    {
        this.healthPlanId = healthPlanId;
    }

    public int getHealthPlanId()
    {
        return healthPlanId;
    }

    // methods
    public String getName()
    {
        return fname + " " + lname;
    }

    // Object -> Employee (child class)
    @Override
    public String toString()
    {
        String rtString = "id: " + id + "\n" +
                          "fname: " + fname + "\n" +
                          "lname: " + lname + "\n" +
                          "salary: " + salary + "\n" +
                          "has401K: " + has401K + "\n" +
                          "companyId: " + companyId + "\n" +
                          "healthPlanId: " + healthPlanId + "\n";
        return rtString;
    }
}