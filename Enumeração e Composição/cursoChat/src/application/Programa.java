package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import entities.Comentario;
import entities.Post;

public class Programa {
	
	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Comentario c1 = new Comentario("Tenha uma boa viagem!");
		Comentario c2 = new Comentario("Uau! Que legal!");
		
		Post p1 = new Post(sdf.parse("21/06/2018 13:05:44"), ("Viajando para a Nova Zelândia"), ("Eu vou visitar esse país maravilhoso!"), (12));
		
		p1.adicionarComentario(c1);
		p1.adicionarComentario(c2);
		
		
		Comentario c3 = new Comentario("Boa noite!");
		Comentario c4 = new Comentario("Que a força esteja com você!");
		
		Post p2 = new Post(sdf.parse("28/07/2018 23:14:19"), ("Boa noite amigos!"), ("Vejo vocês amanhã!"), (5));
		
		p2.adicionarComentario(c3);
		p2.adicionarComentario(c4);
		
		
		
		System.out.println(p1);
		System.out.println();
		System.out.println();
		System.out.println(p2);
		
	}
}
