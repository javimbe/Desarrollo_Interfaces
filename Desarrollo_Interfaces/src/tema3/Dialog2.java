package tema3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Dialog2 extends JFrame {

    public Dialog2() {
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
        dialogo.setTitle("Diálogo Pequeño");
        dialogo.setSize(200, 100);
        dialogo.setLayout(new FlowLayout());
        dialogo.setLocationRelativeTo(this);
        
        JDialog dialogo2 = new JDialog();
        dialogo2.setTitle("Diálogo Medio");
        dialogo2.setSize(400, 200);
        dialogo2.setLayout(new FlowLayout());
        dialogo2.setLocationRelativeTo(this);
        
        JDialog dialogo3 = new JDialog();
        dialogo3.setTitle("Diálogo Grande");
        dialogo3.setSize(800,400);
        dialogo3.setLayout(new FlowLayout());
        dialogo3.setLocationRelativeTo(this);

        JLabel etiqueta = new JLabel("Hola mundo.");
        JButton botonCerrar = new JButton("Cerrar");
        botonCerrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dialogo.dispose(); // Cierra el diálogo
            }
        });
        JButton botonCerrar2 = new JButton("Cerrar");
        botonCerrar2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dialogo2.dispose();
            }
        });
        JButton botonCerrar3 = new JButton("Cerrar");
        botonCerrar3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dialogo3.dispose();
            }
        });

        dialogo.add(etiqueta);
        dialogo.add(botonCerrar);
        dialogo.setVisible(true);
        
        dialogo2.add(etiqueta);
        dialogo2.add(botonCerrar2);
        dialogo2.setVisible(true);
        
        dialogo3.add(etiqueta);
        dialogo3.add(botonCerrar3);
        dialogo3.setVisible(true);
      }

      public static void main(String[] args) {
          SwingUtilities.invokeLater(new Runnable() {
              public void run() {
                  new Dialog2();
              }
          });
      }
  }