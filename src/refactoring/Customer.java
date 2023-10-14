package refactoring;

import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

import javax.xml.stream.XMLStreamException;

public class Customer {
  private String _name;
  private ArrayList<Rental> _rentals = new ArrayList<Rental>();
  private double _totalAmount;
  private int _frequentRenterPoints;

  public Customer(String name) {
    _name = name;
  }

  public void addRental(Rental rental) {
    _rentals.add(rental);
  }

  public String getName() {
    return _name;
  }

  public ArrayList<Rental> getRentals() {
    return _rentals;
  }

  public double getTotalAmount() {
    return _totalAmount;
  }

  public int getFrequentRenterPoints() {
    return _frequentRenterPoints;
  }

  public void calculateAmountAndPoints() {

    for (Rental rental : _rentals) {
      this._totalAmount += rental.getAmount();
      this._frequentRenterPoints += rental.getRentalPoints(); // updateFrequentRenterPoints method in Rental
      System.out.println(_totalAmount);
      System.out.println(_frequentRenterPoints);
    }
  }

  public void printStatement(Customer customer) {
    try {
      PrintOutXML.print(customer);
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (UnsupportedEncodingException e) {
      e.printStackTrace();
    } catch (XMLStreamException e) {
      System.err.println(e);
      e.printStackTrace();
    }
  }

  // public static void main(String[] args) {
  //   Customer greg = new Customer("Greg");
  //   Movie titanicMovie = new Movie("Titanic");
  //   Movie careBearsMovie = new ChildrensMovie("Care Bears");
  //   Movie oppenheimerMovie = new NewReleaseMovie("Oppenheimer");
  //   Movie someMovie = new Movie("A Movie");
  //   Rental titanicRental = new Rental(titanicMovie, 3);
  //   Rental careBearsRental = new Rental(careBearsMovie, 1);
  //   Rental oppenheimerRental = new Rental(oppenheimerMovie, 5);
  //   Rental somRental = new Rental(someMovie, 4);
  //   greg.addRental(titanicRental);
  //   greg.addRental(careBearsRental);
  //   greg.addRental(oppenheimerRental);
  //   greg.addRental(somRental);
  //   greg.calculateAmountAndPoints();
  //   greg.printStatement(greg);
  // }
}