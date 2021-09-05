package test;

public class Demo {

	public static void main(String[] args) {
		Person p=new Person();
		
		p.setId(1);
		int id=p.getId();
		p.setName("Mostafa");
		String name= p.getName();
		System.out.println(id);
		System.out.println(name);
		/*
		 * p.setId(id); p.setName(name);
		 */

	}

}
