import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JPanel;

public class GamePanel extends JPanel {
    //Screeen setting

    final int Pixel_Size =16;
    final int Scale =3;

    final int TitleSize= Pixel_Size* Scale;
    final int maxScreencol=16;
    final int maxScreenRow=12;
    final int screenWidth = TitleSize* maxScreencol;
    final int screenHeight = TitleSize* maxScreenRow;
    

    public GamePanel()
    {
        this.setPreferredSize(new Dimension(screenWidth, screenHeight));
        this.setBackground(Color.black);
        this.setDoubleBuffered(true);
        this.setMinimumSize(new Dimension(200, 200));
    }
}
