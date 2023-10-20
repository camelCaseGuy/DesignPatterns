package refactoring;

public class Rental {
  private Movie _movie;
  private int _daysRented;
  private PriceCalculationStrategy _priceStrategy;
  private PointsCalculationStrategy _pointsStrategy;

  public Rental(Movie movie, int daysRented) {
    _daysRented = daysRented;
    _movie = movie;
    setStrategies(movie);
    _pointsStrategy.setPoints(daysRented);
  }

  private void setStrategies(Movie movie) {
    switch (movie.getType()) {
      case "regular":
        _priceStrategy = new RegularMoviePriceCalculationStrategy();
        _pointsStrategy = new RegularMoviePointsCalculationStrategy();
        break;
        
        case "childrens":
        _priceStrategy = new ChildrensPriceCalculationStrategy();
        _pointsStrategy = new ChildrensPointsCalculationStrategy();
        break;
        
        case "newRelease":
        _priceStrategy = new NewReleasePriceCalculationStrategy();
        _pointsStrategy = new NewReleasePointsCalculationStrategy();
        
        default:
        _priceStrategy = new PriceCalculationStrategy();
        _pointsStrategy = new PointsCalculationStrategy();
        break;
    }
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