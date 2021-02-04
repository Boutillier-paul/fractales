public class MandelbrotFactory implements FractalFactory{
    
    @Override 
    public Fractal create(){
        Window window = new Window(800, 800, -2.5, 1, 1.75, -1.75);
        return new MandelbrotFractal(window);
    }

    @Override
    public String toString(){
        return "Mandelbrot";
    }
}
