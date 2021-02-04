public class Complex {
    
    /**
     * Attributs
     */
    public final double real;
    public final double imaginary;

    /**
     * Constructeur 
     * 
     * @param real Un nombre réel
     * @param imaginary Un nombre imaginaire
     */
    public Complex(double real, double imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }

    /**
     * Constructeur par copie 
     * 
     * @param c Un complexe
     */
    public Complex(Complex c){
        this.real = c.real;
        this.imaginary = c.imaginary;
    }

    /**
     * Méthode permettant de retourner le carré d'un nombre complexe
     * 
     * @return Un complexe au carré
     */
    public Complex square(){
        double a = Math.pow(this.real, 2) - Math.pow(this.imaginary, 2);
        double b = this.real * this.imaginary + this.real * this.imaginary;
        return new Complex(a, b);
    }

    /**
     * Méthode permettant d'additionner un nombre complexe
     * 
     * @param z Un complexe
     * @return Un nombre complexe resultant de l'addition
     */
    public Complex add(Complex z){
        return new Complex(this.real+z.real, this.imaginary+z.imaginary);
    }

    /**
     * Méthode permettant de calculer le module d'un nombre complexe
     * 
     * @return Le module d'un nombre complexe
     */
    public double modulus2(){
        return Math.pow(this.real, 2) + Math.pow(this.imaginary, 2);
    }

    /**
     * Méthode toString permettant de retourner une description de l'objet
     * 
     * @return Une chaine de caractère définissant le nombre complexe
     */
    public String toString(){
        return "Nombre complexe dont le réel est : "+real+" et dont la partie imaginaire est "+imaginary;
    }
}
