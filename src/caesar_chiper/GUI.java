package caesar_chiper;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JFrame {

    private JTextField campoEntrada;
    private JTextField campoSalida;
    private JButton botonCifrar;
    private Chiper chiper;

    public GUI() {
        // Instanciar la clase de lógica
        chiper = new Chiper();

        // Configuración básica de la ventana (JFrame)
        setTitle("Cifrador César");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Centrar la ventana en la pantalla
        setLayout(new GridLayout(3, 2, 10, 10)); // Cuadrícula de 3 filas y 2 columnas

        // Crear los componentes de la interfaz
        JLabel etiquetaEntrada = new JLabel("Palabra original:", SwingConstants.RIGHT);
        campoEntrada = new JTextField();

        JLabel etiquetaSalida = new JLabel("Texto cifrado:", SwingConstants.RIGHT);
        campoSalida = new JTextField();
        campoSalida.setEditable(false); // Hacer que el campo de resultado sea de solo lectura
        campoSalida.setBackground(Color.WHITE);

        botonCifrar = new JButton("Cifrar");

        // Añadir el "Listener" (Escuchador) para cuando se haga clic en el botón
        botonCifrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 1. Obtener el texto del campo de entrada
                String palabra = campoEntrada.getText();

                // 2. Usar tu clase Chiper para cifrar
                String resultado = chiper.cifrar(palabra);

                // 3. Mostrar el resultado en el campo de salida
                campoSalida.setText(resultado);
            }
        });

        // Añadir los componentes a la ventana (el orden importa para el GridLayout)
        add(etiquetaEntrada);
        add(campoEntrada);

        add(new JLabel("")); // Celda vacía para empujar el botón a la derecha
        add(botonCifrar);

        add(etiquetaSalida);
        add(campoSalida);
    }
}