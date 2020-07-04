package ocasandbox.soccer;

import java.util.ArrayList;

public class Game {
	
	private Team homeTeam;
	private Team awayTeam;
	private ArrayList<Goal> goals;
	private int homeGoals;
	private int awayGoals;
	
	public Game(Team homeTeam, Team awayTeam) {
		
		this.homeTeam = homeTeam;
		this.awayTeam = awayTeam;
		goals = new ArrayList<Goal>();
	}
	
	public boolean addGoal(Team team, double time, Player player) {
		
		Goal goal = new Goal(team, player, time);
		if(team.getTeamName().equals(homeTeam.getTeamName())) {
			homeGoals++;
		}
		else {
			awayGoals++;
		}
		
		return this.goals.add(goal);
	}

}
