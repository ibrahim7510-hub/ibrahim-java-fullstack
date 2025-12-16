public class Variable {
    public static void main(String[] args) {
        // 1.Comments and its types
        // single line comments
        /* multi line comments */

        // 2.variable
        //Rules for naming variable

        // 3.Data types
        // byte,short,int,long,float,double,char,boolean
        byte a1 = (byte) 128;//narrow type casting
        System.out.println(a1);

        char c2= 'a';//ANSCI
        int b=c2;//widening type casting
        System.out.println(b);

        float f=3.14f;
        System.out.println(f);
        double d =3.14;
        System.out.println(d);
        // 4. Operator
        // 1.unary operator -> ++,--
        // int a=10;
        //a=a+1;
        //a++;
        //int a=10;
        //System.out.println(a++);}
        //System.out,println(a);
        //Sytem.out.println(a++)
        
        // 2. +,-,*,/,%
        //int a=1%5;
        //System.out.println(a);

        //3. logical operator -> &&,||,!
        //4. bitwise opertor-> &,|,^,~,>>,<<
        int a2 = 2 & 10;
        System.out.println(a2);

       /*
        1.decimal -base-10
        2.binary base-2
        3.octal base-8
        4.hexadecimal base-16 (10-15,A-F)
       */

        //5. control statement
        // if syntax:
        /*
         if(condition){
            block of statement
        }
        */
    }
}