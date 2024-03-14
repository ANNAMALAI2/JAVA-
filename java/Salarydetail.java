abstract class Salary {
    protected String name, dep, company;
    protected int nodays, salary;
    public abstract void getsalary(int salary, int nodays);
    public abstract void getcompanyname(String company);
    public abstract void getworkingdays(int nodays);
    public Salary(String name, String dep, int nodays, int salary, String company) {
        this.name = name;
        this.dep = dep;
        this.nodays = nodays;
        this.salary = salary;
        this.company = company;
    }
}
class Depstaff extends Salary {
    public Depstaff(String name, String dep, int nodays, int salary, String company) {
        super(name, dep, nodays, salary, company);
        System.out.println("Department staff Salary Details");
    }
    @Override
    public void getsalary(int salary, int nodays) {
        System.out.println("Salary:" + (salary * nodays));
    }
    @Override
    public void getcompanyname(String company) {
        System.out.println("The company name:" + company);
    }
    @Override
    public void getworkingdays(int nodays) {
        System.out.println("The number of working days:" + nodays);
    }
}
class Nontechstaff extends Salary {
    public Nontechstaff(String name, String dep, int nodays, int salary, String company) {
        super(name, dep, nodays, salary, company);
        System.out.println("Notechstaff Salary Details");
    }
    @Override
    public void getsalary(int salary, int nodays) {
        System.out.println("Salary:" + (salary * nodays));
    }
    @Override
    public void getcompanyname(String company) {
        System.out.println("The company name:" + company);
    }
    @Override
    public void getworkingdays(int nodays) {
        System.out.println("The number of working days:" + nodays);
    }
}
class Office extends Salary {
    public Office(String name, String dep, int nodays, int salary, String company) {
        super(name, dep, nodays, salary, company);
        System.out.println("Office Salary Details");
    }
    @Override
    public void getsalary(int salary, int nodays) {
        System.out.println("Salary:" + (salary * nodays));
    }
    @Override
    public void getcompanyname(String company) {
        System.out.println("The company name:" + company);
    }
    @Override
    public void getworkingdays(int nodays) {
        System.out.println("The number of working days:" + nodays);
    }
}
class Storemanager extends Salary {
    public Storemanager(String name, String dep, int nodays, int salary, String company) {
        super(name, dep, nodays, salary, company);
        System.out.println("Storemanager Salary Details");
    }
    @Override
    public void getsalary(int salary, int nodays) {
        System.out.println("Salary:" + (salary * nodays));
    }
    @Override
    public void getcompanyname(String company) {
        System.out.println("The company name:" + company);
    }
    @Override
    public void getworkingdays(int nodays) {
        System.out.println("The number of working days:" + nodays);
    }
}
public class Salarydetail {
    public static void main(String[] args) {
        Office a = new Office("Annamalai", "CSE", 30, 1000, "Malai Gaming Cafe");
        a.getsalary(1000, 30);
        a.getcompanyname("Malai Gaming Cafe");
        a.getworkingdays(30);
    }
}
