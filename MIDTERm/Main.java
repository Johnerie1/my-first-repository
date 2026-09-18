public class Main{
   public static void main(String[] args){
   
   Movie movie1 = new Movie();
   movie1.title = "Cinderella";
   movie1.genre = "Fairy Tale";
   movie1.duration = 113;
   
   Movie movie2 = new Movie();
   movie2.title = "Frozen";
   movie2.genre = "Fantasy";
   movie2.duration = 102;
   
   Movie movie3 = new Movie();
   movie3.title = "SnowWhite";
   movie3.genre = "Fantasy";
   movie3.duration = 83;
   
   movie1.displayInfo();
   movie2.displayInfo();
   movie3.displayInfo();


}
}