import java.util.Random;
public class Otp_program{
  public static void main(String[] args)
    {
       int max=999999;
       int min=100000;
       int otp;
       
       System.out.println("six digit number Random Otp genrate program:");
       System.out.println("list of ten otp genrate randomly ");
       for(int i=1;i<=10;i++){
       otp=(int)(Math.random()*(max-min+1)+min);
         System.out.println(i+"OTP : "+otp);
       }
       
    }
}
