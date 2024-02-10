
public class Stock {
    private String symbol;
    private String name;
    private double previousClosingPrice;
    private double currentPrice;

    public Stock(String symbol, String name) {
        this.symbol = symbol;
        this.name = name;
    }

    public String getSymbol() {
        return symbol;
    }

    public String getName() {
        return name;
    }

    public double getPreviousClosingPrice() {
        return previousClosingPrice;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    public void setPreviousClosingPrice(double previousClosingPrice) {
        this.previousClosingPrice = previousClosingPrice;
    }

    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }

    public double changePercent() {
        return ((currentPrice - previousClosingPrice) / previousClosingPrice) * 100;
    }

    public static void main(String[] args) {
        
        Stock myStock = new Stock("SUNW", "Sun Microsystems Inc");

        myStock.setPreviousClosingPrice(100);

        myStock.setCurrentPrice(90);

        System.out.println("Stock Symbol: " + myStock.getSymbol());
        System.out.println("Stock Name: " + myStock.getName());
        System.out.println("Previous Closing Price: $" + myStock.getPreviousClosingPrice());
        System.out.println("Current Price: $" + myStock.getCurrentPrice());
        System.out.println("Price Change Percentage: " + myStock.changePercent() + "%");
    }
}



class MyConcreteClass extends MyAbstractClass {
    // Concrete class must implement the abstract method
    void myAbstractMethod() {
        // Implementation goes here
    }

    // Additional methods and fields
}

class MyConcreteClass extends MyAbstractClass {
    // Concrete class must implement the abstract method
    void myAbstractMethod() {
        // Implementation goes here
    }

    // Additional methods and fields
}


abstract class Shape {
    abstract double calculateArea();
    abstract double calculatePerimeter();
}

class Circle extends Shape {
    double radius;

    // Constructor, methods, and implementation for calculateArea() and calculatePerimeter() go here
}

class Rectangle extends Shape {
    double length;
    double width;

    // Constructor, methods, and implementation for calculateArea() and calculatePerimeter() go here
}

class Triangle extends Shape {
    double side1;
    double side2;
    double side3;

    // Constructor, methods, and implementation for calculateArea() and calculatePerimeter() go here
}


// Displayable interface
interface Displayable {
    void DisplayAllDetails();
    void DisplayEarning();
}

// Abstract class Employee implementing Displayable interface
abstract class Employee implements Displayable {
    private String CompanyName;
    private String Name;
    private int SSN;
    private String Address;
    private String Fax;

    // Constructors, getters, and setters for the attributes

    public void SetName(String Name) {
        // Implementation
    }

    public String GetName() {
        // Implementation
        return null;
    }

    public void SetSSN(int SSN) {
        // Implementation
    }

    public int GetSSN() {
        // Implementation
        return 0;
    }

    public abstract void DisplayAllDetails();

    public abstract void DisplayEarning();

    public abstract double Earning();
}

// Subclass CommissionEmployee
class CommissionEmployee extends Employee {
    private double GrossSales;
    private double CommissionRate;

    // Constructors, getters, and setters for the attributes

    public void SetCommissionRate(double rate) {
        // Implementation
    }

    @Override
    public void DisplayAllDetails() {
        // Implementation
    }

    @Override
    public void DisplayEarning() {
        // Implementation
    }

    @Override
    public double Earning() {
        // Implementation
        return 0;
    }
}

// Subclass HourlyEmployee
class HourlyEmployee extends Employee {
    private double HourlyRate;
    private int NumberOfHours;

    // Constructors, getters, and setters for the attributes

    public void SetGrossSales(double sales) {
        // Implementation
    }

    public void SetHourRate(double rate) {
        // Implementation
    }

    public void SetNumberOfHours(int hours) {
        // Implementation
    }

    @Override
    public void DisplayAllDetails() {
        // Implementation
    }

    @Override
    public void DisplayEarning() {
        // Implementation
    }

    @Override
    public double Earning() {
        // Implementation
        return 0;
    }
}

// Subclass SalariedEmployee
class SalariedEmployee extends Employee {
    private double Salary;
    private double Bonus;
    private double Deductions;

    // Constructors, getters, and setters for the attributes

    public void SetSalary(double salary) {
        // Implementation
    }

    public void SetBonus(double bonus) {
        // Implementation
    }

    public void SetDeductions(double deduction) {
        // Implementation
    }

    @Override
    public void DisplayAllDetails() {
        // Implementation
    }

    @Override
    public void DisplayEarning() {
        // Implementation
    }

    @Override
    public double Earning() {
        // Implementation
        return 0;
    }
}

// Subclass BasePlusCommissionEmployee
class BasePlusCommissionEmployee extends CommissionEmployee {
    private double Base;

    // Constructors, getters, and setters for the attributes

    public void SetBase(double base) {
        // Implementation
    }

    @Override
    public void DisplayAllDetails() {
        // Implementation
    }

    @Override
    public void DisplayEarning() {
        // Implementation
    }

    @Override
    public double Earning() {
        // Implementation
        return 0;
    }
}












