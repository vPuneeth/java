class AirportGet{
 static  String[] airportName= new String[3]; 
static int[] noOfPlatforms= new int[3];


public static void main(String a[]){
airportName[0]="indiragandi airport";
 airportName[1]="kempegowda airport";
 airportName[2]="hubbli aiport";
        noOfPlatforms[0]=13;
        noOfPlatforms[1]=8;
          noOfPlatforms[2]=4;
getAirportName();
getNoOfPlatforms();
}

public static void getAirportName(){
for(int z=0; z<=2; z++){
System.out.println(airportName[z]);
}
}

public static void getNoOfPlatforms(){
for(int z=0; z<=2;z++){
System.out.println(noOfPlatforms[z]);
}
}

}


