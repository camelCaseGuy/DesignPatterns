package refactoring;

public class Rental {
  private Movie _movie;
  private int _daysRented;
  private PriceCalculationStrategy _priceStrategy;
  private PointsCalculationStrategy _pointsStrategy;
  private PriceCalculationFactory _priceFactory;
  private PointsCalculationFactory _pointsFactory;

  public Rental(Movie movie, int daysRented) {
    _daysRented = daysRented;
    _movie = movie;
    _priceFactory = new PriceCalculationFactory();
    _priceStrategy = _priceFactory.setStrategies(movie);
    _pointsFactory = new PointsCalculationFactory(daysRented);
    _pointsStrategy = _pointsFactory.setStrategies(movie);
  }

  public PriceCalculationStrategy setStrategies() {
    return _priceStrategy;
  }

  public PointsCalculationStrategy getPointsStrategy() {
    return _pointsStrategy;
  }

  public int getDaysRented() {
    return _daysRented;
  }

  public Movie getMovie() {
    return _movie;
  }

  public double getAmount() {
    return _priceStrategy.getAmount(_daysRented);
  }

  public int getPoints() {
    return _pointsStrategy.getPoints();
  }

}