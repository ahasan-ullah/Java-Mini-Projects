package encryption.program;
import java.util.*;

public class EncryptionProgram {

    private Scanner scanner;
    private ArrayList<Character> list,shuffledList;
    private char character;
    private String line;
    private char[] letters;

    EncryptionProgram(){
        scanner=new Scanner(System.in);
        list=new ArrayList<>();
        shuffledList=new ArrayList<>();
        character=' ';

        newKey();
        askQuestion();
    }

    public void askQuestion(){
        while(true){
            System.out.println("*************************");
            System.out.println("What do you want to do");
            System.out.println("(N)ewKey,(G)etKey,(E)ncrypt,(D)ecrypt,(Q)uit");
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
                case 'Q':
                    quit();
                    break;
                default:
                    System.out.println("Not a valid key");
            }
        }
    }

    public void newKey(){
        character=' ';
        list.clear();
        shuffledList.clear();

        for(int i=32;i<127;i++){
            list.add(Character.valueOf(character));
            character++;
        }
        shuffledList= new ArrayList<>(list);
        Collections.shuffle(shuffledList);
        System.out.println("A new key has been generated");
    }

    public void getKey(){
        System.out.println("Key: ");
        for(Character x: list){
            System.out.print(x);
        }
        System.out.println();
        for(Character x: shuffledList){
            System.out.print(x);
        }
        System.out.println();
    }

    public void encrypt(){
        System.out.println("Enter a message to be encrypted");
        String msg=scanner.nextLine();

        letters=msg.toCharArray();

        for(int i=0;i<letters.length;i++){
            for(int j=0;j<list.size();j++){
                if(letters[i]==list.get(j)){
                    letters[i]=shuffledList.get(j);
                    break;
                }
            }
        }
        System.out.println("Encrypted ");
        for(char x:letters){
            System.out.print(x);
        }
        System.out.println();
    }
    public void decrypt(){
        System.out.println("Enter a message to be decrypted");
        String msg=scanner.nextLine();

        letters=msg.toCharArray();

        for(int i=0;i<letters.length;i++){
            for(int j=0;j<shuffledList.size();j++){
                if(letters[i]==shuffledList.get(j)){
                    letters[i]=list.get(j);
                    break;
                }
            }
        }
        System.out.println("Decrypted ");
        for(char x:letters){
            System.out.print(x);
        }
        System.out.println();
    }

    public void quit(){
        System.out.println("Thank you");
        System.exit(0);
    }
}
