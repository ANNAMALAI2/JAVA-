public class Aggregation {
    int m1, m2, m3, m4, m5;
    String sub;
    String sname;
    final void Display() {
        System.out.println("This is display");
    }
}
class Result {
    Aggregation Sdetail;
    int Getresult(int m1, int m2, int m3, int m4, int m5) {
        int sum = m1 + m2 + m3 + m4 + m5;
        int avg = sum / 5;
        System.out.println(avg);
        return sum; 
        
    }
    public static void main(String[] args) {
        Result r = new Result();  
        Aggregation detail = new Aggregation();
        detail.sname = "John";
        detail.sub = "Maths";
        detail.m1 = 50;
        detail.m2 = 60;
        detail.m3 = 70;
        detail.m4 = 80;
        detail.m5 = 90;     
        int res = r.Getresult(detail.m1, detail.m2, detail.m3, detail.m4, detail.m5);
        
        System.out.println("Total marks: " + res);
        detail.Display();
    }
}
