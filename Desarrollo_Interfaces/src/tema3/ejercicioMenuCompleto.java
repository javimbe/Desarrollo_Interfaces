package tema3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ejercicioMenuCompleto extends JFrame implements ActionListener  {

	private JMenuBar mb = new JMenuBar();
	private JMenu menu1, menu2, menu3, menu4;
	private JMenuItem mi1_1, mi1_2, mi1_3, mi1_4, mi2_1, mi2_2, mi2_3, mi2_4, mi3_1, mi3_2, mi3_3, mi3_4;
	
	public ejercicioMenuCompleto() {
		 setTitle("Ejemplo de Menú con JFrame"); //titulo a la ventana
	     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	     setLayout(null);

	     setJMenuBar(mb); //Se agrega la barra de menús a la ventana con setJMenuBar(mb).
	     menu1 = new JMenu("Clientes");//se crea el elemento del menu
	     menu2 = new JMenu("Proveedores");
	     menu3 = new JMenu("Facturas");
	     menu4 = new JMenu("Salir");
	     mb.add(menu1); //se agrega a la barra de menus
	     mb.add(menu2);
	     mb.add(menu3);
	     mb.add(menu4);
	     
	     //Clientes
	     mi1_1 = new JMenuItem("Altas"); //se crea el item
	     mi1_1.addActionListener(this); //al utilizar la implementación, nos permite usar directamente
	        //actionlistener this hace referencia al propio objeto
	     menu1.add(mi1_1); //se acrega al menu
	     
	     mi1_2 = new JMenuItem("Bajas");
	     mi1_2.addActionListener(this);
	     menu1.add(mi1_2);
	     
	     mi1_3 = new JMenuItem("Modificaciones");
	     mi1_3.addActionListener(this);
	     menu1.add(mi1_3);
	     
	     mi1_4 = new JMenuItem("Listado");
	     mi1_4.addActionListener(this);
	     menu1.add(mi1_4);
	     
	     //Proveedores
	     mi2_1 = new JMenuItem("Altas");
	     mi2_1.addActionListener(this);
	     menu2.add(mi2_1);
	     
	     mi2_2 = new JMenuItem("Bajas");
	     mi2_2.addActionListener(this);
	     menu2.add(mi2_2);
	     
	     mi2_3 = new JMenuItem("Modificaciones");
	     mi2_3.addActionListener(this);
	     menu2.add(mi2_3);
	     
	     mi2_4 = new JMenuItem("Listado");
	     mi2_4.addActionListener(this);
	     menu2.add(mi2_4);
	     
	   //Facturas
	     mi3_1 = new JMenuItem("Crear Factura");
	     mi3_1.addActionListener(this);
	     menu3.add(mi3_1);
	     
	     mi3_2 = new JMenuItem("Eliminar Factura");
	     mi3_2.addActionListener(this);
	     menu3.add(mi3_2);
	     
	     mi3_3 = new JMenuItem("Listado Facturas");
	     mi3_3.addActionListener(this);
	     menu3.add(mi3_3);
	     
	     mi3_4 = new JMenuItem("Configuracion");
	     mi3_4.addActionListener(this);
	     menu3.add(mi3_4);
	    }
	
	 public void actionPerformed(ActionEvent e) {
	        Container contentPane = getContentPane(); //agregamos el pane
	        if (e.getSource() == mi1_1) { //e.getSource() es un método utilizado en Java para obtener 
	        	//el objeto que generó un evento.
	            contentPane.setBackground(new Color(255, 0, 0)); //cambia el color de la ventana
	        }       
	    }
	 
	 public static void main(String[] args) {
	    	SwingUtilities.invokeLater(new Runnable() {
	    		
	    	    public void run() {
	    	    	ejercicioMenuCompleto formulario1 = new ejercicioMenuCompleto(); //creamos la ventana
	    	    	 //no necesitamos usar jframe debido a que lo estamos extendiendo con extends jframe
	    	            formulario1.setBounds(10, 20, 300, 200); 
	    	            formulario1.setVisible(true);
	    	    }
	    	});
	   
	   }

	
}