import java.util.Scanner;
class Matrix
  {
    private int[][] matrix;
    public Matrix(int rows, int columns)
  {
    matrix = new int[rows][columns];
  }
    public void inputMatrix(Scanner scanner)
  {
    for (int i = 0; i < matrix.length; i++)
  {
    for (int j = 0; j < matrix[0].length; j++)
  {
    matrix[i][j] = scanner.nextInt();
  }
  }
  }
   public Matrix add(Matrix other)
  {
   Matrix result = new Matrix(matrix.length, matrix[0].length);
   for (int i = 0; i < matrix.length; i++)
  {
   for (int j = 0; j < matrix[0].length; j++)
  {
   result.matrix[i][j] = this.matrix[i][j] + other.matrix[i][j];
  }
  }
  return result;
  }
  public void displayMatrix()
  {
  for (int i = 0; i < matrix.length; i++)
  {
  for (int j = 0; j < matrix[0].length; j++)
  {
  System.out.print(matrix[i][j] + "\t");
  }
  System.out.println();
  }
}
}
      public class MatrixAddition
       {
         public static void main(String[] args)
       {
         Scanner scanner = new Scanner(System.in);
         System.out.print("Enter the number of rows: ");
         int rows = scanner.nextInt();
         System.out.print("Enter the number of columns: ");
         int columns = scanner.nextInt();
         Matrix matrix1 = new Matrix(rows, columns);
         Matrix matrix2 = new Matrix(rows, columns);
         System.out.println("Enter the elements of the first matrix:");
         matrix1.inputMatrix(scanner);
         System.out.println("Enter the elements of the second matrix:");
         matrix2.inputMatrix(scanner);
         Matrix sumMatrix = matrix1.add(matrix2);
         System.out.println("Sum of the matrices:");
         sumMatrix.displayMatrix();
         scanner.close();
      }
}
