package firstDay;

import java.io.*;

/**
 * @author honggw
 * @create 2022-01-05 21:57
 */
public class InputTest {
    public static void main(String[] args) {
        testInput();
    }

    private static void testInput() {
        InputStream inputStream = null;
        OutputStream outputStream = null;
        int bt = 0;
        try {
            inputStream = new FileInputStream("D:\\1\\x.txt");
            outputStream = new FileOutputStream("D:\\1\\copy.doc");
            while ((bt = inputStream.read()) != -1){
                outputStream.write(bt);
            }
            inputStream.close();
            outputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
