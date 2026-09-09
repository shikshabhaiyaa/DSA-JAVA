
     import java.util.Scanner;

            public class Main {
            public static void main (String [] args ){

            Scanner sc= new Scanner(System.in) ;

               System.out.print("row ");
               int row = sc.nextInt();
               System.out.print("col ");
               int col = sc.nextInt();

                 for( int i = 1 ; i <= row ; i++ ){
                  for( int j = 1 ; j <= col ; j++ ){
                       System.out.print(j);
            }
                   System.out.println();
        }


    }

}
