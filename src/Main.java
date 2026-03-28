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

//public class Main {
//    public static void main(String[] args){
////        compound interest calculator
//        Scanner scanner= new Scanner(System.in);
//
//        double principal;
//        double rate;
//        int timesCompounded;
//        int years;
//        double amount;
//
//        System.out.println("Enter the principal amount: ");
//        principal=scanner.nextDouble();
//        System.out.println("Enter the interest rate in (%): ");
//        rate=scanner.nextDouble()/100.0;
//        System.out.println("Enter the number of times compounded in a year: ");
//        timesCompounded=scanner.nextInt();
//        System.out.println("Enter the number of years: ");
//        years=scanner.nextInt();
//
//
//        amount = principal * ( Math.pow((1 + rate/timesCompounded), timesCompounded* years));
//        System.out.println(amount);
//        scanner.close();
//    }
//}
//
//public class Main {
//    public static void main(String[] args){
// nested if else statement
//        boolean isStudent = false;
//        boolean isSenior=true;
//        double price=9.99;
//
//        if(isStudent){
//            if(isSenior){
//                System.out.println("You get a student discount of 10%.");
//                System.out.println("You get a senior discount of 20%.");
//                price *=0.70;
//            }else{
//                System.out.println("You get a student discount of 10%.");
//                price *=0.90;
//            }
//        }else{
//            if(isSenior){
//                System.out.println("You get a senior discount of 20%.");
//                price *=0.8;
//            }else{
//                price *=1;
//            }
//        }
//        System.out.printf("You are to pay a ticket of price %.2f", price);
//    }
//}

//public class Main {
//    public static void main(String[] args){
//        String methods
//        String name="password";
//        System.out.println(name.equals("password"));
//        int length=name.length();
//        System.out.println(length);
//        char letter= name.charAt(2);
//        int index=name.indexOf("o");
//        int lastIndex=name.lastIndexOf("o");

//        name=name.trim();

//        name=name.toUpperCase();
//        name=name.toLowerCase();
//
//
//        name=name.replace("o","a");
//        System.out.println(name.isEmpty());
//        System.out.println(name);
//
//        if(name.contains(" ")){
//            System.out.println("Your name contains space.");
//        }else{
//            System.out.println("Your name didn't contains space.");
//        }
//    }
//}

//public class Main {
//    public static void main(String[] args){
//        substring methods
//
//        Scanner scanner= new Scanner(System.in);
//        System.out.print("Enter your email: ");
//        String email=scanner.nextLine();
//
//        String email = "Bro123@gmail.com";
//        String username= email.substring(0,email.indexOf("@"));
//        String domain = email.substring(email.indexOf("@")+1);
//        System.out.println(domain);
//        System.out.println(username);
//
//        scanner.close();
//    }
//}

//public class Main {
//    public static void main(String[] args){
//        Weight converter program
//
//        Scanner scanner= new Scanner(System.in);
//
//        double weight;
//        double newWeight;
//        int choice;
//        System.out.println("Weight conversion program");
//        System.out.println("1: Convert lbs to kgs");
//        System.out.println("2: Convert kgs to lbs");
//        System.out.print("Choose an option: ");
//        choice=scanner.nextInt();
//        if(choice == 1){
//            System.out.println("Enter your weight in lbs: ");
//            weight= scanner.nextDouble();
//            newWeight = weight * 0.45;
//            System.out.printf("Your weight in kgs is %f", newWeight);
//        }else if(choice ==2){
//            System.out.println("Enter your weight in kgs: ");
//            weight= scanner.nextDouble();
//            newWeight = weight * 2.20462;
//            System.out.printf("Your weight in lbs is %f", newWeight);
//        }else{
//            System.out.println("Enter a valid option pls");
//        }
//        scanner.nextLine();
//        scanner.close();
//    }
//}

//public class Main {
//    public static void main(String[] args){
//        ternary operator

//        int score=70;
//
//        String passOrFail= (score>=70)? "PASS":"FAIL";
//        System.out.println(passOrFail);

//        int number=5 ;
//
//        String evenOrOdd=(number%2==0)?"EVEN":"ODD";
//        System.out.println(evenOrOdd);
//    }
//}

//public class Main {
//    public static void main(String[] args){
////        Temperature conversion
//
//        Scanner scanner= new Scanner(System.in);
//
//        double temp;
//        double newTemp;
//        String unit;
//
//        System.out.println("Enter the temperature: ");
//        temp=scanner.nextDouble();
//        scanner.nextLine();
//
//        System.out.println("Convert to Fahrenheit? (C or F): ");
//        unit=scanner.nextLine().toUpperCase();
//
//        System.out.println(temp);
//        System.out.println(unit);
//
//        newTemp=(unit.equals("C"))? (temp - 32) *(5.0/9) : (temp + 32) *(9.0/5);
//        System.out.println(newTemp);
//        scanner.close();
//    }
//    }

//public class Main {
//    public static void main(String[] args){
////        Enhanced switches
//
//        Scanner scanner=new Scanner(System.in);
//
//        String day;
//        System.out.println("Enter a day: ");
//        day = scanner.nextLine().toLowerCase();
//
//
//        switch (day){
//            case "monday", "tuesday", "wednesday", "thursday", "friday" -> System.out.println("It is a week day");
//            case "saturday", "sunday" -> System.out.println("It is a weekend");
//            default -> System.out.println("This isn't a valid day.");
//        }
//    }
//}

//public class Main {
//    public static void main(String[] args){
//    calculator program
//        Scanner scanner=new Scanner(System.in);
//
//        double num1;
//        double num2;
//        char operator;
//        double result = 0;
//        boolean isValidOperator = true;
//
//        System.out.println("Enter the first number: ");
//        num1= scanner.nextDouble();
//
//        System.out.print("Enter an operator (+, -, *, /. ^): ");
//        operator =scanner.next().charAt(0);
//
//        System.out.println("Enter the second number: ");
//        num2= scanner.nextDouble();
//
//        switch (operator){
//            case '+' -> result = num1 + num2;
//            case '-' -> result = num1 - num2;
//            case '*' -> result = num1 * num2;
//            case '/' -> {
//                if(num2==0){
//                    System.out.print("Cannot divide number by zero.");
//                    isValidOperator=false;
//                }else{
//                    result = num1 / num2;
//                }
//            }
//            case '^' -> result= Math.pow(num1,num2);
//            default -> {
//                System.out.println("Invalid operator");
//                isValidOperator=false;
//            }
//        }
//
//        if(isValidOperator){
//            System.out.print(result);
//        }
//
//        scanner.close();
//    }
//}

//
//public class Main {
//    public static void main(String[] args){
// logical operator
//        && = AND
//        || = OR
//        ! = NOT

//        double temp=20;
//
//        if(temp<=30 && temp>0){
//            System.out.println("The weather is good.");
//        }else if(temp >30 || temp<0){
//            System.out.println("The weather is bad.");
//        }
//
//        Scanner scanner= new Scanner(System.in);
//
//
//        String username;
//
//        System.out.println("Enter your username: ");
//        username=scanner.nextLine();
//        if(username.length() <4 || username.length() > 12){
//            System.out.println("Username must be between 4-12 characters.");
//        } else if (username.contains(" ") || username.contains("_")) {
//            System.out.println("Username must not contain underscores or spaces.");
//        } else {
//            System.out.println("Welcome " + username);
//        }
//        System.out.println(username.indexOf("@"));
//        scanner.close();
//    }
//}

//public class Main {
//    public static void main(String[] args){
//        While loops

//        Scanner scanner=new Scanner(System.in);
//
//        String name="";
//
//        while (name.isEmpty()){
//            System.out.println("Enter your name: ");
//            name=scanner.nextLine();
//        }

//        String response= "";
//
//        while (!response.equals("Q")) {
//            System.out.println("You are playing a game");
//            System.out.println("Press Q to quit: ");
//            response=scanner.next().toUpperCase();
//        }
//
//        System.out.print("You have quit the game");
//        System.out.println("Hello "+ name);

//        int age=0;
//        System.out.println("Enter your age: ");
//        age=scanner.nextInt();
//
//        while (age < 0){
//            System.out.println("Your age can't be negative.");
//            System.out.println("Enter your age: ");
//            age=scanner.nextInt();
//        }//
//        do {
//            System.out.println("Your age can't be negative.");
//            System.out.println("Enter your age: ");
//            age=scanner.nextInt();
//        }while (age < 0);

//
//        double number=0;
//
//        do {
//            System.out.println("Enter a number between 1 - 10");
//            number = scanner.nextInt();
//        }while(number < 1 || number > 10);
//        System.out.println("You picked "+ number);
//        System.out.printf("You are %d years old",age);
//        scanner.close();
//    }
//}

//public class Main {
//    public static void main(String[] args){
////        Number guessing game
//
//        Random random=new Random();
//        Scanner scanner= new Scanner(System.in);
//
//        int guess;
//        int attempts = 0;
//
//        int min=1;
//        int max=100;
//        int randomNumber=random.nextInt(min, max+1);
//        System.out.println(randomNumber);
//        System.out.println("Number guessing game");
//        System.out.println("Enter a number between 1 - 100: ");
//
//        do{
//            System.out.println("Guess a number: ");
//            guess=scanner.nextInt();
//            attempts++;
//
//            if(guess<randomNumber){
//                System.out.println("Too Low, Try again.");
//            } else if (guess>randomNumber) {
//                System.out.println("Too high, Try again");
//            }else{
//                System.out.println("You have won, you tried it in "+attempts);
//            }
//        }while (guess != randomNumber);
//
//
//
//    }
//}
//
//public class Main {
//    public static void main(String[] args) throws InterruptedException{
//        for loop

//        for (int i=0; i<10; i--){
//            System.out.println("Pizza");
//        }

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("How many times do you want to loop?: ");
//        int max= scanner.nextInt();
//
//        for (int i=0; i<max ;i++){
//            System.out.println(i);
//        }

//        scanner.close();
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("How many seconds do you want to countdown?: ");
//        int start= scanner.nextInt();
//
//        for (int i = start; i>0; i--){
//            System.out.println(i);
//            Thread.sleep(1000);
//        }
//        System.out.println("HAPPY NEW YEAR");
//
//        scanner.close();
//    }
//}

//public class Main {
//    public static void main(String[] args){
//        break and continue
//
//        for (int i=0; i<10; i++){
//            if(i==5){
//                continue;
//            }
//            System.out.print(i + " ");
//        }
//    }
//}


public class Main {
    public static void main(String[] args){

//        for (int j = 0; j <=2 ; j++) {
//            for(int i = 1; i<=9; i++ ){
//                System.out.print(i + " ");
//            }
//            System.out.println();
//        }

        Scanner scanner=new Scanner(System.in);

        int rows;
        int columns;
        char symbols;

        System.out.println("Enter the numbers of rows: ");
        rows=scanner.nextInt();

        System.out.println("Enter the numbers of columns: ");
        columns=scanner.nextInt();

        System.out.println("Enter the symbol to use: ");
        symbols=scanner.next().charAt(0);

        for (int i = 0; i < rows ; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(symbols);
            }
            System.out.println();

        }
        scanner.close();
    }
}