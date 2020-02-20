package factoryMethodBefore;

public class Main {
	public static void main(String[] args) {		
		Shape circle = new Circle();
		circle.draw();		
		
		Shape square = new Square();
		square.draw();
	}
}
