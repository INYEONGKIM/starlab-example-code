package factoryMethodAfter;

import factoryMethodBefore.Shape;

public interface ShapeFactory {
	abstract public Shape make(String shapeName) throws Exception;
}
