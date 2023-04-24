package tabla;
//Diego Isaias Salas Coronado
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.ScrollPane;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class tabla extends JFrame {

	
	String  [] cabezera=new String [] {"Autor","Pais de Origen","Libro","Genero"};
Object [][] filas=new  Object [][] {
			
			{"Chales Dickens","UK","Cuento de Navidad","Novela"},
			{"J.R.R.Toliken  ","Sud Africa","El hobbit","Novela"},  
			{"J.R.R.Toliken  ","Sud Africa","Silmarillion","Novela"},
			{"Julio Verne ","Francia","La islas Misteriosa","Novela"},
			{"Julio Verne  ","Francia  ","La islas Misteriosa","Novela"},
			{"Julio Verne ","Francia  ","La jangada","Novela"},
			{"Julio Verne  ","Francia ","Doctor ox","Cuentos"},
			{"H.G.Wells  ","UK  ","",""}
};
	public tabla() {
		JTable table =new JTable (filas,cabezera);
		table.setBackground(Color.decode("#C7DBCE"));
		add(new JScrollPane(table));
		setTitle("Tabla Libros");
		setVisible(true);
		setSize(700, 300);
	//	setLayout(null);
		//setLocation(100, 100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		pack();
		
	
	}
	

	
	
	

	
	
	
	
	
	
	
	
	
}
