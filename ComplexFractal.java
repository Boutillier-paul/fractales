public abstract class ComplexFractal implements Fractal {
    
    /**
     * Attribut
     */
    private Window window;

    /**
     * Constructeur
     */
    public ComplexFractal(Window w){
        this.window = w;
    }

    /**
     * Cette méthode abstraite se chargera, pour un point de l’image plongé dans le plan complexe,
     *  de choisir la valeur initiale à partir de laquelle commencer les itérations et de procéder
     *  à des initialisations annexes. Elle est appelée une ffois par la méthode value(), avant de procéder aux
     *  itérations à proprement parler.
     * 
     * @param currentPixel
     * @return
     */
    protected abstract Complex initialValue(Complex currentPixel);

    /**
     * Cette méthode abstraite se chargera de calculer, pour une itération, 
     *  la nouvelle valeur à partir de la valeur précédente ; 
     *  elle est appelée par la méthode value() ;
     * 
     * @param previousValue
     * @return
     */
    protected abstract Complex iterate(Complex previousValue);

    @Override
    public int value(Point p){
        Complex initialComplex = initialValue(this.window.toComplex(p));
        int i = 0;
        int maxIteration = 255;

        while(i < maxIteration && initialComplex.modulus2() < 4){
            initialComplex = iterate(initialComplex);
            i++;
        }

        if(i == maxIteration)
            return (0 << 16) + (0 << 8) + 0;

        i = maxIteration - i;
        return (i << 16) + (i << 8) + i;
    }

    @Override 
    public Zoomable zoomable(){
        return this.window;
    }
}
