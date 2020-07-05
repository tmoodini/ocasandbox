package ocasandbox.soccer;

import java.util.ArrayList;
import java.util.Random;

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
	
	public Goal randomGoal(double time) {
		
		Team scoringTeam;
		Player scoringPlayer;
		int scoringTeamIndex = new Random().nextInt(2);
		if(scoringTeamIndex == 0) {
			scoringTeam = this.homeTeam;
			int randomPlayerIndex = new Random().nextInt(homeTeam.getRoster().length);
			scoringPlayer = homeTeam.getRoster()[randomPlayerIndex];
			homeGoals++;
		}
		else {
			scoringTeam = this.awayTeam;
			int randomPlayerIndex = new Random().nextInt(awayTeam.getRoster().length);
			scoringPlayer = awayTeam.getRoster()[randomPlayerIndex];
			
			awayGoals++;
		}
		
		return new Goal(scoringTeam,scoringPlayer,time);
		
		
	}
	
	public int getHomeGoals() {
		
		return this.homeGoals;
	}
	public int getAwayGoals() {
		return this.awayGoals;
	}

}
