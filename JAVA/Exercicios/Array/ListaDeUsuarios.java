package avaliacao.exercicio.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ListaDeUsuarios {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		Map<Long, ArrayList<String>> listaUsuario = new HashMap<>();
		ArrayList<String> lista = new ArrayList<>();
	
		
		String usuario = "";
		Long codigo= 0L;
		
		// Partindo do princ�pio que o usu�rio sempre vai digitar um c�digo v�lido
		for (int i = 0; i < 3; i++) {
			System.out.print("Forne�a o c�digo do usu�rio : ");
			codigo = entrada.nextLong();
			// Se estivesse utilizando nextLine(), teria que recuperar o nome antes
			do{
				System.out.println("Forne�a o nome do usu�rio : ");	
				usuario = entrada.next();
				if (!usuario.equalsIgnoreCase("sair")) {
					lista.add(usuario.trim());
				}	
			}while(!usuario.equalsIgnoreCase("sair"));
			
			if(lista.size() > 0) {
				listaUsuario.put(codigo, lista);
			}
			
			lista.clear();
		
		}
		entrada.close();
	}
}
