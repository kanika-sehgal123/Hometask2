import java.util.ArrayList;
import java.util.List;


public class SaveData {
	public static void main(String[] args) {
		new SaveData();
	}
	SaveData()
	{
		List<Car> ListCars = new ArrayList<>();
		
		Car car1=new Car("1", "Maruti", "Brezza", 2022, "Blue", 1000000, "PB112255");
		Car car2=new Car("2", "Maruti", "Grand Vitara", 2012, "White", 1200000, "PB112255");
		Car car3=new Car("3", "Maruti", "Ciaz", 2020, "White", 1100000, "PB112255");
		Car car4=new Car("4", "Tata", "Nexon", 2018, "Grey", 1400000, "PB112255");
		Car car5=new Car("5", "Tata", "Harrier", 2023, "Red", 1800000, "PB112255");
		Car car6=new Car("6", "Tata", "Safari", 2021, "Black", 1700000, "PB112255");	
		Car car7=new Car("7", "Hundai", "I 20", 2020, "Grey", 900000, "PB112255");
		Car car8=new Car("8", "Hundai", "Creta", 2017, "White", 1900000, "PB112255");
		Car car9=new Car("9", "Honda", "Amaze", 2019, "Green", 1100000, "PB112255");
		Car car10=new Car("10", "Honda", "Amaze", 2023, "Black", 900000, "PB112255");
				
		ListCars.add(car1);
		ListCars.add(car2);
		ListCars.add(car3);
		ListCars.add(car4);
		ListCars.add(car5);
		ListCars.add(car6);
		ListCars.add(car7);
		ListCars.add(car8);
		ListCars.add(car9);
		ListCars.add(car10);

		
		Car.saveByMake(ListCars, "Maruti", "Maruti.txt");
		Car.saveByMake(ListCars, "Tata", "Tata.txt");
		Car.saveByMake(ListCars, "Honda", "Honda.txt");

		Car.saveByModelAndAge(ListCars, "Amaze", 3, "ModelAndAge.txt");

		Car.saveByYearAndPrice(ListCars, 2012, 1100000, "YearAndPrice.txt");
	}


}
