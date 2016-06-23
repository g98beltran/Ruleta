import javax.swing.JFrame;//biblio
import java.awt.Color;//biblio color
import java.awt.Graphics;//biblio grafics
import java.awt.Graphics2D;//biblio grafics pero + extensa q grafics normal
import java.awt.geom.Ellipse2D;//un objecte per a dibuixar
import javax.swing.JPanel;//biblio del panel pa dubuixar



public class Grame2 extends JPanel{
	public void paint(Graphics g){
		Graphics2D g2d = (Graphics2D) g;//per questions de compativilitat es fa un "CAST"
		g2d.setColor(Color.GREEN);//defineix el color en el q va a dibuixar
		//fill = ple  i draw = buit
		g2d.fillOval(0, 0, 30, 30);//circulo 2prim posicio 2seg tamany
		g2d.drawOval(0, 50, 30, 30);//cercle buit baix de cercle
		g2d.fillRect(50, 0, 30, 30);//quadrat ple 
		g2d.drawRect(50, 50,30, 30);//quadrat buit
		//gastant l'objecte elipse
		g2d.draw(new Ellipse2D.Double(0, 100, 30, 30));//un cercle buit
			
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame finestra = new JFrame("Ping Pong");//instancia amb titol
		finestra.add(new Grame2());//anyadir la clase panel Joc
		finestra.setSize(300,300);//tamany
		finestra.setVisible(true);//bisible o no
		finestra.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//ixir en la x
		

	}
	
	

}
