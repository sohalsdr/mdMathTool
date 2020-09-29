package com.github.sohalsdr.mdMathTool;

import org.apache.commons.text.StringEscapeUtils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class changeDelims {
    public static void replaceDelims(String sourceDir, String destDir, String sourceDelimL, String sourceDelimR,  String destDelimL, String destDelimR) throws IOException {
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
        Scanner in = new Scanner(sourceFile);
        FileWriter file = new FileWriter(destFile);
        BufferedWriter writer = new BufferedWriter(file);
        while (in.hasNextLine()) {
            buffer = in.nextLine();
            if (buffer.length() > 2) {
                int pos1, pos2;
                for (int i = 0; i < buffer.length(); i++) {
                    pos1 = buffer.indexOf(sourceDelimL, i);
                    if (pos1 != -1) {
                        pos2 = (buffer.indexOf(sourceDelimR, (pos1 + 1)));
                        if (pos2 != -1) {
                            String equation = buffer.substring(pos1, (pos2 + 1));
                            String modifiedEquation = destDelimL + (equation.substring(sourceDelimL.length(), (equation.length() - sourceDelimR.length()))) + destDelimR;
                            System.out.println(equation);
                            buffer = buffer.replace(equation, modifiedEquation);
                            i = pos2 + destDelimR.length();
                        }
                    }
                }
            }
            writer.write(buffer);
            writer.newLine();
        }
        writer.close();
        System.out.println("Conversion completed.");
    }
}
