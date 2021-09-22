import java.util.Scanner;  

class ExamUtil22{

static String[] hallTicket = new String[3];

public static void main(String a[]){

Scanner sc = new Scanner(System.in);

System.out.println("enter fees");
String fees = sc.next();
System.out.println("enter candidate name");
String candidateName = sc.next();
System.out.println("enter usn ");
String usnNo = sc.next();
System.out.println("enter subject name ");
String subjectName = sc.next();

hallTicket[0] = candidateName;
hallTicket[1] = usnNo;
hallTicket[2] = subjectName;

ExamOver.allow(hallTicket);
ExamOver.allow( 1000);
}
  }

