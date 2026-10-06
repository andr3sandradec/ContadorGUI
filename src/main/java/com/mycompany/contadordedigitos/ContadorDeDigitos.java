package com.mycompany.contadordedigitos; // 

import controlador.ControladorContador;
import modelo.ContadorDigitos;
import modelo.OperacionNumero;
import vista.VistaContador;

public class ContadorDeDigitos { 

    public static void main(String[] args) {
        OperacionNumero modelo = new ContadorDigitos();
        VistaContador vista = new VistaContador();
        ControladorContador controlador = new ControladorContador(vista, modelo);

        controlador.iniciar();
    }
}