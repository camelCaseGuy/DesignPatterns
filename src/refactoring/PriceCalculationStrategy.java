package refactoring;

// super class, create three children new release price calculation strategy, etc...
public class PriceCalculationStrategy {

  PriceCalculationStrategy(){

  }

  public double getAmount(int _daysRented) {
    return _daysRented * 1;
  }

}
