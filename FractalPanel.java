import javax.swing.*;
import javax.swing.event.MouseInputAdapter;
import java.awt.event.MouseEvent;

public class FractalPanel extends ImagePanel{
    
    /**
     * Constructeur
     * Créer un panel en fonction d'une fractale (on aurait pu imaginer mettre une window en parametre)
     */
    public FractalPanel(Fractal fractal){
        super(fractal.zoomable().width(), fractal.zoomable().height());
    }

    /**
     * Méthode permettant d'afficher une fractale sur l'interface graphique
     */
    public void setFractalToPanel(Fractal fractal){

        int width = getImage().getWidth();
        int height = getImage().getHeight();

        for(int i = 0; i < width; i++){
            for(int j = 0; j < height; j++){
                
                Point p = new Point(i, j);
                int rgb = fractal.value(p);
                getImage().setRGB(i, j, rgb);
            }
        }
    }

    /**
     * Méthode permettant d'attribuer une fractale au FractalPanel
     * 
     * @param fractal Elle prend en paramètre un objet de type Fractal
     */
    public void setFractal(Fractal fractal){
        setFractalToPanel(fractal);
        addMouseListener(new MouseInputAdapter(){
            
            @Override
            public void mouseClicked(MouseEvent e){
                Point p = new Point(e.getPoint().x, e.getPoint().y);

                //Si l'utilisateur clique sur le bouton gauche
                if(SwingUtilities.isLeftMouseButton(e)){
                    fractal.zoomable().zoom(p, 0.5);
                    setFractalToPanel(fractal);
                    refresh();
                }
                    
                //Si l'utilisateur clique sur le bouton droit
                if(SwingUtilities.isRightMouseButton(e)){
                    fractal.zoomable().zoom(p, 1.5);
                    setFractalToPanel(fractal);
                    refresh();
                }
            }
        });
    }

    /**
     * Méthode permettant de rafraîchir l'affichage de la fractale
     */
    public void refresh(){
        this.repaint();
    }
}
