import java.util.Scanner;
import java.util.Random;
//
//public class Main {
//    public static void main(String[] args){
//        System.out.print("Enter your name: ");
//        String name = scanner.nextLine();
//        System.out.print("Enter your age: ");
//        int age= scanner.nextInt();
//        System.out.print("Enter your gpa: ");
//        double gpa= scanner.nextDouble();
//        System.out.print("Are you a student? (true/false)");
//        boolean isStudent= scanner.nextBoolean();
//        System.out.println("Your name is "+name+ " and you are "
//                +age+" years old with a gpa of " +gpa);
//        if(isStudent){
//            System.out.println("You are enrolled as a student.");
//        }else{
//            System.out.println("You are NOT enrolled as a student.");
//
//        System.out.print("Enter your age: ");
//        int age= scanner.nextInt();
//        scanner.nextLine();
//
//        System.out.print("Enter your name: ");
//        String name= scanner.nextLine();
//
//        System.out.println("You are "+name+ " and you are "+age+ " years old");
//
//
//        double width =0;
//        double height=0;
//        double area=0;
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter the width: ");
//        width= scanner.nextDouble();
//        scanner.nextLine();
//        System.out.print("Enter the height: ");
//        height=scanner.nextDouble();
//        scanner.nextLine();
//
//        area=height*width;
//
//        System.out.println("The area is "+area);
//        scanner.close();
//
//
//    }
//}
// }


//public class Main {
//    public static void main(String[] args){
//
////        MAD LIBS GAME
//
//        Scanner scanner= new Scanner(System.in);
//
//        String adjective1;
//        String noun1;
//        String adjective2;
//        String verb1;
//        String adjective3;
//
//        System.out.print("Enter an adjective (description): ");
//        adjective1=scanner.nextLine();
//        System.out.print("Enter a noun (animal or person): ");
//        noun1=scanner.nextLine();
//        System.out.print("Enter an adjective (description): ");
//        adjective2=scanner.nextLine();
//        System.out.print("Enter a verb ending with -ing (action): ");
//        verb1=scanner.nextLine();
//        System.out.print("Enter an adjective (description): ");
//        adjective3=scanner.nextLine();
//
//        System.out.println("Today I went to a "+ adjective1+ " zoo.");
//        System.out.println("In an exhibit, I saw a "+ noun1 + ".");
//        System.out.println(noun1 + " was "+ adjective2+ " and " +verb1+ "!");
//        System.out.println("I was "+ adjective3+ "!");
//    }
//}


//public class Main {
//    public static void main(String[] args){
//
////        Arithmetic operators
////        int x=10;
////        int y=2;
////
////        int z;
////        z=x+y;
//
////        Augmented assignment operators
//
//        int x=10;
//        int y= 3;
//
//        x +=y;
//
//        System.out.println(x);
//    }
//}

//
//public class Main {
//    public static void main(String[] args){
////        SHOPPING CART PROGRAM
//
//        Scanner scanner=new Scanner(System.in);
//        System.out.print("What item will you like to buy?: ");
//        String item=scanner.nextLine();
//        System.out.print("What is the price for each?: ");
//        double price= scanner.nextDouble();
//        scanner.nextLine();
//        System.out.print("How many will you like to get?: ");
//        int quantity= scanner.nextInt();
//        scanner.nextLine();
//
//        double totalPrice=price*quantity;
//
//        System.out.println("You have bought "+quantity+ " "+item+"/s.");
//        System.out.println("The total price is "+ totalPrice+".");
//
//
//        scanner.close();
//    }
//}

//public class Main {
//    public static  void main(String[] args){
////        IF ELSE STATEMENTS
//
//
//
//        Scanner scanner=new Scanner(System.in);
//        String name;
//        boolean isStudent;
//        System.out.print("What is your name?: ");
//        name= scanner.nextLine();
//
//        if(name.isEmpty()){
//            System.out.println("Please enter a valid name.");
//        }else{
//            System.out.println("Hello "+name+"!");
//        }
//
//
//        System.out.print("What is your age?: ");
//        int age= scanner.nextInt();
//        scanner.nextLine();
//
//        System.out.println("Are you a student? (true/false): ");
//;        isStudent=scanner.nextBoolean();
//
//
////        int age=25;
//        if(age > 18){
//            System.out.println("You are an adult.");
//        } else if (age<3) {
//            System.out.println("You are still a kid.");
//        } else{
//            System.out.println("You are an underage.");
//        }
//
//        if(isStudent){
//            System.out.println("You are a student.");
//        }else{
//            System.out.println("You are not a student.");
//        }
//
//        scanner.close();
//    }
//}

//public class Main {
//    public static void main(String[] args){
//    random function
//        Random random=new Random();
//
//        boolean isHead;
//
//        isHead= random.nextBoolean();
//        System.out.println(isHead);
//
//        if(isHead) {
//            System.out.println("HEAD");
//        }else{
//            System.out.println("TAIL");
//        }

//        double number1;
//
//        number1= random.nextDouble(1.0,99.0);
//        System.out.println(number1);

//        int number1;
//        int number2;
//        int number3;
//        number1= random.nextInt(1,7);
//        System.out.println(number1);
//        number2= random.nextInt(1,200);
//        System.out.println(number2);
//        number3=random.nextInt(1,8);
//        System.out.println(number3);

//    }
//}


//public class Main {
//    public static void main(String[] args){
//        Math class
//        System.out.println(Math.PI);
//        System.out.println(Math.E);
//
//        double result;
//        result=Math.pow(2,5);
//        result=Math.abs(-5);
//        result=Math.sqrt(9);
//        result=Math.round(4.2);
//        result=Math.ceil(3.1);
//        result=Math.floor(3.99);
//        result=Math.max(10,20);
//        result=Math.min(10,20);
//        System.out.println(result);
//    }
//}

//public class Main {
//    public static void main(String[] args){
//    Scanner scanner=new Scanner(System.in);
//    System.out.println("How old are you?: ");
//    int age=scanner.nextInt();
//    System.out.println(age);
//
//
//    }
//}

//
//public class Main {
//    public static void main(String[] args){
//        HYPOTENUSE
//        Scanner scanner=new Scanner(System.in);
//        double a;
//        double b;
//        double c;
//
//        System.out.println("Enter the length of side A: ");
//        a=scanner.nextDouble();
//        System.out.println("Enter the breadth of side B: ");
//        b=scanner.nextDouble();
//
//        System.out.println(a);
//        System.out.println(b);
//
//        c=Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
//        System.out.println(c);

//        System.out.print("Enter the radius: ");
//        double radius=scanner.nextDouble();
//
//        double area= (Math.PI)* (Math.pow(radius,2));
//        System.out.println("The area is "+ area);
//        double circumference= 2 * (Math.PI)* radius;
//        System.out.println("The circumference is "+ circumference);
//        double volume= (4.0/3.0) * Math.PI* Math.pow(radius,3);
//        System.out.println("The volume is " + volume);
//
//        System.out.printf("The circumference is %.1fcm \n", circumference);
//        System.out.printf("The area is %.1fcm2 \n", area);
//        System.out.printf("The volume is %.1fcm3", volume);
////        int age;
//        String name;
//        System.out.println("How old are you?: ");
//        age = scanner.nextInt();
//        scanner.nextLine();
//        System.out.println("What is your name?: ");
//        name=scanner.nextLine();
//
//        System.out.printf("My name is %s and I am %d years old.",name,age);

//        scanner.close();
//    }
//}

//public class Main {
//    public static void main(String[] args){
//        Scanner scanner= new Scanner(System.in);
//
//        String name = "Christopher";
//        char firstLetter = 'C';
//        int age = 23;
//        double height = 60000.5;
//        boolean isEmployed = true;
//
//
//        System.out.printf("Your name is %-10.3s",name);
//        System.out.printf("Hello %s \n", name);
//        System.out.printf("Your name starts with %c \n", firstLetter);
//        System.out.printf("Your age is %d \n", age);
//        System.out.printf("You are %,.1f \n", height);
//        System.out.printf("Employed: %b \n", isEmployed);
//        scanner.close();
//    }
//}

