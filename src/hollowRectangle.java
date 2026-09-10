import java.util.Scanner;

public class hollowRectangle{
    public static void main (String [] args ){

        Scanner sc= new Scanner(System.in) ;

        System.out.print("row ");
        int row = sc.nextInt();
        System.out.print("col ");
        int col = sc.nextInt();

        for( int i = 1 ; i <= row ; i++ ){
            for( int j = 1 ; j <= col ; j++ ){

                if ( i == 1 || i == col || j == 1 || j == row)

                System.out.print("* " );
            }
            System.out.println();
        }


    }

}
