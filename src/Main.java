public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // Declaration and inisialization of variable
        int age=35;
        System.out.println(age);

        int myNum1=97;
        myNum1=100;
        System.out.println(myNum1);// myNum changed into 100

        String name = "Meryem";
        System.out.println(name);
        String name1="john";
        System.out.println(name1);
        name1="eka";
        System.out.println(name1);// string data type changed
        System.out.println(name1.toUpperCase());

        // stringbuffer
        StringBuffer sb = new StringBuffer("hanna ");
        sb.append("abel"); // now original string is changed
        System.out.println(sb);// additional not work?
        // coordinate
        //Point coordinates = new Point(x=3, y=5);//?



        //other data types
        byte myNum = 100;
        System.out.println(myNum);

        short myNum2 = 5000;
        System.out.println(myNum2);

        long myNum3 = 15000000000L;
        System.out.println(myNum3);

        float myNum4 = 5.75f;
        System.out.println(myNum4);

        double myNum5 = 19.99d;
        System.out.println(myNum5);

        char myGrade = 'B';
        System.out.println(myGrade);

        boolean isJavaFun = true;
        boolean isFishTasty = false;
        System.out.println(isJavaFun);     // Outputs true
        System.out.println(isFishTasty);   // Outputs false

// e indicate 10 the power of the next number
        float f1 = 35e3f;
        double d1 = 12E4d;
        System.out.println(f1);
        System.out.println(d1);

        int myNum6 = 5;
        float myFloatNum = 5.99f;
        int me= 23;
        System.out.println(myFloatNum);
        System.out.println(me);








    }
}