import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class finestra extends JFrame {
	private final JLabel numero = new JLabel("Numero");//texto o etiquetas
	private final JLabel aposta = new JLabel("Aposta");//texto o etiquetas
	
	private final JTextField campo_numero= new JTextField(10);//hueco para numero
	private final JTextField campo_aposta = new JTextField(10);//hueco para aposta
	public finestra(){
		setTitle("#Ruleta");//titulo en la ventana
		setSize(500 , 500); //mida de 500px x 500px
		setLocation( 250, 250); // a 250px del monitor
		setResizable(false);//no se maximisa
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//per a tancar la finestra

		//Se crea el panel para adherir los elementos
		Container contenedor = getContentPane();
		SpringLayout layout = new SpringLayout();
		contenedor.setLayout(layout);	
		
		//Se posiciona en cordenadas x i y dentro de la ventana
		layout.putConstraint(SpringLayout.WEST, numero, 50, SpringLayout.WEST, contenedor);//Eje X
		layout.putConstraint(SpringLayout.NORTH, numero, 50, SpringLayout.NORTH, contenedor);//Eje Y
		
		contenedor.add(numero);//se adihere el objeto al panel
		
		//Se posiciona en cordenadas x i y dentro de la ventana
		layout.putConstraint(SpringLayout.WEST, campo_numero, 120, SpringLayout.WEST, contenedor);//Eje X
		layout.putConstraint(SpringLayout.NORTH, campo_numero, 50, SpringLayout.NORTH, contenedor);//Eje Y
		
		contenedor.add(campo_numero);//se adihere el objeto al panel
		
		//Se posiciona en cordenadas x i y dentro de la ventana
		layout.putConstraint(SpringLayout.WEST, aposta, 50, SpringLayout.WEST, contenedor);//Eje X
		layout.putConstraint(SpringLayout.NORTH, aposta, 100, SpringLayout.NORTH, contenedor);//Eje Y
		
		contenedor.add(aposta);//se adihere el objeto al panel
		
		//Se posiciona en cordenadas x i y dentro de la ventana
		layout.putConstraint(SpringLayout.WEST, campo_aposta, 120, SpringLayout.WEST, contenedor);//Eje X
		layout.putConstraint(SpringLayout.NORTH, campo_aposta, 100, SpringLayout.NORTH, contenedor);//Eje Y
				
		contenedor.add(campo_aposta);//se adihere el objeto al panel
	}
	

}
