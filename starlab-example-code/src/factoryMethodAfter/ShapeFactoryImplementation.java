package factoryMethodAfter;

import factoryMethodBefore.Shape;
import factoryMethodBefore.Circle;
import factoryMethodBefore.Square;

public class ShapeFactoryImplementation implements ShapeFactory {

	@Override
	public Shape make(String shapeName) throws Exception {
		if (shapeName.equals("Circle")) {
			return new Circle();			
		} 
		else if (shapeName.equals("Square")) {
			return new Square();
		}
		else {
			// make Runtime Error
			throw new Exception("ShapeFactory cannot create " + shapeName);
		}
		
	}
	
}
