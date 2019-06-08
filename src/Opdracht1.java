import java.util.Scanner;

public class Opdracht1 {
    public static void main(String[] args) {
        //teller
        int index;
        Scanner input = new Scanner (System.in);
        System.out.print("Input how many numbers: ");
        index = input.nextInt();
        System.out.print("0 1 ");
        Fib (0,1,index, 2);

    }
    public static void Fib(int n1, int n2, int index, int count) {
        int newnum;
        if (count < index)
        {
            //recursieve call word uitgevoerd hieronder
            newnum = n1 + n2;
            System.out.print(newnum + " ");
            Fib(n2, newnum, index, count + 1);
        }
    }
}