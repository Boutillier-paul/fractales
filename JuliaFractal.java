public class JuliaFractal extends ComplexFractal{

    /**
     * Attribut
     */
    private Complex c;

    /**
     * Constructeur
     */
    public JuliaFractal(Window w){
        super(w);
    }

    protected Complex initialValue(Complex currentPixel){
        this.c = new Complex(0.285, 0.01);;
        return currentPixel;
    }

    protected Complex iterate(Complex previousValue){
        return previousValue.square().add(this.c);
    }
}
