public class SuperCar.java {
	public static void main(String[] args) {

	Object superCar = new Vehicle();

// superCar inherits all the Object methods, 
// but an object of class Object cannot access the Vehicle methods
// For example, System.out.println(superCar.getSpeed());  Throws an error
// You cast  from the type Object to Vehicle to access those methods:
	System.out.println(((Vehicle)superCar).getSpeed());

// The methods of the Object class
	Vehicle superTruck = new Vehicle();
	System.out.println(superCar.equals(superTruck));  
//  ^ Returns 'false' because superCar and superTruck are two separate objects

// Each time you create a new object, Java interpreter creates a 
// unique identifier for that object: hashCode 
	System.out.println(superCar.hashCode());

// getClass returns the class of an object
	System.out.println(superCar.getClass()); 

// THE CLASS OBJECT
// You can use the Class object method getName to get just the class name
	System.out.println(superCar.getClass().getName());

// You can check if 2 objects are of the same class with getClass()
	if (superCar.getClass() == superTruck.getClass()) {
		System.out.println("They are in the same class.");
	}

// getSuperClass returns the superclass of the class
// Here, prints out: "class Crashable"
	System.out.println(); 
	System.out.println(superCar.getClass().getSuperclass());

// The toString method is often overwritten for an object
	System.out.println(superCar.toString()); 

// Common function: convert primitive to string
// toString is often used to convert primitives to strings
	int randNum = 100;
	System.out.println(Integer.toString(randNum)); 

// THE CLONE METHOD
// clone copies the current values of an object and assigns them to another. 
// If you make changes are made after the clone, both objects aren't affected, though.
	superTruck.setWheels(6);
	Vehicle superTruck2 = (Vehicle)superTruck.clone();
	System.out.println(superTruck.getWheels()); 
	System.out.println(superTruck2.getWheels()); 

// They are separate objects and don't have equal hashcodes
	System.out.println(superTruck.hashCode()); 
	System.out.println(superTruck2.hashCode()); 
	}
}

// If you have an object inside of another object: 
// If you have SubObjects defined in an object, clone won't also clone them. 
// You would have to do that manually; to be covered separately (it's more complex).

