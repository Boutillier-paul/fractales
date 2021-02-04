import javax.swing.*;


public class ExampleMandelbrot {
    public static void main(String[] args){

        int height = 800;
        int width = 800;

        JFrame frame = new JFrame("Example Mandelbrot");
        frame.setSize(width,height);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocation(2000,100);

        Window window = new Window(width, height, -2.5, 1, 1.75, -1.75);

        ComplexFractal mandelbrot = new MandelbrotFractal(window);
        FractalPanel panel = new FractalPanel(mandelbrot);
        panel.setFractal(mandelbrot);

        frame.setContentPane(panel);
        frame.setVisible(true);
    }
}
