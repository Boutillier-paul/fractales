import javax.swing.*;

/**
 * @author BOUTILLIER Paul et POCHET Max
 */
public class Main {
    public static void main(String[] args){

        int height = 800;
        int width = 800;

        JFrame frame = new JFrame("Example fractal");
        frame.setSize(width,height);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocation(100,100);

        FractalFactory mandelbrotFractal = new MandelbrotFactory();
        FractalFactory juliaFractal = new JuliaFactory();
        FractalFactory[] fractals = {mandelbrotFractal, juliaFractal};

        FractalPanel panel = new FractalPanel(mandelbrotFractal.create());
        SelectorPanel selectorPanel = new SelectorPanel(fractals);
        selectorPanel.setFractalToPanel(panel);

        frame.getContentPane().add(panel);
        frame.setVisible(true);
    }
}
