package homework.day7;

import playground.essence.creatures.Raven;

import java.io.*;

public class DeserializableTask {
    public void readAndWrite() throws IOException {
        try (FileInputStream fi = new FileInputStream("SmartBoy.tmp");
             ObjectInputStream ois = new ObjectInputStream(fi)) {
            Raven aRaven = (Raven) ois.readObject();
            try (BufferedWriter bf = new BufferedWriter(new FileWriter(aRaven.getName() + ".txt"))) {
                bf.write(aRaven.toString());
            }
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) throws IOException {
        DeserializableTask deserializableTask = new DeserializableTask();
        deserializableTask.readAndWrite();
    }
}
