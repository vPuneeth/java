class Ncr{

public static void main(String a[]) {

System.out.println(fact(4)/(fact(2)*fact(4-2)));
}

public static int fact(int num){
System.out.println("fact method started ");
 int fact=1;
for(int i=1; i<=num;i++){
fact=fact*i;
}
System.out.println("fact method ended ");
return fact;

}
  }












