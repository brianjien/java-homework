import java.util.Scanner;
public class prog2 {
    public static void main(String[] args) {



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
                if(num %2== 0){

                    System.out.println("even number");

                }
                else {
                    System.out.println("odd number");

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

     
    }
        

        }


    }
