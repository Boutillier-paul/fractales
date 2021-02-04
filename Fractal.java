public interface Fractal {
    
    //Entretien le processus itératif et retourne la valeur de couleur pour le point choisi
    public int value(Point p);

    //Getter de l'attribut window
    public Zoomable zoomable();
}
