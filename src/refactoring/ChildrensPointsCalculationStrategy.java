package refactoring;

public class ChildrensPointsCalculationStrategy extends PointsCalculationStrategy {
    private int _points;

    @Override
    public int getPoints(){
        return _points;
    }

    @Override
    public void setPoints(int daysRented) {
        _points = daysRented;
    }
}
