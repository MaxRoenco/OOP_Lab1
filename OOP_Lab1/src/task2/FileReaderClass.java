package task2;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileReader;

public class FileReaderClass {
    public String readFileIntoString(String fileName) {
        String text = "";
        try{

            FileReader reader = new FileReader(fileName);
            int data = reader.read();
            while(data != -1) {
                char c = (char) data;
                data = reader.read();
                text += c;
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return text;
    }
}
