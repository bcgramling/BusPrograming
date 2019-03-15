/******************************************************************************
 *  Compilation:  javac Stats.java
 *  Execution:    java Stats n
 *  Dependencies: StdIn.java StdOut.java
 *  
 *  Reads in a command-line integer n, a sequence of n real numbers from
 *  standard input, and prints the mean and sample standard deviation.
 *
 *  % java Stats 6
 *  10.0 5.0 6.0
 *  3.0 7.0 32.0
 *  <Ctrl-d>
 *  Mean                      = 10.5
 *  Sample standard deviation = 10.784247771634329
 *
 *  Note <Ctrl-d> signifies the end of file on Unix.
 *  On windows use <Ctrl-z>.
 *
 ******************************************************************************/

public class Stats { 
    public static void main(String[] args) { 
        int n = Integer.parseInt(args[0]);
        double[] a = new double[n];

        // read data and compute statistics
        for (int i = 0; i < n; i++) {
            a[i] = StdIn.readDouble();
        }

        // compute mean
        double sum = 0.0;
        for (int i = 0; i < n; i++) {
            sum += a[i];
        }
        double mean = sum / n;

        // compute standard deviation
        double sum2 = 0.0;
        for (int i = 0; i < n; i++) {
            sum2 += (a[i] - mean) * (a[i] - mean);
        }
        double stddev = Math.sqrt(sum2 / (n - 1));

        // print results
        StdOut.println("Mean                      = " + mean);
        StdOut.println("Sample standard deviation = " + stddev);
    }
}
