package refactoring;

import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

import javax.xml.stream.XMLStreamException;

public class Customer {
  private String _name;
  private ArrayList<Rental> _rentals = new ArrayList<Rental>();
  private double _totalAmount;
  private int _points;

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

  public int getPoints() {
    return _points;
  }

  public void calculateAmountAndPoints() {

    for (Rental rental : _rentals) {
      this._totalAmount += rental.getAmount();
      this._points += rental.getPoints(); // updatePoints method in Rental
      System.out.println(_totalAmount);
      System.out.println(_points);
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

}