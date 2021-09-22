import java.util.Scanner; 
class BankingUtil{
static String[] nominee = new String[2];


 public static void main(String a[]){
Scanner sc = new Scanner(System.in);

System.out.println("enter min balance ");
String minBalance = sc.next();  

System.out.println("enter ur age");
String age = sc.next();

 
Banking.create(nominee , Integer.parseInt(age) , Integer.parseInt(minBalance));
   }
}
