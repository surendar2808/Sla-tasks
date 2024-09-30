
//program1
//Write a Java programming to create a banking system with three classes - Bank, Account, SavingsAccount, and CurrentAccount. The bank should have a list of accounts and methods for adding them. Accounts should be an interface with methods to deposit, withdraw, calculate interest, and view balances. SavingsAccount and CurrentAccount should implement the Account interface and have their own unique methods.
package com.index;

//Class methods with an object

class Account{
	int acc_no;
	String name;
	float amount;
	
	void insert(int a,String n,float amt) 
		{	
		acc_no=a;
		name=n;
		amount=amt;
	   }
	
	void deposit(float amt)
	{
		amount=amount+amt;
		System.out.println(amt+ " is Deposited");
	}
	void withdraw(float amt)
	{
		if(amount<amt) {
			System.out.println("Insufficient Amount");
		}
		else {
			amount=amount-amt;
			System.out.println(amt+"Withdarw amount");
		}
	}

	
	void CheckBalance()
	{
		System.out.println("The blance is:"+amount);
	}
	
	void display() {
		System.out.println("The details are "+acc_no+" "+name+" "+amount);
	}
}
class TestAccount{
	public static void main(String[] args) {
	Account a1=new Account();
      a1.insert(768583,"pradeep",2000);
      a1.display();
      a1.CheckBalance();
      a1.deposit(40000);
      a1.CheckBalance();
      a1.withdraw(30000);
      a1.CheckBalance();
	 }
	
}

//program 2
Write a Java program to create an interface Shape with the getArea() method. Create three classes Rectangle, Circle, and Triangle that implement the Shape interface. Implement the getArea() method for each of the three classes.

package JavaTasks3;


interface Shape {
    double getArea();
}

class Rec implements Shape {
    double length;
    double width;

    public Rec(double l, double w) {
         length =l;
        width =w;
    }

    
    public double getArea() {
        return length * width;
    }
}

class Circle implements Shape {
       double radius;

    public Circle(double r) {
    	radius = r;
    }

    
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

class Triangle implements Shape {
     double base;
    double height;

    public Triangle(double b, double h) {
         base = b;
         height =h ;
    }

    
    public double getArea() {
        return 0.5 * base * height;
    }
}

public class Interface  {
    public static void main(String[] args) {
        Rec rectangle = new Rec(7, 5);
        Circle circle = new Circle(3.5);
        Triangle triangle = new Triangle(4.5, 6);

        System.out.println("Area of Rectangle : " + rectangle.getArea());
        System.out.println("Area of Circle : " + circle.getArea());
        System.out.println("Area of Triangle : " + triangle.getArea());
    }
}










