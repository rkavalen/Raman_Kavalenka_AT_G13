package homework.day7;

import playground.essence.creatures.Raven;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializableTask{
    public void write() throws IOException {
        Raven aRaven = new Raven(5, "SmartBoy");
        try (FileOutputStream fos = new FileOutputStream(aRaven.getName() + ".tmp");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(aRaven);
        }
    }

    public static void main(String[] args) throws IOException {
        SerializableTask s = new SerializableTask();
        s.write();
    }
}