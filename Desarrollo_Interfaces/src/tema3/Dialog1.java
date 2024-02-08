package tema3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Dialog1 extends JFrame {

    public Dialog1() {
        JButton botonAbrirDialog = new JButton("Abrir Diálogo");
        botonAbrirDialog.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                abrirDialogo();
            }
        });

        setLayout(new FlowLayout());
        add(botonAbrirDialog);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void abrirDialogo() {
        // Crear el JDialog sin propietario, no es modal
        JDialog dialogo = new JDialog();
        dialogo.setTitle("Diálogo Sencillo");
        dialogo.setSize(200, 100);
        dialogo.setLayout(new FlowLayout());
        dialogo.setLocationRelativeTo(this);

        JLabel etiqueta = new JLabel("Hola mundo.");
        JButton botonCerrar = new JButton("Cerrar");
        botonCerrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dialogo.dispose(); // Cierra el diálogo
            }
        });

        dialogo.add(etiqueta);
        dialogo.add(botonCerrar);
        dialogo.setVisible(true);
      }

      public static void main(String[] args) {
          SwingUtilities.invokeLater(new Runnable() {
              public void run() {
                  new Dialog1();
              }
          });
      }
  }