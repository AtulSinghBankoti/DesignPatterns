package design.pattern.abstractFactory;

import design.pattern.common.Vechile;

public interface AbstractVechileFactoy {
	Vechile createVechile(String type);
}
