public class Window implements Zoomable{
    
    /**
     * Attributs
     */
    private int imageWidth;
    private int imageHeight;
    private double minReal;
    private double maxReal;
    private double minImaginary;
    private double maxImaginary;

    /**
     * Constructeur de l'objet Window
     * 
     * @param width
     * @param height
     * @param real1
     * @param real2
     * @param imaginary1
     * @param imaginary2
     */
    public Window(int width, int height, double real1, double real2, double imaginary1, double imaginary2){

        this.imageWidth = width;
        this.imageHeight = height;
        this.minReal = real1;
        this.maxReal = real2;
        this.minImaginary = imaginary1;
        this.maxImaginary = imaginary2;
    }

    /**
     * Méthode permettant de faire correspondre un pixel (un point) à un nombre complexe du plan
     * 
     * @param p Un pixel
     * 
     * @return Un nombre complexe du plan complexe
     */
    public Complex toComplex(Point p){
        double real = this.minReal + p.x * (this.maxReal - this.minReal) / (width() - 1);
        double imaginary = this.maxImaginary + p.y * (this.minImaginary - this.maxImaginary) / (height() - 1);

        return new Complex(real, imaginary);
    }

    @Override
    public int height(){
        return this.imageHeight;
    }

    @Override
    public int width(){
        return this.imageWidth;
    }

    @Override
    public void zoom(Point center, double factor){

        double largeur = (this.maxReal - this.minReal) * factor;
        Complex complexCenter = toComplex(center);
        this.minReal = complexCenter.real - largeur / 2;
        this.maxReal = complexCenter.real + largeur / 2;
        this.minImaginary = complexCenter.imaginary + largeur / 2;
        this.maxImaginary = complexCenter.imaginary - largeur / 2;
    }
}
