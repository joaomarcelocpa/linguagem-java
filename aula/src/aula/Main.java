package aula;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class Main {

	public static void main(String[] args) {
		String path = "./src/aula/arq.txt";
				
	try {
		
		OutputStream os = new FileOutputStream(path);
		Writer wr = new OutputStreamWriter(os);
		BufferedWriter br = new BufferedWriter(wr);
		
		br.write("Hello World!");
		br.newLine();
		br.newLine();
		br.write("Olá Mundo!");
		br.close();
		
	} catch (Exception e) {
		
		System.out.println("Algo deu errado!");
	}
		
	}

}
