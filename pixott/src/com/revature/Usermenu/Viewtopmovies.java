package com.revature.Usermenu;

import java.util.List;

import com.revature.Moviedao.Movielist;
import com.revature.SQL.Top5movies;
import com.revature.app.App;

public class Viewtopmovies {
public static void display() {
	System.out.println("Top 5 Trending Movies");
	System.out.println("=====================");
	Top5movies dao = new Top5movies();
	List<Movielist> list = dao.show();
	list.forEach(System.out::println);
	System.out.println("Select a movie (Enter Id):");
	int id = App.scanner.nextInt();
	Userchoice.display();
	}
}
