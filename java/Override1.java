public class Override1 {
    int sum(int a,int b)
    {
        int sum=a+b;
        return sum;
    }
    
}
class Classoverride extends Override1
{
@Override
int sum(int a,int b)
{
    int sum=a+b;
    int avg=sum/2;
    System.out.println(sum);
    return avg;
}
public static void main(String[] args)
{
    Override1 o=new Override1();
    Classoverride c=new Classoverride();
    System.out.println( o.sum(1, 9));
    System.out.println( c.sum(1, 9));
}
}
