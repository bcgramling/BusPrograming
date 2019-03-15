/******************************************************************************
 *  Compilation:  javac WordCount.java 
 *  Execution:    java WordCount
 *         [ input required from standard input                        ]
 *         [ use Ctrl-d (OS X or Dr. Java) or Ctrl-z (Windows) for EOF ]
 *
 *  Dependencies: StdIn.java StdOut.java
 *
 *  Read in a sequence of strings from standard input and print out
 *  the number of strings read in.
 *
 *  % java WordCount
 *  it was the best of times
 *  it was the worst of times
 *  number of words  = 12
 *  Ctrl-d
 *
 *  % java WordCount < tale.txt 
 *  number of words  = 139043
 *
 ******************************************************************************/

public class WordCount {
    public static void main(String[] args) {

    	//Try using java -cp bin;stdlib.jar WordCount < amendments.txt
    	//You will have to comment out the other two while loops to get it to print 
    	//out the correct word count, char count or line count.
        int count = 0; 
        int char_count = 0;
        int line_count = 0;
        while (!StdIn.isEmpty()) {
            String word = StdIn.readString();
            count++;
        }
      
        while (StdIn.hasNextChar()) {
        	StdIn.readChar();
        	char_count++;
        }
        /*
        while (StdIn.hasNextLine()) {
        	StdIn.readLine();
        	line_count++;
        }*/
        // output
        StdOut.println("number of words  = " + count);
        StdOut.println("number of characters = " + char_count);
        StdOut.println("number of lines = " + line_count);
    }
}
