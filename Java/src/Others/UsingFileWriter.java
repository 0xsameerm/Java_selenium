package Others;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class UsingFileWriter {
    public static void main(String[] args) throws IOException {

        String location = "Textfile.txt";
        String content = "Why do we fall, sir?";
        FileWriter fwriter = new FileWriter(location);

        //Using BufferedWriter class - easiest, good performance
        BufferedWriter writer = new BufferedWriter(fwriter);
        writer.write(content);
        writer.newLine();
        writer.write("so that we cal learn to pick ourselves up!");
        writer.close();
    }
}
