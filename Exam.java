class Exam{


 static int fees = 1350;

public static void allow(String[] hallTicket) {                                     //methodname is allow.allow is functionality of class exam//
System.out.println("inside allow method");

  if (fees > 1000) {
  System.out.println("fees is paid giv hallticket");
      if (hallTicket != null){
           getHallTicketDetails(hallTicket);                                                              //is another method whic not been declared anywhere above hence declared below in anothe rmethod//
          System.out.println("allowed to write exam");                           //return allowedToWriteExam;//
  }
else{
System.out.println("no hallticket found");
}

}else{
System.out.println("pay the fees");
}
System.out.println("end of allow method");
}
public static void getHallTicketDetails(String[] hallTicket){                                //another method get//
for(int i=0 ; i<hallTicket.length;i++){
 System.out.println(hallTicket[i]);
   }
 }

}


