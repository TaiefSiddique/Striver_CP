//import java.util.Scanner;
//
//public class Fox_And_Snake {
//    public static void main(String[] args) {
//        int n,m;
//        Scanner ss=new Scanner(System.in);
//        n=ss.nextInt();
//        m=ss.nextInt();
//
//        for(int i=0;i<n;i++){
//            for(int j=0;j<m;j++){
//                if(i%4==3 ) {
//                    if(j==0) {
//                        System.out.print("#");
//
//                    }
//                    else System.out.print(".");
//                }
//                else if(i%2==1 ){
//                    if(j==m-1) {
//                        System.out.print("#");
//
//                    }
//                    else System.out.print(".");
//                }
//
//                else System.out.print("#");
//            }
//            System.out.println();
//        }
//    }
//}
import java.util.Scanner;

public class Fox_And_Snake {
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        int n = ss.nextInt();
        int m = ss.nextInt();

        for (int i = 0; i < n; i++) {
            if (i % 4 == 1) {
                for (int j = 0; j < m - 1; j++) {
                    System.out.print(".");
                }
                System.out.print("#");
            } else if (i % 4 == 3) {
                System.out.print("#");
                for (int j = 1; j < m; j++) {
                    System.out.print(".");
                }
            } else {
                for (int j = 0; j < m; j++) {
                    System.out.print("#");
                }
            }
            System.out.println();
        }
    }
}
