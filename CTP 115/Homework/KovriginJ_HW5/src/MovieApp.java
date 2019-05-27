import javax.sound.midi.Soundbank;
import java.util.Scanner;
public class MovieApp {

    public static void main(String[] args) {

        //create fist movie
        Movie oneMovie = new Movie();
        Movie secondMovie = new Movie("Avengers", "PG-13", 8.0);

        oneMovie.setMoviesName("Black Panther");
        oneMovie.setMoviesRating("R");

//        System.out.println("Please enter the price of the movie ");
//        Scanner sc=new Scanner(System.in);
//        double v = oneMovie.sc.nextDouble(System.in);


        oneMovie.setMoviesAveragePrice(oneMovie.calculateAveMoviePrice());

        System.out.println("First movie info");
        oneMovie.printMovieInfo();

        System.out.println("Second movie info");
        secondMovie.printMovieInfo();


    }


   }
