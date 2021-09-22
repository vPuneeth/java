//return value type = boolean//
//return type must also be = boolean//

class Speaker{

static String name ="boat";
static int maxVolume=5;
static int minVolume=0;
static boolean isConnected= false;          //by default made false//
static int currentVolume;

public static boolean onOrOff(){
 if(isConnected == false){
   isConnected=true;  
 System.out.println("turned on");                    //made true//
 return isConnected;          //true vale returned//
}else{
 isConnected=false;
 System.out.println("turned off"); 
 return isConnected;          //default value false//
}
}



public static void increaseVolume(){

if(isConnected){
  if(currentVolume < maxVolume){
      currentVolume=currentVolume+1;
     System.out.println("current volume is  "  +  currentVolume);
     }else{
      System.out.println("max volume reached");
    }
}
}

public static void decreaseVolume(){

if(isConnected){
  if(currentVolume >minVolume){
      currentVolume=currentVolume-1;
     System.out.println("current volume is  "  +  currentVolume);
     }else{
      System.out.println("min volume reached");
    }

}
}
}

 