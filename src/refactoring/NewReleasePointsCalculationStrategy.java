package refactoring;

public class NewReleasePointsCalculationStrategy extends PointsCalculationStrategy {
    int _points;

    @Override
    public int getPoints() {

        return _points;
    }

    @Override
    public void setPoints(int daysRented) {
        _points = (daysRented - 1) * 2;
    }
    
}
