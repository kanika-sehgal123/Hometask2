import java.io.*;
import java.util.Calendar;
import java.util.List;


public class Car {
	private String id;
	private String make;
	private String model;
	private int yom;
	private String color;
	private double price;
	private String regNo;
	public Car(String id, String make, String model, int yom,
			String color, double price, String regNo) {
		this.id = id;
		this.make = make;
		this.model = model;
		this.yom = yom;
		this.color = color;
		this.price = price;
		this.regNo = regNo;
	}

	public String getMake() {
		return make;
	}

	public String getModel() {
		return model;
	}

	public int getYom() {
		return yom;
	}

	public double getPrice() {
		return price;
	}


	public static int getCurrentYear()
	{
		int year = Calendar.getInstance().get(Calendar.YEAR);
		return year;
	}

	public static void saveByMake(List<Car> Cars, String make,
			String fileName) {
		try (PrintWriter writer = new PrintWriter(new FileWriter(fileName))) {
			for (Car Car : Cars) {
				if (Car.getMake().equalsIgnoreCase(make)) {
					writer.println(Car.toString());
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// Method to save Cars by model and age
	public static void saveByModelAndAge(List<Car> Cars, String model,int age, String fileName) {
		try (PrintWriter writer = new PrintWriter(new FileWriter(fileName))) {
			for (Car Car : Cars) {
				if (Car.getModel().equalsIgnoreCase(model)	&& (getCurrentYear() - Car.getYom()) < age) {
					writer.println(Car.toString());
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}


	public static void saveByYearAndPrice(List<Car> Cars, int year,
			double minPrice, String fileName) {
		try (PrintWriter writer = new PrintWriter(new FileWriter(fileName))) {
			for (Car Car : Cars) {
				if (Car.getYom() == year
						&& Car.getPrice() > minPrice) {
					writer.println(Car.toString());
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public String toString() {
		return "Car [id=" + id + ", make=" + make + ", model=" + model
				+ ", yom=" + yom + ", color="
				+ color + ", price=" + price + ", regNo=" + regNo + "]";
	}
}
