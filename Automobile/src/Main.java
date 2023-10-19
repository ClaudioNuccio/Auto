public class Main {
    public static void main(String[] args) {
        Auto firstCar = new Auto("Stelvio", "Alfa Romeo","PA 32427 VZ");
        firstCar.setDisplacement(2891);

        System.out.println("The model of the first car is " + firstCar.getModel());
        System.out.println("The brand of the first car is " + firstCar.getBrand());
        System.out.println("The the license plate of the first car is " + firstCar.getLicensePlate());
        System.out.println("The displacement of the first car is " + firstCar.getDisplacement());
    }
}