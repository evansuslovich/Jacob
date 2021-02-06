import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class Word{ 
    
    public Word(){
        Scanner scanner = new Scanner(System.in); 
        Random random = new Random(); 

        System.out.println("Enter any word");  // enter the word 
        String word = scanner.nextLine();  // takes the word
        int length = word.length(); // the length of the word 

        String[] chars = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x", "y","z"}; // array of all characters
        boolean bool = false; // keeps the program running 
        String newWord = ""; // this makes the new word 
        int counter = 0;  // counter for how many times there is a new configuration



        ArrayList<String> usedLetters = new ArrayList<String>(); // Create an ArrayList object 

        while(bool == false){
            newWord = ""; 
            usedLetters.clear(); 
            counter++;

            
            for(int i = 0; i < length; i++){
                newWord += chars[random.nextInt(26)]; 
                usedLetters.add(chars[random.nextInt(26)]); 
            }

            if(newWord.equals(word)){
                bool = true;
            }
        }

        System.out.println(newWord); 
        System.out.println(counter);
        scanner.close(); 

    }

    
    public static void main(String[] args){
        new Word(); 
    }
}