package GamesPackage;

import java.util.ArrayList;
import java.util.List;

public class Store {
	 public List<MyGame> item = new ArrayList<MyGame>();
	 public MyGame game1=new MyGame();
	 public MyGame game2=new MyGame();
	public MyGame game3=new MyGame();
	
	
	public static List<AdminOfStore> admins = new ArrayList<AdminOfStore>();
	public static AdminOfStore admin1 = new AdminOfStore();
	public static AdminOfStore admin2 = new AdminOfStore();
public static AdminOfStore admin3 = new AdminOfStore();

	public static List<UsersOfStore> Users = new ArrayList<UsersOfStore>();
	public static UsersOfStore user1 = new UsersOfStore();
	public static UsersOfStore user2 = new UsersOfStore();
	public static UsersOfStore user3 = new UsersOfStore();
	
	public Store() {
		super();
		game1.setGameName("GTA");
		game1.setGameType("Action & Life");
		game1.setGamePrice("99$");
		item.add(game1);
		
		game2.setGameName("Blur");
		game2.setGameType("Cars");
		game2.setGamePrice("89$");
		item.add(game2);
		
		game3.setGameName("Call Of Duty");
		game3.setGameType("Horror & Action");
		game3.setGamePrice("125$");
		item.add(game3);
		
		admin1.setUsername("Adlah");
		admin2.setUsername("Masa");
	   admin3.setUsername("Arwa");

		admin1.setPasword("00312");
		admin2.setPasword("01234");
		admin3.setPasword("12345");
		
		
		user1.setID("119");
		user1.setName("Tamara");
		user1.setEmail("tamara103@gmail.com");	
		Users.add(user1);
		
	}
	
	
	
	public boolean checkLogin(String username) {

		for (int i = 0; i < admins.size(); i++)

		{
			
		}
		return false;
	}
	
	
	
	public static int foundUser = 0;

	 
	 

	public String search(String type, String string) {
		String t = "null";
		CharSequence seq = string;
		if (type.equalsIgnoreCase("name")) {
			t = "";
			for (int l = 0; l < item.size(); l++) {
				String test =(item.get(l).getGameName());				
				t = resultFound(t, seq, l, test);
			}
		}		
		if (type.equalsIgnoreCase("type")) {
			t = "";
			for (int l = 0; l < item.size(); l++) {
				String test =(item.get(l).getGameType());

				t = resultFound(t, seq, l, test);
			}
		}		
		if (type.equalsIgnoreCase("price")) {
			t = "";
			for (int l = 0; l < item.size(); l++) {
				String test =(item.get(l).getGamePrice());
				t = resultFound(t, seq, l, test);
			}
		}				
		return t;
	}

	private String resultFound(String t, CharSequence seq, int l, String test) {
		if (test.contains(seq)) {
			t = test;
			System.out.println("Found");
		}
		return t;
	}


}
