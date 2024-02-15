import javax.swing.*;

public class Banco extends JFrame{
    // Atributos
    private JPanel jpVentanaMenu;
    private JTextField txtfSaldoInicial;
    private JLabel lblSaldoInicial;
    private JLabel lblTasaAnual;
    private JTextField txtTasaAnual;
    private JButton btnCuentaAhorros;
    private JButton btnCuentaCorriente;
    private JTextField txtfCantidadDepositar;
    private JLabel lblCantidadDepositar;
    private JButton btnDepositar;
    private JLabel lblCantidadRetirar;
    private JTextField txtfCantidadRetirar;
    private JButton btnRetirar;
    private JButton btnImprimir;
    private JLabel lblEncabezado;

    // Constructor
    Banco(){
        super();
    }

    // Getters and setters
    public JPanel getJpVentanaMenu() {
        return jpVentanaMenu;
    }

    public void setJpVentanaMenu(JPanel jpVentanaMenu) {
        this.jpVentanaMenu = jpVentanaMenu;
    }
}
