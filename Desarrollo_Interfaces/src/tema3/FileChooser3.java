package tema3;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FileChooser3 extends JFrame {

    public FileChooser3() {
    	
    	setLayout(null);
	    setBounds(0,0,400,400);
	    setTitle("Ejercicio 3: FileChooser");
	    setResizable(false);
	    setDefaultCloseOperation(EXIT_ON_CLOSE);
    	
        JButton botonGuardar = new JButton("Guardar Archivo");
        botonGuardar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                guardarArchivo();
            }
        });
        
        JButton botonAbrir = new JButton("Abrir Archivo");
        botonAbrir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                abrirArchivo();
            }
        });
        
        botonAbrir.setBounds(150,20,80,20);
        botonGuardar.setBounds(150,80,80,20);
        
        add(botonAbrir);
        add(botonGuardar);
        
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 300);
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

    private void guardarArchivo() {
        JFileChooser fileChooser = new JFileChooser();
        int resultado = fileChooser.showSaveDialog(this);

        if (resultado == JFileChooser.APPROVE_OPTION) {
            // Guardar archivo
            String nombreArchivo = fileChooser.getSelectedFile().getName();
            JOptionPane.showMessageDialog(this, "Archivo guardado como: " + nombreArchivo);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new FileChooser3();
            }
        });
    }
}