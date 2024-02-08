package tema3;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Componentes5 extends JFrame implements ActionListener{

	//El ide tendrá los siguientes elementos: Eclipse, Visual Studio, Intelli, al pulsar en 
	//jcombobox u otro deberá aparecer una ventana indicándome la opción elegida como en el ejemplo anterior:

	
	
	private JComboBox lenguaje, ide;
	private JLabel labelLenguaje, labelIde;
	private JButton boton1;
	
	public Componentes5() {
		
		setLayout(null);
	    setBounds(0,0,400,400);
	    setTitle("Ejercicio 5: Componentes");
	    setResizable(false);
	    setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		labelLenguaje=new JLabel("Selecciona un lenguaje:");
	    labelLenguaje.setBounds(10,10,300,30);
	    add(labelLenguaje);
	    
	    lenguaje =new JComboBox<String>();
	    lenguaje.setBounds(150,20,80,20);
        add(lenguaje);
        
        lenguaje.addItem("Java");
        lenguaje.addItem("Kotlin");
        lenguaje.addItem("Php");
        
        labelIde=new JLabel("Selecciona un ide: ");
	    labelIde.setBounds(10,40,300,30);
	    add(labelIde);
	    
	    ide =new JComboBox<String>();
	    ide.setBounds(150,50,80,20);
        add(ide);
        
        ide.addItem("Eclipse");
        ide.addItem("Visual Studio");
        ide.addItem("Intelli");
	    
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
	      String ide1 = (String)ide.getSelectedItem();
	      
	      JOptionPane.showMessageDialog(null, "Lenguaje elegido: " + lenguage + "\n Ide Elegido: " + ide1);
	      
	    }
	  }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new Componentes5();
		
	}

}