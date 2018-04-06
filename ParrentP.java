import java.util.Scanner;
public class ParrentP{
	
	
	private String name;
	private String id;
	Scanner scan = new Scanner("this.scan");
//	System.out.println("Checking input in super class");
	String time = scan.nextLine();
	public ParrentP(){}
	public ParrentP(String name , String id){
	this.name = name;
	this.id = id;
}
	public void setName(String name){
	this.name = name;
}
	public void setId(String id){
	this.id = id;
}
	public String getName(){
	return name;
}
	public String getId(){
	return id;
	}

	public void displayData(){
	System.out.println(name+id);
		}

	public void input(){
	Scanner scan = new Scanner(System.in);
	System.out.println("Checking input in super class");
	String time = scan.nextLine();

}
}
