package pokerBase;

import java.util.ArrayList;
import java.util.UUID;

public class Game {
	private UUID GameID;
	private UUID TableID;
	private ArrayList<Player> GamePlayers;
	/**
	 * @param gameID
	 * @param tableID
	 * @param gamePlayers
	 */
	public Game(UUID gameID, UUID tableID, ArrayList<Player> gamePlayers) {
		super();
		GameID = gameID;
		TableID = tableID;
		GamePlayers = gamePlayers;
	}
	public UUID getGameID() {
		return GameID;
	}
	public UUID getTableID() {
		return TableID;
	}
	public ArrayList<Player> getGamePlayers() {
		return GamePlayers;
	}
	public void setGamePlayers(ArrayList<Player> gamePlayers) {
		GamePlayers = gamePlayers;
	}
	
	
	
}
