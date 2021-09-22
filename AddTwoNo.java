class AddTwoNo{
 public static void main(String a[]){
    add(232,246);                                         //by using methodname it should be declared inside main//
  add(22,46);
  add(292,946);                                       //22,46,... are arguments//
  add(5032,746);                                   /int x ,int y are parameters...arguments and parameters should be same otherwise compile time error//
  
}

 public static void add(int x , int y){        //written outside main method//
                       int total =x +y;                                         //methodName - add//  //returntype - p s v //
System.out.println(total);                                                   //other way of declaring---  without int total = x + y directly we can give System.out.println(x + y)//
}
  }                            