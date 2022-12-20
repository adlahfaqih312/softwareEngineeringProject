package GamesPackage;

import java.util.ArrayList;
import java.util.Calendar;




public class MyGame {
	public String gameName;
	public String gameType;
	public String gamePrice;
	public DateServer dateServ;
	public Calendar dateofb;
	public boolean late=false;
	public static ArrayList<MyGame> iitems= new ArrayList<MyGame>(); ;
	public MyGame() {
		dateServ= new DateServer();
		gameName="GTA";
		gameType="Action & Life";
	}
	
	public String getGameName() {
		return gameName;
	}
	public void setGameName(String gameName) {
		this.gameName = gameName;
	}
	public String getGameType() {
		return gameType;
	}
	public void setGameType(String gameType) {
		this.gameType = gameType;
	}
	public String getGamePrice() {
		return gamePrice;
	}
	public void setGamePrice(String gamePrice) {
		this.gamePrice = gamePrice;
	}
	public void setDateServer(DateServer dateServ) {
		this.dateServ=dateServ;

		
	}
	
	

}
