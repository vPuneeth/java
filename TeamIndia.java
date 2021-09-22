class TeamIndia{
  
 public static void main(String a[]){
  String[] teamIndiaPlayers = new String[5];
                teamIndiaPlayers[0]="virat";
                teamIndiaPlayers[1]="rohit";
                teamIndiaPlayers[2]="rahul";
                teamIndiaPlayers[3]="jadeja";
               teamIndiaPlayers[4]="bumrah";
  int[] playersJerseyNo = new int[5];
         playersJerseyNo[0]=18;
          playersJerseyNo[1]=45;
          playersJerseyNo[2]=1;
       playersJerseyNo[3]=8;
       playersJerseyNo[4]=37;
 

for(int i=0; i<teamIndiaPlayers.length;i++){
System.out.println(teamIndiaPlayers[i]);
}
for(int i=0; i<=4;i++){
System.out.print(playersJerseyNo[i] +  "- -");
System.out.print(i  + "   ");
}

}


}