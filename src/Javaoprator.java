import java.util.Scanner;

public class Javaoprator {
    public static void main (String arg[]){
       // arithmetic opration
        int a =10;
        int b=5;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);

        // relational oprators
        System.out.println(a==b);
        System.out.println(a!=b);
        System.out.println(a>b);
        System.out.println(a<b);
        System.out.println(a>=b);
        System.out.println(a<=b);

        //assignment oprator
        int x = 10;
        int y = 20;
        int z= 0;
        z = x + y;
        System.out.println("z = x + y = " + z );
        z += x ;

        //logical
       boolean c=true;
        boolean d=false;
        System.out.println("c&&d="+(c&&d));
        System.out.println("c||d="+(c||d));

        // ternary oprator    syntax; variable x = (expression) ? value if true : value if false
        int age=19;
        boolean is_adult=age>18?true:false;
        System.out.println(is_adult);

        int ag=19;
        String ab=ag>18?"yes":"no";
        System.out.println(ab);

     // class room example:- with ternary oprator

        boolean has_criminal_record=false;
       boolean has_good_salary=false;
       boolean has_bank_saving=false;
       boolean has_good_social= false;

       boolean Loan=  !has_criminal_record && ((has_good_salary||has_bank_saving)|| has_good_social)? true : false;
        System.out.println(Loan);

        /**boolean unage=false;
        boolean eth=false;
        boolean id=false;
        boolean prv= false;
        boolean cri= false;

        boolean vote= (eth && unage) && ((id||cri)||prv);
        System.out.println(vote);*/

       /** boolean unage=false;
        boolean eth=false;
        boolean id=false;
        boolean prv= false;
        boolean cri= false;

        boolean vote= (eth && unage) && ((id||cri)||prv);
        System.out.println(vote)*/

// scanner opration... take input from user
       Scanner aage = new Scanner(System.in);
        System.out.println("please enter your age ");

//class example on scanner opr.
        int userinput=aage.nextInt();

        System.out.println("your input" + userinput);
        String  cd= userinput >18? "adult":"under age";
        System.out.println(cd);

//





    }
}
