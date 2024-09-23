import javax.swing.JFrame;

public class App {
    public static void main(String[] args) throws Exception {
        JFrame window = new JFrame("Live till sun rise");


        window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        window.setResizable(false);
        window.setExtendedState(JFrame.MAXIMIZED_BOTH); 


        GamePanel gamepanel = new GamePanel();

        window.add(gamepanel);
        window.pack();

        window.setLocationRelativeTo(null);
        window.setVisible(true);
    }

    
}
