package employeeAPP;

public class Main
{
    // fields - information
    // methods(functions) - do behaviors

    public static void main(String[] args)
    {
        Healthplan h1 = new Healthplan("My Health 1");
        Healthplan h2 = new Healthplan("My Health 2");
        
        Company c1 = new Company("Company A", 100);  // (company name, debt)
        Company c2 = new Company("Company B", 100);

        // to access a public field - object_name.field
        // to access a getter/setter - object_name.get_object/set_object()
        Employee emp1 = new Employee("Steve", "Green", 45000, true, c1.id, h1.getId());
        Employee emp2 = new Employee("May", "Ford", 80000, true, c1.id, h2.getId());
        Employee emp3 = new Employee("Doug", "John", 75000, true, c1.id, h2.getId());
        Employee emp4 = new Employee("John", "Jones", 80000, false, c1.id, h1.getId());
        Employee emp5 = new Employee("My", "Name", 45000, true, c1.id, h2.getId());

        System.out.println("*** Query Data ***");
        System.out.println(emp1);
        System.out.println();
        System.out.println(c1.debt);
        c1.debt = -c1.debt;
        System.out.println(c1.debt);

        System.out.println("*** Strings ***");

        String localString;
        localString = emp1.getFname() + " " + emp3.getLname();
        System.out.println(localString);
        String noVowels = localString.toLowerCase().replaceAll("[a, e, i, o, u]", "_");

        System.out.println();
        System.out.println("*** Numbers ***");
        System.out.println("Original / 5 " + (c1.debt / 5));
        System.out.println("Original / 7 " + (c1.debt / 7));
        System.out.println("Original / 7.0 " + (c1.debt / 7.0));
        // System.out.println("Original / 7 " + ((double)c1.debt / 7));
        System.out.println("Original mod 3 " + (c1.debt % 3)); // When 3 goes into 100 (33 times), what is the remainder?
    }
}