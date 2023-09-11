public class Main {
    public static void main(String[] args) {
    Car car = new Car("BMW", "X6", 2024);

        //setters
        car.setModelo("x5");

        //getters
        System.out.println(car.getMarca());
        System.out.println(car.getModelo());
        System.out.println(car.getAno());

    }
}