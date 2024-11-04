package task2;

public class TextData {
    private String fileName;
    private String text;
    private int numberOfVowels;
    private int numberOfConsonants;
    private int numberOfLetters;
    private int numberOfSentences;
    private String longestWord = "";

    public TextData(String fileName, String text) {
        this.fileName = fileName;
        this.text = text;
    }

    public String getFileName() {
        return fileName;
    }
    public String getText() {
        return text;
    }
    public int getNumberOfVowels() {
        for(char i : text.toLowerCase().toCharArray()) {
            if(i == 'a' || i == 'e' || i == 'i' || i == 'o' || i == 'u') {
                numberOfVowels++;
            }
        }

        return numberOfVowels;
    }
    public int getNumberOfConsonants() {
        for(char i: text.toLowerCase().toCharArray()) {
            if((i != 'a' && i != 'e' && i != 'i' && i != 'o' && i != 'u') && Character.isLetter(i)) {
                numberOfConsonants++;
            }
        }
        return numberOfConsonants;
    }
    public int getNumberOfLetters() {
        for(char i: text.toCharArray()) {
            if(Character.isLetter(i)) {
                numberOfLetters++;
            }
        }
        return numberOfLetters;
    }
    public int getNumberOfSentences() {
        for(char i: text.toCharArray()) {
            if(i == '.' || i == '!' || i == '?') {
                numberOfSentences++;
            }
        }
        return numberOfSentences;
    }
    public String getLongestWord() {
        String longestWordCheck = "";
        for(char i: (text + " ").toCharArray()) {
            if(!Character.isLetter(i) && i != ' ') continue;

            if(i == ' ') {
                if(longestWord.length() < longestWordCheck.length()) {
                    longestWord = longestWordCheck;
                }
                longestWordCheck = "";
            }else{
                longestWordCheck += i;
            }
        }
        return longestWord;
    }
}
