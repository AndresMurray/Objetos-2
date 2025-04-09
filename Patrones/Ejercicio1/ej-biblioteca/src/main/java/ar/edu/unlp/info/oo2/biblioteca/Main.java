package ar.edu.unlp.info.oo2.biblioteca;



public class Main {

	public static void main(String[] args) {
		/*Biblioteca biblioteca = new Biblioteca();
		biblioteca.agregarSocio(new Socio("Arya Stark", "needle@stark.com", "5234-5"));
		biblioteca.agregarSocio(new Socio("Tyron Lannister", "tyron@thelannisters.com",  "2345-2"));
		System.out.println(biblioteca.exportarSocios());*/
		
	/*
		Biblioteca bibliotecaDos;
		bibliotecaDos = new Biblioteca();
		bibliotecaDos.setExporter(new JsonAdapter());

		bibliotecaDos.agregarSocio(new Socio("Arya Stark", "needle@stark.com", "5234-5"));
		bibliotecaDos.agregarSocio(new Socio("Tyron Lannister", "tyron@thelannisters.com",  "2345-2"));
		
		System.out.println(bibliotecaDos.exportarSocios());*/
		
		Biblioteca bibliotecaTres = new Biblioteca();
		bibliotecaTres.setExporter( new JacksonAdapter());
		bibliotecaTres.agregarSocio(new Socio("Arya Stark", "needle@stark.com", "5234-5"));
		bibliotecaTres.agregarSocio(new Socio("Tyron Lannister", "tyron@thelannisters.com",  "2345-2"));
		System.out.println(bibliotecaTres.exportarSocios());

	}

}
