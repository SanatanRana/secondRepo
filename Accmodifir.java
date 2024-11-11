public class Accmodifir {
    public static void main(String[] args) {
        Bankacc b1 =new Bankacc();
        b1.user ="rahul";
        b1.setpassword(456);
        System.out.println(b1.user);
    }
    
}
class Bankacc{
    public String  user;
    private int password;
    public void setpassword(int n){
           password =n;
           System.out.println(password);
    }

}