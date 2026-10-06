package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.OperacionNumero;
import vista.VistaContador;

/**
 * @author Usuario
 */
public class ControladorContador implements ActionListener {

    private VistaContador vista;
    private OperacionNumero modelo;

    public ControladorContador(VistaContador vista, OperacionNumero modelo) {
        this.vista = vista;
        this.modelo = modelo;
        // Conectamos los botones usando los getters de tu VistaContador
        this.vista.getBtnCalcular().addActionListener(this);
        this.vista.getBtnLimpiar().addActionListener(this);
    }

    public void iniciar() {
        this.vista.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vista.getBtnCalcular()) {
            procesarConteo();
        } else if (e.getSource() == vista.getBtnLimpiar()) {
            vista.getTxtNumero().setText("");
            // [PERSONALIZAR]: Texto cuando se limpia la ventana
            vista.getLblResultado().setText("Cantidad de digitos: ");
            vista.getTxtNumero().requestFocus();
        }
    }

    public void procesarConteo() {
        try {
            // [PERSONALIZAR]: Puedes cambiar los nombres de "entrada" y "numeroIngresado"
            String entrada = vista.getTxtNumero().getText().trim();
            int numeroIngresado = Integer.parseInt(entrada);

            modelo.setNumero(numeroIngresado);
            int totalDigitos = modelo.calcular();

            // [PERSONALIZAR]: Mensaje de salida en el Label y en el JOptionPane
            vista.getLblResultado().setText("Cantidad de digitos: " + totalDigitos);
            JOptionPane.showMessageDialog(vista, modelo.obtenerReporte(), "Resultado del Conteo", JOptionPane.INFORMATION_MESSAGE);

        } catch (NumberFormatException ex) {
            // [PERSONALIZAR]: Mensaje de error cuando ingresan letras o dejan vacío
            JOptionPane.showMessageDialog(vista, "Error: Ingrese un número entero válido.", "Error de entrada", JOptionPane.ERROR_MESSAGE);
        }
    }
}