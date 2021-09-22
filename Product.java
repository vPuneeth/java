import java.util.Scanner;
class Product{


static String productName;
static int productQuantity;
static int productPrice;
static int totalCost;

 public static void main(String a[]){


Scanner sc = new Scanner(System.in);
System.out.println("enter the product name");
String productname = sc.next();
System.out.println("enter the product quantity");
String productQuantity = sc.next();
System.out.println("enter the product price");
String productPrice= sc.next();
totalCost=productQuantity*productPrice;
System.out.println(totalCost);

}

 }

