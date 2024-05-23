import java.awt.*;
import java.util.Arrays;
import java.util.Random;

public class Draw {

    public static void main(String[] args) {
        randomArrayPrint();
        //linesPrint();
    }

    public static void randomArrayPrint() {
        StdDraw.setCanvasSize(800, 800);

        // adding picture as background
//        StdDraw.picture(0.5, 0.5, "lib/hasibo.png");
//        StdDraw.show();

        //change background color to black
        StdDraw.clear(new Color(0, 0, 0));

        Font font = new Font("Arial", Font.BOLD, 16);
        StdDraw.setFont(font);

        // insert random values into the array
        int[] random = new int[10];
        double x = 0.05;
        for (int i = 0; i < random.length; i++) {
            StdDraw.setPenColor(Color.WHITE);
            random[i] = (int) (Math.random() * 10);
            //printing the elements of the array
            StdDraw.text(x, 0.05, String.valueOf(random[i]));

            int colorChange = 1;
            double y = 0.15;
            while (random[i] > 0) {
                if (colorChange == 4 || colorChange == 5) StdDraw.setPenColor(Color.yellow);
                else if (colorChange == 6 || colorChange == 7) StdDraw.setPenColor(Color.ORANGE);
                else if (colorChange == 8 || colorChange == 9) StdDraw.setPenColor(Color.RED);
                else StdDraw.setPenColor(StdDraw.GREEN);
                StdDraw.filledSquare(x, y, 0.03);
                y += 0.1;
                colorChange++;
                random[i]--;
            }
            x += 0.1;
        }
    }

    public static void linesPrint() {
        int width = 700, height = 700;
        StdDraw.setCanvasSize(width, height);

        StdDraw.clear(new Color(0, 0, 0));
        StdDraw.setPenColor(StdDraw.WHITE);

        StdDraw.setPenRadius(0.005);
        float x = 0f, y = 1f;
        float x1 = 0f, y1 = 0f;
        float x2 = 1f, y2 = 0f;
        float x3 = 1f, y3 = 1f;
        float x4 = 0.0f, y4 = 0.5f, x44 = 1.0f;
        float x5 = 0.0f, y5 = 0.5f, x55 = 1.0f;

        for (int i = 0; i < width / 14; i++) {
            StdDraw.line(0, y, x, 1);
            y -= 0.01f;
            x += 0.01f;

            StdDraw.line(0, y1, x1, 0);
            y1 += 0.01f;
            x1 += 0.01f;

            StdDraw.line(x2, 0, 1, y2);
            x2 -= 0.01f;
            y2 += 0.01f;

            StdDraw.line(1, y3, x3, 1);
            x3 -= 0.01f;
            y3 -= 0.01f;

            StdDraw.line(x4, y4, x44, y4);
            y4 -= 0.01f;
            x44 -= 0.01f;
            x4 += 0.01f;

            StdDraw.line(x5, y5, x55, y5);
            y5 += 0.01f;
            x55 -= 0.01f;
            x5 += 0.01f;
        }
    }

}