package podstawytestowanie.programowanie.zestawtrudniejszychzadan.operacjenaplikach.testowanie;

import podstawytestowanie.programowanie.zestawzadan.Input;

import java.io.IOException;

public class InpuOutputFiles {

    static String FILE_NAME = "./test.txt";
    static String TEST_STRING = "testowy string\npo \n";

    public static void main(String[] args) throws IOException {

        FileClass fc = new FileClass(FILE_NAME);
        fc.writeToFile(TEST_STRING);
        fc.writeToFile(Input.readString(""));
        fc.readFromFile();
        Input.readString("");
        fc.deleteFile();
    }

}
