import java.util.Scanner;

public class prog4 {

    public static void main(String[]args){


              float sum = 0;

                Scanner brian = new Scanner(System.in);
                 float []score=new float[11];
                for(int i=0;i<10;i++){

                    System.out.println("input number "+(i+1));
                    score[i]=brian.nextFloat();

                }

        for(int i=0;i<10;i++){
            sum=score[i]+sum;


        }
           System.out.println("the main is "+(sum/10));

}}
