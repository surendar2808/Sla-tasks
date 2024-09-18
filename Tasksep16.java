package dailytasksla;

public class taskeight {
double salary;
int id;
String name;
double bonus;


    /* 
    // instance variable
    int a=10,b=32;  */
    taskeight(int id,String name,double salary)
    {
        this.id=id;
        this.name=name;
        this.salary=salary;
    }
    public void printdetails(int month)
    {
        System.out.println("Name :"+name);
            System.out.println("ID :"+id);
            System.out.println("Salary :"+salary);
            System.out.println("Month :"+month);
    
        if(month==12)
        {
            bonus=salary*1.5;
            System.out.println("Total salary Bonus :"+bonus);
        }
        else if(month==3)
        {
            bonus=salary*1.1;
            System.out.println("Total salary Bonus :"+bonus);
        }
        else if(month==6)
        {
            bonus=salary*1.3;
            System.out.println("Total salary Bonus :"+bonus);
        }
    }

    public static void main(String[] args) {
     /* 1) LOCAL VARIABLES  
       int a=10,b=20;
        System.out.println("The first number is"+a);
        System.out.println("the second number is"+b);   */

    /*  2) INSTANCE VARIABLES   

        taskeight mul=new taskeight();
        System.out.println(mul.a*mul.b);    */

        taskeight emp1=new taskeight(1,"Aravind", 12000);
        taskeight emp2=new taskeight(2,"Bharath", 12000);
        taskeight emp3=new taskeight(3,"Venkat", 12000);
        emp1.printdetails(3);
        System.out.println("======================================");
        System.out.println();
        emp2.printdetails(12);
        System.out.println("======================================");
        System.out.println();
        emp3.printdetails(6);
        System.out.println("======================================");
        System.out.println();






    }
    
}
