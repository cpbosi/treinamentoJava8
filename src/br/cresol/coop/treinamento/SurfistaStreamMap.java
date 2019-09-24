package br.cresol.coop.treinamento;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SurfistaStreamMap {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(21, "Mineiro");
		map.put(24, "Toledo");		
		map.put(30, "Medina");
		map.put(20, "Iago");
		
		System.out.println("Com base no Map é criado um List ordenado (idade) de surfista");
		List<Surfista> listaSurfistas = map.entrySet().stream()
//				.sorted(Comparator.comparing(e -> e.getKey()))
				.sorted(Comparator.comparing(Map.Entry::getKey))
				.map(s -> new Surfista(s.getValue(), s.getKey()))
				.collect(Collectors.toList());
		listaSurfistas.forEach(System.out::println);
	}
}
