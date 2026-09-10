

        import java.util.Scanner;
          public class flippedTriangle {
              public static void main(String[] args) {

                  Scanner sc = new Scanner(System.in);

                  System.out.print("put: ");
                  int n = sc.nextInt();

                  for (int i = 1; i <= n; i++) {
                      char ch = 'a';

                      for (int j = 1; j <= n - i + 1; j++) {           // here, for number put only (j <= n - i + 1)
                          System.out.print( ch + " ");
                            ch++ ;
                      }
                      System.out.println( );
                  }
              }
          }