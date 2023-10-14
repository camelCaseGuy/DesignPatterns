package refactoring;

// migrate to regularMovieStrategy
public class RegularMovie {

  private RegularMoviePriceCalculationStrategy _regularMoviePriceCalculationStrategy;

  // public RegularMovie(String title, RegularMoviePriceCalculationStrategy
  // strategy) {
  public RegularMovie(String title) {
    // super(title);
    // _regularMoviePriceCalculationStrategy = strategy;

  }

  public RegularMovie(String title, RegularMoviePriceCalculationStrategy strategy) {

    _regularMoviePriceCalculationStrategy = strategy;

  }

  public double getAmount(int _daysRented) {
    return _regularMoviePriceCalculationStrategy.getAmount(_daysRented);

    // double thisAmount = 2;
    // if (_daysRented > 2) {
    //   thisAmount += (_daysRented - 2) * 1.5;
    // }
    // return thisAmount;
  }

  // public double getAmount() {
  // return _regularMoviePriceCalculationStrategy.getAmount(this);
  // }

}
