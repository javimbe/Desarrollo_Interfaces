package tema3;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;

import javax.swing.JOptionPane;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Componentes7 extends JFrame implements ChangeListener{

	//Crearemos otra clase modificando el ejemplo anterior, de manera que al elegir 
	//uno de los CheckBox me mostrará una ventana joptionpane
	//En el caso de desea recibir publicidad, que indique has aceptado recibir publicidad

	private JCheckBox check1, check2;
	
	public Componentes7() {
		
		setLayout(null);
	    setBounds(0,0,400,400);
	    setTitle("Ejercicio 7: Componentes");
	    setResizable(false);
	    setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	    check1=new JCheckBox("Aceptar términos y condiciones.");
        check1.setBounds(10,10,150,30);
        check1.addChangeListener(this);
        add(check1);
        
        check2=new JCheckBox("Desea recibir publicidad");
        check2.setBounds(10,50,150,30);    
        check2.addChangeListener(this);
        add(check2);
		
	    setVisible(true);
	}
	
	public void stateChanged(ChangeEvent e){
		
		if (check1.isSelected()==true) {
			JOptionPane.showMessageDialog(null, "Has aceptado los términos y condiciones");
        }
        if (check2.isSelected()==true) {
        	JOptionPane.showMessageDialog(null, "Has aceptado recibir nuestra publicidad, preparate para el spam...");
        }
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new Componentes7();
		
	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}