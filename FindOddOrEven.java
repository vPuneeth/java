

import java.util.Scanner;
class FindOddOrEven{
 
 static  int num;
public static void main(String a[]){
Scanner sc = new Scanner(System.in);
System.out.println("enter the num");
int num = sc.nextInt();

if(num % 2 == 0){


System.out.println("num is even");
}
else{
System.out.println("num is odd");
}
}
}
