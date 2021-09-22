class SpeakerUtil{
 
 public static void main(String a[]){
 
  boolean isConnected = Speaker.onOrOff();
System.out.println("system is connected    "  +  isConnected);


Speaker.increaseVolume();
Speaker.increaseVolume();
Speaker.increaseVolume();
Speaker.increaseVolume();

Speaker.decreaseVolume();
Speaker.decreaseVolume();
Speaker.decreaseVolume();
Speaker.decreaseVolume();
boolean isCon =  Speaker.onOrOff();
System.out.println("system is connected "  + isCon);
boolean isConnect =  Speaker.onOrOff();
System.out.println("system is connected "  + isConnect);


}

}