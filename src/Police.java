import java.awt.Image;

/**
 * Models Police Class who uniquely have police ranks
 *@author Seth Miller
 *@version 1.0.0, 07 January 2021
 */
public class Police extends Person implements Employee{
	private int ID;
	
	private static int IDcounter = 100000;
	
	//Represents hourly wage
	private int payRate;
	//represents sum of income made
	private int earnings = 0;
	//Represents rank in police force, determined by payRate
	private PoliceRole role;
	private Image imgURL =  toolkit.createImage("Police.png");
	
	
	/**
	 * Implements Police with only ID
	 */
	Police(int ID){
		super();
		init();
		this.ID = ID;
	}
	
	/**
	 * Implements Police with no parameters
	 */
	Police(){
		super();
		init();
	}
	
	/**
	 * Implements Police based on payRate
	 * @param payRate - hourly wage
	 */
	Police(int payRate){
		super();
		init();
		this.payRate = payRate;
		setRole();
	}
	
	/**
	 * Implements Police based on name and age
	 * @param name - Cop's name
	 * @param age - Cop's age
	 */
	Police(String name, int age){
		super(name,age);
		init();
	}
	
	/**
	 * Implements Police based on payRate, name and age
	 * @param payRate - hourly wage
	 * @param name - Cop's name
	 * @param age - Cop's age
	 */
	Police(int payRate,String name, int age){
		super(name,age);
		init();
		this.payRate = payRate;
		setRole();
	}
	
	/**
	 * Helper function - Sets default parameters for Police class
	 */
	private void init() {
		//Create unique police ID
		ID = IDCounter++;
		payRate = 13;
		earnings = 0;
		setRole();
		//default all police phone numbers to 911
		phoneNum = "911";
	}
	
	/**
	 * set Police's role based on the current pay rate
	 * Higher payRate, means higher role
	 */
	private void setRole() {
		if (payRate>40)
			role = PoliceRole.Chief;
		else if (payRate>30)
			role = PoliceRole.Captain;
		else if (payRate > 20)
			role = PoliceRole.Sargent;
		else
			role = PoliceRole.Patrol;
	}
	
	/**
	 * Represents different roles in the police force
	 */
	public enum PoliceRole {
		Patrol, Sargent, Captain, Chief
	}
	
	/**
	 * @return a string compiling all Police attributes
	 */
	public String toString() {
		return super.toString() + "\nID:" + ID +" | Position: " + role.toString();
	}
	
	/**
	 * Implements Employee's getPaid()
	 * Represents how Employees can get money from their job
	 * @return a string showing payRate and earnings
	 */
	public String getPaid() {
		earnings+=payRate;
		return (name+ " gets paid $"+payRate+ " and now has $"+ earnings);
	}

	/**
	 * Getter for ID
	 * @return ID - Police's ID
	 */
	public int getID() {
		// TODO Auto-generated method stub
		return ID;
	}

	/**
	 * Getter for earnings
	 * @return earnings - Police's earnings
	 */
	public int getEarnings() {
		// TODO Auto-generated method stub
		return earnings;
	}
	
	/**
	 * Getter for PoliceRole
	 * @return - a string version of the Enum for this police's role
	 */
	public String getRole() {
		return this.role.toString();
	}
	
	/**
	 * Getter for imgUrl
	 * @return the image representing Teacher - for UI purposes
	 */
	public Image getImage() {
		return imgUrl;
	}

}
