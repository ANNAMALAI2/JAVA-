interface Android {
   void makeCall(String number);
   void sendMessage(String number,String message);
   void browseInternet(String url);
   void getwifi(String Ip);
   void AndroidOS(String os);
}
interface IPhone{
   void Ios(String os);
} 
public class Oneplus implements Android, IPhone {
    @Override
    public void makeCall(String number) {
        System.out.println("Making call from New Mobile Brand to " + number);
    }

    @Override
    public void sendMessage(String number, String message) {
        System.out.println("Sending message from New Mobile Brand to " + number + ": " + message);
    }

    @Override
    public void browseInternet(String url) {
        System.out.println("Browsing internet on New Mobile Brand to URL: " + url);
    }
    
}





   
