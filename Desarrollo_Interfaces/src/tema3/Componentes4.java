package tema3;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Componentes4 extends JFrame implements ActionListener{

	//Desarrollar un programa que presente una ventana con una lista desplegable (JComboBox) que contenga 
	//varias opciones. La aplicación debe cerrarse correctamente al hacer clic en el botón de cierre.
	//Las opciones son Java, Kotlin y Php

	
	
	private JComboBox lenguaje;
	private JLabel labelNombre;
	private JButton boton1;
	
	public Componentes4() {
		
		setLayout(null);
	    setBounds(0,0,400,400);
	    setTitle("Ejercicio 4: Componentes");
	    setResizable(false);
	    setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		labelNombre=new JLabel("Selecciona un lenguaje:");
	    labelNombre.setBounds(10,10,300,30);
	    add(labelNombre);
	    
	    lenguaje =new JComboBox<String>();
	    lenguaje.setBounds(150,20,80,20);
        add(lenguaje);
        
        lenguaje.addItem("Java");
        lenguaje.addItem("Kotlin");
        lenguaje.addItem("Php");
	    
	    boton1=new JButton("Aceptar");
	    boton1.setBounds(10,160,100,30);
	    add(boton1);

	    /* Inicializo escuchador del botón */
	    boton1.addActionListener(this);
	    
	    setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
	    if (e.getSource()==boton1) {
		    
	      String lenguage = (String)lenguaje.getSelectedItem();
	      
	      JOptionPane.showMessageDialog(null, "Lenguaje elegido: " + lenguage);
	      
	    }
	  }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new Componentes4();
		
	}

}
