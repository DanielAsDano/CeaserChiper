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
        chiper = new Chiper();

        setTitle("Cifrador César");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); 
        setLayout(new GridLayout(3, 2, 10, 10));

        JLabel etiquetaEntrada = new JLabel("Palabra original:", SwingConstants.RIGHT);
        campoEntrada = new JTextField();

        JLabel etiquetaSalida = new JLabel("Texto cifrado:", SwingConstants.RIGHT);
        campoSalida = new JTextField();
        campoSalida.setEditable(false);
        campoSalida.setBackground(Color.WHITE);

        botonCifrar = new JButton("Cifrar");

        botonCifrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String palabra = campoEntrada.getText();

                String resultado = chiper.cifrar(palabra);

                campoSalida.setText(resultado);
            }
        });

        add(etiquetaEntrada);
        add(campoEntrada);

        add(new JLabel("")); 
        add(botonCifrar);

        add(etiquetaSalida);
        add(campoSalida);
    }
}
