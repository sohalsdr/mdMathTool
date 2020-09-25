package com.github.sohalsdr.mdMathTool;
import java.io.*;

import static com.github.sohalsdr.mdMathTool.convertGitHub.convertToGitHub;
import static com.github.sohalsdr.mdMathTool.printToTerminal.printOut;

public class mdMathTool {
    public static void main(String[] args) {
        try {
            if ((args[0].equals("-a")) || (args[0].equals("-s"))) {
                String mode = args[0];
                if (mode.equals("-a")) {
                    try {
                        advancedMode(args[1], args[2], args[3], args[4]);
                    } catch (ArrayIndexOutOfBoundsException e) {
                        e.printStackTrace();
                    }
                }
            } else if(args[0].equals("help")) {
                File modeHelp = new File("resources/modeHelp.txt");
                printOut(modeHelp);
                System.exit(0);
            } else {
                System.out.println("Invalid Mode argument, please run with a mode argument");
                System.out.println("Run with argument \"help\" for more info");
            }


        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("No Mode argument found, please run with a mode argument");
            System.out.println("Run with argument \"help\" for more info");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    public static void advancedMode(String sourceDir, String destDir, String sourceDelim, String destDelim) throws IOException {
        sourceDir = sourceDir.replace("\"", "");
        destDir = destDir.replace("\"", "");
        if (destDelim.equals("github")) {
            convertToGitHub(sourceDir, destDir, sourceDelim);
        }
    }
}
