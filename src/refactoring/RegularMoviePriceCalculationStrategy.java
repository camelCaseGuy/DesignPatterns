package refactoring;

public class RegularMoviePriceCalculationStrategy {
  
  public RegularMoviePriceCalculationStrategy() {

  }
  
  public RegularMoviePriceCalculationStrategy(String title) {

  }

  public double getAmount(int _daysRented) {
    double thisAmount = 2;
    if (_daysRented > 2) {
      thisAmount += (_daysRented - 2) * 1.5;
    }
    return thisAmount;
  }
  
}
