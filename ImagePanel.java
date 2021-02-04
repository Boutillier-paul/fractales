import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public abstract class ImagePanel extends JPanel {

    private BufferedImage image;

    public ImagePanel(BufferedImage image) {
        this.image = image;
        this.setPreferredSize(new Dimension(image.getWidth(), image.getHeight()));
    }

    public ImagePanel(int width, int height) {
        this(new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB));
    }

    public final BufferedImage getImage() {
        return this.image;
    }

    @Override
    protected void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        graphics.drawImage(image, 0, 0, image.getWidth(), image.getHeight(), null);
    }
}
