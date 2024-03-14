abstract class MobilePhone {
    private String brand;
    private String model;
    private double screenSize;
    public MobilePhone(String brand, String model, double screenSize) {
        this.brand = brand;
        this.model = model;
        this.screenSize = screenSize;
    }
    public abstract void makeCall(String phoneNumber);
    public abstract void sendText(String phoneNumber, String message);
    public void getPhoneDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Screen Size: " + screenSize + " inches");
    }
}
class IPhone extends MobilePhone {
    public IPhone(String model, double screenSize) {
        super("Apple", model, screenSize);
    }
    @Override
    public void makeCall(String phoneNumber) {
        System.out.println("Calling " + phoneNumber + " from iPhone...");
    }
    @Override
    public void sendText(String phoneNumber, String message) {
        System.out.println("Sending text message '" + message + "' to " + phoneNumber + " from iPhone...");
    }
}
public class Mobile{
    public static void main(String[] args) {
        IPhone iphone = new IPhone("iPhone 12", 6.1);
        iphone.getPhoneDetails();
        iphone.makeCall("1234567890");
        iphone.sendText("1234567890", "Hello there!");
    }
}
