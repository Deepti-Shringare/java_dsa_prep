import java.util.Scanner;

public class conditionalst {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();

       switch (n) {
        case 1:
        int add=a+b;
        System.out.println("Addition"+add);
            
            break;
            case 2: 
            int sub=a-b;
        System.out.println("Subtraction"+sub);
            break;

            case 3:
            int mul= a*b;
        System.out.println("Multiplication"+mul);
             break;

            case 4:
            
        System.out.println("Division"+a/b);
            
            break;


       
        default:
        System.out.println("invalid");
            break;
       }

    }
    
}
