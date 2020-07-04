package ocasandbox.soccer;

public class Team {
	
	private String teamName;
	private Player[] roster;
	
	
	public Team(String teamName, Player[] roster) {
		
		this.teamName = teamName;
		this.roster = roster;
	}
	
	public String getTeamName() {
		return teamName;
	}
	
	public Player[] getRoster() {
		return this.roster;
	}
	
	

}
