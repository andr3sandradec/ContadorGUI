package modelo;

/**
 * @author AM
 */
public class ContadorDigitos extends OperacionNumero {

    private int cantidadDigitos;

    public ContadorDigitos() {
        super();
        this.cantidadDigitos = 0;
    }

    public ContadorDigitos(int numero) {
        super(numero);
        this.calcular();
    }

    public int getCantidadDigitos() {
        return cantidadDigitos;
    }

    @Override
    public int calcular() {
        int auxiliar = this.numero;
        this.cantidadDigitos = 0;

        if (auxiliar < 0) {
            auxiliar = auxiliar * -1;
        }

        if (auxiliar == 0) {
            this.cantidadDigitos = 1;
            return this.cantidadDigitos;
        }

        while (auxiliar > 0) {
            auxiliar = auxiliar / 10;
            this.cantidadDigitos++;
        }

        return this.cantidadDigitos;
    }

    @Override
    public String obtenerReporte() {

        String mensaje = String.format(
            "--- REPORTE CONTADOR DE DÍGITOS ---\n\n" +
            "Número Ingresado: %d\n" +
            "Total de Dígitos: %d",
            this.numero, this.cantidadDigitos
        );
        return mensaje;
    }
}