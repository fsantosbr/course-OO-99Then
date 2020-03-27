package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

import entities.Comment;
import entities.Post;

public class Sec13_117_StringBuilder {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Post p1 = new Post(
				sdf.parse("21/06/2018 13:05:44"),
				"Traveling to New Zealand", 
				"I'm going to visit this wonderful country!",
				12);
		//No parse pode apresentar um erro, escolhe a sugestão de correção 'throws ParseException'
		
		
		Post p2 = new Post(
				sdf.parse("28/07/2018 23:14:19"),
				"Good night guys", 
				"See you tomorrow",
				5);
		//No parse pode apresentar um erro, escolhe a sugestão de correção 'throws ParseException'
		
		
		
				
		Comment c1 = new Comment("Have a nice trip");
		Comment c2 = new Comment("Wow that's awesome!");
		
		Comment c3 = new Comment("Good night");
		Comment c4 = new Comment("May the Force be with you");
		
				
		p1.addComment(c1);
		p1.addComment(c2);
		
		p2.addComment(c3);
		p2.addComment(c4);
		
		
		
		System.out.println(p1);
		System.out.println(p2);
		
		
		
		/*
		 * Traveling to New Zealand
12 Likes - 21/06/2018 13:05:44
I'm going to visit this wonderful country!
Comments:
Have a nice trip
Wow that's awesome!
Good night guys
5 Likes - 28/07/2018 23:14:19
See you tomorrow
Comments:
Good night
May the Force be with you
		 */
		
		
		
		
		
		sc.close();
	}

}
