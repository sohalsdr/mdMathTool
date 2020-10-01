package com.github.sohalsdr.mdMathTool;

import org.apache.commons.text.StringEscapeUtils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class changeDelims {
    public static void replaceDelims(File sourceFile, File destFile, String sourceDelimL, String sourceDelimR,  String destDelimL, String destDelimR) throws IOException {
        System.out.println("Source File: "+sourceFile);
        System.out.println("Destination File: "+destFile);
        System.out.println("Source delimiters: "+sourceDelimL+"<equation>"+sourceDelimR);
        System.out.println("Destination delimiters: "+destDelimL+"<equation>"+destDelimR);
        String buffer;
        Scanner in = new Scanner(sourceFile);
        FileWriter file = new FileWriter(destFile);
        BufferedWriter writer = new BufferedWriter(file);
        int eqCount = 0;
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
                            eqCount++;
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
        System.out.println(eqCount+" equations found");
        System.out.println("Conversion completed.");
    }
}
