
public class TestCircleWithStaticMembers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Before creating objects");
		System.out.println("The number of Circle objects is "+Circle.number0f0bjects);
		Circle c1=new Circle();
		System.out.println("\nAfter creating c1");
		System.out.println("c1: radius (" + c1.radius + ") and number of Circle objects(" + c1.number0f0bjects + ")");
		Circle c2=new Circle(5);
		c1.radius=9;
		System.out.println("\nAfter creating c2 and modifying c1");
		System.out.println("c1: radius (" + c1.radius + ") and number of Circle objects(" + c1.number0f0bjects + ")");
		System.out.println("c2: radius (" + c2.radius + ") and number of Circle objects(" + c2.number0f0bjects + ")");
	}

}
