class Foo {
	
	public static String classVar = "Class Var";
	public String instanceVar = "Instance Var";
	
	public static void classMethod() {
		System.out.println(classVar); // ok
		// System.out.println(instanceVar); // error	
	}
	
	public void instanceMethod() {
		System.out.println(classVar); // ok
		System.out.println(instanceVar); //ok
	}
}


public class StaticApp {

	public static void main(String[] args) {
		System.out.println("Class Test");
		System.out.println(Foo.classVar); // ok
		// System.out.println(Foo.instanceVar); // error
		Foo.classMethod(); // ok
		// Foo.instanceMethod(); // error
		
		System.out.println("Instance Test");
		Foo f1 = new Foo();
		Foo f2 = new Foo();
		
		System.out.println(f1.classVar); // ok
		System.out.println(f1.instanceVar); // ok
		
		f1.classVar = "Changed by f1";
		System.out.println(f1.classVar); // Changed by f1
		System.out.println(f2.classVar); // Changed by f1
		
		f1.instanceVar = "Changed by f1";
		System.out.println(f1.instanceVar); // Changed by f1
		System.out.println(f2.instanceVar); // Instance Var
		
		System.out.println("f1 class method");
		f1.classMethod();
		System.out.println("f1 instance method");
		f1.instanceMethod();
		
		System.out.println("f2 class method");
		f2.classMethod();
		System.out.println("f2 instance method");
		f2.instanceMethod();
	}

}
