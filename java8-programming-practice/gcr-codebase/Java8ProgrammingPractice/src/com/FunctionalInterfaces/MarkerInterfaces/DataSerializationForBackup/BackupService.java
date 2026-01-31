package com.FunctionalInterfaces.MarkerInterfaces.DataSerializationForBackup;

import java.io.*;

public class BackupService {

    public static void backup(Object obj) throws Exception {

        if (obj instanceof Serializable) {
            ObjectOutputStream oos =
                    new ObjectOutputStream(new FileOutputStream("backup.dat"));
            oos.writeObject(obj);
            oos.close();
            System.out.println("Backup completed");
        } else {
            System.out.println("Object not serializable");
        }
    }

    public static void main(String[] args) throws Exception {
        Employee emp = new Employee(101, "Rahul");
        backup(emp);
    }
}
