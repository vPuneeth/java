         class IplGet{
 static int totalTeams= 8;
 static String[] iplTeams={"csk", " rcb","rr","mi","kkr","dc","kxip","srh"};
static int[] noOfTitlesWon={3,0,1,5,2,0,0,1};


public static void main(String a[]){
getTotalTeams();
getIplTeams();
getNoOfTitlesWon();
}

public static void getTotalTeams(){
System.out.println( totalTeams);
}

public static void getIplTeams(){
for(int i=0; i<7; i++){
System.out.println(iplTeams[i]);
}
}

public static void getNoOfTitlesWon(){
for(int i=0; i<7; i++){
System.out.println(noOfTitlesWon[i]);
}
}
}


