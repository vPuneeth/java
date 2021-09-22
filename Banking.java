class Banking{
   static String bankName="S.B.I";
   static int minBalance ;
   static int age ;

public static void create(String[] nominee , int age, int minBalance){
  if(minBalance > 400){
  System.out.println("go and give nominee details");
     if( age > 18){
     System.out.println("collect pass book");
     }
  else {
               System.out.println("grow up kid");
             }  
}else {
                        System.out.println("maintain min balance beggar");
                    }
         }
}
