package com.github.sohalsdr.mdMathTool;

import javax.script.*;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class convertGitHub {
    public static void convertToGitHub(String sourceDir, String destDir, String sourceDelim) throws IOException{
        File sourceFile = new File (sourceDir);
        File destFile = new File (destDir);
        if (!destFile.getParentFile().exists())
            destFile.getParentFile().mkdirs();
        if (!destFile.exists())
            destFile.createNewFile();
        if (destFile.createNewFile()) {
            System.out.println("File " + destDir + " Created");
        }
        String buffer;
        String delimL = " "+sourceDelim;
        String delimR = sourceDelim;
        try {
            Scanner in = new Scanner(sourceFile);
            FileWriter file = new FileWriter(destFile);
            BufferedWriter writer = new BufferedWriter(file);
            while (in.hasNextLine()) {
                buffer = in.nextLine();
                int pos1, pos2;
                for (int i = 0; i < buffer.length(); i++) {
                    pos1 = buffer.indexOf(delimL, i);
                    if (pos1 != -1) {
                        pos2 = (buffer.indexOf(delimR, (pos1+1)));
                        if (pos2 != -1) {
                            String equation = buffer.substring(pos1, (pos2+1));
                            buffer= buffer.replace(equation, githubify(equation));
                            i = pos2+1;
                        }
                    }
                }
                writer.write(buffer);
                writer.newLine();
            }
            writer.close();
            System.out.println("Conversion completed.");
        } catch (NoSuchMethodException | ScriptException e) {
            e.printStackTrace();
        }
    }
    public static String githubify(String equation) throws ScriptException, NoSuchMethodException {
        ScriptEngine engine = new ScriptEngineManager().getEngineByName("nashorn");
        Invocable invocable = (Invocable) engine;
        Object scriptResult = invocable.invokeFunction("encodeURIComponent", equation);
        return "<img src=\"https://render.githubusercontent.com/render/math?math=" + scriptResult.toString() + "\">";
    }
}
