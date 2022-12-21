package games_package;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;




public class MyGame {
	public  String gameName;
	public  String gameType;
	public  String gamePrice;
	public static final DateServer dateServ = new DateServer();
	public static final Calendar dateofb =Calendar.getInstance();
	public static final boolean LATE=false;
	private static final List<MyGame> iitems= new ArrayList<>(); 
	public MyGame() {
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
		//this method is empty because there was critical bug 

		
	}

	public static List<MyGame> getIitems() {
		return iitems;
	}
	
	

}
