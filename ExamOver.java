class ExamOver{


public static void allow(int fees) {  
 System.out.println("inside allow fees method");
if(fees >1000){  
 System.out.println(" write exam");
}else{
System.out.println("pay fees");
System.out.println("end of allow  fees method");
}
}

public static void allow(String[] hallTicket) {                                     
System.out.println("inside allow hallticketmethod");
if(hallTicket != null){
      getHallTicketDetails(hallTicket);
System.out.println("recevie hallticket");
}else{
System.out.println("no hall ticket");
}
System.out.println("end of allow hallticket method");
}




public static void getHallTicketDetails(String[] hallTicket){                             
for(int i=0 ; i<hallTicket.length;i++){
 System.out.println(hallTicket[i]);
   }
}
}