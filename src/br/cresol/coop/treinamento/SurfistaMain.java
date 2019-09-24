package br.cresol.coop.treinamento;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SurfistaMain {
	

	public static void main(String[] args) {
		
//		List<String> surfistas = new ArrayList<String>();
//		surfistas.add("Mineirinho");
//		surfistas.add("Felipe Toledo");
//		surfistas.add("Medina");
//		surfistas.add("Crack");
		
//		surfistas.sort((s1, s2) -> s1.length() - s2.length());
//		surfistas.sort((s1,s2) -> String.valueOf(s1.charAt(0)).compareTo(String.valueOf(s2.charAt(0))));
		
//		for (String surfista : surfistas) {
//			System.out.println(surfista);
//		}
		
//		surfistas.stream()
//			.filter(t -> t.startsWith("M"))
//			.collect(Collectors.toList());
		
		
		// VERSAO 2
		Stream<String> surfistasStream = Stream.of("Mineirinho", "Mineirinho", "Felipe Toledo", "Medina", "Crack");
		
		surfistasStream.filter(t -> t.startsWith("M"))
			.distinct()
			.map(t -> t.toLowerCase())
			.forEach(System.out::println);
		
		
		//VERSAO 3
		Stream<Surfista> surfistaStreamObj = Stream.of(new Surfista("Mineirinho", 32, 89), 
				new Surfista("Mineirinho", 32, 89),  //Repetido propositalmente
				new Surfista("Felipe Toledo", 27, 45),
				new Surfista("Medina", 32, 89),
				new Surfista("Slater", 32, 89),
				new Surfista("Jhon Jhon", 32, 89));
		
		surfistaStreamObj
			.distinct()
			.filter(s -> s.nome.startsWith("K"))
			.map(s -> s.nome)
			.findAny().orElse("Não encontrado");
		
	}
}
