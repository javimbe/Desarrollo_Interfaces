package tema3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class Componentes2 extends JFrame implements ActionListener{

	//diseña el siguiente formulario
	
	
	private JTextField nombre, edad, direccion, ciudad, provincia;
	private JLabel labelNombre, labelEdad, labelDireccion, labelCiudad, labelProvincia;
	
	public Componentes2() {
		
		setLayout(null);
	    setBounds(0,0,400,400);
	    setTitle("Ejercicio 2: Componentes");
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
	    
	    setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new Componentes2();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
