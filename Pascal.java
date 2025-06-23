import java.util.Scanner;

public class Pascal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no.of lines ");
        int no = sc.nextInt();

        int spaces = no;
        for (int i = 0; i < no; i++) {
            int number = 1;
            for (int s = 1; s <= spaces; s++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(number + " ");
                number = number * (i - j) / (j + 1);
            }
            spaces--;
            System.out.println();
        }
    }
}