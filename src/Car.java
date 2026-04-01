////public class Car {
////    String make = "Ford";
////    String model = "Mustang";
////    int year = 2025;
////    double price = 58000.99;
////    boolean isRunning = false;
////
////    void start(){
////        isRunning=true;
////        System.out.println("You start the engine.");
////    }
////
////    void stop(){
////        isRunning=false;
////        System.out.println("You stop the engine.");
////    }
////
////    void drive(){
////        System.out.println("You are driving the model "+model );
////    }
////
////    void brake(){
////        System.out.println("You brake the model "+model);
////    }
////}
//
//
////public class Car {
////
////    String model;
////    String color;
////
////    Car(String model, String color){
////        this.model=model;
////        this.color=color;
////    }
////
////    void drive(){
////        System.out.println("You drive the "+ this.color+" "+this.model);
////    }
////}
//
//public class Car {
//
//    String make;
//    String model;
//    int year;
//    String color;
//
//    Car(String make, String model, int year, String color){
//        this.make = make;
//        this.model = model;
//        this.year = year;
//        this.color = color;
//    }
//
//    @Override
//    public String toString(){
//        return this.make +" "+ this.model+" "+this.year+" "+this.color;
//    }
//}

//public class Car extends Vehicle {
//    @Override
//    void go(){
//        System.out.println("You drive the car.");
//    }
//}

//public class Car {
//    private String model;
//    private String color;
//    private int price;
//
//    Car(String model, String color, int price){
//        this.model = model;
//        this.color = color;
//        this.price = price;
//    }
//
//    String getModel(){
//        return this.model;
//    }
//
//    String getColor(){
//        return this.color;
//    }
//
//    int getPrice(){
//        return this.price;
//    }
//
//    void setColor(String color){
//        this.color = color;
//    }
//
//    void setPrice(int price){
//       if(price <= 0){
//           System.out.println("Price must be greater than 0");
//       }else {
//           this.price = price;
//       }
//    }
//}

public class Car {
    int year;
    String model;
    Engine engine;

    Car(int year, String model, String type){
        this.model = model;
        this.year = year;
        this.engine = new Engine(type);
    }
}