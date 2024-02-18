import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        Banco bbva = new Banco();

        bbva.setContentPane(bbva.getJpVentanaMenu());
        bbva.getJpVentanaMenu().setAlignmentX(Component.CENTER_ALIGNMENT);
        bbva.setExtendedState(JFrame.MAXIMIZED_BOTH);
        bbva.setUndecorated(true);
        bbva.setTitle("BBVA - Menu");
        bbva.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        bbva.setResizable(false);
        bbva.pack();
        bbva.setVisible(true);


    }
}
