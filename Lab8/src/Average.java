public class Average {
   public static void main(String[] args) {
      double sum = 0.0;  // cumulative total
      int n = 0;         // number of values

      while (!StdIn.isEmpty()) {
         double x = StdIn.readDouble();
         sum = sum + x;
         n++;
         //StdOut.println(x);
      }

      StdOut.println(sum / n);
      StdOut.println(sum);
      StdOut.println(n);
   }
}
