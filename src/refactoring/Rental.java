package refactoring;

public class Rental {
  private Movie _movie;
  private int _daysRented;
  private int _frequentRentalPoints;
  private PriceCalculationStrategy _strategy;
  // BASE_PRICE, BASE_POINTS

  public Rental(PriceCalculationStrategy strategy, int daysRented) {
    _strategy = strategy;
    _daysRented = daysRented;
  }

  public Rental(Movie movie, int daysRented) {
    _movie = movie;
    _daysRented = daysRented;
  }

  public Rental(PriceCalculationStrategy priceCalculationStrategy, 
  Movie movie, int daysRented) {
    _daysRented = daysRented;
    _strategy = priceCalculationStrategy;
    _movie = movie;
  }

  public PriceCalculationStrategy getPriceCalculationStrategy() {
    return _strategy;
  }

  public int getDaysRented() {
    return _daysRented;
  }

  public Movie getMovie() {
    return _movie;
  }

  public double getAmount() {
    return _strategy.getAmount(_movie._type, _daysRented);

  }

  public int getRentalPoints() {
    _frequentRentalPoints++;
    int getBonusPoints = _movie.getBonusPoints(_daysRented);
    _frequentRentalPoints += getBonusPoints;
    return _frequentRentalPoints;
  }
}