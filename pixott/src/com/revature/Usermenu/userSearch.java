package com.revature.Usermenu;
import java.util.List;

import com.revature.Moviedao.Movielist;
import com.revature.SQL.search;
import com.revature.app.App;

public class userSearch {
public static void display() {
	System.out.println("Find movie ");
	System.out.println("===");
	System.out.println("enter the movie name to watch");
	String name = App.scanner.next();
	search movie = new search();
	List<Movielist> find = movie.search(name);
	System.out.println("search result");
	find.forEach(System.out::println);
	System.out.println("select a movie to watch (enter the id");
	int id = App.scanner.nextInt();
	Userchoice.display();
}
}
