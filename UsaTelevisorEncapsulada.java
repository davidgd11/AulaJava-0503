package br.com.fiap;

public class UsaTelevisorEncapsulada {
	public static void main(String[] args) {
		
		TelevisorEncapsulada tv = new TelevisorEncapsulada();
		
		// tv.setCanal(2);
		// tv.setVolume(19);
		// tv.mostrar();
		
		// tv.aumentarVolume();
		// tv.aumentarVolume();
		// tv.setCanal(8);
		// tv.mostrar();

		int escolha = 0;
		Scanner scan;
		try{
			scan = new Scanner(System.in);
			System.out.println("Escolha um canal e definida o volume");
			tv.setCanal(scan.nextInt());
			tv.setVolume(scan.nextInt());
			System.out.println("Faça sua escolha: "
					  + "\n(1) Definir canal"
					  + "\n(2) Definir volume"
					  + "\n(3) Aumentar volume"
					  + "\n(4) Diminuir volume");
			escolha = scan.nextInt();
			if (escolha == 1){
				System.out.println("Escolha novo canal");
				tv.setCanal(scan.nextInt());
			} else if (escolha == 2) {
				System.out.println("Escolha novo volume");
				tv.setVolume(scan.nextInt());
			} else if (escolha == 3){
				System.out.println("Aumentando volume...");
				tv.aumentarVolume();
			}
		} catch (Exception e){
			System.out.println(e.getMessage());
		}
		
	}

}
