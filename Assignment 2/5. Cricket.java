import java.util.Scanner;

class Player{
	String name;
	int age;
	String country_name;
	int total_runs;
	
	Player(String sname, int sage, String scountry, int sruns){
		this.name = sname;
		this.age = sage;
		this.country_name = scountry;
		this.total_runs = sruns;
		
	}
	
	void display() {
		if (total_runs > 5000) {
			System.out.println("Details of the players with more than 5000 total runs.");
			System.out.println("Name of the player : " + name);
			System.out.println("Age of the player : " + age);
			System.out.println("Country name of the player is : " + country_name);
			System.out.println("Total runs of the player : " + total_runs);
			System.out.println("");
		}
	}
}


public class Cricket {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Player[] player = new Player[5];
		for (int i = 0; i<5; i++) {
			System.out.println("Enter the name, age, country_name and total runs of player number " + (i +1));
			String name = s.next();
			int age = s.nextInt();
			String country_name = s.next();
			int total_runs = s.nextInt();
			
			player[i] = new Player(name, age,country_name,total_runs);
			
			
		}
		for(int i =0; i<5; i++) {
			player[i].display();
		}
		s.close();
	}	

}
