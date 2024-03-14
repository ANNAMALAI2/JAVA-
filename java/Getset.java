public class Getset
{
    private int acc_num;
    public int getAcc_num() {
        return acc_num;
    }
    public void setAcc_num(int acc_num) {
        this.acc_num = acc_num;
    }
    private int id;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    private int balance;
    public int getBalance() {
        return balance;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }
    public static void main(String[] args)
    {
        Getset obj=new Getset();
        obj.setAcc_num(123456);
        System.out.println(obj.getAcc_num());

    }

}