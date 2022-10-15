package myLogIn;

public class Search {
	Search s;
	Log_In l;
	String user;
	int pass;
	public Search() {
		
	}

	public void searchIfThere(String userName,int passWord) {
		l=new Log_In(userName);
		l=new Log_In(passWord);
		if(l.getUserName().contains(l.getUsername())) {
				System.out.println("you already register please go to login page");
			}
			
		
		else {
			l.addToList(l,l);
			System.out.println("Good");
		}
		
	}
	

	public void displayMessage(Log_In userName,Log_In PassWord) {
		if(userName.getUserName().contains(userName.getUsername())) {
			if(PassWord.getPassWord().contains(PassWord.getPassword())) {
				System.out.println("Login Succsessfully");
			}
			else {
				System.out.println("Please Enter Valid Password");
			}
		}
		else {
			System.out.println("Please Enter Valid Username");
		}
		
		
	}

}
