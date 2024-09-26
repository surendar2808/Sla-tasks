//Write a Java program to create a class called "Book" with instance variables title, author, and price. Implement a default constructor and two parameterized constructors:One constructor takes title and author as parameters.
//The other constructor takes title, author, and price as parameters.
//Print the values of the variables for each construct
#program1
package com.index;

public class Book {

    // Instance variables
    String title;
    String author;
    double price;

    // Default constructor
    public Book() {
        title = "No Title";
        author = "No Author";
        price = 0.0;
    }

    // Constructor with title and author
    public Book(String t, String a) {
        title = t;
        author = a;
        price = 0.0;
    }

    // Constructor with title, author, and price
    public Book(String t, String a, double p) {
        title = t;
        author = a;
        price = p;
    }

    // Method to display book information
    public void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println();
    }

    public static void main(String[] args) {
        
        Book book1 = new Book("Wings of fire", "Dr.Apj.abdul kalam",443.94);
        book1.display();

        
        Book book2 = new Book("The Great Gatsby", "F. Scott Fitzgerald");
        book2.display();

        
    }
}

#program2 
  //2.Write a Java program to create a class called "Person" with a name and age attribute. Create two instances of the "Person" class, set their attributes using the constructor, and print their name and age


package com.index;

public class Person {
	    
	    String name;
	    int age;

	    
	    public Person(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }

	   
	    public void displayPerson() {
	        System.out.println("Name: " + name + ", Age: " + age);
	    }

	    
	    public static void main(String[] args) {
	        
	        Person person1 = new Person("Surendar", 22);
	        Person person2 = new Person("lingesh", 22);

	        
	        person1.displayPerson();
	        person2.displayPerson();
	    }

  //program3
3.Write a Java program to create a class called "Rectangle" with width and height attributes. Calculate the area and perimeter of the rectangle.

  package com.index;

public class Rectangle {

    
    double width;
    double height;

    
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    
    public double calculateArea() {
        return width * height;
    }

    
    public double calculatePerimeter() {
        return 2 * (width + height);
    }

    
    public static void main(String[] args) {
       
        Rectangle rect = new Rectangle(5.0, 3.0);

       
        System.out.println("Area: " + rect.calculateArea());
        System.out.println("Perimeter: " + rect.calculatePerimeter());
    }
}

//program4
//4.Write a Java program to create a class called "Employee" with a name, job title, and salary attributes, and methods to calculate and update salary.
package com.index;

public class Employee {

    String name;
    String jobTitle;
    double salary;

   
    public Employee(String name, String jobTitle, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    
    public double calculateAnnualSalary() {
        return salary * 12;
    }

    
    public void updateSalary(double percentage) {
        salary += salary * (percentage / 100);
    }

    
    public void displayEmployee() {
        System.out.println("Name: " + name);
        System.out.println("Job Title: " + jobTitle);
        System.out.println("Monthly Salary: " + salary);
        System.out.println("Annual Salary: " + calculateAnnualSalary());
    }

    
    public static void main(String[] args) {
        
        Employee emp = new Employee("Surendar", "Fullstack developer", 50000);

       
        System.out.println("Initial Employee Details:");
        emp.displayEmployee();

      
        emp.updateSalary(10);

     
        System.out.println("\nUpdated Employee Details after 10% raise:");
        emp.displayEmployee();
    }
}
