package tema3;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Componentes8 extends JFrame implements ChangeListener{

	//Desarrollar un programa que presente una ventana con dos opciones exclusivas (JRadioButton).
	//El usuario debe poder seleccionar una de las opciones, y la aplicación debe
	//cerrarse correctamente al hacer clic en el botón de cierre.

	private JRadioButton check1, check2;
	private ButtonGroup bg;
	
	public Componentes8() {
		
		setLayout(null);
	    setBounds(0,0,400,400);
	    setTitle("Ejercicio 8: Componentes");
	    setResizable(false);
	    setDefaultCloseOperation(EXIT_ON_CLOSE);
	    
	    bg=new ButtonGroup();
	    
	    check1=new JRadioButton("Opcion 1");
        check1.setBounds(10,10,150,30);
        check1.addChangeListener(this);
        add(check1);
        bg.add(check1);
        
        check2=new JRadioButton("Opcion 2");
        check2.setBounds(10,50,150,30);    
        check2.addChangeListener(this);
        add(check2);
        bg.add(check2);
		
	    setVisible(true);
	}
	
	public void stateChanged(ChangeEvent e){
		
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new Componentes8();
		
	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}