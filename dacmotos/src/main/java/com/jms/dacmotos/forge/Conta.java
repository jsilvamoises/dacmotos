package com.jms.dacmotos.forge;

import java.io.File;  
import java.io.IOException;  
  
public class Conta{  
  
    private static int count = 0;  
  
    public static void main(String[] args) throws IOException {  
  
        long start = System.currentTimeMillis();  
        File root = new File("..").getCanonicalFile();  
        System.out.println("Root: " + root.toString());  
        analyze(root);  
        analyze(root);  
        System.out.println("Encountered: " + count);  
        System.out.println("Elapse: " + (System.currentTimeMillis() - start));  
    }  
  
    public static void analyze(File parent) throws IOException {  
        File[] files = parent.listFiles();  
        for (int i = 0; i < files.length; i++) {  
  
            if(files[i].isDirectory()) {  
  
                if (files[i].getName().startsWith(".")) {  
                    continue;  
                }  
  
                analyze(files[i]);  
                continue;  
            }  
  
            if (!files[i].getName().endsWith(".java")) {  
                continue;  
            }  
  
            String name = getClassName(files[i]);  
            if (name == null) {  
                continue;  
            }  
            Class clazz;  
            try {  
                clazz = Class.forName(name);  
                System.out.println(name);
            } catch (Throwable e) {  
                continue;  
            }  
            if (Object.class.isAssignableFrom(clazz)) {  
                //System.out.println("Oba: " + name);  
                ++count;  
            }  
        }  
    }  
    private static String getClassName(File file) throws IOException {  
        String ret = file.getCanonicalPath();  
        int i = ret.indexOf("\"\\com\\jms\\dacmotos\\bean\"");  
        if (i == -1) {  
            return null;  
        }  
        return ret.substring(i + 1, ret.length() - 0).replaceAll("\\", ".");  
    }  
  
}