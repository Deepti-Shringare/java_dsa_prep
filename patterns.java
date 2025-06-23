public class patterns {
    public static void main(String[] args) {
        int n=4;

//upper half
// for (int i=1;i<=n;i++){
//     for(int j=1; j<=i;j++){
//         if(j==i||j==1){
//             System.out.print("*");
//         }else{
//             System.out.print(" ");
//         }
//     }


//     int spaces=2*(n-i);
// for (int j=1 ; j<=spaces;j++){
//     System.out.print(" ");
// }

// for(int j=1; j<=i;j++){
//     if(i==j||j==1){
//         System.out.print("*");
//     }else{
//         System.out.print(" ");
//     }
// }
// System.out.println();
// }

// //lower

// for (int i=n;i>=1;i--){
//     for(int j=1; j<=i;j++){
//         if(i==j||j==1){
//             System.out.print("*");
//         }else{
//             System.out.print(" ");
//         }
//     }


//     int spaces=2*(n-i);
// for (int j=1 ; j<=spaces;j++){
//     System.out.print(" ");
// }

// for(int j=1; j<=i;j++){
//     if(i==j||j==1){
//         System.out.print("*");
//     }else{
//         System.out.print(" ");
//     }
// }
// System.out.println();
// }

// for(int i=1; i<=n;i++){
//     //spaces
//     for(int j=1; j<=n-i;j++){
//         System.out.print(" ");
//     }

//     //stars
//     for (int j=1;j<=n;j++){
//         if(j==1||i==1||i==n||j==n-1){
//             System.out.print("*");
//         }else{
//             System.out.print(" ");
//         }
//     }
//     System.out.println();
// }


// for(int i=0;i<=n;i++){
//      int num=1;
//      for(int j=0;j<=i;j++){
//         System.out.print(" "+num+" ");
//         num=num*(i-j)/(j+1);
//      }
//      System.out.println();
// }

for(int i=1;i<=n;i++){
    for(int j=n-i+1;j>=1;j--){
        System.out.print(i);
    }
    System.out.println();
}

        
    }
            }
            

