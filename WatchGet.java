class WatchGet{
 static String[] watchBrand=new String[3];
 static int[] costOfBrand= new int[3];


public static void main(String a[]){
watchBrand[0]="sonata";
watchBrand[1]="rolex";
watchBrand[2]="hmt";
costOfBrand[0]=30000;
costOfBrand[1]=27000;
costOfBrand[2]=33000;
getWatchBrand();
getCostOfBrand();
}


public static void getWatchBrand(){
for(int z=0; z<=2; z++){
System.out.println(watchBrand[z]);
}
}

public static void getCostOfBrand(){
for(int z=0; z<=2;z++){
System.out.println(costOfBrand[z]);
}
}

}
