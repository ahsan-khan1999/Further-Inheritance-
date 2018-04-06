public class ChildC extends ParrentP{
	
	private String semester;
	public ChildC(){}
	public ChildC(String name, String id, String semester){
	super(name,id);
	this.semester = semester;
}
	//overiding!!
	public void displayData(){
	super.displayData();
	System.out.println(semester);

		}
	public void setSemester(String semester){
	this.semester = semester;
	}
	
	public String getSemester(){
	return semester;
	}
	public void input(){
	super.input();	
	System.out.println("Input Taken UhUhooo!!");
	}

	
}
