package tema3;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Componentes3 extends JFrame implements ActionListener{

	//Modificar el ejercicio anterior, añadiendo un botón y que al pulsar el botón,
	//aparezca un joptionPane que me muestre esta información
	
	
	private JTextField nombre, edad, direccion, ciudad, provincia;
	private JLabel labelNombre, labelEdad, labelDireccion, labelCiudad, labelProvincia;
	private JButton boton1;
	
	public Componentes3() {
		
		setLayout(null);
	    setBounds(0,0,400,400);
	    setTitle("Ejercicio 3: Componentes");
	    setResizable(false);
	    setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		labelNombre=new JLabel("Introduce tu nombre:");
	    labelNombre.setBounds(10,10,300,30);
	    add(labelNombre);
		
		nombre = new JTextField();
	    nombre.setBounds(140,15,150,20);
	    add(nombre);
	    
	    labelEdad=new JLabel("Introduce tu edad:");
	    labelEdad.setBounds(10,40,300,30);
	    add(labelEdad);
	    
	    edad = new JTextField();
	    edad.setBounds(140,45,150,20);
	    add(edad);
	    
	    labelDireccion=new JLabel("Introduce tu direccion:");
	    labelDireccion.setBounds(10,70,300,30);
	    add(labelDireccion);
	    
	    direccion = new JTextField();
	    direccion.setBounds(140,75,150,20);
	    add(direccion);
	    
	    labelCiudad=new JLabel("Introduce tu ciudad:");
	    labelCiudad.setBounds(10,100,300,30);
	    add(labelCiudad);
	    
	    ciudad = new JTextField();
	    ciudad.setBounds(140,110,150,20);
	    add(ciudad);
	    
	    labelProvincia=new JLabel("Introduce tu provincia:");
	    labelProvincia.setBounds(10,130,300,30);
	    add(labelProvincia);
	    
	    provincia = new JTextField();
	    provincia.setBounds(140,135,150,20);
	    add(provincia);
	    
	    boton1=new JButton("Aceptar");
	    boton1.setBounds(10,160,100,30);
	    add(boton1);

	    /* Inicializo escuchador del botón */
	    boton1.addActionListener(this);
	    
	    setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
	    if (e.getSource()==boton1) {
		    
	      String name = nombre.getText();
	      String age = edad.getText();
	      String direction = direccion.getText();
	      String city = ciudad.getText();
	      String province = provincia.getText();
	      
	      JOptionPane.showMessageDialog(null, "Datos Introducidos \n Nombre:  " + name + "\n Edad: " + age + "\n Direccion: "
	      + direction + "\n Ciudad: " + city + "\n Provincia: " + province);
	      
	    }
	  }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new Componentes3();
		
	}

}