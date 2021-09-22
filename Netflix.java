class Netflix{

static String movies[] = {"shersha","cindrella","kgf","kgf2"};
static String webSeries[] = {"the family man","four more shots","vampire daries","mumbai daries"};
static String movie = "Dia";
 
public static void main(String a[]){
 System.out.println("main method started");
getMovies(movies);
String mov=getMovies(movie);
System.out.println(mov);
}

public static void getMovies(String[] movies){
System.out.print("get movies methd with string parameter");
for(int i=0; i<movies.length;i++){
System.out.println(movies[i]);
}
}

public static String getMovies(String movie){
return movie;
}
}

