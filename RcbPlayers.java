import java.util.Scanner;
class RcbPlayers{
 static String[] playerName = new String[3];
 public static void main(String a[]){
 Scanner sc = new Scanner(System.in);
System.out.println("enter playerName- 1");
 playerName[0]= sc.next();
System.out.println("enter playerName- 2");
playerName[1] = sc.next();
System.out.println("enter playerName- 3");
playerName[2] = sc.next();

for (int i=0;i<=2;i++){
System.out.println(playerName[i]);
}

}
  }
    
 