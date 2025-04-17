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
