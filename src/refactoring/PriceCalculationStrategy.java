package refactoring;

// super class, create three children new release price calculation strategy, etc...
public class PriceCalculationStrategy {

  public double getAmount(String type, int _daysRented) {
    return _daysRented * 1;
  }

}
