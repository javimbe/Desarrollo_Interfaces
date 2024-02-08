package tema3;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Componentes9 extends JFrame implements ChangeListener{

	//Vamos a crear una clase en donde al elegir un radiobutton u otro me muestre un mensaje en joptionpane:

	private JRadioButton check1, check2;
	
	public Componentes9() {
		
		setLayout(null);
	    setBounds(0,0,400,400);
	    setTitle("Ejercicio 9: Componentes");
	    setResizable(false);
	    setDefaultCloseOperation(EXIT_ON_CLOSE);
	    
	    
	    check1=new JRadioButton("Pastilla Azul");
        check1.setBounds(10,10,150,30);
        check1.addChangeListener(this);
        add(check1);
        
        check2=new JRadioButton("Pastilla Roja");
        check2.setBounds(10,50,150,30);    
        check2.addChangeListener(this);
        add(check2);
        
	    setVisible(true);
	}
	
	public void stateChanged(ChangeEvent e){
		if (check1.isSelected()==true) {
			JOptionPane.showMessageDialog(null, "Has elegido la opcion azul, puedes quedarte en tu mundo de fantasia");
        }
        if (check2.isSelected()==true) {
        	JOptionPane.showMessageDialog(null, "Has elegido la opcion roja, te voy a contar la verdad sobre Matrix");
        }
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new Componentes9();
		
	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}