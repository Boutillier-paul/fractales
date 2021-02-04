import javax.swing.*;

/**
 * Classe permettant de tester le code d'une fractale Julia
 */
public class ExampleJulia {
     public static void main(String[] args){

        int height = 800;
        int width = 800;

        JFrame frame = new JFrame("Example Mandelbrot");
        frame.setSize(width,height);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocation(2000,100);

        Window window = new Window(width, height, -2, 2, 2, -2);

        ComplexFractal julia = new JuliaFractal(window);
        FractalPanel panel = new FractalPanel(julia);
        panel.setFractal(julia);

        frame.setContentPane(panel);
        frame.setVisible(true);
    }
}