package wstepoop.homework.io.zadanie6;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SerializeHelp {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        List<Integer> integerList = new ArrayList<>(List.of(1, 4, 8, 6, 2, 58, 91, 179, 51689, 5611646, 61174796));
        serialize("list.txt", integerList);
        for (Integer integer : deserialize("list.txt")) {
            System.out.println(integer);
        }


    }

    private static void serialize(String fileName, List<Integer> list) throws IOException {
        FileOutputStream fos = new FileOutputStream(fileName);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(list);
        oos.close();
        fos.close();
    }

    private static List<Integer> deserialize(String fileName) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(fileName);
        ObjectInputStream ois = new ObjectInputStream(fis);
        return (List<Integer>) ois.readObject();
    }

}
