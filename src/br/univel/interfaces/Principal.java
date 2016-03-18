package br.univel.interfaces;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class Principal {
	public static void main(String[] args) {
		List<Desenho> lista = new LinkedList<>();
		
		lista.add(new ExA());
		lista.add(new ExB());
		lista.add(new ExC());
		lista.add(new ExD());

		lista.add(new ExE());
		lista.add(new ExF());

		lista.add(new ExJ());
		lista.add(new ExM());
		
		
		for (Desenho d : lista) {
			d.desenhar();
		}
	}
}
