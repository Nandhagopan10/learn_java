public class pattern {
    public static void main(String[] args) {
        // pattern-1
        // for(int i=1;i<=4;i++){
        //     for(int j=1;j<=100;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        // pattern-2
        // int n=4;
        // int m=5;
        //outer loop
    //     for(int i=1;i<=n;i++){
    //         //inner loop
    //         for(int j=1;j<=m;j++){
    //             //cell=>(i,j)
    //             if(i==1 || j==1 || i==n || j==m){
    //                 System.out.print("*");
    //             }else{
    //                 System.out.print(" ");
    //             }
    //         }
    //         System.out.println();
    //     }
    // }

    //pattern-3
    // int n=4;
    // for(int i=1;i<=n;i++){
    //     for(int j=1;j<=i;j++){
    //         System.out.print(" * ");
    //     }
    //     System.out.println();
    // }

    //pattern-4
    // int n=4;
    // for(int i=n;i>=1;i--){
    //     for(int j=1;j<=i;j++){
    //         System.out.print(" * ");
    //     }
    //     System.out.println();
    // }

    //pattern-5
    // int n=4;
    // for(int i=1;i<=n;i++){
    //     for(int j=1;j<=n;j++){
    //         System.out.print(" ");
    //     }
    //     for(int j=1;j<=i;j++){
    //         System.out.print(" * ");
    //     }
    //     System.out.println();
    // }

    //pattern-6
    // int n=5;
    // for(int i=1;i<=n;i++){
    //     for(int j=1;j<=i;j++){
    //         System.out.print(j+"  ");
    //     }
    //     System.out.println();
    // }

    //pattern-7
    // int n=5;
    // for(int i=1;i<=n;i++){
    //     for(int j=1;j<=n-i+1;j++){
    //         System.out.print( j);
    //     }
    //     System.out.println();
    // }

    //pattern-8
    // int n=5;
    // int number=1;
    // for(int i=1;i<=n;i++){
    //     for(int j=1;j<=i;j++){
    //         System.out.print(number+"  ");
    //         number++;
    //     }
    //     System.out.println();
    // }

    //pattern-9
    // int n=5;
    // for(int i=1;i<=n;i++){
    //     for(int j=1;j<=i;j++){
    //         int sum=i+j;
    //         if(sum%2==0){
    //             System.out.print(" 1 ");
    //         }else{
    //             System.out.print(" 0 ");
    //         }
    //     }
    //     System.out.println();
    // }


    //pattern-10
    // int n=5;
    // for(int i=1;i<=n;i++){
    //     for(int j=1;j<=i;j++){
    //         System.out.print("*");
    //     }
    //     int space=2*(n-i);
    //     for(int j=1;j<=space;j++){
    //         System.out.print(" ");
    //     }
    //     for(int j=1;j<=i;j++){
    //         System.out.print("*");
    //     }
    //     System.out.println();
    // }
    // for(int i=n;i>=1;i--){
    //     for(int j=1;j<=i;j++){
    //         System.out.print("*");
    //     }
    //     int space=2*(n-i);
    //     for(int j=1;j<=space;j++){
    //         System.out.print(" ");
    //     }
    //     for(int j=1;j<=i;j++){
    //         System.out.print("*");
    //     }
    //     System.out.println();
    // }

    //pattern-11
    // int n = 5;
    // for (int i = 1; i <= n; i++) {
    //     // Print leading spaces for parallelogram shift
    //     for (int j = 1; j <= n - i; j++) {
    //         System.out.print(" ");
    //     }
    //     // Print stars for parallelogram
    //     for (int j = 1; j <= n; j++) {
    //         System.out.print("* ");
    //     }
    //     System.out.println();
    // }

    //pattern-12
    // int n=5;
    // for(int i=1;i<=n;i++){
    //     //spaces
    //     for(int j=1;j<=n-i;j++){
    //         System.out.print(" ");
    //     }
    //     //Number
    //     for(int j=1;j<=i;j++){
    //         System.out.print(i+" ");
    //     }
    //     System.out.println();
    // }

    //pattern-13
    int n = 5;
    for (int i = 1; i <= n; i++) {
        // Print leading spaces
        for (int j = 1; j <= n - i; j++) {
            System.out.print("  ");
        }
        // Print descending numbers
        for (int j = i; j >= 1; j--) {
            System.out.print(j + " ");
        }
        // Print ascending numbers
        for (int j = 2; j <= i; j++) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

}}
