package main;

import task1.Display;
import task2.FileReaderClass;
import task2.TextData;
import task3.Assistant;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

//        task4(args);
//        task1();
        task3();

    }

    private static void task3() {
        Display item1 = new Display(1000, 1200, 200, "Victus 16");
        Display item2 = new Display(2000, 1000, 300, "Victus 17");
        Assistant assistant = new Assistant();
        assistant.assignDisplay(item1);
        assistant.assignDisplay(item2);
        assistant.showAssignedDisplays();
        Display buyedDisplay = assistant.buyDisplay(item1);
        assistant.assist();
        assistant.showAssignedDisplays();
        System.out.println(buyedDisplay.getModel());
    }

    private static void task1() {
        Display item1 = new Display(1000, 1200, 200, "Victus 16");
        Display item2 = new Display(2000, 1000, 300, "Victus 17");
        item1.compareWithMonitor(item2);
    }

    private static void task4(String[] args) {
        FileReaderClass fileReader = new FileReaderClass();
        List<TextData> textDataList = new ArrayList<>();
        for(String arg : args) {
            textDataList.add(new TextData("./resources/" + arg, fileReader.readFileIntoString("./resources/" + arg)));
        }

        for (TextData textData : textDataList) {
            System.out.println(textData.getText() + "\n" + textData.getFileName() + "\n" + textData.getNumberOfConsonants() + "\n" + textData.getNumberOfVowels() + "\n" + textData.getNumberOfLetters() + "\n" + textData.getNumberOfSentences() + "\n" + textData.getLongestWord());
        }
    }

}