//import java.util.Scanner;
public class TestPC{
	public static void main(String[] args){
	ParrentP p1 = new ParrentP("kslis","fa17");
	ChildC c1 = new ChildC("sfdwe","0065d","sp18");

	p1.setName("asjassj");
	String nAme = p1.getName();
	p1.setId("sp18");
	String iD = p1.getId();
	c1.setSemester("sp19");
	String semester = c1.getSemester();

	c1.input();
	
}
}
