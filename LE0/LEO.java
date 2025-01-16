/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
    String name; int age;
    
    void  setName(String name){
        this.name = name;
    }
    void setAge(int age){
        this.age = age;
    }
    String getName(){
        return name;
    }
    int getAge(){
        return age;
    }
	public static void main(String[] args) {
		Main person = new Main();
		person.setName("UTKARSH PRATAP SINGH");
		person.setAge(21);
		
		System.out.println("Name is "+ person.getName());
		System.out.println("Age is "+ person.getAge());
		
	}
}