package modelo;

/**
 * @author AM
 */
// [PERSONALIZAR]: Puedes cambiar el nombre "OperacionNumero" por "NumeroBase" (cambiando también el nombre del archivo .java)
public class OperacionNumero {

    protected int numero;

    public OperacionNumero() {
        this.numero = 0;
    }

    public OperacionNumero(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int calcular() {
        return 0;
    }

    public String obtenerReporte() {
        return "Número registrado: " + numero;
    }
}