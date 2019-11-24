package factory;
//import car.Benz;
import car.*;
public class Benzcar implements factory {
public car producecar() {
	return new Benz();
}
}
