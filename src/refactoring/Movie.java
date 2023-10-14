package refactoring;

public class Movie {
  
  private String _title;
  private String _type;
  
  public Movie(String title) {
      _title = title;
      switch (title) {
        case "titanic":
          _type = "regular";
          break;
        case "oppenheimer":
          _type = "newRelease";
          break;
        default:
          break;
      }
  }
  
  public String getTitle() {
      return _title;
  }
  
  public String getType() {
      return _type;
  }

  // public double getAmount(int _daysRented) {
  //   return _daysRented * 1;
  // }

  // public int getBonusPoints(int _daysRented) {
  //   return _daysRented * 1;
  // }

}
