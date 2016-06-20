import java.util.Random;
import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*finestra iniciar = new finestra();
		iniciar.setVisible(true);*/
		
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
		
		//instancies
		Random rand = new Random(System.nanoTime());
		Scanner S = new Scanner(System.in);
		
		//inici
		System.out.println("Ruleta");
		System.out.println("Els diners q tens son: "+diners);
		
		//pre joc
		while(diners > 0){
		int aleatorio = rand.nextInt(36);
		System.out.println("Introdueix 1 per apostar a numero o 0 si no vols");
		trianumero = S.nextInt();
		if(trianumero == 1){
			numero = true;
		}
		if(numero){
			System.out.println("Introdueix el nº al que apostes: ");
			aposta = S.nextInt();
			System.out.println("introdueix el dines q apostes");
			pasta = S.nextInt();
		}
		
		
		System.out.println("Introdueix 1 per apostar al roig 2 per apostar al negre i 0 si no....");
		triacolor = S.nextInt();
		if(triacolor == 1 || triacolor ==2){
			color = true;
		}
		if(color){
			System.out.println("quan vols apostar al color: ");
			pastacolor = S.nextInt();
		}
		if(color || numero){
			apostar = true;
		}
		
		
		
		//Joc	
		while(apostar){
			System.out.println("El nº q ha ixit es...."+aleatorio);
			apostar = false;
			
			while(numero){
				numero = false;
				System.out.println("Estas apostant a numero");
				//Apostar al numero
				if(aposta == aleatorio){//win
					diners = diners + (pasta*36);
					System.out.println("Win!!! Has guanyat: "+pasta*36);
					System.out.println("Els dines totals q tens son: "+diners);
				
				}else{//lose
					diners = diners - pasta;
					
					System.out.println("Loser...");
					System.out.println("Els diners totals q tens es: "+diners);
				}
			}
			
			while(color){
				System.out.println("Estas apostant a color");
				if(aleatorio == 0){
					System.out.println("Ha ixit 0 per tant no ha ixit color...");
					diners = diners - pastacolor;
					System.out.println("Lose...");
					System.out.println("Els diners totals q tens es: "+diners);
				}else{
					
					if((aleatorio % 2) == 0){
							System.out.println("El color es roig!");
						if(triacolor == 1){
								diners = diners + (pastacolor * 2);
								System.out.println("Win!");
						
								System.out.println("Els diners totals q tens es: "+diners);
						}else{
								diners = diners - pastacolor;
								System.out.println("Lose...");
								System.out.println("Els diners totals q tens es: "+diners);
							}
					}else{
							System.out.println("El color es negre!");
						if(triacolor == 2){
								diners = diners + (pastacolor * 2);
								System.out.println("Win!");
						
								System.out.println("Els diners totals q tens es: "+diners);
						}else{
								diners = diners - pastacolor;
								System.out.println("Lose...");
								System.out.println("Els diners totals q tens es: "+diners);
								}
					
						}
				}
				color = false;
			}
			try{
				System.in.read();
			}catch(Exception e){}
		}
	}
		System.out.println("Programed by Gerard & Isma");
		//The End..

	}

}
