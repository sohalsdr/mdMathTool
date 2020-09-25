package com.github.sohalsdr.mdMathTool;

import java.io.*;
import java.util.Scanner;

public class printToTerminal extends Object {
    public static void printOut(File toPrint) {
        try {
            Scanner text = new Scanner(toPrint);
            while (text.hasNextLine()) {
                System.out.println(text.nextLine());
            }
        } catch (IOException | NullPointerException ex) {
            ex.printStackTrace();
        }
    }
}
