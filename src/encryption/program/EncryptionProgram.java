package encryption.program;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class EncryptionProgram {
    private Scanner scanner;
    private Random random;
    private ArrayList<Character>List;
    private ArrayList<Character>shuffledList;
    private char character;
    private String line;
    private char[] letters;
    private char[] secretLetters;

    public EncryptionProgram(){
        scanner=new Scanner(System.in);
        random=new Random();
        List=new ArrayList<Character>();
        shuffledList=new ArrayList<Character>();
        character=' ';

        newKey();
        askQuestion();
    }
    private void askQuestion(){
        while(true){
            System.out.println("*****************************************************");
            System.out.println("What do you want to do?");
            System.out.println("(N)ewKey, (G)etKey, (E)ncrypt, (D)ecrypt, (Q)uit");
            char response=Character.toUpperCase(scanner.nextLine().charAt(0));

            switch(response){
                case 'N':
                    newKey();
                    break;
                case 'G':
                    getKey();
                    break;
                case 'E':
                    encrypt();
                    break;
                case 'D':
                    decrypt();
                    break;
                case 'q':
                    quit();
                    break;
                default:
                    System.out.println("Not a valid answer :(");
            }
        }
    }
    private void newKey(){

    }
    private void getKey(){

    }
    private void encrypt(){

    }
    private void decrypt(){

    }
    private void quit(){

    }
}
