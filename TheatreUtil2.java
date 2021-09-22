import java.util.Scanner;
 class TheatreUtil2{
   static String[] ticketDetails= new String[3];
public static void main(String a[]){
 
  Scanner sc= new Scanner(System.in);
System.out.println("enter the minAge");
String minAge = sc.next();
System.out.println("enter the ticketPrice");
String ticketPrice = sc.next();
System.out.println("enter the theatreCapacity");
String theatreCapacity = sc.next();


System.out.println("enter the theatre name");
String theatreName = sc.next();
System.out.println("enter the movie name");
String movieName = sc.next();
System.out.println("enter the hero name");
String heroName = sc.next();

ticketDetails[0]=theatreName;
ticketDetails[1]=movieName;
ticketDetails[2]=heroName;
 
Theatre.entry(ticketDetails , Integer.parseInt( minAge) , Integer.parseInt(ticketPrice) , Integer.parseInt(theatreCapacity));
}
}

