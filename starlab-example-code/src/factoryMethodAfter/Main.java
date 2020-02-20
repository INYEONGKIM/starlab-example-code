package factoryMethodAfter;

import factoryMethodBefore.Shape;

public class Main {
	public static void main(String[] args) {
		ShapeFactory factory = new ShapeFactoryImplementation();
		try {
			Shape shape1 = factory.make("Circle");
			shape1.draw();
			
			Shape shape2 = factory.make("Square");
			shape2.draw();
			
			Shape shape3 = factory.make("Triangle");
			shape3.draw();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

