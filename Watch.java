class WatchFor{
public static void main(String a[]){

String[] watchBrand=new String[3];
             watchBrand[0]="sonata";
watchBrand[1]="rolex";
watchBrand[2]="hmt";
 int[] costOfBrand= new int[3];
costOfBrand[0]=30000;
costOfBrand[1]=27000;
costOfBrand[2]=33000;

for(int z=watchBrand.length-1; z>=0; z++){
System.out.println(watchBrand[z]);
}

for(int z=costOfBrand.length-1; z>=0;z++){
System.out.println(costOfBrand[z]);
}

}
}
