package com.learning.java.miscellaneous;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by ejangpa on 1/11/2017.
 */
public class FileReadingDemo {
    public static void main(String[] args) {

        try {
            FileInputStream fileInputStream = new FileInputStream("C:\\Users\\ejangpa\\Desktop\\TestJava\\Echo.java");
            FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\ejangpa\\Desktop\\TestJava\\CommandArgs.java");
            String s = "public class CommandArgs {\n" +
                    " public static void main(String [] args) \n" +
                    "   /*  {\n" +
                    "   //     String s1 = args[1];\n" +
                    "        String s2 = args[2];\n" +
                    "        String s3 = args[3];\n" +
                    "        String s4 = args[4];\n" +
                    "        System.out.print(\" args[2] = \" + s2);\n" +
                    "    } jb */\n" +
                    "\t\n" +
                    "\t{\n" +
                    "\t\tString names [] = new String[5];\n" +
                    "        for (int x=0; x < args.length; x++)\n" +
                    "            names[x] = args[x];\n" +
                    "        System.out.println(names[2]);\n" +
                    "\t}\n" +
                    "\t\n" +
                    "}\n";
            byte[] biteStream = s.getBytes();
            System.out.println(biteStream.getClass());
            fileOutputStream.write(biteStream);
            fileOutputStream.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
