package app;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import entities.*;

public class Program {
	public static void main (String[] args) {
		
		DateTimeFormatter sdf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		
		LocalDateTime dthr = LocalDateTime.parse("21/06/2018 13:05:44", sdf);
		String title = ("Traveling to New Zealand"); 
		String content = ("I'm going to visit this wonderful country!"); 
		int likes = 12;
		String text = "Have a nice trip"; 
		String text2 = "Wow that's awesome!"; 	
		
		Post post = new Post (dthr, title, content, likes);
		Comment comment = new Comment (text);
		post.addComment(comment);
		comment = new Comment (text2); 
		post.addComment(comment); 
		
		
		dthr = LocalDateTime.parse("28/07/2018 23:14:19", sdf);
		title = ("Good night guys"); 
		content = ("See you tomorrow"); 
		likes = 5;
		text = "Good night"; 
		text2 = "May the force be with you"; 	
		
		Post post2 = new Post (dthr, title, content, likes);
		comment = new Comment (text);
		post2.addComment(comment);
		comment = new Comment (text2); 
		post2.addComment(comment); 
		
		 
		 System.out.println(post);
		 System.out.println("-----------------------");
		 System.out.println(post2);
		
	}

}
