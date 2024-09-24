

public class tasknine {
    /* 
    // 1) write a program to add two number using static method

    static void add(int a,int b)
    {
        System.out.println("sum is "+(a+b));
    }
    public static void main(String[] args) {
        add(10,5);
    }
    */

    /* 
    // 2.) write a program to add two number using public method

    public void add(int a,int b)
    {
        System.out.println("sum is"+(a+b));
    }
    public static void main(String[] args) {
        tasknine tn=new tasknine();
        tn.add(10,23);
    }
    */
    /* 
    // 3.) write a program to print a square of the number by passing the value in the method

    static void square(int a,int pow)
    {
        System.out.println(Math.pow(a, pow));
    }
    public static void main(String[] args) {
        square(5,2);
    }   */

    // 4.) write a program in fibonic series.
/* 
    public static void main(String[] args) {
        int i=0,temp,limit=8,fnum=0,snum=1;
        if(limit<=0)
        {
            System.out.println("invalid");
        }
        else
        {
            while(i<limit)
            {
            System.out.println(fnum);
            temp=fnum+snum;
            fnum=snum;
            snum=temp;
            i++;
        }
        }
    }
        */

     /*    // 5.) write a program to reverse a integer .

        public static void main(String[] args) {
            int a=5474;
            int rev=0;
            while(a!=0)
            {
                rev=rev*10+a%10;
                a=a/10;
            }
            System.out.println(rev);
        }   */

        // 6.)to add the sum of the digit from the given number .
    /* 
        static void sumofdigit(int a)
        {
            int sum=0;
            while(a!=0)
            {
                sum=sum+a%10;
                a/=10;
            }
            System.out.println(sum);
        }
    public static void main(String[] args) {
        sumofdigit(2342);
    }

*/
}
