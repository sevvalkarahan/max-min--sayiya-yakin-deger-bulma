import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int [] array={15,12,788,1,-1,-788,2,0};
        System.out.println( Arrays.toString(array));

        Scanner input=new Scanner(System.in);
        System.out.print("Girilen sayı: ");
        int sayi= input.nextInt();
        Arrays.sort(array);
        int max=array[7];
        int min=array[0];



        for (int i: array){
            if (i>min && i<sayi){
                min=i;

            }
            if (i<max && i>sayi){
                max=i;
            }

        }


        System.out.println("Girilen sayıdan küçük en yakın sayı:" +min);
        System.out.println("Girilen sayıdam büyük en yakın sayı: " +max);


    }

}
