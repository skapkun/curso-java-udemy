package application;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors; 

public class Program {
	public static void main (String [] args) {
		List <String> list = new ArrayList <>(); 
		
		list.add("Maria"); 
		list.add("Ana");
		list.add("Pedro");
		list.add("Bob");
		list.add(2, "Marco");
		list.add("Dana");
		list.add("Tereza");
		list.add("Danubia");
		list.add("Dudu");
		
		System.out.println(list.size());
		
		list.remove("Ana");
		list.remove(0);
		list.removeIf(x -> x.charAt(0) == 'M'); //expressão lambda, define um predicado 
		System.out.println("Index of Bob: " + list.indexOf("Bob"));
		System.out.println("Index of Marco: " + list.indexOf("Marco"));
		List <String> resul = list.stream().filter(y -> y.charAt(0)=='D').collect(Collectors.toList()); 
		for (String x : list) {
			System.out.println(x);
		}
		System.out.println("------------------");
		for (String x : resul) {
			System.out.println(x);
		}
		String name = list.stream().filter(y -> y.charAt(0)=='D').findFirst().orElse(null); 
		System.out.println(name);
		
	}
}
