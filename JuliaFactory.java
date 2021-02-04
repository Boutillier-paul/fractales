public class JuliaFactory implements FractalFactory{
    
    @Override 
    public Fractal create(){
        Window window = new Window(800, 800, -2, 2, 2, -2);
        return new JuliaFractal(window);
    }

    @Override
    public String toString(){
        return "Julia";
    }
}
