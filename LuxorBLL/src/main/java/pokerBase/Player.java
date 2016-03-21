package pokerBase;

import java.util.UUID;

public class Player {
	private UUID PlayerID;
	private String PlayerName;
	private int PlayerPosition;
	/**
	 * @param playerID
	 * @param playerName
	 * @param playerPosition
	 */
	public Player(UUID playerID, String playerName, int playerPosition) {
		super();
		PlayerID = playerID;
		PlayerName = playerName;
		PlayerPosition = playerPosition;
	}
	public UUID getPlayerID() {
		return PlayerID;
	}
	public String getPlayerName() {
		return PlayerName;
	}
	public void setPlayerName(String playerName) {
		PlayerName = playerName;
	}
	public int getPlayerPosition() {
		return PlayerPosition;
	}
	public void setPlayerPosition(int playerPosition) {
		PlayerPosition = playerPosition;
	}
	
	
	
}
