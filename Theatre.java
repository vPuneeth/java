class Theatre{
 
 static int theatreCapacity= 400;
 static int ticketPrice=250;



public static void entry(String[] ticketDetails, int minAge , int ticketPrice , int theatreCapacity   ){

 if( minAge > 18){
 System.out.println("go and take ticket");
      if( ticketPrice < 250){
      System.out.println("collect ticket and enter theatre"); 
      getMovieDetails(ticketDetails);
            if(theatreCapacity < 400){
            System.out.println("get to your seat and enjoy the movie");   
            }else{ 
                   System.out.println("return the ticket and collect it's Price");
                 }
      }else{
                  System.out.println("go to home and sleep"); 
                 }
 }else{
            System.out.println("grow up first");
         }
}

public static void  getMovieDetails(String[] ticketDetails){
 for(int i=0; i<3;i++){
   System.out.println(ticketDetails[i]);
  }
}

}
