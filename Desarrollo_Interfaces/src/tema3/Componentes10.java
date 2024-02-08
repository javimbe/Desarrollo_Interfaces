package tema3;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Componentes10 extends JFrame implements ActionListener{

	//Crear una aplicación que muestre una ventana con un área de texto (JTextArea) que contenga un 
	//texto predeterminado. La ventana debe cerrarse correctamente al hacer clic en el botón de cierre.

	private JTextArea txt;
	private JLabel label;
	
	public Componentes10() {
		
		setLayout(null);
	    setBounds(0,0,400,400);
	    setTitle("Ejercicio 10: Componentes");
	    setResizable(false);
	    setDefaultCloseOperation(EXIT_ON_CLOSE);
	    
	    label=new JLabel("Comentario:");
	    label.setBounds(10,10,300,30);
	    add(label);
		
		txt = new JTextArea();
	    txt.setBounds(10,40,150,50);
	    add(txt);
        
	    setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new Componentes10();
		
	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}