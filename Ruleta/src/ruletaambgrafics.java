import javax.swing.JOptionPane;
import java.util.Random;

public class ruletaambgrafics {

	/*
	 * La Ruleta 
	 * así pots apostar a numero color 
	 * el nombre ix aleatoriament amb l'objecte random
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//variables
		int diners = 30;
		int aposta = 0;
		int pasta = 0;
		boolean apostar = false;
		int triacolor;
		int trianumero;
		boolean numero = false;
		boolean color = false;
		int pastacolor = 0;
		String q1 = "";
				
		//instancies
		Random rand = new Random(System.nanoTime());
		
		//inici
		q1 = "Ruleta\nEls diners q tens son: "+diners;
		JOptionPane.showMessageDialog(null, q1);//missatge per a informarete dels teus diners
		//pre joc
		while(diners > 0){
		int aleatorio = rand.nextInt(36);
		q1 ="Introdueix \n- 1 per apostar a numero\n- 0 si no vols";// apostar a un numero 0,1,2,..36
		trianumero = Integer.parseInt(JOptionPane.showInputDialog(null, q1));
		if(trianumero == 1){
			numero = true;
		}
		if(numero){
			q1 ="Introdueix el nº al que apostes: ";
			aposta = Integer.parseInt(JOptionPane.showInputDialog(null, q1));//numero
			q1 ="Introdueix el dines q apostes";
			pasta = Integer.parseInt(JOptionPane.showInputDialog(null, q1));//dines
		}
				
				
		q1 = "Introdueix\n- 1 per apostar al roig\n- 2 per apostar al negre\n- 0 si no....";
		triacolor = Integer.parseInt(JOptionPane.showInputDialog(null, q1));//color roig o negre
		if(triacolor == 1 || triacolor ==2){
			color = true;
		}
		if(color){
			q1 = "Quant vols apostar al color: ";
			pastacolor =Integer.parseInt(JOptionPane.showInputDialog(null, q1));//dines
		}
		if(color || numero){
			apostar = true;
		}
				
				
				
		//Joc	
		while(apostar){
			q1 = "El nº q ha ixit es: "+aleatorio;
			JOptionPane.showMessageDialog(null, q1);//num que ha ixit
			apostar = false;
					
			while(numero){//si avanç ha apostat a numero
				numero = false;
				q1 = "Pel que fa de la teva aposta al numero";
				JOptionPane.showMessageDialog(null, q1);
				//Apostar al numero
				if(aposta == aleatorio){//win
					diners = diners + (pasta*36);
					q1 = "Win!!! Has guanyat: "+ pasta*36 +"\nEls dines totals q tens son: "+diners;
					JOptionPane.showMessageDialog(null, q1);
						
				}else{//lose
					diners = diners - pasta;
							
					q1 = "Loser.\nEls diners totals q tens es: "+diners;
					JOptionPane.showMessageDialog(null, q1);
				}
			}
					
			while(color){//si avanç has apostat a color
				color = false;
				q1 = "Pel que fa a la teva aposta a color";
				JOptionPane.showMessageDialog(null, q1);
				if(aleatorio == 0){//excluim primer el 0
					q1 = "Ha ixit 0 per tant no ha ixit color...";
					JOptionPane.showMessageDialog(null, q1);
					diners = diners - pastacolor;
					q1 ="Lose...\nEls diners totals q tens es: "+diners;
					JOptionPane.showMessageDialog(null, q1);
				}else{
							
					if((aleatorio % 2) == 0){//si es parell es roig
							q1 = "El color es roig!";
							JOptionPane.showMessageDialog(null, q1);
						if(triacolor == 1){//win
								diners = diners + (pastacolor * 2);
								q1 = "Win!\nEls diners totals q tens es: "+diners;
								JOptionPane.showMessageDialog(null, q1);
						}else{//lose
								diners = diners - pastacolor;
								q1 = "Lose.\nEls diners totals q tens es: "+diners;
								JOptionPane.showMessageDialog(null, q1);
							}
					}else{//si no es roig ni 0 es negre
							q1 = "El color es negre!";
							JOptionPane.showMessageDialog(null, q1);
						if(triacolor == 2){//win
								diners = diners + (pastacolor * 2);
								q1 = "Win!\nEls diners totals q tens es: "+diners;
								JOptionPane.showMessageDialog(null, q1);
						}else{//lose
								diners = diners - pastacolor;
								q1 = "Lose.\nEls diners totals q tens es: "+diners;
								JOptionPane.showMessageDialog(null, q1);
							}							
						}									
					}			
				}
			}		
		}
		q1 = "Programed by Gerard & Isma";
		JOptionPane.showMessageDialog(null, q1);
		//The End..
	}
}	