package refactoring;

public class NewReleasePriceCalculationStrategy extends PriceCalculationStrategy {
  
  public double getAmount(int _daysRented) {
    double thisAmount = _daysRented * 3; // 3 is BASE_PRICE
    return thisAmount;
  }

}
