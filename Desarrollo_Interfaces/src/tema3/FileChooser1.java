package tema3;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FileChooser1 extends JFrame {

    public FileChooser1() {
        JButton botonAbrir = new JButton("Abrir Archivo");
        botonAbrir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                abrirArchivo();
            }
        });

        add(botonAbrir);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void abrirArchivo() {
        JFileChooser fileChooser = new JFileChooser();
        int resultado = fileChooser.showOpenDialog(this);

        if (resultado == JFileChooser.APPROVE_OPTION) {
            // Seleccionar archivo
            String nombreArchivo = fileChooser.getSelectedFile().getName();
            JOptionPane.showMessageDialog(this, "Archivo seleccionado: " + nombreArchivo);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new FileChooser1();
            }
        });
    }
}