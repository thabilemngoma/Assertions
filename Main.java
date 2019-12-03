import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Choose what you'd like to do by number");
        System.out.println("1. Convert Letters to Morse");
        System.out.println("2. Convert Morse to Letters");
        int option = scan.nextByte();
        invoker(option);
    }
    public static void invoker(int option){
        switch (option){
            case 1:
                Scanner scan2 = new Scanner(System.in);
                System.out.println("Enter letters or words you'd like to convert to morse");
                String letters = scan2.nextLine();
                String result0 = MorseCodeConverter.lettersToMorseCode(letters);
                assert letters.length() == result0.split(" ").length: "pass";
                System.out.println(result0);
                break;
            case 2:
                Scanner scan3 = new Scanner(System.in);
                System.out.println("Enter the morse code you'd like to convert to letters/words");
                System.out.println("NOTE: use '/' for spacing");
                String morse = scan3.nextLine();
                String result = MorseCodeConverter.morseCodeToLetters(morse);
                assert morse.split(" ").length == result.length(): "pass";
                System.out.println(result);
                break;
            default:
                System.out.println("Oops!! that's an invalid entry, please re-run & choose a valid option");
                break;
        }
    }
}

