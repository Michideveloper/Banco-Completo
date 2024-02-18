import javax.swing.*;
import java.awt.*;

public class Banco2 extends JFrame {
    private JPanel jpVentanaMenu;
    private JLabel lblSaldoInicial;
    private JTextField txtfSaldoInicial;
    private JButton btnCrearCuentaAhorros;
    private JLabel lblMovimientosCuentaAhorros;
    private JLabel lblCantidadCuentaAhorros;
    private JTextField txtfCantidadCuentaAhorros;
    private JButton btnDepositarCuentaAhorros;
    private JButton btnRetirarCuentaAhorros;
    private JButton btnImprimir;
    private JLabel lblMovimientoCuentaCorriente;
    private JLabel lblCantidadCuentaCorriente;
    private JTextField txtfCantidadCuentaCorriente;
    private JButton btnDepositarCuentaCorriente;
    private JButton btnRetirarCuentaCorriente;
    private JButton btnImprimirCuentaCorriente;
    private JButton btnCrearCuentaCorriente;
    private JTextField txtfTasaAnual;
    private JLabel lblTasaAnual;
    private JPanel jpCuentaAhorros;
    private JPanel jpCuentaCorriente;


    Banco2() {
        super();
    }


    public JPanel getJpVentanaMenu() {
        return jpVentanaMenu;
    }

    public void setJpVentanaMenu(JPanel jpVentanaMenu) {
        this.jpVentanaMenu = jpVentanaMenu;
    }
}
