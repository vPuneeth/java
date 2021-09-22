import java.util.Scanner;

class CompareNos{

 
 public static void main(String a[]){

Scanner sc= new Scanner(System.in);
System.out.println("enter the d");
int d = sc.nextInt();
System.out.println("enter the b");
int b = sc.nextInt();
System.out.println("enter the c");
int c = sc.nextInt();

if(d > b){
System.out.println("condition is true");
  if(b > c){
System.out.println("condition is true again");
 }else{
   System.out.println("maths kali");
}
}else{
 System.out.println("basics kali");
}
}
}