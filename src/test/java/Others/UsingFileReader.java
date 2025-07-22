package Others;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class UsingFileReader {
    public static void main(String[] args) throws IOException {
        String currentLine;
        FileReader freader = new FileReader("Textfile.txt");
        BufferedReader reader = new BufferedReader(freader);

        while((currentLine=reader.readLine())!=null){
           System.out.println(currentLine);
        }
        reader.close();
    }
}
