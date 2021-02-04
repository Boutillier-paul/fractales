public class MandelbrotFractal extends ComplexFractal{
    
    /**
     * Attribut
     */
    private Complex currentC;

    /**
     * Constructeur
     */
    public MandelbrotFractal(Window w){
        super(w);
    }

    protected Complex initialValue(Complex currentPixel){
        this.currentC = currentPixel;
        return new Complex(0, 0);
    }

    protected Complex iterate(Complex previousValue){
        return previousValue.square().add(this.currentC);
    }
}
