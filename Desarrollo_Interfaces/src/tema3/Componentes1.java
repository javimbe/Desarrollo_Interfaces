package tema3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class Componentes1 extends JFrame implements ActionListener{

	//Crear una aplicación que muestre una ventana con un campo de texto (JTextField) 
	//que tenga un texto predeterminado. La ventana debe cerrarse 
	//correctamente al hacer clic en el botón de cierre.
	
	
	private JTextField nombre;
	private JLabel labelNombre;
	
	public Componentes1() {
		
		setLayout(null);
	    setBounds(0,0,400,150);
	    setTitle("Ejercicio 1: Componentes");
	    setResizable(false);
	    setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		labelNombre=new JLabel("Introduce tu nombre:");
	    labelNombre.setBounds(10,10,300,30);
	    add(labelNombre);
		
		nombre = new JTextField();
	    nombre.setBounds(140,15,150,20);
	    add(nombre);
	    
	    setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new Componentes1();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
