public class Demo{
    public static void main(String[] args){

        int height = 5; 
        printPyramid(height);
    }
     public static void printPyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }

            // New line after each row
            System.out.println();
        }
        System.out.println("Hello!!");
        System.out.println("Editor: Vatsal");
    }
}