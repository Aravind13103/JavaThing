package exceptions;

class CarStopped extends Exception {
	public CarStopped(String message) {
		super(message);
	}

}

class CarPuncture extends Exception {
	public CarPuncture(String message) {
		super(message);
	}
}

class CarHeat extends Exception {
	public CarHeat(String message) {
		super(message);
	}
}

class CarTest extends Exception {

	static void stop(String msg) throws Exception {
		if (msg == "stop") {
			throw new CarStopped("Car Stopped");
		} else {
			System.out.println("Car not Stalled!");
		}
	}

	static void puncture(String msg) throws Exception {
		if (msg == "puncture") {
			throw new CarPuncture("Car is Punctured");
		} else {
			System.out.println("Car not Punctured");
		}
	}

	static void carHeat(int tempature) throws Exception {
		if (tempature > 50) {
			throw new CarHeat("Car is heated more than 50 degrees");
		} else {
			System.out.println("Car not Stalled!");
		}
	}

	public static void main(String[] args) {
		try {
//			CarTest.stop("stop");
			CarTest.puncture("puncture");
		} catch(Exception e) {
			System.err.println(e.getMessage());
		}
	}

}
