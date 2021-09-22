import java.util.Scanner; 
class ElectionUtil{


 public static void main(String a[]){
Scanner sc = new Scanner(System.in);
System.out.println("enter the age");
String age = sc.next();  
System.out.println("enter the voter id details");
String voterId = sc.next();  
String value = Election.voting(Integer.parseInt(age));    
System.out.println(value);
   }
}
