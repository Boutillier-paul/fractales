import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JPanel;

public class SelectorPanel extends JPanel {

    /**
     * Attribut
     */
    private JComboBox<FractalFactory> box;

    /**
     * Constructeur 
     * 
     * @param fractals Une fractale
     */
    public SelectorPanel(FractalFactory[] fractals) {

        super();
        this.box = new JComboBox<>(fractals);
    }

    /**
     * Méthode permettant d'afficher une fractale sur le panel
     * 
     * @param panel Elle prend en paramètre un panel de type FractalPanel
     */
    public void setFractalToPanel(FractalPanel panel){

        this.box.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent event) {
                
                FractalFactory choice = box.getItemAt(box.getSelectedIndex());
                panel.setFractal(choice.create());
                panel.refresh();
            }
        });
        panel.add(this.box);
    }
}