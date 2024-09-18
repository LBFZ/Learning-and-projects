package Collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class Collection {

	public static void main(String[] args) {
		
		//ArrayList
		
//		Criando uma lista
		List<String> list = new ArrayList<>();
		
//		Adicionando itens a lista
		list.add("A");
		list.add("B");
		list.add("C");
		
// 		Selecionando valores da lista
		System.out.println(list.get(2));
		
//		LinkedList
		List<String> linkedList = new LinkedList<>();
		
//		Adicionandp valores a LinkedList
		linkedList.add("A");
		linkedList.add("B");
		linkedList.add("C");
		
//		Selecionado valores da linkedList
		System.out.print("LinkedList: " + linkedList.get(1));
		
/* HashSet */
		
//		Criando uma HashSet
		Set<String> set = new HashSet<>();
			
//		Adicionando valores a hashSet
		set.add("A");
		set.add("B");
		set.add("C");
		
//		Descobrindo o tamanho da HashSet
		System.out.println("HashSet:" + set.size());
		
/*  HashMap */
		
//		Criando uma HashMap
		Map<String, Integer> map = new HashMap<>();
		
//		Adicionando valores nulos a HashMap
		map.put("A", 1);
		map.put("B", 2);
		map.put("C", 3);
		
// 		Selecionando o terceiro elemento do HashMap
		System.out.println("HashMap: " + map.get("C"));
		
//		Criando uma Queue
		Queue<String> queue = new LinkedList<>();
		
//		Adicionando valores a Queue
		
		queue.add("Promeiro");
		queue.add("Segundo");
		queue.add("Terceiro");
		
//		Selecionado elementos da Queue
		System.out.println("Elementos da Queue:" + queue);
		
//		Removendo um elemento da queue
		System.out.println("Removendo da Queue[" +queue.poll() + "]");
		
//		Selecionando elemetos da Queue após a remoção
		System.out.println("Elemntos da Queue:" + queue);


		
		
	}
	
}
