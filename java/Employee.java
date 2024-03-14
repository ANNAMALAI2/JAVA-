public class Employee {
    static void calculate(String name,int id,int salary,int days)
    {
        System.out.println("Monlthly salary:"+salary*days);
    }
    public static void main(String[] args)
    {
        calculate("Annamalai",18,1000,30);
    }
}
