import java.util.Scanner;

public class prog3 {
    public static void main(String[]args){


        boolean brian1;
        float a, b;
        float num  = 0;

        float num2 = 0;



        do {
            try {

                Scanner brian = new Scanner(System.in);
                System.out.println("input number1");
                num = brian.nextFloat();

                a = num;

                 System.out.println("input number 2");
                num2 = brian.nextFloat();

                 b = num2;
                if(num>num2){

                    System.out.println(num+">"+num2);

                }
                else {
                    System.out.println(num+"<"+num2);

                }

                brian.close();
                brian1 = false;
            } catch (Exception e) {
                System.out.println("only input Integer and Decimal value" + e);
                brian1 = true;

            }
        }
        while (brian1);
        a = num;
        b = num2;





    }}



