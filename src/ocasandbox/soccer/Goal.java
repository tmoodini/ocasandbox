package ocasandbox.soccer;

public class Goal {
	
	private Team team;
	private Player player;
	private double time;
	
	public Goal(Team team, Player player, double time) {
		this.team = team;
		this.player = player;
		this.time = time;
	}
	
	public Team getTeam() {
		
		return this.team;
	}
	
	public Player getPlayer() {
		return this.player;
	}
	
	public double getTime() {
		
		return this.time;
	}

}
