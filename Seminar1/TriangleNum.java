import java.io.IOException;

public class TriangleNum {
  static int calc (int n) {
    System.out.println("Input number is "+ n);
    return (n * (n + 1))/2;
  }

  public static void main(String[] args) throws IOException {
    System.out.println("triangel number = " + TriangleNum.calc(2));
  } 
}
      
