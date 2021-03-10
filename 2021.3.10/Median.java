import java.util.Scanner;
public class prog5 {



    public static void main(String[]args){

        Scanner brian = new Scanner(System.in);
        float []score=new float[11];
        for(int i=0;i<10;i++){

            System.out.println("input number "+(i+1));
            score[i]=brian.nextFloat();

        }

        for (int x = 1; x < score.length; x++)
        {
            for (int p = 0 ; p < score.length; p++)
            {
                if (score[x] < score[p])
                {
                    float temp = score[x];
                    score[x] = score[p];
                    score[p] = temp;
                }
            }
        }
        System.out.println("the Median is " +((score[4]+score[5])/2));
        for (int i = 0; i < score.length; i++)
        {
            System.out.print(score[i] + " ");
        }


    }




}

