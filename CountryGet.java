class CountryGet{
static String[] countryName={"India","srilanka","england","australia"};
static  int[] totalStatesOfCountry={29,23,12,19};


 public static void main(String args[]){
getCountryName();
getTotalStatesOfCountry();
}

 public static void getCountryName(){
for(int i=0;i<countryName.length;i++){
 System.out.println(countryName[i]  );
}
}

public static void getTotalStatesOfCountry(){
for(int i=0;i<totalStatesOfCountry.length;i++){
System.out.println(totalStatesOfCountry[i]  );
}

        }


 }

