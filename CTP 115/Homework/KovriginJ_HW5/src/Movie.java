import java.util.Scanner;

public class Movie {
    static Scanner sc = new Scanner(System.in);
    //Attributes
    private String moviesName;
    private String moviesRating;
    private double moviesAveragePrice;

    //Getters and Setters
    public String getMoviesName() {
        return this.moviesName;
    }

    public String getMoviesRating() {
        return moviesRating;
    }

    public void setMoviesRating(String moviesRating) {
        this.moviesRating = moviesRating;
    }

    public double getMoviesAveragePrice() {
        return moviesAveragePrice;
    }

    public void setMoviesAveragePrice(double moviesAveragePrice) {
        this.moviesAveragePrice = moviesAveragePrice;
    }

    public void setMoviesName(String moviesName) {
        this.moviesName = moviesName;
    }

    //Default constructor
    public Movie() {
        this.moviesName = "";
        this.moviesRating = "";
        this.moviesAveragePrice = 0;
    }

    //Overloaded constructor
    public Movie(String moviesName, String moviesRating, double moviesAveragePrice) {
        this.moviesName = moviesName;
        this.moviesRating = moviesRating;
        this.moviesAveragePrice = moviesAveragePrice;

    }

    //method that calculates the average price of the movie using a loop to get user input
    public double calculateAveMoviePrice() {
        double price = 0;
        int i;
        for (i = 0; i < 3; i++) {
            System.out.println("Please enter movie prices-Ex 13.59.");
            price = price + sc.nextDouble();

        }
        double avePrice = price / i;
        System.out.println("The average price of the movies is: " + avePrice);
        System.out.println("_________________________");

        return avePrice;
//            System.out.println("Please enter second movie price");
//            double userInput2 = sc.nextDouble();
//            System.out.println("Please enter third movie price");
//            double userInput3 = sc.nextDouble();
//            double averagePrice = (userInput1 + userInput2 + userInput3) / 3;
    }

//    @Override
//    public String toString() {
//        //information about the first movie
//
//    }
    public void printMovieInfo(){
        System.out.println("Title:" + moviesName);
        System.out.println("Rating: " + moviesRating);
        System.out.println("Average Price:"+ moviesAveragePrice);
        System.out.println("________________________");
    }
}






