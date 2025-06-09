import java.io.*;

public class Test {
    public static void main(String args[]) throws IOException {
        // Writing using BufferedWriter
        BufferedWriter bw = new BufferedWriter(new FileWriter("abc.txt"));
        bw.write("DEV\nJI\nGoyal");
        bw.close();  // always close writer

        // Reading using BufferedReader
        BufferedReader br = new BufferedReader(new FileReader("abc.txt"));
        String line = br.readLine();
        while (line != null) {
            System.out.println(line);  // println adds newline automatically
            line = br.readLine();
        }
        br.close();  // always close reader
    }
}
