package com.github.sohalsdr.mdMathTool;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class printToTerminal extends Object {
    public static void printOut(File toPrint) throws FileNotFoundException {
        Scanner in = new Scanner(toPrint);
        while(in.hasNextLine()) {
            System.out.println(in.nextLine());
        }
    }
}
