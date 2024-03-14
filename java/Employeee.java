public class Employeee {
    int id,phno,sal,nodays;
    String name,address;
    
    int getsalary(int sal)
    {
        System.out.println("Salary per day:"+sal);
        return 0;
    }
    int Calculatewdays(int days,int sal)
    {
        int tsal=days*sal;
        System.out.println("Total salary:"+tsal);
        return 0;
    }

}
class Staff extends Employeee
{
    int yrexp;
    String role,dep_name;
    int getdetails()
    {
        System.out.println("Role:"+role);
        System.out.println("year of experience:"+yrexp);
        System.out.println("Department name:"+dep_name);
        return 0;
    }
    public  static void main(String[] args)
    {
        Staff s=new Staff();
        //s.id=123;
        //s.phno=123456;
        //s.sal=1000;
        //s.nodays=30;
        //s.address="chennai";
        s.role="Software dev";
        s.yrexp=2;
        s.dep_name="Project dev";
        System.out.println(s.getsalary(1000));
        System.out.println(s.Calculatewdays(30,1000));
        System.out.println(s.getdetails());
    }
}
