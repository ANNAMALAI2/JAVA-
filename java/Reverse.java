public class Reverse {
    public static void main(String[] args)
    {
        int rev=0;
        int number=85321;
        while(number!=0)
        {
            int remainder = number % 10;  
            rev = rev*10 + remainder;  
            number = number/10;  
        }
        System.out.println("Reverse of the number:"+rev);
    }
    
}
