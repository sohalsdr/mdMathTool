package com.github.sohalsdr.mdMathTool;

import javax.script.*;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.io.*;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class convertGitHub {
    public static void convertToGitHub(File sourceFile, File destFile, String sourceDelim) throws IOException{
        System.out.println("Source File: "+sourceFile);
        System.out.println("Destination File: "+destFile);
        System.out.println("Source delimiters: "+sourceDelim+"<equation>"+sourceDelim);
        String buffer;
        String delimL = sourceDelim;
        String delimR = sourceDelim;
        int eqCount = 0;
        try {
            Scanner in = new Scanner(sourceFile);
            FileWriter file = new FileWriter(destFile);
            BufferedWriter writer = new BufferedWriter(file);
            while (in.hasNextLine()) {
                buffer = in.nextLine();
                if (buffer.equals("$$")) {
                    buffer = "";
                    writer.write(buffer);
                    writer.newLine();
                    buffer = in.nextLine();
                    buffer = githubify(buffer);
                    writer.write(buffer);
                    writer.newLine();
                    buffer = in.nextLine();
                    buffer = "";
                } else {
                    int pos1, pos2;
                    for (int i = 0; i < buffer.length(); i++) {
                        pos1 = buffer.indexOf(delimL, i);
                        if (pos1 != -1) {
                            pos2 = (buffer.indexOf(delimR, (pos1 + 1)));
                            if (pos2 != -1) {
                                String equation = buffer.substring(pos1, (pos2 + 1));
                                buffer = buffer.replace(equation, githubify(equation));
                                eqCount++;
                                i = pos2 + 1;
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
        } catch (NoSuchMethodException | ScriptException e) {
            e.printStackTrace();
        }
    }
    public static String githubify(String equation) throws ScriptException, NoSuchMethodException {
        String encodedQuery = encodeValue(equation);
        return "<img src=\"https://render.githubusercontent.com/render/math?math=" + encodedQuery + "\">";
    }
    private static String encodeValue(String value) {
        try {
            return URLEncoder.encode(value, StandardCharsets.UTF_8.toString());
        } catch (UnsupportedEncodingException ex) {
            throw new RuntimeException(ex.getCause());
        }
}}
