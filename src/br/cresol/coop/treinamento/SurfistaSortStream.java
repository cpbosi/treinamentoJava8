package br.cresol.coop.treinamento;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import br.cresol.coop.treinamento.Surfista;

public class SurfistaSortStream {
	
	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(2,5,4,7,10);
		
		System.out.println("---Ordenação natural Numeros---");
		List<Integer> numerosOrdenadosNatural = numeros.stream()
			.sorted().collect(Collectors.toList());
		numerosOrdenadosNatural.forEach(System.out::println);
		
		System.out.println("---Ordenação invertida Numeros---");
		List<Integer> numerosOrdenadosInvertido = numeros.stream()
			.sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		numerosOrdenadosInvertido.forEach(System.out::println);
		
		
		List<Surfista> surfistas = new ArrayList<Surfista>();
		surfistas.add(new Surfista("Mineiro", 30, 10));
		surfistas.add(new Surfista("Medina",25, 1));
		surfistas.add(new Surfista("Felipe Toledo", 23, 2));
		
		System.out.println("---Ordenação natural por NOME---");
		List<Surfista> surfistasOrdenadoNatural = surfistas.stream()
				.sorted(Comparator.comparing(Surfista::getNome))
				.collect(Collectors.toList());
		surfistasOrdenadoNatural.forEach(System.out::println);
		
		System.out.println("---Ordenação natural por NOME invertido---");
		List<Surfista> surfistasReversoNatural = surfistas.stream()
				.sorted(Comparator.comparing(Surfista::getNome).reversed())
//				.sorted(Comparator.reverseOrder())
				.collect(Collectors.toList());
		surfistasReversoNatural.forEach(System.out::println);		
		
		System.out.println("---Ordenação natural pela posiçãodo CT---");
		List<Surfista> surfistasOrdenadoPosicaoCT =  surfistas.stream()
				.sorted(Comparator.comparing(Surfista::getPosicaoCT))
				.collect(Collectors.toList());
		surfistasOrdenadoPosicaoCT.forEach(System.out::println);
	}

}
