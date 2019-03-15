import java.awt.Color;
public class Triangle {
   public static void main(String[] args) {
	StdDraw.setPenColor(Color.red);
	StdDraw.line(0.0, 0.0, 0.9, 0.2);
	StdDraw.line(0.9, 0.2, 0.2, 0.9);
	StdDraw.line(0.0, 0.0, 0.2, 0.9);
	StdDraw.circle(0.5, 0.5, 0.3);
	StdDraw.square(0.5, 0.5, 0.3);
   }
} 
