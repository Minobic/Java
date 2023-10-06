//**** Chapter 1 ****//     Core Java
//**** Introduction ****//


// Hello World Program


/*
public class Main {
    public static void main(String[] args) {
        System.out.printlnln("Hello World");
    }
} */



// Variables


/*
public class main{
    public static void main(String[] args) {
        System.out.println("The sum of these numbers is: ");
        int num1 = 8;
        int num2 = 5;
        int num3 = 9;
        int sum = num1 + num2 + num3;
        System.out.printlnln(sum);
    }
} */



// Literals


/*
public class main {
    public static void main(String[] args) {
           byte age = 34;
           int age2 = 56;
           short age3 = 87;
           long ageDino = 12345678910L;
           char ch = 'A';
           float f1 = 5.6f;
           double d1 = 4.33d; // d optional
           boolean a = true;
           String str = "Mayank";
           
           System.out.println(age);
           System.out.println(age2);
           System.out.println(age3);
           System.out.println(ageDino);
           System.out.println(ch);
           System.out.println(f1);
           System.out.println(d1);
           System.out.println(a);
           System.out.println(str);
    }
} */



// User Input


/*
import java.util.Scanner;

public class main {
    public static void main(String[] arg) {
        System.out.println("Taking Input from the User");
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter number 1: ");
        // int a = sc.nextInt();
        float a = sc.nextFloat();
        
        System.out.println("Enter number 2:");
        // int b = sc.nextInt();
        float b = sc.nextFloat();
        
        // int sum = a + b;
        float sum = a + b;
        
        System.out.print("The sum of these numbers is: ");
        System.out.println(sum);
        
        /* // check the input true/false
        boolean b1 = sc.hasNextInt();
        System.out.println(b1); */
        
        /* // Print the input string
        String str = sc.next(); // print single word
        String str = sc.nextLine(); //print whole sentence
        System.out.println(str); * /
    }
} */



// Percentage Calculator


/*
import java.util.Scanner;

public class main {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);


         System.out.println("Total number of marks:");
         int tMarks = sc.nextInt();

         System.out.println("Marks Obtained in First Subject:");
         float m1 = sc.nextFloat();

         System.out.println("Marks Obtained in Second Subject:");
         float m2 = sc.nextFloat();

         System.out.println("Marks Obtained in Third Subject:");
         float m3 = sc.nextFloat();

         System.out.println("Marks Obtained in Fourth Subject:");
         float m4 = sc.nextFloat();

         System.out.println("Marks Obtained in Fifth Subject:");
         float m5 = sc.nextFloat();

         float percentage = ((m1 + m2 + m3 + m4 + m5) * 100 / tMarks);
         System.out.print("Here is your total percentage: ");
         System.out.print(percentage);
         System.out.println("%");
    }
} */



/******************************/
// chapter 1 Practice Set


// Sum of three numbers


/*
import java.util.Scanner;

public class main {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Firt number:");
        float num1 = sc.nextFloat();

        System.out.println("Enter Second number:");
        float num2 = sc.nextFloat();

        System.out.println("Enetr Third number:");
        float num3 = sc.nextFloat();

        float sum = num1 + num2 + num3;
        System.out.print("The sum of the above given number is: ");
        System.out.println(sum);
    }
} */



// CGPA of marks


/*
import java.util.Scanner;

public class main {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter marks of First subject:");
        float a = sc.nextFloat();

        System.out.println("Enter marks of First subject:");
        float b = sc.nextFloat();

        System.out.println("Enter marks of First subject:");
        float c = sc.nextFloat();

        float cgpa = (a + b + c)/30;

        System.out.print("Here is your CGPA: ");
        System.out.println(cgpa);
    }
} */



// Print user name with wishing good day


/*
import java.util.Scanner;

public class main {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);

        System.out.println("What is your name:");
        String name = sc.next();

        System.out.println("Hello " + name + " have a good day!");
    }
} */



// Kilometers to miles


/*
import java.util.Scanner;

public class main {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the kilometers:");
        double kilometers = sc.nextDouble();

        double miles = kilometers * 0.62137119;
        System.out.println(kilometers + " Kilometers is equal to " + miles + " Miles.");
    }
} */



// Is given number integer?


/*
import java.util.Scanner;

public class main {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number:");
        System.out.println(sc.hasNextInt());
    }
} */
/******************************/



//**** Chapter 2 ****//
//**** Operators and Expressions ****//


// Types of Operators

// Arthmetic Operators: + , - , * , / , % , ++ , --    // % is modulo operator
// Assignment Operators: = , +=
// Comparison Operators: == , >= , <=
// Logical Operators: && , || , !
//Bitwise Operators: & , | (operats bitwise)   // not too important



// Precendence & Associativity


/*
public class main {
    public static void main(String[] main) {
        // int a = 6*5-34/2;
        /*
        Highest presedence goes to * and / 
        They are evaluated on the basis of left to right associativity
         = 30-34/2
         = 30-17
         = 13
         */
        // System.out.println(a);

        // int b = 60/5-34*2;
        /*
         = 12-34*2
         = 12-68
         = -56
        * /
        // System.out.println(b);

        // Quick quiz

        int x = 6;
        int y = 1;

        int sol = (x-y)/2;
        System.out.println(sol);


        int a = 10;
        int b = 0;
        int c = 0;

        int sol1 = b*b - (4*a*c) /(2*a);
        System.out.println(sol1);


        int u = 5;
        int v = 4;

        int sol2 = v*v - u*u;
        System.out.println(sol2);


        int sol3 = x * y/2;
        System.out.println(sol3);
    }
} */



// Resulting data types after Arthmetic Operation


/*
 * R => b + s = int                 b = byte
 * R => s + i = int                 f = float
 * R => l + f = float               s = short
 * R => i + f = float               d = double
 * R => c + i = int                 i = integer
 * R => c + s = int                 c = character
 * R => l + d = double              l = long
 * R => f + d = double
 * /


public class main {
    public static void main(String[] args) {
        
        // Increment and Decrement Operators
        // int i = 56;
        // System.out.println(i++);    // first print (56) then increment (57)
        // System.out.println(i);      // (57) will be print
        // System.out.println(++i);    // first increment (58) then print (58)
        // System.out.println(i);      // (58) will be printed
        // This is same with --i and i--


        // Quick Quiz
        
        int y = 7;
        int x = ++y * 8; // x = ?
        // Ans
        System.out.println(x); // x = 8*8 = 64

        char ch = 'a';
        System.out.println(++ch);
    }
} */



/******************************/
// Chapter 2 Practice Set


// Tricky Question but simple at the same time


/*
public class main {
    public static void main(String[] args) {
        //float a = 7/4*9/2;        // a = ? but here's a twist answer is 7.87 but it will print 4
        float a = 7/4.0f*9/2.0f;    // to get the right answer we have to use f at the end
        System.out.println(a);      // a = 1.75*9/2 = 15.75/2 = 7.87
    }
} */



// Grade encrypt and decrypt


/*
public class main {
    public static void main(String[] args) {
        char grade = 'B';
        grade = (char) (grade + 8);
        System.out.println(grade);

        // Decrypting the Grade
        grade = (char) (grade - 8);
        System.out.println(grade);
    }
} */


/*
// Input comparison by given number



import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a number:");
        int a = sc.nextInt();
        System.out.println(a>8);
    }
} */



// Simple Question


/*
public class main {
    public static void main(String[] args) {
        int v = 2;
        int u = 4;
        int a = 6;
        int s = 8;

        int que = (v*v - u*u)/(2*a*s);
        System.out.println(que);
    }
} */
/******************************/



//**** Chapter 3 ****//
//**** Strings ****//


/*
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        // String name = new String("Mayank");
        // String name = "Mayank";
        // System.out.print("The name is: ");
        // System.out.println(name);

        // int a = 6;
        // float b = 5.6454f;
        // System.out.printf("The value of a is %d and the value of b is %f", a, b);
        // %d for int
        // %f for float
        // %c for char
        // %s for string
        
        // System.out.format("The value of a is %d and the value of b is %8.2f", a, b);     // 8.2 means in 8 spaces and upto 2 decimal numbers
        
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        System.out.println(st);
    }
} */



// String   multiplication(a);s


/*
public class main {
    public static void main(String[] args) {
        /*String name = "Mayank";
//Index no. like this= 012345                                   // starts from 0
        // System.out.println(name);

        int value = name.length();                              // Return length of string
        System.out.println(value);

        String lString = name.toLowerCase();
        System.out.println(lString);                            // Return new string with all letters lower case

        String uString = name.toUpperCase();
        System.out.println(uString);                            // Return new string with all letters upper case

        String nonTrimmedString = "    Mayank    ";
        System.out.println(nonTrimmedString);
        String trimmedString = nonTrimmedString;
        System.out.println(trimmedString.trim());               // Return new string after removing all the spaces

        System.out.println(name.substring(3));                  // Return sub string which starts from the given number(if number is ot given it is initially start from 0)

        System.out.println(name.substring(1, 6));               // Return sub string with given start to the given ending(given ending should be +1) 
        
        System.out.println(name.replace('M', 'C'));             // Replace all the same word with another
        System.out.println(name.replace("Ma", "Cha"));          // Replace all the give Words in bunch in a string bunch

        System.out.println(name.startsWith("pay"));             // give boolean output is the string start with the given word if yes true if not then false
        System.out.println(name.endsWith("nk"));                // same just see the end

        System.out.println(name.charAt(2));                     // Return the word on the given index
        
        System.out.println(name.indexOf("y"));                  // Return the index number of the given word
        System.out.println(name.indexOf("a", 2));               // start finding word from the given index(behind ones are eliminate)
        // Return -1 if finds no match
        System.out.println(name.lastIndexOf("ank"));            // Search for index from last
        System.out.println(name.lastIndexOf("a", 2));           // from last but from the given number

        System.out.println(name.equals("Mayank"));              // Boolean for equal and non equal
        System.out.println(name.equalsIgnoreCase("maYAnk"));    // It ignores case sensetion
        * /
    

        // Escape Sequence character

        System.out.println("My name is \n Maynkraj");         // \n start from new line
        System.out.println("My name is \t Mayankraj");       // \t is a tab
        System.out.println("My name is \" Mayankraj \' ");    // \" and \' is a " and '
        System.out.println("My name is \\ Mayankraj");        // \\ is a single \
        // etc can get more info in java oracal escape sequence
    }
} */



/******************************/
// Chapter 3 Practice Set


// Convert String to Lower Case


/*
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the words to transform into Lower case:");
        String Name = sc.nextLine();

        System.out.print("This is modified version of lower case: ");
        System.out.println(Name.toLowerCase());
    }
} */



// Replace Spaces with _


/*
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the setence to modify from space to _:");
        String space = sc.nextLine();

        System.out.print("This is modified version to _: ");
        System.out.println(space.replace(" ", "_"));
    }
} */



// Change name on user input


/*
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String letter = "Hii <|name|>, How may i help you?";

        System.out.println("Plese Enter your name:");
        String name = sc.nextLine();

        letter = letter.replace("<|name|>", name);
        System.out.println(letter);

    }
} */



// Detect Doube and Triple Spaces in the given String


/*
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a sentence to recognise spaces:");
        String space = sc.nextLine();

        System.out.print("Double space occure at: ");
        System.out.println(space.indexOf("  "));

        System.out.print("Triple space occure at: ");
        System.out.println(space.indexOf("   "));

    }
} */



// Convert a line into a letter


/*
public class main {
    public static void main(String[] args) {
        String letter = "Dear Mayank,\nThis is a letter ig...\n\tThanks!";

        System.out.println(letter);
    }
} */
/******************************/



//**** Chapter 4 ****//
//**** Conditionals in Java ****/


// if else statement


/*
public class main {
    public static void main(String[] args) {
        int age = 20;
        if (age>18) {
            System.out.println("Yes boy you can drive!");
        } 
        else {
            System.out.println("No boy you cannot yet!");
        }
    }
} */



// Relational operators

// == -> equal      // for equal use == otherwise on = will get error
// >= -> gretor than equal to
// >  -> greator than
// <  -> less than
// <= -> less than equal to
// != -> Not equal



// Logical Operators

// && -> AND        // Both true is true
// || -> OR         // atleast one true is true
// !  -> NOT        // invert the value from true to false

/*
public class main {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        // For Logical AND
        if (a && b) {
            System.out.println("Y");
        } else {
            System.out.println("N");
        }

        // For Logical OR
        if (a || b) {
            System.out.println("Y");
        } else {
            System.out.println("N");
        }

        // For Logical NOT
        System.out.print("Not(a) is: ");
        System.out.println(!a);
        System.out.print("Not(b) is: ");
        System.out.println(!b);
    }
} */



// else if Statement


/*
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your Age:");
        int age = sc.nextInt();
        if (age>56) {
            System.out.println("You are experienced!");
        } else if (age>46) {
            System.out.println("You are semi-experienced!");
        } else if (age>36) {
            System.out.println("You are semi-semi-experienced!");
        } else {
            System.out.println("you are not experienced!");
        }
    }
} */



// Switch Case Statement


/*
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your age:");
        int age = sc.nextInt();

        switch (age) {      // Here var can be a string, int or char
            case 18:
                System.out.println("You are going to become adult!");
                break;
            case 23:
                System.out.println("You are going to join a job!");
                break;
            case 60:
                System.out.println("You are going to retired!");
                break;
            default:
                System.out.println("Enjoy your life!");
        }
        System.out.println("Thanks for using me!");
    }
} */



/******************************/
// Chapter 4 Practice Set


// Output of a quiz


/*
public class main {
    public static void main(String[] args) {
        int a = 10;

        if (a == 11) {
            System.out.println("I am 11");
        } else {
            System.out.println("I am not 11");
        }
    }
} */



// Pass or fail with noticing percentage and marks


/*
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the marks of First subject:");
        float sub1 = sc.nextInt();
        System.out.println("Enter the marks of Second subject:");
        float sub2 = sc.nextInt();
        System.out.println("Enter the marks of Third subject:");
        float sub3 = sc.nextInt();

        float sum = sub1 + sub2 + sub3;
        float percentage = (sum / 300) * 100;

        System.out.print("Your Percentage is " + percentage + "% and ");

        if (percentage >= 40 && sub1 >= 33 && sub2 >= 33 && sub3 >= 33) {
            System.out.println("Congretulation!, You are passed!");
        } else {
            System.out.println("Sorry!, You are failed!");
        }
    }
} */



// Calculate income tac paid by an employee


/*
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your income in Lacks per annum:");
        float tax = 0;
        float income = sc.nextFloat();
        if(income <= 2.5) {
            tax = tax + 0;
        } else if (income > 2.5f && income <= 5f) {
            tax = tax + 0.05f * (income - 2.5f);
        } else if (income > 5f && income <= 10.0f) {
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.2f * (income - 5f);
        } else if (income > 10.0f) {
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.2f * (10.0f - 5f);
            tax = tax + 0.3f * (income - 10.0f);
        }

        System.out.println("The total tax paid by the employee is: " + tax);
    }
} */



// Find day using number


/*
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Eneter a number:");
        int day = sc.nextInt();

        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thusday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");

        }
    }
} */



// Find wether aentered year is a leap year or not


/*
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a year to check if it is a leap year or not:");
        int year = sc.nextInt();
        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
            System.out.println(year + " is a leap year");            
        } else {
            System.out.println(year + " is not a leap year");
        }
    }
} */



// Find website type by url


/*
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a url here:");
        String website = sc.next();
        if(website.endsWith(".com")) {
            System.out.println(website + " is a Commercial Website");
        } else if (website.endsWith(".org")) {
            System.out.println(website + " is a Organization Website");
        } else if (website.endsWith(".in")) {
            System.out.println(website + " is a Indian Website");
        }
    }
} */
/******************************/



// RPS Game


/*
import java.util.Scanner;
import java.util.Random;

public class main {    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rn = new Random(3);

        int chance = 0;
        int ui = 0;
        int ci = 0;

        System.out.println("--Welcome to RPS game--");
        while (chance<3) {
            chance++;
            System.out.println("Choose any one of the option below:\n1) Rock\n2) Paper\n3) Scissor");
        
            int player = sc.nextInt();
            int pc = rn.nextInt(3);

            if (player == 1 && pc == 1) {
                System.out.println("This Match Tied We both selected Rock");
            } else if (player == 1 && pc == 2) {
               System.out.println("You loose! I selected Paper which coveres rock");
               ci++;
            } else if (player == 1 && pc == 3) {
            System.out.println("You Won! I selected Scissor which is broken by Scissor");
            ui++;
            }

            if (player == 2 && pc == 1) {
                System.out.println("You Won! I selected rock which is covered by Paper");
                ui++;
            } else if (player == 2 && pc == 2) {
                System.out.println("This Match Tied We both selected Paper");
            } else if (player == 2 && pc == 3) {
                System.out.println("You loose! I selected Scissor which cuts Paper");
                ci++;
            }

            if (player == 3 && pc == 1) {
                System.out.println("You loose! I selected Rock which brecks Scissor");
                ci++;
            } else if (player == 3 && pc == 2) {
                System.out.println("You Won! I selected Paper wich is cut by Scissor");
                ui++;
            } else if (player == 3 && pc == 3) {
                System.out.println("This Match Tied We both selected Scissor");
            }
            
            if (player != 1 && player != 2 && player != 3) {
                System.out.println("Enter a valid Number!");
            }
        }

        if (ui>ci) {
            System.out.println("\n--Scoreboard--\nYour Points: " + ui + "\nMy Points: " + ci + "\nYou Won this match!");
        } else if (ui<ci) {
            System.out.println("\n--Scoreboard--\nYour Points: " + ui + "\nMy Points: " + ci + "\nYou Loose this match!");
        } else if (ui==ci) {
            System.out.println("\n--Scoreboard--\nYour Points: " + ui + "\nMy Points: " + ci + "This match is Tied!");
        }
    }
} */



/**** Chapter 5 ****/
/**** Loop Control Instruction ****/


// While Loop



/*
public class main {
    public static void main(String[] args) {
        int i = 1;
        System.out.println("Using Loops:");
        while (i<=3) {      // First checks the condition then execute
            System.out.println(i);
            i++;
        }
        System.out.println("While loop finished!");

        // An Infinite loop
        // while (true) {
        //     System.out.print("An Infinite Loop!");
        // }

        // Natural numbers from 100 to 200
            int a = 1;

        while (a<=100) {
            System.out.println(a);
            a++;
        }
    }
} */



// do - While loop


/*
public class main {
    public static void main(String[] args) {
        int i = 0;

        do {        // First executes the checks the condition
            System.out.println(i);
            i++;
        } while (i<5);

        // first n natural numbers
        int a = 1;

        do {
            System.out.println(a);
            a++;
        } while (a<45);
    }
} */



// For Loop


/*
public class main {
    public static void main(String[] args) {
        for (int i=1; i<=10; i++) {
            System.out.println(i);
        }

        // Print first n odd numbers
        int m = 5;

        for (int i=0; i<m; i++) {
            System.out.println(2*i+1);
        }


        // Decrimenting For Loop
        int n = 5;
        for (int i = n; i > 0; i--) {       // i != 0 same output
            System.out.println(i);
        }

        // First n natural numbers in reverse order
    }
} */



// Break Statement


/*
public class main {
    public static void main(String[] args) {
        // for (int i = 0; i < 5; i++) {
        //     System.out.println(i);
        //     System.out.println("Java is great");
            
        //     if(i==2) {
        //         System.out.println("Ending the loop");
        //         break;
        //     }
        // }

        int i = 0;
        // while (i<5) {
        //     System.out.println(i);
        //     System.out.println("Java is great");
            
        //     if(i==2) {
        //         System.out.println("Ending the loop");
        //         break;
        //     }
        //     i++;         
        // }

        do {
            System.out.println(i);
            System.out.println("Java is great");
            
            if(i==2) {
                System.out.println("Ending the loop");
                break;
            }
            i++;            
        } while (i<5);
        System.out.println("Loops ends here");
    }
} */



// Continue Statement


/*
public class main {
    public static void main(String[] args) {
        // for (int i = 0; i < 5; i++) {
        //     if(i==2) {
        //         System.out.println("Ending the loop");
        //         continue;
        //     }
        //     System.out.println(i);
        //     System.out.println("Java is great");
        // }

        int i = 0;
        do {
            i++;
            if(i==2) {
                System.out.println("Ending the loop");
                continue;
            }
            System.out.println(i);
            System.out.println("Java is great");           
        } while (i<5);
    }
} */


/******************************/
// Practice Set 5


// To print a following pattern


/*
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int star = sc.nextInt();
        for (int i = star; i > 0; i--) {

            for (int j = 0; j < i; j++) {
                System.out.print("*");              
            }
            System.out.println("\n");
        }
    }
} */
// Triangle
// import java.util.Scanner;

// public class main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int star = sc.nextInt();
//         for (int i = 0; i < star; i++) {

//             for (int j = star-i; j > 1; j--) {
//                 System.out.print(" ");              
//             }
//             for (int j = 0; j <= i; j++) {
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }



// Sum of first n even numbers using while loop


/*
public class main {
    public static void main(String[] args) {
        int sum = 0;
        int n = 5;
        int i = 0;
        while (i < n) {
            sum = sum + (2*i);
            i++;
        }
        System.out.print("Sum of even nmbers is: ");
        System.out.println(sum);
    }
} */



// Multiplication table of given number


/*
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number:");
        int n = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d", n, i, n*i);
            System.out.println();
        }
    }
} */



// Make table in reverse order


/*
public class main {
    public static void main(String[] args) {
        int n = 10;
        for (int i = 10; i >= 1; i--) {
            System.out.printf("%d x %d = %d", n, i, n*i);
            System.out.println();
        }
    }
} */



// Factorial of given number using for loop


/*
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number:");
        int n = sc.nextInt();
        int factorial = 1;
        for (int i = 1; i <=n; i++) {
            factorial *= i;
        }
        System.out.println(factorial);
    }
} */



// Factorial of given number using while loop


/*
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number:");
        int n = sc.nextInt();
        int factorial = 1;
        int i = 1;
        while (i<=n) {
            factorial *= i;
            i++;
        }
        System.out.println(factorial);
    }
} */



// Pattern using while loop


/*
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int star = sc.nextInt();
        int i = star;
        while (i > 0) {
            int j = 0;
            while (j < i) {
                System.out.print("*");  
                j++; 
            }
            System.out.println("\n");
            i--;
        }
    }
} */



// Calculat sum of table of 8


/*
public class main {
    public static void main(String[] args) {
        int n = 8;
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += n*i;
        }
        System.out.println(sum);
    }
} */



// Sum of first n even numbers using for loop


/*
public class main {
    public static void main(String[] args) {
        int sum = 0;
        int n = 5;
        for (int i = 0; i < n; i++) {
            sum = sum + (2*i);
        }
        System.out.print("Sum of even nmbers is: ");
        System.out.println(sum);
    }
} */
/******************************/



/**** Chapter 6 ****/
/**** Arrays ****/



// Array Syntax


/*
public class main {
    public static void main(String[] args) {
        int [] marks = new int[5];              //First multiplication(a);      // Use memory of 5 x 4 = 20 bytes
        
        // int [] marks;                           // Second    multiplication(a);
        // marks = new int[5];

        // int [] marks = {100, 70, 80, 71, 81};   // Third multiplication(a);

        marks [0] = 100;
        marks [1] = 60;
        marks [2] = 78;
        marks [3] = 98;
        marks [4] = 86;
        System.out.println(marks[4]);
    }
} */



// Array Length


/*
public class main {
    public static void main(String[] args) {
        float [] marks = {98.5f, 45.7f, 79.8f, 99.0f, 88.9f};
        System.out.println(marks.length);
        System.out.println(marks[2]);

        String [] students = {"Minobic", "Mayank", "MinoBot", "Mino"};
        System.out.println(students.length);
        System.out.println(students[2]);
    }
} */



// Displaying Array


/*
public class main {
    public static void main(String[] args) {
        String [] students = {"Minobic", "Mayank", "MinoBot", "Mino"};

        // Naive way (simple way)
        System.out.println("Printing using naive    multiplication(a);");
        System.out.println(students[0]);
        System.out.println(students[1]);
        System.out.println(students[2]);
        System.out.println(students[3]);

        // Using for loop       // Array Traversal
        System.out.println("Printing using for loop");
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }

        // Quick quiz print in reverse order
        System.out.println("Printing in reverse order using for loop");
        for (int i = students.length - 1 ; i >= 0; i--) {
            System.out.println(students[i]);
        }

        // Using for each loop
        System.out.println("Printing using for each loop");
        for(String element: students) {
            System.out.println(element);
        }
    }
} */



// Multidimensional Arrays


/*
public class main {
    public static void main(String[] args) {
        int [][] flats;     // 2D array
        flats = new int [2][3];
        flats[0][0] = 101;
        flats[0][1] = 102;
        flats[0][2] = 103;
        flats[1][0] = 201;
        flats[1][1] = 201;
        flats[1][2] = 201;

        System.out.println("Printing a 2d array using a for loop:");
        for (int i = 0; i < flats.length; i++){
            for (int j = 0; j < flats[i].length; j++) {
                System.out.print(flats[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
} */


/******************************/
// Practice Set Chapter 6


// Create an array of 5 floats and calculate sum


/*
public class main {
    public static void main(String[] args) {
        float [] exaArray = {52.5f, 23.1f, 45.6f, 54.8f, 87.9f};
        float sum = 0;

        for (float newSum : exaArray) {
            sum = sum + newSum;
        }
        System.out.println("The value of sum is: " + sum);
    }
} */



// find if input int present in array


/*
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] num = {25, 54, 63, 43, 24};
        int inNum = sc.nextInt();
        Boolean isInArray = false;

        for (int element : num) {
            if (inNum == element) {
                System.out.println("Yes! " + inNum + " is present in array.");
            } else {
                System.out.println("No! " + inNum + " is not present in array.");
            }
            break;
        }

    }
} */



// Calculate average from arry of physic marks if all student


/*
public class main {
    public static void main(String[] args) {
        int [] marks = {54, 89, 46, 74, 85};
        int sum = 0;
        
        for (int element : marks) {
            sum = sum + element;
        }

        int average  = sum/2;
        System.out.println("Here is your marks average: " + average); 
    }
} */



// Addition of two matrix size 2 x 3


/*
public class main {
    public static void main(String[] args) {
        int [][] matrix;
        matrix = new int [2][3];

        matrix[0][0] = 1;
        matrix[0][1] = 2;
        matrix[0][2] = 3;
        matrix[1][0] = 4;
        matrix[1][1] = 5;
        matrix[1][2] = 6;

        int [][] matrix2;
        matrix2 = new int [2][3];

        matrix2[0][0] = 1;
        matrix2[0][1] = 2;
        matrix2[0][2] = 3;
        matrix2[1][0] = 4;
        matrix2[1][1] = 5;
        matrix2[1][2] = 6;

        int [][] result;
        result = new int [2][3];

        result[0][0] = 0;
        result[0][1] = 0;
        result[0][2] = 0;
        result[1][0] = 0;
        result[1][1] = 0;
        result[1][2] = 0;

        for (int i = 0; i < matrix.length; i++) {           // Row number of times
            for (int j = 0; j < matrix2[i].length; j++) {   // Column number of times
                System.out.printf("Setting value for i = %d and j = %d \n", i, j);
                result[i][j] = matrix[i][j] + matrix2[i][j];
            }
        }
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
} */



// Reverse an array


/*
public class main {
    public static void main(String[] args) {
        int [] reverse = {1, 2, 3, 4, 5, 6};
        int l = reverse.length;
        int n = Math.floorDiv(l, 2);
        int temp;

        for (int i = 0; i < n; i++) {
            // Swap a[i] and a[l-1-i]
            // [3] [4] []
            temp = reverse[i];
            reverse[i] = reverse[l-i-1];
            reverse[l-i-1] = temp;
        }
        for (int element : reverse) {
            System.out.print(element + " ");
        }
    }
} */



// Find maximum element in an array


/*
public class main {
    public static void main(String[] args) {
        int [] maxA = {1 , 5 , 24 , 6 , 17};
        int max = maxA[0];

        for (int i = 1; i < maxA.length; i++) {
            if (maxA[i] > max) {
                max = maxA[i];
            }
        }

        System.out.println("Maximum value in given array is: " + max);
    }
} */



// Find minium element in an array


/*
public class main {
    public static void main(String[] args) {
        int [] maxA = {1 , 5 , 24 , 6 , 17};
        int max = maxA[0];

        for (int i = 1; i < maxA.length; i++) {
            if (maxA[i] < max) {
                max = maxA[i];
            }
        }

        System.out.println("Minimum value in given array is: " + max);
    }
} */



// Find weather an arra is sorted or not(in acending order)


/*
public class main {
    public static void main(String[] args) {
        int [] arr = {1, 51, 21, 32, 95, 9};
        boolean sorted = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                sorted = false;
                break;
            }
        }
        if (sorted) {
            System.out.println("Yes! it's sorted");
        } else {
            System.out.println("No! it's not sorted");
        }
    }
} */
/******************************/



/**** Chapter 7 ****/
/****   multiplication(a); in Java ****/



// Syntax of Method


/*
public class main {
    static int logic(int x, int y) {
        int z;
        if (x > y) {
            z = x + y;
        } else {
            z = (x + y) * 5;
        }
        return z;
    }

    public static void main(String[] args) {
        int a = 5, b = 7, c;
        c = logic(a, b);        // Calling method/function
        
        int a1 = 2, b1 = 1, c1;
        c1 = logic(a1, b1);
        System.out.println(c);
        System.out.println(c1);
    }
} */



// Calling a Method


/*
public class main {
    int logic(int x, int y) {
        int z;
        if (x > y) {
            z = x + y;
        } else {
            z = (x + y) * 5;
        }
        return z;
    }

    public static void main(String[] args) {
        main obj = new main();      // Making a new obj for method(object creation)
        int a = 5, b = 7, c;
        c = obj.logic(a, b);
        
        int a1 = 2, b1 = 1, c1;
        c1 = obj.logic(a1, b1);
        System.out.println(c);
        System.out.println(c1);
    }
} */



// void Return type


/*
public class main {
    static void joke() {
        System.out.println("I invented a new word\n" + "Plagiarism");
    }
    public static void main(String[] args) {
        joke();
    }
} */



// Process of method Invocation in Array


/*
public class main {
    static void change(int [] arr) {
        arr[0] = 98;
    }
    public static void main(String[] args) {
        int [] marks = {63, 54, 82, 93, 59};
        change(marks);
        System.out.println("The value of x after change is: " + marks[0]);
    }
} */



// Method Overloading


/*
public class main {
    static void new1() {
        System.out.println("Good morning bro!");
    }
    static void new1(int a) {
        System.out.println("Good morning " + a + " bro!");
    }
    static void new1(int a, int b) {
        System.out.println("Good morning " + a + " bro!");
        System.out.println("Good morning " + b + " bro!");
    }
    public static void main(String[] args) {
        new1();
        new1(3000);
        new1(3000, 200);        // Arguments are actual
    }
} */



// Variable Arguments (Varargs)


/*
public class main {
    // static int sum(int a, int b) {
    //     return a + b;
    // }
    // static int sum(int a, int b, int c) {
    //     return a + b + c;
    // }
    static int sum(int ...arr) {        // Availabe as int [] arr       // If sum(int x, int ... arr) then atleast one integer is required
        int result = 0;
        for (int a : arr) {
            result += a;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("Hello!");
        System.out.println("The sum of 4 and 5 is: " + sum(4, 5));
        System.out.println("The sum of 4, 3 and 5 is: " + sum(4, 3, 5));
        System.out.println("The sum of 2, 3, 4 and 5 is: " + sum(2, 3, 4, 5));
    }
} */



// Recursion


/*
import java.util.Scanner;

public class main {
    static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;         
        } else {
            return n * factorial(n-1);
        } 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m;
        System.out.println("Enter a number:");
        m = sc.nextInt();
        System.out.println("The factorial of " + m + " is: " + factorial(m));
    }
} */



// Fibonacci Sequence


/*
import java.util.Scanner;

public class main {
    static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        int fibNum1 = fibonacci(n - 1);
        int fibNum2 = fibonacci(n - 2);
        int fibResult = fibNum1 + fibNum2;
        return fibResult; 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int m = sc.nextInt();
        System.out.println(fibonacci(m - 1));
    }
} */



/******************************/
// Practice Set Chapter 7


// Multiplication table of a number


/*
import java.util.Scanner;

public class main {
    static void table(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + i*n);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int m = sc.nextInt();
        table(m);
    }
} */



// star pattern


/*
public class main {
    static void pattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern(5);
    }
} */



// Sum of first n natural number using recursion


/*
public class main {
    static int sum(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * sum(n-1);
        }
    }
    public static void main(String[] args) {
        System.out.println(sum(5));
    }
} */



// Pattern but reverse


/*
public class main {
    static void pattern(int n) {
        for (int i = n; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern(5);
    }
} */



// nth number of fibonacci sequence


/*
import java.util.Scanner;

public class main {
    static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int m = sc.nextInt();
        System.out.println(fibonacci(m - 1));
    }
} */



// Function to find average of a set of numbers as arguments


/*
public class  main {
    static float argument(int ...arr) {
        float result = 0;
        float sum = 0;
        for (int i : arr) {
            // System.out.println(i);
            sum += i ;
        }
        result = sum/arr.length;
        return result;
    }
    public static void main(String[] args) {
        System.out.println(argument(2,3,4,5));
    }
} */



// Pattern using recursion


/*
public class main {
    static void pattern(int n) {
        if (n > 0) {
            pattern(n - 1);
            for (int i = 0; i < n; i++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern(5);
    }
} */



// Reverse pattern using recursion


/*
public class main {
    static void printPatternRowRecur(int n) {
        if (n < 1)
            return;
        System.out.print( "* ");
        printPatternRowRecur(n - 1);
    }
      
    static void printPatternRecur(int n, int m) {
        if (m > n)
            return;
        printPatternRowRecur(m); 
        System.out.println ();
        printPatternRecur(n, m + 1);
          
    }
    public static void main (String[] args) {
        int n = 5;
        printPatternRecur(n, 1);
          
    }
} */



// Degree to fahrenheit


/*
public class main {
    static void conversion(int n) {
        System.out.println((n * 1.8) + 32);
    }
    public static void main(String[] args) {
        conversion(6);
    }
} */



// Sum of first n natural numbers using itrative approach


/*
public class main {
    static int sum(int n) {
        if (n == 1) {
            return 1;
        }
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(sum(5));
    }
} */
/******************************/



/**** Chapter 8 ****/
/**** Introduction to OOPs ****/



// Writting Custom Class


/*
class employee {
    int id;
    int salary;
    String name;
    public void details() {
        System.out.println("My id is: " + id);
        System.out.println("My name is: " + name);
    }
    public int getSalary() {
        System.out.println();
        return salary;
    }
}

public class main {
    public static void main(String[] args) {
        System.out.println("This is our coustom class");
        employee mayank = new employee();       // Instanting a new employee object
        employee aadit = new employee();

        // Setting atributes/properties
        mayank.id = 20;
        mayank.salary = 5000;
        mayank.name = "Minobic";

        aadit.id = 25;
        aadit.salary = 50;
        aadit.name = "Atu";

        // System.out.println(mayank.id);
        // System.out.println(mayank.name);
        mayank.details();
        aadit.details();

        int salaryEmp = mayank.getSalary();
        System.out.println(salaryEmp);
        salaryEmp = aadit.getSalary();
        System.out.println(salaryEmp);
    }
} */



/******************************/
// Practice Set Chapter 8


// Making class with methods in it for employee


/*
class employee {
    int salary;
    String name;

    public int getSalary() {
        return salary;
    }
    public String getName() {
        return name;
    }
    public void setName(String n) {
        name = n;
    }
}

public class main {
    public static void main(String[] args) {
  
        employee mayank = new employee();
        mayank.salary = 5000;
        
        mayank.setName("Minobic");
        System.out.println(mayank.getName()); 
        System.out.println(mayank.getSalary());
    }
} */



// Making class with method for cellphone


/*
class cellphone {
    public void ring() {
        System.out.println("Ringing...");
    }
    public void vibrate() {
        System.out.println("Vibrating...");
    }
}

public class main {
    public static void main(String[] args) {
        cellphone samsung = new cellphone();
        samsung.ring();
        samsung.vibrate();
    }    
} */



// Square class for side, area, parameter


/*
class square {
    int side;
    public int area() {
        return side * side;
    }
    public int parameter() {
        return 4 * side;
    }
}

public class main {
    public static void main(String[] args) {
        square square1 = new square();

        square1.side = 5;
        System.out.println(square1.area());
        System.out.println(square1.parameter());
    }    
} */



// Rectangle class for side, area, parameter


/*
class rectangle {
    int side1, side2;
    public int area() {
        return side1 * side2;
    }
    public int parameter() {
        return 2 * side1 + 2 * side2;
    }
}

public class main {
    public static void main(String[] args) {
        rectangle rectangle1 = new rectangle();
        rectangle1.side1 = 5;
        rectangle1.side2 = 6;
        System.out.println(rectangle1.area());
        System.out.println(rectangle1.parameter());
    }
} */



// Character hit run fire


/*
class tommyVecetti {
    public void hit() {
        System.out.println("Hitting...");
    }
    public void run() {
        System.out.println("Running...");
    }
    public void fire() {
        System.out.println("Firing...");
    }
}

public class main {
    public static void main(String[] args) {
        tommyVecetti tommy = new tommyVecetti();
        tommy.hit();
        tommy.run();
        tommy.fire();
    }
} */



// Circle class for side, area, parameter


/*
class circle {
    int radius;
    float pi = 22/7;
    public float area() {
        return pi * radius * radius;
    }
    public float parameter() {
        return 2 * pi * radius;
    }
}

public class main {
    public static void main(String[] args) {
        circle circle1 = new circle();
        circle1.radius = 5;
        System.out.println(circle1.area());
        System.out.println(circle1.parameter());
    }
} */
/******************************/



/**** Chapter 9 ****/
/**** Access Modifires and Constructor ****/



// Getters and Setters


/*
class employee {
    private int id;
    private String name;

    public String getName() {
        return name;
    }
    public void setName(String n) {
        name = n;
    }
    public int getId(){
        return id;
    }
    public void setId(int n) {
        this.id = n;        // "this" is optional here
    }
}

public class main {
    public static void main(String[] args) {
        employee mayank = new employee();
        // mayank.id = 15;
        // mayank.name = "Minobic";     // Here will be an error cuz of private acces modifiers
        mayank.setName("Minobic");
        System.out.println(mayank.getName());
        mayank.setId(15);
        System.out.println(mayank.getId());
    }
} */



// Circle dimension using getters and setters


/*
class circle{
    private int radius;
    private double area;
    private double circumference;
    
    public void setRadius(int n) {
        radius = n;
    }
    public int getRadius() {
        return radius;
    }

    public void setArea(double n) {
        System.out.printf("The area is: %d", (22 / 7) * (radius * radius));
    }
    public double getArea() {
        return area;
    }

    public void setCircumference(double n) {
        System.out.printf("The circumference is: %d", 2* (22 / 7) * radius);
    }
    public double getCircumference() {
        return circumference;
    }
}

public class main {
    public static void main(String[] args) {
        circle circle1 = new circle();
        
        circle1.setRadius(5);
        System.out.println(circle1.getRadius());
 
        circle1.setArea(78.54);
        System.out.println(circle1.getArea());

        circle1.setCircumference(31.42);
        System.out.println(circle1.getCircumference());
    }
} */



// Cronstructors in Java


/*
import java.util.Scanner;

class employee {
    private int id;
    private String name;

    public employee() {
        id = 45;
        name = "Your-Name-Here";
    }
    public employee(String myName, int myId) {
        id = myId;
        name = myName;
    }

    public String getName() {
        return name;
    }
    public void setName(String n) {
        name = n;
    }
    public int getId(){
        return id;
    }
    public void setId(int n) {
        this.id = n;        // "this" is optional here
    }
}

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String myName = sc.next();
        System.out.print("Enter your id: ");
        int myId = sc.nextInt();

        // employee minobic = new employee(myName, myId);
        employee minobic = new employee();      // Cronstructor overloading

        System.out.println(minobic.getName());
        System.out.println(minobic.getId());
    }
} */



// Employee constructor to initialize salary to Rs 10,000


/*
import java.util.Scanner;;

class employee {
    private int id;
    private String name;
    private int salary;

    public employee(int myId, String myName, int mySalary) {
        id = myId;
        name = myName;
        salary = mySalary;
    }

    public void setId(int n) {
        this.id = n;
    }
    public int getId() {
        return id;
    }
    
    public void setName(String n) {
        this.name = n;
    }
    public String getName() {
        return name;
    }

    public void setSalary(int n) {
        salary = n;
    }
    public int getSalary() {
        return salary;
    }
}

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your id: ");
        int myId = sc.nextInt();
        System.out.print("Enter your name: ");
        String myName = sc.next();
        System.out.print("Enter your salary: ");
        int mySalary = sc.nextInt();

        employee minobic = new employee(myId, myName, mySalary);

        System.out.println(minobic.getId());
        System.out.println(minobic.getName());
        System.out.println(minobic.getSalary());
    }
} */



// Make a guess the number game


/*
import java.util.Scanner;
import java.util.Random;

class guessTheNumber {
    int random;
    int userInput;

    int randomGen() {
        Random rd = new Random();
        random = rd.nextInt(100) + 1;
        return random;
    }
    void uInput(int n) {
        userInput = n;
    }
    void isNoCorrect() {
        if (userInput == random) {
            System.out.println("You guessed the right number!");
        } else if (userInput > random) {
            System.out.println("You guessed too big number think of a lil small!");
        } else if (userInput < random) {
            System.out.println("You guessed too small number think of a lil big!");
        } else {
            System.out.println("Input a valid number!");
        }
    }
    void noOfGuess(int n) {
        System.out.printf("You take a total of %d guesses!\n", n);
    }
}
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int noOfGuess = 0;

        guessTheNumber guess = new guessTheNumber();
        int randomNumber = guess.randomGen();

        while (true) {
            System.out.print("Guess a number between 1 - 100: ");
            int input = sc.nextInt();
            guess.uInput(input);
            noOfGuess++;

            guess.isNoCorrect();

            if (guess.userInput == randomNumber) {
                break;
            }
        }
        guess.noOfGuess(noOfGuess);
        System.out.println("The random number was: " + randomNumber);
    }
} */



/******************************/
// Practice Set Chapter 9


// Create a class cylinder and use gettesrs and setters and set both


/*
class cylinder {
    private int radius;
    private int height;

    public void setRadius(int n) {
        radius = n;
    }
    public int getRadius() {
        return radius;
    }

    public void setHeight(int n) {
        height = n;
    }
    public int getHeight() {
        return height;
    }
}
public class main {
    public static void main(String[] args) {
        cylinder cyl = new cylinder();
        cyl.setRadius(5);
        cyl.setHeight(4);

        System.out.println(cyl.getRadius());
        System.out.println(cyl.getHeight());
    }
} */



// Use the upper cylinder and calculate surface area and volume of the cylinder


/*
class cylinder {
    private int radius;
    private int height;

    void setRadius(int n) {
        radius = n;
    }
    int getRadius() {
        return radius;
    }

    void setHeight(int n) {
        height = n;
    }
    int getHeight() {
        return height;
    }

    public double surfaceArea() {
        return 2 * Math.PI * radius * radius + 2 * Math.PI * radius * height;
    }
    public double volume() {
        return Math.PI * radius * radius * height;
    }
}
public class main {
    public static void main(String[] args) {
        cylinder cyl = new cylinder();
        cyl.setRadius(9);
        cyl.setHeight(12);

        System.out.println(cyl.getRadius());
        System.out.println(cyl.getRadius());

        System.out.println(cyl.surfaceArea());
        System.out.println(cyl.volume());
    }
} */



// Use a constructor and repeat first question


/*
class cylinder {
    private int radius;
    private int height;

    public cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }
    public int getHeight() {
        return height;
    }
}

public class main {
    public static void main(String[] args) {
        cylinder cyl = new cylinder(15, 46);

        System.out.println(cyl.getRadius());
        System.out.println(cyl.getHeight());
    }
} */



// overlaod a constructor use to initialize rectangels length and breadth for coustom parameter


/*
class rectangel {
    private int l = 65;
    private int b = 35;

    public rectangel(int l, int b) {
        this.l = l;
        this.b = b;
    }
    
    public int getL() {
        return l;
    }
    public int getB() {
        return b;
    }
}

public class main {
    public static void main(String[] args) {
        rectangel rec = new rectangel(6, 4);

        System.out.println(rec.getL());
        System.out.println(rec.getB());
    }
} */



// Repeat first problem for a sphere


/*
class sphere {
    private double radius;
    private double area;
    private double circumference;

    public sphere(int radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    public double getArea() {
        return 1.3333 * Math.PI * radius * radius * radius;
    }
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }
}

public class main {
    public static void main(String[] args) {
        sphere sph = new sphere(5);

        System.out.println(sph.getRadius());
        System.out.println(sph.getArea());
        System.out.println(sph.getCircumference());
    }
} */
/******************************/



/**** Chapter 10 ****/
/**** Inheritance ****/



// Declaring Inheritance in Java


/*
class base {
    public int x;

    public void setX(int x) {
        this.x = x;
    }
    public int getX() {
        System.out.println("I'm in base and setting x");
        return x;
    }
}

class derived extends base {        // Here "derived" is a name of that class but use of "extends" is complusory
    public int y;

    public void setY(int y) {
        this.y = y;
    }
    public int getY() {
        return y;
    }
}

public class main {
    public static void main(String[] args) {
        derived d = new derived();      // If base b = new base(); then it can only acces x not y

        d.setX(4);
        System.out.println(d.getX());
        d.setY(6);
        System.out.println(d.getY());
    }
} */



// Create class animal and derive dog class from it 


/*
class animal {
    public void printHetro() {
        System.out.println("All animals are heterotrophs.");
    }
}

class dog extends animal {
    public void printBark() {
        System.out.println("Dog barks!");
    }
}

public class main {
    public static void main(String[] args) {
        dog d = new dog();

        d.printHetro();
        d.printBark();
    }
} */


  
// Constructors in Inheritance


/*
class base {
    base() {
        System.out.println("I'm a constructor");
    }
    base(int a) {
        System.out.println("I'm an overloaded constructot with value: " + a);
    }
}

class bDerivied extends base {
    bDerivied() {
        // super(0);
        System.out.println("I'm a derived class constructor");
    }
    bDerivied(int a, int b) {
        super(a);       // Calls constructor form the parent class which take one variable
        System.out.println("I'm a overloaded constructor of derived with value: " + b);
    }
}

class childOfDerivied extends bDerivied{
    childOfDerivied() {
        System.out.println("I'm a child constructor");
    }
    childOfDerivied(int a, int b, int c) {
        super(a, b);
        System.out.println("I'm a overloaded constructor of child with value: " + c);
    }
}

public class main {
    public static void main(String[] args) {
        // base b = new base();
        // bDerivied bd = new bDerivied(14, 9);
        childOfDerivied c = new childOfDerivied(21, 23, 42);
    }
} */



// Use this and super Keyword


/*
class newClass {
    int a;

    public int getA() {
        return a;
    }

    newClass(int a) {
        this.a = a;     // Here this keyword is a way to reference an object of the class which is being creatd/referenced
    }
}

class newClass2 extends newClass {
    newClass2(int n) {
        super(n);       // If you want to invoke a custom constructor
        System.out.println("I'm a contructor");
    }
}

public class main {
    public static void main(String[] args) {
        newClass c = new newClass(5);
        newClass2 c2 = new newClass2(6);

        System.out.println(c.getA());
    }
} */



// Method Overriding


/*
class A{
    public int a;

    public int mayank() {
        return 4;
    }
    public void math2() {
        System.out.println("I'm method 2 of class A");
    }
}

class B extends A {
    @Override       // Optional its just a notation nut recommended
    public void math2() {
        System.out.println("I'm method 2 of class B");      // Method overriding
    }
    public void math3() {
        System.out.println("I'm method 3 of class B");
    }
}

public class main {
    public static void main(String[] args) {
        A a = new A();
        a.math2();

        B b = new B();
        b.math2();
    }
} */



// Dynamic Method Dispatch


/*
class phone {
    public void time() {
        System.out.println("Time is 8 am");
    }
    public void on() {
        System.out.println("Turning on Phone...");
    }
}

class smartPhone {
    public void music() {
        System.out.println("Playing Music...");
    }
    public void on() {
        System.out.println("Turning on Smart Phone...");
    }
}

public class main {
    public static void main(String[] args) {
        // phone obj = new phone();     // Allowed
        // smartPhone sobj = new smartPhone();      // Allower

        // obj.name();

        phone obj = new smartPhone();       // Method dispatch      // Allowed
        // smartPhone obj1 = new phone();      // Not allowed

        obj.time();
        obj.on();
        // obj.music();        // Not allowed
    }
} */



// Make library with some features


/*
import java.util.Scanner;
import java.util.ArrayList;

class library {
    Scanner sc = new Scanner(System.in);
    ArrayList<String> books = new ArrayList<>();
    ArrayList<String> issuedBooks = new ArrayList<>();
    int arrayLength = books.size();

    library() {
        books.add("My Vampire System");
        books.add("The Legendary Survivor");
        books.add("School of Magic");
    }

    void addBooks() {
        System.out.print("Which book you want to add: ");
        String addBookName = sc.nextLine();
        books.add(addBookName);
        System.out.println("Book is successfully added!");
    }
    void issueBooks() {
        System.out.println("Books availabe in library: ");
        for (int i = 0; i < books.size(); i++) {
            System.out.println((i + 1) + ") " + books.get(i));
        }
        System.out.print("Which book you want to issue: ");
        int bookIndex = sc.nextInt();

        if (bookIndex >= 1 && bookIndex <= books.size()) {
        String issuedBookName = books.remove(bookIndex - 1);
        issuedBooks.add(issuedBookName);
        System.out.println("Book '" + issuedBookName + "' is successfully issued!");
        } else {
            System.out.println("Invalid book index. Book cannot be issued.");
        }
    }
    void returnBook() {
        System.out.println("Books you issued: ");
        for (int i = 0; i < issuedBooks.size(); i++) {
            System.out.println((i + 1) + ") " + issuedBooks.get(i));
        }
        System.out.print("Which book you want to return: ");
        int bookReturn = sc.nextInt();

        if (bookReturn >= 1 && bookReturn <= books.size()) {
        String returnBookName = issuedBooks.remove(bookReturn - 1);
        books.add(returnBookName);
        System.out.println("Book '" + returnBookName + "' is successfully returned!");
        } else {
            System.out.println("Invalid book index. Book cannot be returned.");
        }
    }
    void showAvailableBooks() { 
        System.out.println("There are total of " + books.size() + " Books they are:");
        for (int i = 0; i < books.size(); i++) {
            System.out.println((i + 1) + ") " + books.get(i));
        }
    }
    void showIssuedBooks() { 
        System.out.println("There are total of " + issuedBooks.size() + " Issued Books they are:");
        for (int i = 0; i < issuedBooks.size(); i++) {
            System.out.println((i + 1) + ") " + issuedBooks.get(i));
        }
    }
}

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        library lib = new library();

        int select = 0;

        System.out.println("Enter Your name:");
        String name = sc.nextLine();
        System.out.println("Hello " + name + " welcome to our Library!");
        while (true) {
            System.out.println("Please select one option:\n1) Add Books\n2) Issue a Book\n3) Return a Book\n4) Show availabe Books\n5) Show Issued Books");
            select = sc.nextInt();
            sc.nextLine();

            if (select == 1) {
                lib.addBooks();
            } else if (select == 2) {
                lib.issueBooks();
            } else if (select == 3) {
                lib.returnBook();
            } else if (select == 4) {
                lib.showAvailableBooks();
            } else if (select == 5) {
                lib.showIssuedBooks();
            }
        }
    }
} */



/******************************/
// Practice Set Chapter 10


// Create class circle and use inheritance to create another class cylinder from it


/*
class circle {
    public int radius;

    circle(int radius) {
        System.out.println("I'm circle paramaterized constructor");
        this.radius = radius;
    }
}

class cylinder extends circle {
    public int height;

    cylinder(int radius, int height) {
        super(radius);
        System.out.println("I'm cylinder paramaterized constructor");
        this.height = height;
    }
}

public class main {
    public static void main(String[] args) {
        // circle obj = new circle(15);
        cylinder obj = new cylinder(15, 4);
} */



// Create class rectangle and use inheritance to create acother class cuboid


/*
class rectangel {
    public int length;
    public int breadth;

    rectangel(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    public double parameter() {
        return 2 * (length + breadth);
    }
}

class cuboid extends rectangel {
    public int height;

    cuboid(int length, int breadth, int height) {
        super(length, breadth);
        this.height = height;
    }
    public double parameter() {
        return 4 * (length + breadth + height);
    }
}

public class main {
    public static void main(String[] args) {
        cuboid obj = new cuboid(15, 4, 9);

        System.out.println(obj.parameter());
        System.out.println(obj.parameter());
    }
} */



// Create meathods for area and volume in first question


/*
class circle {
    public int radius;

    circle(int radius) {
        System.out.println("I'm circle paramaterized constructor");
        this.radius = radius;
    }
    public double area() {
        return Math.PI * radius * radius;
    }
}

class cylinder extends circle {
    public int height;

    cylinder(int radius, int height) {
        super(radius);
        System.out.println("I'm cylinder paramaterized constructor");
        this.height = height;
    }
    public double volume() {
        return Math.PI * radius * radius * height;
    }
}

public class main {
    public static void main(String[] args) {
        // circle obj = new circle(15);
        cylinder obj = new cylinder(15, 4);

        System.out.println(obj.area());
        System.out.println(obj.volume());
    }
} */



// Create methods for area & volume in second question and also create getters and setters


/*
class rectangel {
    protected int length;
    protected int breadth;

    public void setLength(int length) {
        this.length = length;
    }
    public int getLength() {
        return length;
    }
    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }
    public int getBreadth() {
        return breadth;
    }

    public double parameter() {
        return 2 * (length + breadth);
    }
    public double area() {
        return length * breadth;
    }
}

class cuboid extends rectangel {
    private int height;

    public void setHeight(int height) {
        this.height = height;
    }
    public int getHeight() {
        return height;
    }

    public double parameter() {
        return 4 * (length + breadth + height);
    }
    public double volume() {
        return length * breadth * height;
    }
}

public class main {
    public static void main(String[] args) {
        cuboid obj = new cuboid();

        obj.setLength(14);
        obj.setBreadth(6);
        obj.setHeight(9);

        System.out.println(obj.parameter());
        System.out.println(obj.area());
        System.out.println(obj.parameter());
        System.out.println(obj.volume());
    }
} */
/******************************/



/**** Chapter 11 ****/
/**** Abstract Classes & Interfaces ****/



// Abstract Class & Abstract method


/*
abstract class parent {     // Abstract class define after abstract method
    public parent() {
        System.out.println("I'm a constructor of parent");
    }
    public void sayHello() {
        System.out.println("Hello!");
    }
    abstract public void greet();       // If using abstract method we have to define the class an abstract class too 
    abstract public void greet2();
}

class child extends parent {
    @Override
    public void greet() {
        System.out.println("Good Morning");
    }
    @Override
    public void greet2() {
        System.out.println("Good Morning");
    }
}

abstract class child2 extends parent {      // Has to declare abstract cuz not overriding greet()
    public void about() {
        System.out.println("I'm good");
    }
}

public class main {
    public static void main(String[] args) {
        // parent p = new parent();        // Cannot instantiate the parent class gives an error
        child c = new child();
        // child2 c2 = new child2();       // Error cuzz it is also an abstract class
    }
} */



// Interfaces


/*
interface bicycle {
    int a = 45;

    void applyBrake(int decrement);     // It is necessory to implement methods
    void speedUp(int increment);
}

interface hornBicycle {
    int x = 40;

    public void blowHornK3g();      // Modifier is redentend public no need to type public
    void blowHornmp3();
}

class minoCycle implements bicycle, hornBicycle {
    int x = 5;      // Not necessory to override and by this u can reassign the value in class

    void blowHorn() {
        System.out.println("Blowing horn...");
    }
    public void applyBrake(int decrement) {
        System.out.println("Applying brake...");
    }
    public void speedUp(int increment) {
        System.out.println("Speeding up...");
    }
    public void blowHornK3g() {
        System.out.println("K3g horn blowing...");
    }
    public void blowHornmp3() {
        System.out.println("Mp3 horn blowing...");
    }
}

public class main {
    public static void main(String[] args) {
        minoCycle mc = new minoCycle();
        mc.applyBrake(1);
        System.out.println(mc.a);       // You can create properties in interfaces
        // mc.a = 50;       // You cannot modify the properties in interfaces as they are final
        mc.blowHornK3g();
        mc.blowHornmp3();
        System.out.println(mc.x);
    }
} */



// Default Modifiers with Inheritgance Example of Smartphone


/*
interface camera {
    void takeSnap();
    void recordVideo();
    private void greet() {
        System.out.println("Good morning");     // Implementing class cannot use this method and also cannot use directly
    }
    default void record4kVideo() {      // Default method use so dont have to edit every time
        greet();
        System.out.println("Recording 4k viddeo...");
    }
}

interface wifi {
    String[] getNetworks();
    void connectToNetwork(String network);
}

class cellphone {
    void cellNumber(int phoneNumber) {
        System.out.println("Calling " + phoneNumber);
    }
    void pickCall(int phoneNumber) {
        System.out.println("Connecting...");
    }
}

class smartPhone extends cellphone implements wifi, camera {
    public void takeSnap() {
        System.out.println("Taking snap...");
    }
    public void recordVideo() {
        System.out.println("Recording video...");
    }
    // public void record4kVideo() {       // overrided this one will executed not the interface class one
    //     System.out.println("Taking snap and recording 4k...");
    // }
    public String[] getNetworks() {
        System.out.println("Getting list of networks...");
        String[] networkList = {"Mayank", "Minobic", "Minobot"};
        return networkList;
    }
    public void connectToNetwork(String network) {
        System.out.println("Connecting to the network " + network);
    }
}

public class main {
    public static void main(String[] args) {
        smartPhone sp = new smartPhone();

        sp.record4kVideo();
        String[] arr = sp.getNetworks();
        for (String item : arr) {
            System.out.println(item);
        }
    }
} */



// Inheritance in Interfaces


/*
interface sampleInterface {
    void meth1();
    void meth2();
}

interface childSampleInterface extends sampleInterface {
    void meth3();
    void meth4();
}

class sampleClass implements childSampleInterface {
    public void meth1() {       // You have to implement meth1 and meth 2 also if not there will be an error
        System.out.println("meth1");
    }
    public void meth2() {
        System.out.println("meth2");
    }
    public void meth3() {
        System.out.println("meth3");
    }
    public void meth4() {
        System.out.println("meth4");
    }
}

public class main {
    public static void main(String[] args) {
        sampleClass obj = new sampleClass();

        obj.meth1();
        obj.meth2();
        obj.meth3();
        obj.meth4();
    }
} */



// Polymorphism


/*
interface camera {
    void takeSnap();
    void recordVideo();
    default void record4kVideo() {
        System.out.println("Recording 4k viddeo...");
    }
}

interface wifi {
    String[] getNetworks();
    void connectToNetwork(String network);
}

class cellphone {
    void cellNumber(int phoneNumber) {
        System.out.println("Calling " + phoneNumber);
    }
    void pickCall(int phoneNumber) {
        System.out.println("Connecting...");
    }
}

class smartPhone extends cellphone implements wifi, camera {
    public void takeSnap() {
        System.out.println("Taking snap...");
    }
    public void recordVideo() {
        System.out.println("Recording video...");
    }
    public String[] getNetworks() {
        System.out.println("Getting list of networks...");
        String[] networkList = {"Mayank", "Minobic", "Minobot"};
        return networkList;
    }
    public void connectToNetwork(String network) {
        System.out.println("Connecting to the network " + network);
    }
}

public class main {
    public static void main(String[] args) {
        camera cam = new smartPhone();      // Smartphone but have be used as camera only
        
        // cam.getNetworks();      // Not allowed
        cam.record4kVideo();
    }
} */



/******************************/
// Practice Set Chapter 11


// Create abstract class pen with abstract methods write & refill


/*
abstract class pen {
    abstract void write();
    abstract void refill();
}

public class main {
    public static void main(String[] args) {

    }
} */



// Use the problem one to create a concrete class fountainPen with additional method changeNib


/*
abstract class pen {
    abstract void write();
    abstract void refill();
}

class fountainPen extends pen {
    void write() {
        System.out.println("Writting...");
    }
    void refill() {
        System.out.println("Refilling...");
    }
    void changeNib() {
        System.out.println("Changing the nib...");
    }
} 

public class main {
    public static void main(String[] args) {
        fountainPen fPen = new fountainPen();

        fPen.write();
        fPen.refill();
        fPen.changeNib();
    }
} */



// Create class Monkey with jump & bite methods create a class human which inherits monkey class & impliments basic animal interface with eat and sleep method


/*
interface basicAnimal {
    void eat();
    void sleep();
}

class monkey {
    void jump() {
        System.out.println("Jumping...");
    }
    void bite() {
        System.out.println("Biting...");
    }
}

class human extends monkey implements basicAnimal {
    void speak() {
        System.out.println("Speeking...");
    }

    @Override
    public void eat() {
        System.out.println("Eating...");
    }
    @Override
    public void sleep() {
        System.out.println("Sleeping...");
    }
}

public class main {
    public static void main(String[] args) {
        human mayank = new human();
        mayank.sleep();
    }
} */



// Create class telephone with ring, lift & diconnect methods as abstract create another class smartelephone and demostrate polymorphism


/*
class telephone {
    public void ring() {
        System.out.println("Ringing...");
    }
    public void lift() {
        System.out.println("Lifting...");
    }
    public void disconnect() {
        System.out.println("Disconnecting...");
    } 
}

class smartTelephone extends telephone{
    void ringtone() {
        System.out.println("Ringing ringtonr...");
    }
}

public class main {
    public static void main(String[] args) {
        telephone st = new smartTelephone();
        // st.ringtone();       // Error
    }
} */



// Demostrate polymorphism using monkey class from problem 3


/*
interface basicAnimal {
    void eat();
    void sleep();
}

class monkey {
    void jump() {
        System.out.println("Jumping...");
    }
    void bite() {
        System.out.println("Biting...");
    }
}

class human extends monkey implements basicAnimal {
    void speak() {
        System.out.println("Speeking...");
    }

    @Override
    public void eat() {
        System.out.println("Eating...");
    }
    @Override
    public void sleep() {
        System.out.println("Sleeping...");
    }
}

public class main {
    public static void main(String[] args) {
        monkey mayank = new human();
        // mayank.speak();       // Error
        mayank.jump();

        basicAnimal mino = new human();
        // mino.speak();         // Error
        mino.sleep();
    }
} */



// Create interface tvRemote & use it to inherit another interface smartTVRemote


/*
interface tvRemote {
    void pressButton();
}

interface smartTVRemote extends tvRemote {
    void blutooth();
}

class remote implements tvRemote, smartTVRemote{
    public void pressButton() {
        System.out.println("Pressing button...");
    }
    public void blutooth() {
        System.out.println("Blutoots on...");
    }
}

public class main {
    public static void main(String[] args) {
        remote r = new remote();
        r.blutooth();
    }
} */



// Create class tv which implements tvremote interface from problem 6


/*
interface tvRemote {
    void pressButton();
}

interface smartTVRemote extends tvRemote {
    void blutooth();
}

class tv implements tvRemote {
    public void pressButton() {
        System.out.println("Pressing button...");
    }
}

public class main {
    public static void main(String[] args) {
        tv t = new tv();
        t.pressButton();
    }
} */
/******************************/



/**** Chapter 12 ****/
/**** Packages ****/



// Creating and Using Packages
// javac -d . <filename>.java important     // For compiling the code
// java <filename> here without extension   // To execute the compiled class file code


/*
// import java.util.Scanner;
// import java.util.*;
import minobic.package1;

public class main {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        java.util.Scanner sc = new java.util.Scanner(System.in);
        package1 pk = new package1();
        System.out.println("I'm main class with mayank package");
    }
} */



// Access Modifiers
// +-----------+----------+-----------+------------+--------+
// | Modifier  |   Class  |  Package  |  Subclass  |  World |
// +-----------+----------+-----------+------------+--------+
// | Public    |    Y     |     Y     |     Y      |    Y   |
// | Protected |    Y     |     Y     |     Y      |    N   |
// | Default   |    Y     |     Y     |     N      |    N   |
// | Private   |    Y     |     N     |     N      |    N   |
// +-----------+----------+-----------+------------+--------+


/*
// class c1 {
//     public int x = 5;
//     protected int y = 45;
//     int z = 6;
//     private int a = 78;
//     public void meth1() {
//         System.out.println(x);
//         System.out.println(y);
//         System.out.println(z);
//         System.out.println(a);
//     }
// }

class using extends package1 {
    void meth2() {
        System.out.println(x);
        System.out.println(y);
        // System.out.println(z);
        // System.out.println(a); 
    }
}

public class main {
    public static void main(String[] args) {
        // package1 c = new package1();
        using u = new using();
        // c.meth1();
        u.meth2();
        // System.out.println(c.x);
        // System.out.println(c.y);
        // System.out.println(c.z);
        // System.out.println(c.a);        // Cannot use in same package
    }
} */



/******************************/
// Practice Set Chapter 12


// Create three classes calcultor, scCalculator & hyCalculator and group the into a package


/*
package calc;

class Calculator {
    public void calculate(int a, int b) {
        System.out.println("Result: " + (a + b));
    }
}

class ScCalculator {
    public void calculate(int a, int b) {
        System.out.println("Result: " + Math.sin(a + b));
    }
}

class hyCalculator {
    public void calculate(int a, int b) {
        System.out.println("Result: " + (a + b));
        System.out.println("Result: " + Math.sin(a + b));
    }
}

public class main {
    public static void main(String[] args) {
        System.out.println("Hello!");
    }
} */



// Use a built in package to writr a class which display message after taking input


/*
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        System.out.println("You give no: " + a);
    }    
} */



// Create a package in class with three package level folder1 , 2 & 3


/*
package folder.folder1.folder2;

class Calculator {
    public void calculate(int a, int b) {
        System.out.println("Result: " + (a + b));
    }
}

class ScCalculator {
    public void calculate(int a, int b) {
        System.out.println("Result: " + Math.sin(a + b));
    }
}

class hyCalculator {
    public void calculate(int a, int b) {
        System.out.println("Result: " + (a + b));
        System.out.println("Result: " + Math.sin(a + b));
    }
}

public class folderInFolder {
    public static void main(String[] args) {
        System.out.println("Hello!");
    }
} */



// Prove that we cannot acces default property but can acces protected from sub class


/*
package folder.folder1.folder2;

class Calculator {
    public void calculate(int a, int b) {
        System.out.println("Result: " + (a + b));
    }
}

public class proof {
    protected int a = 4;
    int b = 41;
    public static void main(String[] args) {
        System.out.println("Hello!");
    }
} */
/******************************/



// Code in notepad create package with individual classes for rectangele, square, circle, cylinder, sphere with using inheritance include methodes like volume, surface area and getters & setters


/*
public class main {
    public static void main(String[] args) {
        
    }
} */



/**** Chapter 13 ****/
/**** Multithreading ****/



// Creating Thread by Extending Thread Class


/*
class myThread1 extends Thread {
    @Override
    public void run() {
        int i = 0;
        while (i < 4000) {
            System.out.println("Running thread 1...");   
            i++;
        }
    }
}

class myThread2 extends Thread {
    @Override
    public void run() {
        int i = 0;
        while (i < 4000) {
            System.out.println("Running thread 2...");  
            i++; 
        }
    }
}

public class main {
    public static void main(String[] args) {
        myThread1 t1 = new myThread1();
        myThread2 t2 = new myThread2();
        
        t1.start();
        t2.start();
    }
} */



// Creating Thread by Implementing Runnable Interface


/*
class runnableThread1 implements Runnable {
    public void run() {
        int i = 0;
        while (i < 4000) {
            System.out.println("Running Thread 1...");
            i++;
        }
    }
}

class runnableThread2 implements Runnable {
    public void run() {
        int i = 0;
        while (i < 4000) {
            System.out.println("Running Thread 1...");
            i++;
        }
    }
}

public class main {
    public static void main(String[] args) {
        runnableThread1 rT1 = new runnableThread1();
        Thread t1 = new Thread(rT1);

        runnableThread2 rT2 = new runnableThread2();
        Thread t2 = new Thread(rT2);

        t1.start();
        t2.start();
    }
} */



// Life Cycle of Thread
// 1) New          -> Instance of thread created not started
// 2) Runnable     -> After invocation of start & before it selected to be run by schedular
// 3) Running      -> After thread schedular has selected it
// side) Non Runnable -> Thread alive, not eligible to run
// 5) Terminated   -> run() method has executed 



// Construcor of Thread class       // The simple Thread() and the Thread(Runnable r) we already used


/*
class myThread extends Thread {
    public myThread(String name) {
        super(name);
    }
    public void run() {
        // while (true) {
            System.out.println("I'm a thread");
        // }
    }
}

public class main {
    public static void main(String[] args) {
        myThread mt = new myThread("mayank");
        mt.start();
        System.out.println("The id of thread is: " + mt.threadId());
        System.out.println("The name of thread is: " + mt.getName());
        
        myThread mt2 = new myThread("minobic");
        mt2.start();
        System.out.println("The id of thread is: " + mt2.threadId());
        System.out.println("The name of thread is: " + mt2.getName());
    }
} */



// Thread Priorities


/*
class thread extends Thread {
    public thread(String name) {
        super(name);
    }
    public void run() {
        while (true) {
            System.out.println("started... " + this.getName());
        }
    }
}

public class main {
    public static void main(String[] args) {
        thread t1 = new thread("Mayank (Imp Thread)");
        thread t2 = new thread("Minobic");
        thread t3 = new thread("Mino");
        thread t4 = new thread("Minobot");

        t1.setPriority(thread.MAX_PRIORITY);
        t3.setPriority(thread.MIN_PRIORITY);
        t4.setPriority(thread.NORM_PRIORITY);
        t2.setPriority(thread.MIN_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
} */



// Thread Methods


/*
class thread extends Thread {
    public void run() {
        // int i = 0;
        while (true) {
            System.out.println("Hello...");
            try {
                Thread.sleep(455);      // Method 1 -> t1 will sleep for 455 millisecond
            } catch (Exception e) {
                e.printStackTrace();
            }
            // i++;
        }
    }
}

class thread2 extends Thread {
    public void run() {
        int i = 0;
        while (i < 5) {
            System.out.println("Hello 2...");
            i++;
        }
    }
}

public class main {
    public static void main(String[] args) {
        thread t1 = new thread();
        thread2 t2 = new thread2();

        t1.start();
        // try {
        //     t1.join();      // Method 2 -> t2 will not start until t1 ends
        // } catch (Exception e) {
        //     System.out.println(e);
        // }

        t2.start();
    }
} */



/******************************/
// Practice Set Chapter 13


// Program to print "Good Morning" & "Welcome" continuosly on the screen using thread


/*
class thread1 extends Thread {
    public void run() {
        while (true) {
            System.out.println("Good Morning");
        }
    }
}

class thread2 extends Thread {
    public void run() {
        while (true) {
            System.out.println("Welcome");
        }
    }
}

public class main {
    public static void main(String[] args) {
        thread1 t1 = new thread1();
        thread2 t2 = new thread2();

        t1.run();
        t2.run();
    }
} */



// Add a sleep method in welcome thread in above problem to delay its execuation for 200 ms


/*
class thread1 extends Thread {
    public void run() {
        while (true) {
            System.out.println("Good Morning");
        }
    }
}

class thread2 extends Thread {
    public void run() {
        while (true) {
            try {
                Thread.sleep(200);
            } catch (Exception e) {
                e.printStackTrace();
            }

            System.out.println("Welcome");
        }
    }
}

public class main {
    public static void main(String[] args) {
        thread1 t1 = new thread1();
        thread2 t2 = new thread2();

        t1.run();
        t2.run();
    }
} */



// Demostrate getPriority() & setPriority() methods in Thread


/*
class thread1 extends Thread {
    public void run() {
        while (true) {
            System.out.println("Good Morning");
        }
    }
}

class thread2 extends Thread {
    public void run() {
        while (true) {
            System.out.println("Welcome");
        }
    }
}

public class main {
    public static void main(String[] args) {
        thread1 t1 = new thread1();
        thread2 t2 = new thread2();

        t1.setPriority(5);
        t2.setPriority(15);

        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());

        t1.run();
        t2.run();
    }
} */



// How do we get state of a given thread


/*
class thread1 extends Thread {
    public void run() {
        while (true) {
            System.out.println("Good Morning");
        }
    }
}

class thread2 extends Thread {
    public void run() {
        // while (true) {
            System.out.println("Welcome");
        // }
    }
}

public class main {
    public static void main(String[] args) {
        thread1 t1 = new thread1();
        thread2 t2 = new thread2();

        System.out.println(t2.getState());      // First state will be NEW

        // t1.run();
        t2.run();

        System.out.println(t2.getState());      // then state will be RUNNABLE
    }
} */



// How do we get refrence to the current thread


/*
class thread1 extends Thread {
    public void run() {
        while (true) {
            System.out.println("Good Morning");
        }
    }
}

class thread2 extends Thread {
    public void run() {
        // while (true) {
            System.out.println("Welcome");
        // }
    }
}

public class main {
    public static void main(String[] args) {
        thread1 t1 = new thread1();
        thread2 t2 = new thread2();

        // t1.run();
        t2.run();

        System.out.println(Thread.currentThread().getState());      // Prints the data about current thread
    }
} */
/******************************/



/**** Chapter 14 ****/
/**** Errors & Exceptions ****/



// Types of Errors
// 1) Syntax Error
// 2) Logical Error
// 3) Runtime Error



// Types of Exceptions
// 1) Checked Exception     -> Compile time exception(Handeled by compiler)
// 2) Unchecked Exception   -> Runtime Exception



// Try Catch Block


/*
public class main {
    public static void main(String[] args) {
        int a = 600;
        int b = 0;

        try {
            int c = a / b;
            System.out.println("The result is: " + c);
        } catch (Exception e) {
            System.out.println("We failed to devide reason:");
            System.out.println(e);
        }

        System.out.println("End of program");
    }
} */



// Handling Specific Exception


/*
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] marks = new int[3];
        marks[0] = 1;
        marks[1] = 56;
        marks[2] = 5;

        System.out.println("Enter the array index:");
        int ind = sc.nextInt();

        System.out.println("Enter the num u want to divide with:");
        int num = sc.nextInt();
        try {
            System.out.println("The value at array index entered is: " + marks[ind]);
            System.out.println("The value of divide is: " + marks[ind] / num);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Error Occured!");
            System.out.println("Reason: " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Error Occured!");
            System.out.println("Reason: " + e);
        } catch (Exception e) {
            System.out.println("Other Error Occured!");
            System.out.println("Reason: " + e);
        }
    }
} */



// Nested try catch


/*
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] marks = new int[3];
        marks[0] = 1;
        marks[1] = 56;
        marks[2] = 5;

        System.out.println("Enter the array index:");
        int ind = sc.nextInt();

        System.out.println("Enter the num u want to divide with:");
        int num = sc.nextInt();
        try {
            System.out.println("Welcome!");
            try {
                System.out.println(marks[ind]);
            } catch (Exception e) {
                System.out.println("Sorry this index does not exist");
                System.out.println("Exception in level 2");
            }
        } catch (Exception e) {
            System.out.println("Exception in level 1");
        }
    }
} */



// Program to create accesing array until valid index is given


/*
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] marks = new int[3];
        marks[0] = 1;
        marks[1] = 56;
        marks[2] = 5;

        boolean a = true;
        int num;

        while (a) {
            System.out.println("Enter a num: ");
            num = sc.nextInt();

            try {
                System.out.println("Index on provided num is: " + marks[num]);
                a = false;
            } catch (Exception e) {
                System.out.println("Error occured: " + e);
            }
        }
    }
} */



// Exceptin Class


/*
import java.util.Scanner;

class customException extends Exception {
    @Override
    public String toString() {
        return /*super.toString() +* / "I'm toString()";
    }
    @Override
    public String getMessage() {
        return /*super.getMessage() +* / "I am getMessage()";
    }
}

class ageException extends Exception {
    @Override
    public String toString() {
        return  "Age cannot be greater than 125";
    }
    @Override
    public String getMessage() {
        return "Make sure the age is entered correctly";
    }
}

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;

        a = sc.nextInt();
        if (a < 99) {
            try {
                throw new customException();
                // throw new ArithmeticException("This is an exception");
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                System.out.println(e);      // toStrinfg will run
                e.printStackTrace();
            }
        }
    }
} */



// Throw Keyword


/*
class dimensionException extends Exception {
    @Override
    public String toString() {
        return  "Dimension cannot be negative or zero";
    }
    @Override
    public String getMessage() {
        return "Make sure the dimension is entered correctly";
    }
}

public class main {
    public static double area(int r) throws dimensionException{
        if (r <= 0) {
            throw new dimensionException();
        }
        double result = Math.PI * r * r;
        return result;
    }

    public static int divide(int a, int b) throws ArithmeticException{
        int result = a / b;
        return result;
    }

    public static void main(String[] args) {
        try {
            int c = divide(6, 0);
                System.out.println(c);
        } catch (Exception e) {
            System.out.println("Exception");
        }

        try {
            double ar = area(1);
            System.out.println(ar);
        } catch (dimensionException e) {
            System.out.println("Exception");
        }
    }
} */



// Finally Block


/*
public class main {
    public static int greet() {
        try {
            int a = 5;
            int b = 10;
            int c = a / b;
            return c;
        } catch (Exception e) {
            System.out.println(e);
        }

        finally {
            System.out.println("This is the end of this function");
        }
        return -1;
    }
    
    public static void main(String[] args) {
        int k = greet();
        System.out.println(k);

        int a = 7;
        int b = 4;

        while (true) {
            try {
                System.out.println(a / b);
            } catch (Exception e) {
                System.out.println(e);
                break;
            }

            finally {
                System.out.println("I'm finally b = " + b);
            }
            b--;
        }

        try {
            System.out.println(5/0);
        }       // Error without catch but use finally to overcome it
        finally {
            System.out.println("Yes this is finally");
        }
    }
} */



/******************************/
// Practice Set Chapter 14


// Program to demostrate syntax, logical & runtime errors


/*
public class main {
    public static void main(String[] args) {
        // int a = 8                // Syntax error

        int age = 78;
        int born_year = 2000-78;    // Logical errors

        System.out.println(7 / 0);
    }
} */



// Program that prints "Haha" during arithmetic exception and "Hehe" during illegal argument exception


/*
public class main {
    public static void main(String[] args) {
        try {
            int a = 2, b = 0;
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            System.out.println("Haha");
        } catch (IllegalArgumentException e) {
            System.out.println("Hehe");
        }
    }
} */



// Program that allows to keep assuming an arry until valid index is given if max retries exceed 5 print "Error"


/*
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] marks = new int[3];
        marks[0] = 1;
        marks[1] = 56;
        marks[2] = 5;

        boolean a = true;
        int index;
        int i = 0;

        while (a && i < 5) {
            System.out.println("Enter a index: ");
            index = sc.nextInt();

            try {
                System.out.println("The value of marks[index] is: " + marks[index]);
                break;
            } catch (Exception e) {
                System.out.println("Error! Please enter a valid index");
                i++;
            }
        }

        if (i >= 5) {
            System.out.println("Error!");
        }
    }
} */



// Modify problem 3 to throw a custom exception if max retries are reached


/*
import java.util.Scanner;

class maxException extends Exception {
    @Override
    public String toString() {
    return "You only have 5 attempts";
    }
    @Override
    public String getMessage() {
        return "Max attempts reached";
    }
}

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] marks = new int[3];
        marks[0] = 1;
        marks[1] = 56;
        marks[2] = 5;

        boolean a = true;
        int index;
        int i = 0;

        while (a && i < 5) {
            System.out.println("Enter a index: ");
            index = sc.nextInt();

            try {
                System.out.println("The value of marks[index] is: " + marks[index]);
                break;
            } catch (Exception e) {
                System.out.println("Error! Please enter a valid index");
                i++;
            }
        }

        if (i >= 5) {
            try {
                throw new maxException();
            } catch (maxException e) {
                System.out.println(e.getMessage());
            }
        }
    }
} */



// In problem 3 inside a method which throws your custom exception


/*
import java.util.Scanner;

class maxException extends Exception {
    @Override
    public String toString() {
    return "You only have 5 attempts";
    }
    @Override
    public String getMessage() {
        return "Max attempts reached";
    }
}

public class main {
    public static void customExceptionMethod() throws maxException{
        Scanner sc = new Scanner(System.in);
        int [] marks = new int[3];
        marks[0] = 1;
        marks[1] = 56;
        marks[2] = 5;

        boolean a = true;
        int index;
        int i = 0;

        while (a && i < 5) {
            System.out.println("Enter a index: ");
            index = sc.nextInt();

            try {
                System.out.println("The value of marks[index] is: " + marks[index]);
                break;
            } catch (Exception e) {
                System.out.println("Error! Please enter a valid index");
                i++;
            }
        }

        if (i >= 5) {
            try {
                throw new maxException();
            } catch (maxException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        try {
            customExceptionMethod();
        } catch (maxException e) {
            e.printStackTrace();
        }   
    }
} */
/******************************/



// Custom Calculator which throws Exceptions


/*
class invaldInputException extends Exception {
    @Override
    public String toString() {
        return "Error: Enter a valid number 8 & 9 are not accepted";
    }
}

class notDivideZeroException extends Exception {
    @Override
    public String toString() {
        return "Error: Cannot divide by 0";
    }
}

class maxNum extends Exception {
    @Override
    public String toString() {
        return "Error: Max input limit reached(100000)";
    }
}

class maxMulti extends Exception {
    @Override
    public String toString() {
        return "Error: Max multiplication input limit reached(7000)";
    }
}

class customCalculator {
    double addition(double a, double b) throws invaldInputException, maxNum {
        if(a > 100000 || b > 100000) {
            throw new maxNum();
        }
        if (a == 8 || b == 9) {
            throw new invaldInputException();
        }
        return a + b;
    }

    double subtraction(double a, double b) throws maxNum {
        if(a > 100000 || b > 100000) {
            throw new maxNum();
        }
        return a - b;
    }

    double multiplication(double a, double b) throws maxMulti {
        if(a > 7000 || b > 7000) {
            throw new maxMulti();
        }
        return a * b;
    }

    double divison(double a, double b) throws notDivideZeroException, maxNum {
        if(a > 100000 || b > 100000) {
            throw new maxNum();
        }
        if (b == 0) {
            throw new notDivideZeroException();
        }
        return a / b;
    }
}

public class main {
    public static void main(String[] args) throws invaldInputException, notDivideZeroException, maxNum, maxMulti {
        customCalculator c = new customCalculator();

        System.out.println(c.addition(5, 4));
        System.out.println(c.subtraction(5, 4));
        System.out.println(c.multiplication(5, 4));
        System.out.println(c.divison(5, 5));
    }
} */



/**** Chapter 15 ****/      // Advance Java
/**** Collection Framework ****/



// ArrayList


/*
import java.util.*;

public class main {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>(5);
        l2.add(15);
        l2.add(25);
        l2.add(48);

        l1.add(6);
        l1.add(4);
        l1.add(5);
        l1.add(0, 2);
        l1.add(0, 5);      // This will shift the 2 to the second
        l1.addAll(l2);

        // l1.clear();      // Clears the whole array

        System.out.println(l1.contains(7));
        System.out.println(l1.indexOf(5));      // If not exist print -1 and if there are same numbers in array prints the one which occur first
        System.out.println(l1.lastIndexOf(5));

        l1.set(0, 6);

        System.out.println(l1.hashCode());
        System.out.println(l1.iterator());;

        for (int i = 0; i < l1.size(); i++) {
            System.out.print(l1.get(i));
            System.out.print(", ");
        }
    }
} */



// Linked List


/*
import java.util.*;

public class main {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        LinkedList<Integer> l2 = new LinkedList<>();
        l2.add(15);
        l2.add(25);
        l2.add(48);

        l1.add(6);
        l1.add(4);
        l1.add(5);
        l1.add(0, 2);
        l1.add(0, 5);      // This will shift the 2 to the second
        l1.addAll(l2);
        l1.addFirst(1);
        l1.addLast(1);

        l1.set(5, 456);

        // l1.clear();      // Clears the whole array

        System.out.println(l1.contains(7));
        System.out.println(l1.indexOf(5));      // If not exist print -1 and if there are same numbers in array prints the one which occur first
        System.out.println(l1.lastIndexOf(5));

        // l1.set(0, 6);

        System.out.println(l1.hashCode());
        System.out.println(l1.iterator());;

        for (int i = 0; i < l1.size(); i++) {
            System.out.print(l1.get(i));
            System.out.print(", ");
        }
    }
} */



// Array Deque


/*
public class main {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad1 = new ArrayDeque<>();
        ad1.add(6);
        ad1.add(56);
        ad1.add(9);
        ad1.addFirst(5);

        System.out.println(ad1.getFirst());
        System.out.println(ad1.getLast());
    }
} */



// Hashing Technique        // Technique to convert range of kye value into range of indices
// 1) Hash Set
// 2) Hash Map
// 3) Hash Table



// Hash Set


/*
import java.util.HashSet;

public class main {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>(6, 0.5f);      // Initial capicity will be of 16 and load factor 0.75
        hs.add(5);
        hs.add(2);
        hs.add(8);
        hs.add(3);
        hs.add(3);

        System.out.println(hs);
    }
} */



// Date & Time in java      // Java assumes start time as 1900 but it holds the milisecond since 1 jan 1970


/*
public class main {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis()/1000/3600/24/365);        // First we got seconds then minute then day then year
        System.out.println("Mili Seconds passed till now:" + System.currentTimeMillis());      
        System.out.println("Seconds passed till now:" + System.currentTimeMillis()/1000);
        System.out.println("Days passed till now:" + System.currentTimeMillis()/1000/3600/24);
        System.out.println("Years passed till now:" + System.currentTimeMillis()/1000/3600/24/365);
    }
} */



// Is it safe toi= store the no. in ms in variable long


/*
public class main {
    public static void main(String[] args) {
        System.out.println(Long.MAX_VALUE);
        System.out.println(System.currentTimeMillis());
    }
} */



// Date Class


/*
import java.util.Date;

public class main{
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(d);
        System.out.println(d.getTime());
        System.out.println(d.getDate());
        System.out.println(d.getSeconds());
        System.out.println(d.getYear());        // Gives date bye subtracting 1900
    }
} */



// Calender Class       // It is an abstract class


/*
import java.util.Calendar;
import java.util.TimeZone;

public class main {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c.getCalendarType());
        System.out.println(c.getTimeZone());

        Calendar c2 = Calendar.getInstance(TimeZone.getTimeZone("Asia/Singapore"));
        System.out.println(c2.getCalendarType());
        System.out.println(c2.getTimeZone());
        System.out.println(c2.getTimeZone().getID());
    }
} */



// Gregorian Calender Class


/*
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class main {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c.getTimeZone());
        System.out.println(c.get(Calendar.DATE));
        System.out.println(c.get(Calendar.SECOND));
        System.out.println(c.get(Calendar.HOUR));
        System.out.println(c.get(Calendar.HOUR_OF_DAY) + ":" + c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND));

        GregorianCalendar gc = new GregorianCalendar();
        System.out.println(gc.isLeapYear(2023));

        for (int i = 0; i < 10; i++) {
            System.out.println(TimeZone.getAvailableIDs()[i]);
        }
    }
} */



// Java Time API


/*
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class main {
    public static void main(String[] args) {
        LocalDate d = LocalDate.now();
        System.out.println(d);

        LocalTime t = LocalTime.now();
        System.out.println(t);

        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);
    }
} */



// Date Time Formatter


/*
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class main {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.now();     // This is a date
        System.out.println(dt);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy - E - H:h a");      // This is a formate
        DateTimeFormatter dtf2 = DateTimeFormatter.ISO_LOCAL_DATE;

        String myDate = dt.format(dtf);     // Using formatter to make date string
        String myDate2 = dt.format(dtf2);
        System.out.println(myDate);
        System.out.println(myDate2);
    }
} */



/******************************/
// Practice Set Chapter 15


// Make array list and store name of 10 students


/*
import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        ArrayList<String> arl = new ArrayList<>();

        arl.add("Student 1");
        arl.add("Student 2");
        arl.add("Student 3");
        arl.add("Student 4");
        arl.add("Student 5");
        arl.add("Student 6");
        arl.add("Student 7");
        arl.add("Student 8");
        arl.add("Student 9");
        arl.add("Student 10");

        for (Object o : arl) {
            System.out.println(o);
        }
    }
} */



// Use the date class to print time in following order 11:47:02


/*
import java.util.Date;

public class main {
    public static void main(String[] args) {
        Date d = new Date();

        System.out.println(d.getHours() + ":" + d.getMinutes() + ":" + d.getSeconds());
    }
} */



// Reapeat problem 2 using calendar class


/*
import java.util.Calendar;

public class main {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();

        System.out.println(c.get(Calendar.HOUR_OF_DAY) + ":" + c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND));
    }
} */



// Repeat problem 2 using time API


/*
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class main {
    public static void main(String[] args) {
        LocalTime lt = LocalTime.now();

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("H:m:s");
        String customTime = lt.format(dtf);

        System.out.println(customTime);
    }
} */



// Create set and try to store duplicate elements in set and verify that only one instance is stored


/*
import java.util.HashSet;

public class main {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();

        hs.add(9);
        hs.add(1);
        hs.add(5);
        hs.add(8);
        hs.add(7);
        hs.add(2);
        hs.add(5); 

        System.out.println(hs);
    }
} */
/******************************/



// Advance Library System


/*
import java.util.ArrayList;

class Book {
    public String name, author;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    @Override
    public String toString() {
        return "\nBook{" + "name = '" + name + '\'' + ", author = '" + author + '\'' + "}";
    }
}

class library {
    public ArrayList<Book> books;

    public library(ArrayList<Book> books) {
        this.books = books;
    }

    public void addBook(Book book) {
        System.out.println("Book '" + book + "' has been added sucessfully!");
        this.books.add(book);
    }

    public void issueBook(Book book, String issued_to) {
        System.out.println("Book '" + book + "' has been issued sucessfully issued to " + issued_to);
        this.books.remove(book);
    }

    public void returnBook(Book b) {
        System.out.println("Book '" + b + "' has been returnd sucessfully!");
        this.books.add(b);
    }
}

public class main {
    public static void main(String[] args) {
        ArrayList<Book> bk = new ArrayList<>();

        Book b1 = new Book("School of Magic","Minobic");
        bk.add(b1);
        Book b2 = new Book("The Legendry Survivor","MinoBot");
        bk.add(b2);
        Book b3 = new Book("My Vampire System","Mino");
        bk.add(b3);

        library l = new library(bk);
        l.addBook(new Book("New", "unknown"));

        System.out.println(l.books);

        l.issueBook(b3, "Mayank");
    }
} */



/**** Chapter 16 ****/
/**** Advance Java 2 ****/



// Java Docs Generator
// javadoc file name.java -protected -splitindex -d .\file location



// Tags for Class, Method & Package


/*
// Class Tags
/**
 * This class is to demostrate java doc and it's woking
 * @author Mayank (Minobic)
 * @version 0.1
 * @see <a href="https://docs.oracle.com/en/java/javase/14/docs/api/index.html"></a>Java Docs 
 * @since 2023
 * /

public class main {
    /**
     * This is adding method
     * @param i This is the first number to add
     * @param j This is the second number to add
     * @return Sum of two numbers as an interger
     * @throws Exception If i is 0
     * @deprecated This method is deprecatede please use + operator
     * /
    public int add(int i, int j) throws Exception {
        if (i == 0) {
            throw new Exception();
        }
        int c;
        c = i + j;
        return c;
    }

    /**
     * 
     * @param args Thease are arguments supplied to command line
     * /
    public static void main(String[] args) {
        System.out.println("This is main method");
    }
} */



// Annotations


/*
@FunctionalInterface        // Allows only one method in interface class
interface functionInterface {
    void method1();
    // void method2();      // Produces an error
}

class phone {
    public void showTime() {
        System.out.println("Time is 11:10 pm");
    }
}

class newPhone extends phone {
    @Override
    public void showTime() {
        System.out.println("Time is 11:13 pm");
    }
    @Deprecated     // Mark the method as deprecated
    public int sum(int a, int b) {
        return a + b;
    }
}

public class main {
    @SuppressWarnings( "deprecation" )      // Supress the error and remove the warning from the output
    public static void main(String[] args) {
        newPhone phone = new newPhone();
        phone.showTime();
        System.out.println(phone.sum(5, 6));
    }
} */



// Anonymous Class


/*
interface demoAno {
    void meth1();
    void meth2();
}

class anoDemo implements demoAno{
    public void display() {
        System.out.println("Hello!");
    }

    @Override
    public void meth1() {
        System.out.println("I'm meth 1");
    }

    @Override
    public void meth2() {
        System.out.println("I'm meth 2");
    }
}        

public class main {
    public static void main(String[] args) {
        anoDemo obj = new anoDemo();
        obj.meth1();

        demoAno obj2 = new demoAno() {      // Do's the same thing without making a whole new class
            @Override
            public void meth1() {
                System.out.println("I am meth 1");
            }
            
            @Override
            public void meth2() {
                System.out.println("I am meth 2");
            }
        };
        obj2.meth1();
    }
} */



// Lambda Expression


/*
interface demoAno {
    void meth1(int a);
}

class lambdaDemo implements demoAno {
    @Override
    public void meth1(int a) {
        System.out.println("This is method 1");
    }
}

public class main {
    public static void main(String[] args) {
        demoAno obj = new lambdaDemo();
        obj.meth1(5);

        demoAno obj2 = (a)->{
            System.out.printf("This is method 1 " + a);
        };
        obj2.meth1(6);
    }
} */



// Java Generics


/*
class newGenerics<T1, T2> {
    int val;
    private T1 t1;
    private T2 t2;

    public newGenerics(int val, T1 t1, T2 t2) {
        this.val = val;
        this.t1 = t1;
        this.t2 = t2;
    }

    public void setVal(int val) {
        this.val = val;
    }
    public int getVal() {
        return val;
    }

    public void setT1(T1 t1) {
        this.t1 = t1;
    }
    public T1 getT1() {
        return t1;
    }

    public void setT2(T2 t2) {
        this.t2 = t2;
    }
    public T2 getT2() {
        return t2;
    }
}

public class main {
    public static void main(String[] args) {
        // ArrayList<Integer> arrayList = new ArrayList<>();
        // // ArrayList<int> arrayList = new ArrayList<>();        // Produces an error
        // // arrayList.add("str1");
        // arrayList.add(54);
        // arrayList.add(643);
        // // arrayList.add(new java.util.Scanner(System.in));

        // int a = /* (int) * / arrayList.get(2);
        // System.out.println(a);

        newGenerics<String, Character> g1 = new newGenerics(40, "My String is string", '*');
        String str = g1.getT1();
        char ch = g1.getT2();
        System.out.println(str + ch);
    }
} */



// File Handling in Java


/*
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.net.Socket;

public class main {
    public static void main(String[] args) {
        // Code to create new file
        /*
        File myFile = new File("test.txt");
        try {
            myFile.createNewFile();
        } catch (IOException e) {
            System.out.println("Unable to create this file");
            e.printStackTrace();
        }

        // Code to write to a file
        try {
            FileWriter fileWriter = new FileWriter("test.txt");
            fileWriter.write("This is the first file written from this java course\nBye!");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Code to read from a file
        File myFile = new File("test.txt");
        try {
            Scanner sc = new Scanner(myFile);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        // Code to delete a file
        File myFile = new File("test2.txt");
        if (myFile.delete()) {
            System.out.println("File " + myFile.getName() + " is deleted sucessfully");
        } else {
            System.out.println("Error occured while deleting the file");
        } * /
    }
} */



/******************************/
// Practice Set Chapter 16


// Create javadoc from program using and without using pre defined setting for generation
// Output in file Java-Docs



// Create a class & add method with deprecated annotation & what's it's effect on execution


/*
class depClass {
    @Deprecated
    void meth1() {
        System.out.println("I am method 1");
    }
}

public class main {
    public static void main(String[] args) {
        depClass dc = new depClass();
        dc.meth1();
    }
} */



// Suppress the generated warnings in problem 2


/*
class depClass {
    @Deprecated
    void meth1() {
        System.out.println("I am method 1");
    }
}

public class main {
    @SuppressWarnings ( "deprecation" )
    public static void main(String[] args) {
        depClass dc = new depClass();
        dc.meth1();
    }
} */



// Create an interface and generate an instance from it


/*
interface I {
    public void meth1();
}

public class main {
    public static void main(String[] args) {
        I i = () -> System.out.println("Hello!");
        i.meth1();
    }
} */



// Program to generate multiplication table of a given number & write it ti a file


/*
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc1.nextInt();
        String table = "";
        for (int i = 1; i <= 10; i++) {
            table += i + " x " + a + " = " + i * a;
            table += "\n";
        }

        File file = new File("Multiplication Table.txt");
        
        try {
            file.createNewFile();
            System.out.println("File created sucessfully!");
        } catch (IOException e) {
            System.out.println("Unable to create this file");
            e.printStackTrace();
        }

        try {
            FileWriter fileWriter = new FileWriter("Multiplication Table.txt");
            fileWriter.write(table);
            System.out.println("File writen sucessfully!");
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("Error while writing the file");
            e.printStackTrace();
        }

        try {
            Scanner sc2 = new Scanner(file);
            while (sc2.hasNextLine()) {
                String line = sc2.nextLine();
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error while reading the file");
            e.printStackTrace();
        }
    }
} */



// Generate table from 2 - 9 and save all file to folder


/*
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);

        for (int j = 2; j <= 9; j++) {
            for (int i = 1; i <= 10; i++) {
                String table = i + " x " + j + " = " + i * j + "\n";
                File file = new File("./Tables/Multiplication Table" + j + ".txt");

                try {
                    file.createNewFile();
                    System.out.println("File created successfully!");
                } catch (IOException e) {
                    System.out.println("Unable to create this file");
                    e.printStackTrace();
                }

                try {
                    FileWriter fileWriter = new FileWriter(file, true); // Use true to append to the file
                    fileWriter.write(table);
                    System.out.println("File written successfully!");
                    fileWriter.close();
                } catch (IOException e) {
                    System.out.println("Error while writing the file");
                    e.printStackTrace();
                }

                try {
                    Scanner sc2 = new Scanner(file);
                    while (sc2.hasNextLine()) {
                        String line = sc2.nextLine();
                        System.out.println(line);
                    }
                } catch (FileNotFoundException e) {
                    System.out.println("Error while reading the file");
                    e.printStackTrace();
                }
            }
        }
    }
} */
/******************************/