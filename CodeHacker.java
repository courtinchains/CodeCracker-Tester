// code determining how easy it would be for hackers to crack your password
// strong passwords = 12+ characters, uppercase, lowercase, numbers and special characters
import java.util.Scanner;

public class CodeHacker {

    public static void main(String[] args) {
        int password_length = 12; // according to microsoft, minimum length of password for a strong password is 12 characters +
        // creating variables and initialising them
        int upChars = 0;
        int lowChars = 0;
        int nums = 0;
        int spe_char = 0;
        char ch;

        System.out.println("Cyber criminals are getting smarter and smarter, be sure you're protected!");
        System.out.println("This programme will determine how long it would take hackers to crack your password");

        System.out.println("Please enter your password:");
        Scanner scan = new Scanner(System.in);
        String userInput;
        userInput = scan.nextLine(); // scanning in user input

       if(userInput.length() < password_length){ // if password length is under 12 characters, it's automatically too short and hence unsafe
           System.out.println("Time taken to crack your password: SECONDS TO MINUTES (password needs to be at least 12 characters long)");}
       else{ // if password long enough the real determination can begin
           for(int i =0; i< userInput.length(); i++){ // cycles through the user's password
               ch = userInput.charAt(i);
               if(Character.isUpperCase(ch)){ // if uppercase characters are present upChars are counted
                   upChars++;
               }
               else if(Character.isLowerCase(ch)){ // if lowercase characters are present lowChars are counted
                   lowChars++;
               }
               else if(Character.isDigit(ch)){ // if there are numbers present nums are counted
                   nums++;
               }
               else{
                   if(ch == '<'|| ch == '>'){ // > and < are invalid special characters and hence cannot be used in passwords
                       System.out.println("Your password is invalid");
                   } else {
                       spe_char++; // any other special character is counted in spec_char
                   }}}
       }
    if(upChars!=0 && lowChars!=0 && nums!=0 && spe_char!=0){ // if all requirements for strong password is reached
        if(userInput.length() >= password_length){ // 12 + characters, special characters, upper and lower case, and numbers
            System.out.println("Time taken to crack your password: YEARS TO CENTURIES");
        }
        else{
            System.out.println("Time taken to crack your password: WEEKS TO YEARS"); // if all requirements except the length of password is reached
        }}
    else{
        if(upChars == 0 && spe_char == 0 && lowChars == 0 && userInput.length() >= password_length){ // password with only numbers and 12+ characters
            System.out.println("Time taken to crack your password: SECONDS TO MINUTES");
        }
        else if(upChars == 0 && spe_char == 0 && userInput.length() >= password_length){ // password with numbers, lowercase and 12+ characters
            System.out.println("Time taken to crack your password: SECONDS TO DAYS");
        }
        else if(spe_char ==0 && userInput.length()>= password_length){ // password with numbers, lower and upper case and 12+ characters
            System.out.println("Time taken to crack your password: DAYS TO YEARS");
        }
    }
    }
}