//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
/*
How to Create an Array in Java – Array Declaration Example
Article in:
https://www.freecodecamp.org/news/how-to-create-an-array-in-java/
 */
public class Main {
    public static void main(String[] args) {
        // single-statement declaration and initialization
        int[] numbers = {1,2,3,4,5};
        String[] names = {"Maria", "João", "Karol"};
        // separate declaration and initialization
        String[] carros;
        carros = new String[]{"Ferrari", "Fusca", "Monza Classic"};
        // default values
        int[] otherNumbers = new int[3];
        otherNumbers[1] = 99;
        System.out.println("Default values for int = 0, booleans = false and object = null");
        System.out.println("Not initialized: " + otherNumbers[0]);
        System.out.println("Initialized: " + otherNumbers[1]);
        // multi-dimensional arrays
        // 3 rows and 3 columns for tic tac toe
        int[][] matrix = new int[3][3];
        matrix[0][0] = 1;
        matrix[0][1] = 0;
        matrix[0][2] = 0;
        matrix[1][0] = 0;
        matrix[1][1] = 1;
        matrix[1][2] = 0;
        matrix[2][0] = 0;
        matrix[2][1] = 0;
        matrix[2][2] = 1;
        System.out.println("Tic tac Toe:");
        System.out.println(matrix[0][0] + " " + matrix[0][1] + " " + matrix[0][2]);
        System.out.println(matrix[1][0] + " " + matrix[1][1] + " " + matrix[1][2]);
        System.out.println(matrix[2][0] + " " + matrix[2][1] + " " + matrix[2][2]);
    }
}