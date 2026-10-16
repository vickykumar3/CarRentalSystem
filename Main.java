public class Main {
    public static void main(String[] args) {
        Car car1 = new Car(101, "Mahindra", "XUV", 1000);
        Car car2 = new Car(109, "Maruti" , "Swift", 120);
        

        // System.out.println(car1.getBrand());
        // System.out.println(car1.getModel());
        // System.out.println(car1.getPricePerDay());
        // System.out.println(car1.isAvailable());

     //  car2.displayinfo();
        car1.rentCar();
        System.out.println(car1.isAvailable()); //true

        car1.returnCar();
        System.out.println(car1.isAvailable());  //true
    }
}
