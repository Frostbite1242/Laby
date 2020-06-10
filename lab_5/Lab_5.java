package lab_5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter text:\n");
        String inputText = scan.nextLine();
        text mainText = new text(inputText);
        String mychar = scan.nextLine();
        System.out.println("Enter char");
        ArrayList<String> golos = new ArrayList<>(List.of(mychar));
        word[] wordsToSort = new word[(inputText.split(" ")).length];
        word[] tempWords = new word[(inputText.split(" ")).length];
        int k = 0;
        for (int i = 0; i < mainText.resultText.length; i++) {
            for (int j = 0; j < mainText.resultText[i].resultSentence.length; j++) {
                if (mainText.resultText[i].resultSentence[j].letters.length > 1) {
                    if (golos.contains(String.valueOf(mainText.resultText[i].resultSentence[j].letters[0]))) {
                        wordsToSort[k] = mainText.resultText[i].resultSentence[j];
                        tempWords[k] = mainText.resultText[i].resultSentence[j];
                        k += 1;
                    }
                }
            }
        }

        char[] sortLetters = new char[wordsToSort.length];
        for (int i=0; i<k;i++){
            sortLetters[i] = wordsToSort[i].letters[1];
        }
        int n=0;
        Arrays.sort(sortLetters);
        for (char sortLetter : sortLetters) {
            for (int j = 0; j < k; j++) {
                if (sortLetter == tempWords[j].letters[1]) {
                    wordsToSort[n] = tempWords[j];
                    tempWords[j] = new word("11");
                    n += 1;
                    break;
                }
            }
        }
        StringBuilder result = new StringBuilder();
        for(int i=0; i<k;i++){
            for(int j=0; j<wordsToSort[i].letters.length;j++){
                result.append(wordsToSort[i].letters[j]);
            }
            result.append(" ");
        }
        System.out.print(result);
    }
}