//public class Fish extends Animal{
//
//   @Override
//    void move(){
//        System.out.println("This animal is swimming");
//    }
//}

public class Fish implements Prey, Predator {
    @Override
    public void flee(){
        System.out.println("The fish is swimming away.");
    };

    @Override
    public void hunt(){
        System.out.println("The fish is hunting.");
    };
}