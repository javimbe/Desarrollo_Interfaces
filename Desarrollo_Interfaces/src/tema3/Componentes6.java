package tema3;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;

import javax.swing.JOptionPane;

public class Componentes6 extends JFrame implements ActionListener{

	//Implementar una aplicación que muestre una ventana con una casilla
	//de verificación (JCheckBox) que represente la aceptación de términos y condiciones.
	//La aplicación debe cerrarse correctamente al hacer clic en el botón de cierre.

	private JCheckBox check1;
	
	
	
	public Componentes6() {
		
		setLayout(null);
	    setBounds(0,0,400,400);
	    setTitle("Ejercicio 6: Componentes");
	    setResizable(false);
	    setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	    check1=new JCheckBox("Aceptar términos y condiciones.");
        check1.setBounds(10,10,150,30);
        add(check1);
		
	    setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new Componentes6();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}