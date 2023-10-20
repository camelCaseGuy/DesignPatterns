package refactoring;

public class ChildrensPriceCalculationStrategy extends PriceCalculationStrategy {

  public ChildrensPriceCalculationStrategy(){

  }

  @Override
  public double getAmount(int _daysRented) {
    double thisAmount = 1.5;
    if (_daysRented > 3) {
        thisAmount += (_daysRented - 3) * 1.5;
    }
    return thisAmount;
  }
}
