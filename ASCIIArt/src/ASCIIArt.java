/**
 * Unit 1 Project
 * 
 * In this project you have the opportunity to create a piece of artwork using ASCII 
 * (American Standard Code for Information Interchange). Using the already created file 
 * named `ASCIIArt.java` write a program that outputs your artwork to the console. 
 * The goal of this project is to use ONLY what we have learned in Unit 1 to create 
 * anything you would like so be creative (and school appropriate). Artwork must also have a caption describing what it's depicting.  
 * 
 * For those of you who have dabbled in coding before, try to contain your code to 
 * just what we have discussed in this unit.  
 * 
 * @author Mr. Rasmussen 
 *
 */

// YOU CODE HERE :) 

public class ASCIIArt {
	public static void main (String[] args) {
		bubbles1();
		fishes1();
		bubbles2();
		fishes2();
		bubbles3();
		fishes3();
		bubbles4();
		fishes4();
		projectCaption();
		
	
	}
	public static void bubbles1() {
		 System.out.println("\n\n\t\t\tO");
		 System.out.println("\n\n\t\t    o");
	 
	}
	public static void bubbles2() {
		 System.out.println("\t\t\tO");
		 System.out.println("\n\n\t\t\t\t    o"); 
	}
	public static void bubbles3() {
		 System.out.println("\t\t\tO");
		 System.out.println("\n\n\t\t\t    o"); 
	}
	public static void bubbles4() {
		 System.out.println("\t\tO");
		 System.out.println("\n\n\t    o"); 
	}
	 
	public static void fishes1() {
		System.out.print("\t><\\\\\\^>");
	}
	public static void fishes2() {
		System.out.println("\t\t\t\t\t<^)))><");
		seaweed();
		seaweed2();
	}
	public static void fishes3() {
		System.out.println("\t\t\t\t<^///><");
	}
	public static void fishes4() {
		System.out.println("><||||^>");
		System.out.print("\t\t\t\t\t");
		seaweed();
	
		bubbles1();
		fishes1();
	
	}
	public static void seaweed() {
		System.out.print(" \\\\//");
	
	}
	public static void seaweed2() {
		System.out.print("\n\\\\\\///");
	}
	public static void projectCaption() {
		System.out.println("\n\n\n\n\nCaption:");
		System.out.println("\n\tA group of fishes, bubbles, and seaweed");
	
	}
	
	
	
}