import javax.swing.JFrame;

public class Game {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame finestra = new JFrame("Ping Pong");//instancia amb titol
		finestra.setSize(300,300);//tamany
		finestra.setVisible(true);//bisible o no
		finestra.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//ixir en la x
	}
}