package OOPs.Interface;

public abstract class Player3 implements Coach{
	
	//run method undefined here.so,it is an Abstract class. 

	private String player_Name="Rishabh Pant";
	
	public void play() {System.out.println("Playing Cricket");}
	
	
	public static void main(String[] args) {
	    
		System.out.println("It is an abstract class");
		//so we cant create objects like below
	//Player3 player3=new Player3();
	//	System.out.println("Player Name is : "+player3.player_Name);
	//	player3.play();
	
	}


}
