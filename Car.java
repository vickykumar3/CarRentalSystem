public class Car {
    private int id;
    private String brand;
    private String model;
    private double pricePerDay;
    private boolean available;

   public  Car(int id, String brand, String model, double pricePerDay) {
    this.id = id;
    this.brand = brand;
    this.model = model;
    this.pricePerDay = pricePerDay;
    this.available = true;
   }

   public void displayinfo() {
     System.out.println("Car ID: " + id);
     System.out.println("Brand: " + brand);
     System.out.println("Model: " + model);
     System.out.println("Price per day: " + pricePerDay);
     System.out.println("Available: " + available);
   }

   public String getBrand() {
    return this.brand;
   }

   public String getModel(){
    return this.model;
   }

   public double getPricePerDay() {
    return this.pricePerDay;
   }

   public boolean isAvailable(){
    return available;
   }
    
    public boolean rentCar() {
        if(available) {
            available = false;
            System.out.println("Car rented successfully");
            return true;
        }
        else {
            System.out.println("Car is already rented");
            return false;
        }
    }

    public void returnCar(){
        if(available) {
            System.out.println("Car is already available");
        }
        else {
            available = true;
            System.out.println("Car returned successfully");
        }
    }


}