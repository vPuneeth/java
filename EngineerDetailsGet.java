class EngineerDetailsGet{
 static  String[] engineerCollegeName= new String[3];   
 static int[] noOfBranches= new int[3];

public static void main(String a[]){
   
 engineerCollegeName[0]="ait";
engineerCollegeName[1]="kit";
engineerCollegeName[2]="jnnce";
  noOfBranches[0]=8;
        noOfBranches[1]=8;
          noOfBranches[2]=10;
getEngineerCollegeName();
getNoOfBranches();
}

public static void getEngineerCollegeName(){
for(int i=0; i<3 ; i++){
System.out.println(engineerCollegeName[i]);
}
}

public static void getNoOfBranches(){
for(int i=0; i<3 ; i++){
System.out.println(   noOfBranches[i] );
   }
}

             }