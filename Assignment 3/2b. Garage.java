class Vehicle{
	int no_of_wheels;
	String color;
	String fuel;
	int speed;
	
	public Vehicle(int no_of_wheels, String color, String fuel, int speed) {
		this.no_of_wheels = no_of_wheels;
		this.color = color;
		this.fuel = fuel;
		this.speed = speed;
	}
	
	
	void start() {
		System.out.println("The vehicle has started.");
	}
	
	void accelerate() {
		System.out.println("The vehicle is accelerating.");
	}
	
	void brake() {
		System.out.println("The vehicle is slowing down.");
	}
}


class Van extends Vehicle{
	int no_of_doors;
	int load_capacity;
	int no_of_boxes;
	
	public Van(int no_of_wheels, String color, String fuel, int speed, int no_of_doors, int load_capacity,
			int no_of_boxes) {
		super(no_of_wheels, color, fuel, speed);
		this.no_of_doors = no_of_doors;
		this.load_capacity = load_capacity;
		this.no_of_boxes = no_of_boxes;
	}
	
	void loadVan() {
		System.out.println("The van is being loaded.");
	}
}


class Truck extends Vehicle{
	int no_of_doors;
	int load_capacity;
	String size_of_containers;
	
	
	public Truck(int no_of_wheels, String color, String fuel, int speed, int no_of_doors, int load_capacity,
			String size_of_containers) {
		super(no_of_wheels, color, fuel, speed);
		this.no_of_doors = no_of_doors;
		this.load_capacity = load_capacity;
		this.size_of_containers = size_of_containers;
	}
	
	void loadContainer() {
		System.out.println("The truck is being loaded.");
	}
}


class Car extends Vehicle{
	int no_of_doors;
	int passenger_seats;
	
	public Car(int no_of_wheels, String color, String fuel, int speed, int no_of_doors, int passenger_seats) {
		super(no_of_wheels, color, fuel, speed);
		this.no_of_doors = no_of_doors;
		this.passenger_seats = passenger_seats;
	}
}



class Bike extends Vehicle{
	int passenger_seats;
	int saddleHeight;
	public Bike(int no_of_wheels, String color, String fuel, int speed, int passenger_seats, int saddleHeight) {
		super(no_of_wheels, color, fuel, speed);
		this.passenger_seats = passenger_seats;
		this.saddleHeight = saddleHeight;
	}
}

public class Garage {
	public static void main(String[] args) {
		System.out.println("This is the main method.");
	}
}
