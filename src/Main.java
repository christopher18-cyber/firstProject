import javax.sound.sampled.*;
import java.io.*;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.*;
import java.util.Collections;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
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

//
//public class Main {
//    public static void main(String[] args){

//        for (int j = 0; j <=2 ; j++) {
//            for(int i = 1; i<=9; i++ ){
//                System.out.print(i + " ");
//            }
//            System.out.println();
//        }

//        Scanner scanner=new Scanner(System.in);
//
//        int rows;
//        int columns;
//        char symbols;
//
//        System.out.println("Enter the numbers of rows: ");
//        rows=scanner.nextInt();
//
//        System.out.println("Enter the numbers of columns: ");
//        columns=scanner.nextInt();
//
//        System.out.println("Enter the symbol to use: ");
//        symbols=scanner.next().charAt(0);
//
//        for (int i = 0; i < rows ; i++) {
//            for (int j = 0; j < columns; j++) {
//                System.out.print(symbols);
//            }
//            System.out.println();
//
//        }
//        scanner.close();
//    }
//}


//public class Main {
//    public static void main(String[] args){

//        methods
//        int age=15;
//        String name = "Christopher";
//        happyBirthday(name,age);

//        double result=square(2.0);
//        System.out.println(result);
//        double result2=cube(2);
//        System.out.println(result2);
//        String fullName= getFullName("Ayo","Chris");
//        System.out.println(checkAge(19));
//    }
//    static void happyBirthday(String name,int age){
//        System.out.println("Happy birthday to you");
//        System.out.printf("Happy birthday dear %s\n",name);
//        System.out.printf("You are %d years old\n",age);
//        System.out.println("Happy birthday to you");
//    }
//    static double square(double number){ return number * number; }
//    static double cube(double number){
//        return number * number * number;
//    }
//    static String getFullName(String first, String last){
//        return first + " " + last;
//    }
//
//    static boolean checkAge(int age){
//        return age >= 18;
//    }
//}

//public class Main {
//    public static void main(String[] args){
//        Overloaded methods
//        System.out.println(add(1,3));
//        System.out.println(add(2,2,1));
//    }
//
//    static double add(double num1, double num2){
//        return num1 + num2;
//    }
//    static double add(double num1, double num2, double num3){
//        return num1 + num2 + num3;
//    }
//}

//public class Main {
//    public static void main(String[] args){
//
//        int x=10;
//    }
//}

//public class Main {
//    static Scanner scanner= new Scanner(System.in);
//
//    public static void main(String[] args){
//
////        JAVA BANK PROGRAM
//
//
//        boolean isRunning=true;
//        double balance=10.99;
//        int choice;
//
//        while (isRunning){
//            System.out.println("*************");
//            System.out.println("BANKING PROGRAM");
//            System.out.println("*************");
//            System.out.println("1. Show Balance");
//            System.out.println("2. Deposit");
//            System.out.println("3. Withdraw");
//            System.out.println("4. Exit");
//            System.out.println("*************");
//
//            System.out.print("Enter your choice (1-4): ");
//            choice=scanner.nextInt();
//
//            switch (choice){
//                case 1 -> showBalance(balance);
//                case 2 -> balance=balance+deposit();
//                case 3 -> balance=balance-withdraw(balance);
//                case 4 -> isRunning=false;
//                default -> System.out.println("INVALID CHOICE");
//            }
//
//        }
//        scanner.close();
//    }
//
//    static void showBalance(double balance){
//        System.out.printf("$%.2f\n",balance);
//    }
//
//    static double deposit(){
//        double amount;
//        System.out.print("How much do you want to deposit?: ");
//        amount=scanner.nextDouble();
//        if(amount < 0){
//            return 0;
//        }else{
//            return amount;
//        }
//    }
//
//    static double withdraw(double balance){
//        double amount;
//        System.out.println("How much you want to withdraw?: ");
//        amount=scanner.nextDouble();
//        if(amount>balance){
//            System.out.print("You can withdraw amount greater than your balance.");
//            return 0;
//        }else if(amount<0){
//            System.out.println("Amount can't be negative.");
//            return 0;
//        }else{
//            return amount;
//        }
//    }
//}

//public class Main {
//    public static void main(String[] args){
//        JAVA DICE ROLLER PROGRAM
//
//        Scanner scanner= new Scanner(System.in);
//        Random random = new Random();
//        int numOfDice;
//        int total=0;
//
//        System.out.print("Enter the number of dice to roll: ");
//        numOfDice=scanner.nextInt();
//
//        if(numOfDice > 0){
//
//            for(int i=0; i< numOfDice; i++){
//                int roll = random.nextInt(1,7);
//                printDie(roll);
//                System.out.println("You rolled "+ roll);
//                total = total + roll;
//            }
//            System.out.println("Total: "+ total);
//        }else{
//            System.out.println("The number of dice must be greater than 0");
//        }
//
//        scanner.close();
//    }
//
//    static void printDie(int roll){
//        String dice1 = """
//                 -------
//                |       |
//                |   •   |
//                |       |
//                 -------
//                """;
//
//
//        String dice2 = """
//                 -------
//                | •     |
//                |       |
//                |     • |
//                 -------
//                """;
//
//        String dice3 = """
//                 -------
//                | •     |
//                |   •   |
//                |     • |
//                 -------
//                """;
//
//        String dice4 = """
//                 -------
//                | •   • |
//                |       |
//                | •   • |
//                 -------
//                """;
//
//        String dice5 = """
//                 -------
//                | •   • |
//                |   •   |
//                | •   • |
//                 -------
//                """;
//
//        String dice6 = """
//                 -------
//                | •   • |
//                | •   • |
//                | •   • |
//                 -------
//                """;
//
//        switch (roll){
//            case 1 -> System.out.println(dice1);
//            case 2 -> System.out.println(dice2);
//            case 3 -> System.out.println(dice3);
//            case 4 -> System.out.println(dice4);
//            case 5 -> System.out.println(dice5);
//            case 6 -> System.out.println(dice6);
//            default -> System.out.println("Invalid roll");
//            case 1 -> System.out.println(dice1);
//        }
//    }
//}



//public class Main {
//    public static void main(String[] args){
//        array
//        String[] fruits = {"apple","orange","banana","coconut"};
//        System.out.println(fruits[0]);
//
//        Arrays.sort(fruits);
//        Arrays.fill(fruits,"pineapple");

//        for(int i =0; i< fruits.length; i++){
//            System.out.println(fruits[i]);
//        }
//
//        for(String fruit: fruits){
//            System.out.println(fruit);
//        }
//    }
//}

//public class Main {
//    public static void main(String[] args){
//
//        Scanner scanner=new Scanner(System.in);
//        String[] foods;
//        int size;
//
//        System.out.println("How many foods do you want to input: ");
//        size=scanner.nextInt();
//        scanner.nextLine();
//        foods=new String[size];
//
//        for(int i = 0; i< foods.length; i++){
//            System.out.println("Enter a food");
//            foods[i]=scanner.nextLine();
//        }
//        for(String food: foods){
//            System.out.println(food);
//        }
//        scanner.close();
//    }
//}


//public class Main {
//    public static void main(String[] args){
//        searching through an array
//
//        Scanner scanner = new Scanner(System.in);
//        int[] numbers={1,9,2,8,3,5,4};
//        String[] fruits = {"apple","orange","pineapple"};
//        String target;
//        boolean isFound=false;
//        System.out.print("What fruit are you looking for?: ");
//        target=scanner.nextLine();
//
//
//        for(int i =0; i<fruits.length; i++){
//            if(fruits[i].equals(target)){
//                System.out.println("Element "+fruits[i]+ " found at index "+ i);
//                isFound=true;
//                break;
//            }
//        }
//        if(!isFound){
//            System.out.println("Element not found in the array.");
//        }
//
//        scanner.close();
//    }
//}

//public class Main {
//    public static void main(String[] args){
//        varargs
//
//        int result= add(1,3,2);
//        double result=average(1,2,2,4);
//        System.out.println(result);
//    }
//
//    static double average(double... numbers){
//        double sum=0;
//        int length;
//        length=numbers.length;
//        if(length==0){
//            return 0;
//        }
//        for(double number: numbers){
//            sum+=number;
//        }
//        return sum/length;
//    }
//    static int add(int... numbers){
//        System.out.println(numbers);
//        int sum = 0;
//        for (int number: numbers){
//            sum+=number;
//        }
//        return sum;
//    }
//}

//public class Main {
//    public static void main(String[] args){
//        2D arrays

//        String[] fruits={"apple","orange","banana"};
//        String[] vegetables={"potato","carrot","onions"};
//        String[] meats={"chicken","pork","beef","fish"};
//
//        String[][] groceries ={fruits,vegetables,meats};
//
//        for(String[] foods: groceries){
//            for(String food: foods){
//                System.out.println(food);
//            }
//        }
//
//        char[][] telephone ={
//                {'1','2','3'},
//                {'4','5','6'},
//                {'7','8','9'},
//                {'*','0','#'}
//        };
//
//        for(char[] rows: telephone){
//            for(char number: rows){
//                System.out.print(number+" ");
//            }
//            System.out.println();
//        }
//        System.out.println();
//    }
//}

//public class Main {
//    public static void main(String[] args){
//        JAVA QUIZ GAME
//        String[] questions={"What is the main function of a router?",
//                            "Which part of the computer is considered the brain?",
//                            "What year was facebook launched?",
//                            "Who is known as the father of computers?",
//                            "What was the first programming language?"
//        };
//
//        String[][] options={
//                            {"1. Storing files","2. Encrypting data","3. Directing the internet traffic","4. Managing password"},
//                            {"1. CPU","2. Hard drive","3. RAM","4. GPU"},
//                            {"1. 2000","2. 2004","3. 2006","4. 2008"},
//                            {"1. Steve jobs","2. Bill Gates","3. Alan Turing","4. Charles Babbage"},
//                            {"1. COBOL","2. C","3. FORTRAN","4. ASSEMBLY"}
//                            };
//
//        int[] answers={3,1,2,4,3};
//        int scores=0;
//        int guess;
//
//        Scanner scanner= new Scanner(System.in);
//
//        System.out.println("*****************************");
//        System.out.println("WELCOME TO THE JAVA QUIZ GAME");
//        System.out.println("*****************************");
//
//        for(int i=0; i< questions.length;i++ ){
//            System.out.println(questions[i]);
//            for(String option: options[i]){
//                System.out.println(option);
//            }
//            System.out.print("Enter your guess: ");
//            guess=scanner.nextInt();
//
//            if(guess == answers[i]){
//                System.out.println("********");
//                System.out.println("CORRECT");
//                System.out.println("*********");
//                scores++;
//            }else{
//                System.out.println("********");
//                System.out.println("WRONG!");
//                System.out.println("*********");
//            }
//        }
//        System.out.println("Your final score is "+scores);
//        scanner.close();
//    }
//}

//
//public class Main {
//    public static void main(String[] args){
//
//        ROCK PAPER SCISSORS GAME
//
//        Scanner scanner = new Scanner(System.in);
//        Random random = new Random();
//
//        String[] choices={"rock","paper","scissors"};
//        String playerChoice;
//        String computerChoice;
//        String playAgain = "yes";
//
//
//        do {
//
//            System.out.print("Enter your move (rock, scissors, paper): ");
//            playerChoice=scanner.nextLine().toLowerCase();
//
//            if(!playerChoice.equals("scissors") &&
//                    !playerChoice.equals("rock") &&
//                    !playerChoice.equals("paper")){
//                System.out.println("Invalid choice");
//                continue;
//            }
//
//            computerChoice=choices[random.nextInt(3)];
//            System.out.println("Computer choice: "+ computerChoice);
//
//            if(playerChoice.equals(computerChoice)){
//                System.out.println("It is a lie.");
//            }else if((playerChoice.equals("rock") && computerChoice.equals("scissors")) ||
//                    (playerChoice.equals("paper") && computerChoice.equals("rock")) ||
//                    (playerChoice.equals("scissors") && computerChoice.equals("paper"))){
//                System.out.println("You win!");
//            } else{
//                System.out.println("You lose.");
//            }
//
//            System.out.print("Play again (yes/no): ");
//            playAgain=scanner.nextLine();
//        }while (playAgain.equals("yes"));
//
//        System.out.println("Thanks for playing.");
//
//        scanner.close();
//    }
//}

//
//public class Main {
//    public static void main(String[] args){
//        JAVA SLOT MACHINE
//
//        Scanner scanner = new Scanner(System.in);
//
//        int balance=100;
//        int bet;
//        int payout;
//        String[] row;
//        String playAgain;
//
//        System.out.println("***********************");
//        System.out.println("Welcome to Java Slots");
//        System.out.println("Symbols: 🍉 🍒 🍋 🔔 ⭐");
//        System.out.println("***********************");
//
//        while (balance>0){
//            System.out.println("Current balance: $"+ balance);
//            System.out.print("Place your bet amount: ");
//            bet=scanner.nextInt();
//            scanner.nextLine();
//
//            if(bet > balance){
//                System.out.println("INSUFFICIENT FUNDS");
//                continue;
//            } else if (bet <= 0) {
//                System.out.println("Bet must be greater than zero");
//            }else {
//                balance-=bet;
//                System.out.println("Your remaining balance "+ balance);
//            }
//
//            System.out.println("Spinning...");
//            row = spinRow();
//            printRow(row);
//            payout = getPayout(row,bet);
//
//            if(payout > 0){
//                System.out.println("You won $"+payout);
//                balance+=payout;
//            }else{
//                System.out.println("Sorry you lost this round");
//            }
//
//            System.out.println("Do you want to play again? (Y/N): ");
//            playAgain = scanner.nextLine().toUpperCase();
//
//            if(!playAgain.equals("Y")){
//                break;
//            }
//        }
//        System.out.println("GAME OVER! Your final balance is $"+balance);
//
//        scanner.close();
//    }
//    static String[] spinRow(){
//        String[] symbols = {"🍉" ,"🍒", "🍋" ,"🔔", "⭐"};
//        String[] row= new String[3];
//        Random random=new Random();
//
//        System.out.println(symbols[random.nextInt(symbols.length)]);
//        for(int i = 0; i<3; i++){
//            row[i]=symbols[random.nextInt(symbols.length)];
//        }
//
//        return row;
//    }
//
//    static void printRow(String[] row){
//        System.out.println(" "+ String.join(" | ",row));
//    }
//
//    static int getPayout(String[] row, int bet){
//        if(row[0].equals(row[1]) && row[1].equals(row[2])){
//            return switch (row[0]){
//                case "🍒" -> bet * 3;
//                case "🍉" -> bet * 4;
//                case "🍋" -> bet * 5;
//                case "🔔" -> bet * 10;
//                case "⭐" -> bet * 20;
//                default -> 0;
//            };
//        } else if(row[0].equals(row[1])){
//            return switch (row[0]){
//                case "🍒" -> bet * 2;
//                case "🍉" -> bet * 3;
//                case "🍋" -> bet * 4;
//                case "🔔" -> bet * 5;
//                case "⭐" -> bet * 10;
//                default -> 0;
//            };
//        }else if(row[1].equals(row[2])){
//            return switch (row[1]){
//                case "🍒" -> bet * 2;
//                case "🍉" -> bet * 3;
//                case "🍋" -> bet * 4;
//                case "🔔" -> bet * 5;
//                case "⭐" -> bet * 10;
//                default -> 0;
//            };
//        }
//        return 0;
//    }
//}

//public class Main {
//  public static void main(String[] args){
//      Object oriented programming
//      Car car = new Car();
//      System.out.println(car.isRunning);
//      car.start();
//      System.out.println(car.isRunning);
//      car.stop();
//      System.out.println(car.isRunning);
//      System.out.println(car.isRunning);
//      System.out.println(car.model);
//      System.out.println(car.price);
//      System.out.println(car.make);
//      System.out.println(car.year);
//      car.stop();
//
//  }
//}
//
//
//public class Main {
//    public static void main(String[] args){
////        constructors
//        Student student1 = new Student("Chris",23, 4.5);
//        Student student2 = new Student("Salami",23, 4.9);
//
//        System.out.println(student1.name);
//        System.out.println(student2.name);
//        student1.study();
//        student2.study();
//    }
//}

//public class Main {
//    public static void main(String[] args){
//        overloaded constructors
//        User user1 = new User("Pop");
//        User user2 = new User("Ayo","Ayo@gmail.com");
//        User user3 = new User("Emmanuel","emmanuel@gmail.com",23);
//
//        System.out.println(user1.username);
//        System.out.println(user1.email);
//        System.out.println(user1.age);
//    }
//}

//public class Main {
//    public static void main(String[] args){
//        array of objects
//
//        Car car1 = new Car("Ford","red");
//        Car car2 = new Car("Benz","Pink");
//        Car car3 = new Car("Mercedes","orange");
//
//        Car[] cars = {car1, car2, car3};
//
//        for(Car car: cars){
//            car.color="black";
//        }
//
//        for(Car car: cars){
//            car.drive();
//        }
//    }
//}

//public class Main {
//    public static void main(String[] args){
////        static
//
//        Friend friend1 = new Friend("SpongeBob");
//        Friend friend2 = new Friend("Chris");
//        Friend friend3 = new Friend("Charles");
//
//        System.out.println(friend1.name);
//        System.out.println(friend2.name);
//
//        System.out.println(Friend.numOfFriends);
//        Friend.showFriends();
//    }
//}

//public class Main {
//    public static void main(String[] args){
//        Inheritance
//
//        Dog dog1 = new Dog();
//
//        System.out.println(dog1.isAlive);
//        dog1.eat();
//    }
//}

//public class Main {
//    public static void main(String[] args){
//        super
//        Person person = new Person("Tom","Riddle");
//        Student student = new Student("Chris","Ayo",4.52);
//        Employee employee = new Employee("Chris","Ayomide",350000);
//        person.showName();
//        student.showName();
//        student.showGPA();
//        employee.showSalary();
//
//
//    }
//}

//public class Main {
//    public static void main(String[] args){
//        method overriding
//
//        Cat cat = new Cat();
//        Dog dog = new Dog();
//        Fish fish = new Fish();
//
//        fish.move();
//    }
//}

//public class Main {
//    public static void main(String[] args){
//        to string method
//
//        Car car= new Car("Ford","Mustang",2004,"red");
//        System.out.println(car);
//    }
//}

//public class Main {
//    public static void main(String[] args){
//        abstraction
//
//        Triangle triangle = new Triangle(4,4);
//        Circle circle = new Circle(7);
//        Rectangle rectangle = new Rectangle(4,4);
//
//        System.out.println(triangle.area());
//        System.out.println(circle.area());
//        System.out.println(rectangle.area());
//    }
//}

//public class Main {
//    public static void main(String[] args){
//        interface
//        Rabbit rabbit = new Rabbit();
//        Hawk hawk =  new Hawk();
//        rabbit.flee();
//        hawk.hunt();
//    }
//}

//public class Main {
//    public static void main(String[] args){
//        polymorphism
//
//        Car car = new Car();
//        Bike bike = new Bike();
//        Boat boat = new Boat();
//
//        car.go();
//        bike.go();
//        boat.go();
//
//        Vehicle[] vehicles = {car,bike,boat};
//        Vehicle a1 = new Bike();
//        a1.go();
//    }
//}

//public class Main {
//    public static void main(String[] args){
//        polymorphism runtime
//
//        Scanner scanner = new Scanner(System.in);
//        Animal animal;
//        int choice;
//
//        System.out.print("Would you like a dog or a cat?: ");
//        choice= scanner.nextInt();
//        scanner.nextLine();
//        if(choice == 1){
//            animal = new Dog();
//            animal.speak();
//        } else if (choice == 2) {
//            animal = new Cat();
//            animal.speak();
//        }else{
//            System.out.println("Invalid choice.");
//        }
//        scanner.close();
//    }
//}

//public class Main {
//    public static void main(String[] args){
//        getters and setters
//
//        Car car = new Car("charger","yellow", 10000);
//
//        car.setPrice(-20000);
//        car.setColor("pink");
//        System.out.println(car.getModel() + " " +car.getColor() +" "+ car.getPrice());
//    }
//}

//public class Main {
//    public static void main(String[] args){
////        Aggregation
//        Book book1 = new Book("The fellow of the ring",354);
//        Book book2 = new Book("The tall tower",343);
//        Book book3 = new Book("The lord's temple",264);
//
//        Book[] books={book1, book2, book3};
//        Library library = new Library("HOL", 1960,books);
//
//        for(Book book:books){
//            System.out.println(book.displayInfo());
//        }
//
//        library.displayInfo();
//    }
//}

//
//public class Main {
//    public static void main(String[] args){
//        composition
//        Car car = new Car(2025,"ford","V8");
//        System.out.println(car.year);
//        System.out.println(car.model);
//        System.out.println(car.engine.type);;
//    }
//}

//public class Main {
//    public static void main(String[] args){
////        wrapper classes
//
////        Integer a= 123;
////        Double b= 12.3;
////        Character c = '$';
////        Boolean d = true;
////
////        int x =a;
//
////        String a = Integer.toString(124);
////        String b = Double.toString(90.9);
////        String c = Character.toString('@');
////        String d = Boolean.toString(true);
////
////        String x = a + b + c + d;
//
//        int a = Integer.parseInt("123");
//        double b = Double.parseDouble("3.14");
//        char c = "Pizza".charAt(0);
//        boolean d = Boolean.parseBoolean("true");
//
//        char letter = 'A';
//        System.out.println(Character.isLetter(letter));
//        System.out.println(Character.isUpperCase(letter));
//    }
//}


//public class Main {
//    public static void main(String[] args){
//        ArrayList
//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(3);
//        list.add(2);
//        list.add(5);
//        list.add(5);
//        System.out.println(list);

//        ArrayList<Double> list = new ArrayList<>();
//
//        list.add(3.2);
//        list.add(2.1);
//
//        System.out.println(list);
//
//        ArrayList<String> list = new ArrayList<>();
//        list.add("3");
//        list.add("worm");
//        list.add("lope");
//
//        list.set(0,"pop");
//        list.remove(0);
//        System.out.println(list);
//        System.out.println(list.size());
//
//        Collections.sort(list);
//        System.out.println(list);
//
//        Scanner scanner = new Scanner(System.in);
//
//        ArrayList<String> foods = new ArrayList<>();
//        System.out.println("Enter the number of foods, you want to store");
//        int numOfFood = scanner.nextInt();
//        scanner.nextLine();
//
//
//        for(int i =1; i<= numOfFood; i++){
//            System.out.println("Enter food #"+ i+": ");
//            String food= scanner.nextLine();
//            foods.add(food);
//        }
//
//        System.out.println(foods);
//
//        scanner.close();
//    }
//}

//public class Main {
//    public static void main(String[] args){
//        exception handling
//
//        Scanner scanner = new Scanner(System.in);
//        try {
//            System.out.println("Enter a number: ");
//            int number= scanner.nextInt();
//            System.out.println(number);
//        }catch (ArithmeticException e){
//            System.out.println("YOU CAN'T DIVIDE BY ZERO, IDIOT.");
//        }catch (InputMismatchException e){
//            System.out.println("THIS IS NOT A NUMBER");
//        }catch (Exception e){
//            System.out.println("Something went wrong.");
//        }finally {
//            scanner.close();
//            System.out.println("This always executes.");
//        }
//
//        scanner.close();
//    }
//}

//public class Main {
//    public static void main(String[] args){
//        write files

//        How to write files using java popular options
//        FileWriter = Good for small or medium-sized text files
//        BufferWriter = Better performance for large amount of text
//        PrintWriter = Best for structured data, like reports or log
//        FileOutputStream = Best for binary files (e.g, images, audio files)
//
//        try(FileWriter writer = new FileWriter("test.txt")){
//            writer.write("I love pizza");
//            System.out.println("File has been written");
//        }catch (IOException e){
//            System.out.println("Could not write file.");
//        }
//    }
//}


//public class Main {
//    public static void main(String[] args){
//        read file
//        BufferedReader + FileReader: Best for reading text files line by line/
//        FileInputStream: Best for binary files (image, audio)
//        RandomAccessFile: Best for read/ write specific portions of a large file
//
//        String filePath = "C:\\Users\\Rokib\\OneDrive\\Desktop\\file.txt";
//        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))){
//
//            String line;
//            while ((line = reader.readLine()) != null){
//                System.out.println(line);
//            }
//            System.out.println("That file exists.");
//        }catch (FileNotFoundException e){
//            System.out.println("Could not find file.");
//        }catch (IOException e){
//            System.out.println("Something went wrong.");
//        }
//    }
//}
//


//public class Main {
//    public static void main(String[] args){
////        HOW TO PLAY AUDIO with JAVA
//
//        String filePath = "src\\song.wav";
//        File file = new File(filePath);
//
//        try(Scanner scanner = new Scanner(System.in);
//             AudioInputStream audioStream = AudioSystem.getAudioInputStream(file)){
//
//            Clip clip = AudioSystem.getClip();
//            clip.open(audioStream);
//
//            String response = "";
//            while (!response.equals("Q")){
//                System.out.println("P = Play");
//                System.out.println("S = Stop");
//                System.out.println("Q = Quit");
//                System.out.println("R = Restart");
//                System.out.println("Enter your choice: ");
//                response= scanner.nextLine().toUpperCase();
//
//                switch (response){
//                    case "P" -> clip.start();
//                    case "S" -> clip.stop();
//                    case "R" -> clip.setMicrosecondPosition(0);
//                    case "Q" -> clip.close();
//                    default -> System.out.println("Invalid choice");
//                }
//            }
//
//        }
//        catch (FileNotFoundException e){
//            System.out.println("Could not locate file.");
//        }
//        catch (LineUnavailableException e){
//            System.out.println("Unable to access audio resource");
//        }
//        catch (UnsupportedAudioFileException e){
//            System.out.println("Audio file is not supported.");
//        }catch (IOException e){
//            System.out.println("Something went wrong.");
//        }finally {
//            System.out.println("Bye.");
//        }
//    }
//}

//
//public class Main {
//    public static void main(String[] args){
////        HANGMAN GAME
//       String filePath = "words.txt";
//       ArrayList<String> words= new ArrayList<>();
//
//       try(BufferedReader reader = new BufferedReader(new FileReader(filePath))){
//           String line;
//           while ((line = reader.readLine()) != null){
//               words.add(line.trim());
//           }
//       }catch (FileNotFoundException e){
//           System.out.println("File is not found.");
//       }catch (IOException e){
//           System.out.println("Something went wrong.");
//       }
//
//       System.out.println(words);
//
//       Random random = new Random();
//
//       String word = words.get(random.nextInt(words.size()));
//
//
////        String word = "watermelon";
//        int wrongGuess = 0;
//        Scanner scanner = new Scanner(System.in);
//
//        ArrayList<Character> wordState = new ArrayList<>();
//
//        for (int i = 0; i< word.length(); i++){
//            wordState.add('_');
//        }
//        System.out.println("***********************");
//        System.out.println("Welcome to JAVA HANGMAN");
//        System.out.println("***********************");
//
//        while(wrongGuess< 6){
//
//            System.out.print("Word: ");
//            for(char c: wordState){
//                System.out.print(c+" ");
//            }
//            System.out.println();
//
//            System.out.print("Guess a letter: ");
//            char guess = scanner.next().toLowerCase().charAt(0);
//
//            if(word.indexOf(guess) >= 0){
//                System.out.println("Correct guess!\n");
//
//                for(int i =0;i <word.length(); i++){
//                    if(word.charAt(i) == guess){
//                        wordState.set(i, guess);
//                    }
//                }
//                if(!wordState.contains('_')){
//                    System.out.println(getHangManArt(wrongGuess));
//                    System.out.println("YOU WIN");
//                    System.out.println("The word was "+word);
//                    break;
//                }
//            }else{
//                System.out.println("Wrong guess.");
//                wrongGuess++;
//            }
//
//        }
//
//        if(wrongGuess>=6){
//            System.out.println(getHangManArt(wrongGuess));
//            System.out.println("GAME OVER.");
//            System.out.println("The word was "+word);
//        }
//        scanner.close();
//    }
//    static String getHangManArt(int wrongGuess){
//        return switch (wrongGuess){
//          case 0 -> """
//
//
//
//                  """;
//          case 1 -> """
//                  O
//
//                  """;
//          case 2 -> """
//                  O
//                  |
//                  """;
//
//          case 3 -> """
//                   O
//                  /|
//                  """;
//
//          case 4 -> """
//                  O
//                 /|\\
//                 \s""";
//
//
//            case 5 -> """
//                  O
//                 /|\\
//                  |
//                 \s""";
//
//            case 6 -> """
//                  O
//                 /|\\
//                 /|\\
//                  \s""";
//
//            case 7 -> """
//                  O
//                 /|\\
//                 /|\\
//                  \s""";
//
//          default -> "";
//        };
//    }
//}

//public class Main {
//    public static void main(String[] args) {
//        WORK WITH DATE AND TIME
//        LocalDate localDate = LocalDate.now();
//        System.out.println(localDate);
//        LocalTime time = LocalTime.now();
//        System.out.println(time);
//        LocalDateTime localDateTime = LocalDateTime.now();
//        System.out.println(localDateTime);
//        Instant instant = Instant.now();
//        System.out.println(instant);

//        Custom format
//        LocalDateTime localDateTime = LocalDateTime.now();
//
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
//        String newDateTime = localDateTime.format(formatter);
//        System.out.println(newDateTime);
//
//        LocalDateTime date1 = LocalDateTime.of(2024,12,25, 12,0,0);
//        LocalDateTime date2 = LocalDateTime.of(2025, 1, 1, 3,0,0);
//
//        if(date1.isBefore(date2)){
//            System.out.println("Date 1 is earlier than Date 2.");
//        } else if (date1.isAfter(date2)) {
//            System.out.println("Date 2 is earlier than Date 1");
//        }else{
//            System.out.println("They are equal.");
//        }
//
//
//    }
//}

//public class Main {
//    public static void main(String[] args){
//
//        Anonymous classes
//
//        Dog dog1 = new Dog();
//        Dog dog2 = new Dog(){
//            @Override
//            void speak() {
//                System.out.println("Scooby Doo says Ruh Roh.");
//            }
//        };
//
//        dog1.speak();
//        dog2.speak();
//    }
//}


//public class Main {
//    public static void main(String[] args){
//        timer : a class that schedule tasks at specific times or periodically
//        timerTask: task that will be executed by the timer
//
//        Timer timer = new Timer();
//        TimerTask task= new TimerTask() {
//
//            int count = 3;
//            @Override
//            public void run() {
//                System.out.println("Hello!");
//                count--;
//                if(count<=0){
//                    timer.cancel();
//                }
//            }
//        };
//        timer.schedule(task, 50,1000);
//    }
//}

//
//public class Main {
//    public static void main(String[] args){
//        JAVA COUNTDOWN TIMER PROGRAM
//
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Enter # of seconds to count down: ");
//        int response = scanner.nextInt();
//        scanner.nextLine();
//
//        Timer timer = new Timer();
//        TimerTask task = new TimerTask() {
//
//            int count = response;
//            @Override
//            public void run() {
//                System.out.println(count);
//                count--;
//                if(count <= 0){
//                    System.out.println("Happy New Year");
//                    timer.cancel();
//                }
//            }
//        };
//
//        timer.schedule(task, 2000, 1000);
//
//        scanner.close();
//    }
//}

//public class Main {
//    public static void main(String[] args){
//        Generics : A concept where you can write class which is compatible with many data types

//        Box<Double> box = new Box<>();
//
//        box.setItem(3.14);
//        System.out.println(box.getItem());

//        Product<String,Double> product = new Product<>("apple",50.0);
//
//        System.out.println(product.getItem());
//        System.out.println(product.getPrice());
//    }
//}


//public class Main {
//    public static void main(String[] args){
//        HashMap: A data structure that stores key-value pairs, key will be unique
//        but values can be duplicated
//
//        HashMap<String,Double> map = new HashMap<>();
//        map.put("apple", 0.5);
//        map.put("orange",2.5);
//        map.put("lime", 9.50);
//        map.put("banana",5.50);
//
//        System.out.println(map.get("apple"));
//
//        System.out.println(map);
//        System.out.println(map.containsKey("banana"));
//
//        System.out.println(map.containsValue(2.00));
//
//        if(map.containsKey("apple")){
//            System.out.println(map.get("apple"));
//        }else{
//            System.out.println("Key not found.");
//        }
//
//        System.out.println(map.size());
//
//
//        for(String key: map.keySet()){
//            System.out.println(key+ ":"+map.get(key));
//        }
//    }
//}

//public class Main {
//    public static void main(String[] args){
//        enum is a kind of class that represents a fixed set of constants
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter a day of the week");
//        String response = scanner.nextLine().toUpperCase();
//
//        try {
//            Day day = Day.valueOf(response);
//
//            switch (day){
//                case MONDAY,
//                     TUESDAY,
//                     WEDNESDAY,
//                     THURSDAY,
//                     FRIDAY-> System.out.println("It is a weekday.");
//                case SATURDAY, SUNDAY -> System.out.println("It is a weekend.");
//            }
//
//        }catch (IllegalArgumentException e){
//            System.out.println("Please enter a valid day.");
//        }
//        scanner.close();
//    }
//}

//public class Main {
//    public static void main(String[] args){
////        Threading: this helps to run tasks simultaneously, help improve performance
////        HOW TO CREATE THREAD
////        1 : Extend the Thread class
////        2 : Implement the Runnable interface
//
//
//        Scanner scanner = new Scanner(System.in);
//
//        MyRunnable myRunnable = new MyRunnable();
//        Thread thread = new Thread(myRunnable);
//        thread.setDaemon(true);
//        thread.start();
//        System.out.println("You have 5 seconds to enter your name");
//        System.out.print("Enter your name: ");
//        String name = scanner.nextLine();
//        System.out.println("Hello "+ name);
//
//
//        scanner.close();
//    }
//}

//public class Main {
//    public static void main(String[] args){
//        Multithreading: enables a program to run multiple thread concurrently
//        (Thread) a set of instructions that runs independently
//
//        MyRunnable myRunnable = new MyRunnable();
//        Thread thread1 = new Thread(new MyRunnable("PING"));
//        Thread thread2 = new Thread(new MyRunnable("PONG"));
//
//        System.out.println("GAME START");
//        thread1.start();
//        thread2.start();
//
//        try{
//            thread1.join();
//            thread2.join();
//        }catch(InterruptedException e){
//            System.out.println("Main thread was interrupted.");
//        }
//        System.out.println("GAME OVER");
//    }
//}

public class Main {
    public static void main(String[] args){
//        JAVA ALARM CLOCK
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter= DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime alarmTime = null;
        String filePath= "src\\song.wav";

        while(alarmTime == null){
            try{
                System.out.print("ENTER AN ALARM TIME (HH:MM:SS): ");
                String inputTime = scanner.nextLine();

                alarmTime = LocalTime.parse(inputTime,formatter);
                System.out.println("Alarm set for "+ alarmTime);
            }catch(DateTimeParseException e){
                System.out.println("Invalid format, pls use HH:MM:SS");
            }

        }

        AlarmClock alarmClock = new AlarmClock(alarmTime,filePath,scanner);
        Thread alarmThread = new Thread(alarmClock);
        alarmThread.start();
    }
}