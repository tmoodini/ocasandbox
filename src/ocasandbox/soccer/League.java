package ocasandbox.soccer;

import java.util.Random;

public class League {

	public static void main(String[] args) {
		
		League league = new League();
		Player[] homeRoster = new Player[3];
		Player[] awayRoster = new Player[3];
		
		homeRoster[0] = new Player("Bob Smoth");
		homeRoster[1] = new Player("Sam Houtson");
		homeRoster[2] = new Player("Jill Jenkins");
		
		awayRoster[0] = new Player("Joe Jack");
		awayRoster[1] = new Player("Sally Salty");
		awayRoster[2] = new Player("Mike Ike");
		
		
		
		Team home = new Team("Lions", homeRoster);
		Team away = new Team("Tigers", awayRoster);
		
		Game game = new Game(home, away);
		
		int totalGoals = new Random().nextInt(10-3) + 3;
		Random randomTime = new Random();

		
		
		for(int i = 0; i <=totalGoals;i++) {
			int minutes = randomTime.nextInt(90);
			double seconds = randomTime.nextDouble();
			Goal g = game.randomGoal(minutes+seconds);
			System.out.println(g.getPlayer().getName() + " " + g.getTeam().getTeamName() + " " + g.getTime());
		}
		
		league.searchAndPrint(homeRoster, "o");
		

	}
	
	public void searchAndPrint(Player[] roster, String searchString) {
		
		CharSequence cs = searchString.subSequence(0, searchString.length());
		System.out.println(cs.toString());
		for(Player p : roster) {
			if (p.getName().contains(cs)) {
				System.out.println(p.getName());
			}
		}
		
	}
	
	
	

}
