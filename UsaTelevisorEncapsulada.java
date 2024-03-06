package br.com.fiap;

public class UsaTelevisorEncapsulada {
	public static void main(String[] args) {
		
		TelevisorEncapsulada tv = new TelevisorEncapsulada();
		
		tv.setCanal(2);
		tv.setVolume(19);
		tv.mostrar();
		
		tv.aumentarVolume();
		tv.aumentarVolume();
		tv.setCanal(8);
		tv.mostrar();
		
	}

}
