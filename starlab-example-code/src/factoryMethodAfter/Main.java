package factoryMethodAfter;

import factoryMethodBefore.Shape;

public class Main {
	public static void main(String[] args) {
		ShapeFactoryImplementation factory = new ShapeFactoryImplementation();
		try {
			Shape shape = factory.make("Circle");
			shape.draw();
			
			shape = factory.make("Square");
			shape.draw();
			
			shape = factory.make("Triangle");
			shape.draw();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
