package refactoring;

public class Main {
    public static void main(String[] args) {
        Customer greg = new Customer("Greg");
        // RegularMovie titanicMovie = new RegularMovie("Titanic", new RegularMoviePriceCalculationStrategy());
        Movie titanicMovie = new Movie("Titanic");
        Movie careBearsMovie = new Movie("Care Bears");
        Movie oppenheimerMovie = new Movie("Oppenheimer");
        Movie someMovie = new Movie("A Movie");
        Rental titanicRental = new Rental(titanicMovie, 3);
        // double amount = titanicRental.getAmount();
        Rental careBearsRental = new Rental(careBearsMovie, 3);
        Rental oppenheimerRental = new Rental(oppenheimerMovie, 3);
        Rental someRental = new Rental(someMovie, 3);
        greg.addRental(titanicRental);
        greg.addRental(careBearsRental);
        greg.addRental(oppenheimerRental);
        greg.addRental(someRental);
        greg.calculateAmountAndPoints();
        greg.printStatement(greg);
      }
}
