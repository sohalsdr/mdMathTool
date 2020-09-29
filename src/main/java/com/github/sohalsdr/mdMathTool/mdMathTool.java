package com.github.sohalsdr.mdMathTool;
import org.apache.commons.text.StringEscapeUtils;

import java.io.*;

import static com.github.sohalsdr.mdMathTool.changeDelims.replaceDelims;
import static com.github.sohalsdr.mdMathTool.convertGitHub.convertToGitHub;
import static com.github.sohalsdr.mdMathTool.printToTerminal.printOut;

public class mdMathTool {
    public static void main(String[] args) {
        try {
            if ((args[0].equals("-a")) || (args[0].equals("-s"))) {
                String mode = args[0];
                if (mode.equals("-a")) {
                    try {
                        advancedMode(args[1], args[2], StringEscapeUtils.escapeJava(args[3]), args[4]);
                    } catch (ArrayIndexOutOfBoundsException e) {
                        e.printStackTrace();
                    }
                } else if (mode.equals("-s")); {
                    simpleMode();
                }
            } else if(args[0].equals("help")) {
                // File modeHelp = new File("./modeHelp.txt");
                // printOut(modeHelp);
                System.out.print("----mdMathTool------------------------------------------------\n" +
                        "Various utilities to make working with math in markdown easier\n" +
                        "https://github.com/sohalsdr/mdMathTool\n" +
                        "\n" +
                        "MODES\n" +
                        "    Simple: Prompts user through individual arguments\n" +
                        "    Advanced: Accepts all arguments at command start\n" +
                        "\n" +
                        "USAGE\n" +
                        "    SIMPLE:     java -jar mdMathTool_<version>.jar -s\n" +
                        "    ADVANCED:   java -jar mdMathTool_<version>.jar -a <Source File> <Destination File> <Source Delimiter> <Destination Delimiter>\n" +
                        "\n" +
                        "FORMATS\n" +
                        "    Common math delimiters are $ and $$, although the program will accept any delimiter put in.\n" +
                        "    If \"github\" is chosen as the destination delimiter, the program will render all detected equations into images for use with GitHub.\n" +
                        "--------------------------------------------------------------");

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
        sourceDir = sourceDir.replace('~', '.');
        destDir = destDir.replace('~', '.');
        if (destDelim.toLowerCase().equals("github")) {
            convertToGitHub(sourceDir, destDir, sourceDelim);
        } else {
            String sourceDelimL = sourceDelim;
            String sourceDelimR = sourceDelim;
            if (sourceDelim.toLowerCase().equals("latex\\[")) {
                // sourceDelimL = "\\[";
                // sourceDelimR = "\\]";
                System.err.println("This delimiter option is not supported yet");
                System.exit(0);
            }
            if (sourceDelim.toLowerCase().equals("latex\\(")) {
                // sourceDelimL = "\\[";
                // sourceDelimR = "\\]";
                System.err.println("This delimiter option is not supported yet");
                System.exit(0);
            }
            if (sourceDelim.toLowerCase().equals("latex\\\\[")) {
                // sourceDelimL = "\\[";
                // sourceDelimR = "\\]";
                System.err.println("This delimiter option is not supported yet");
                System.exit(0);
            }
            if (sourceDelim.toLowerCase().equals("latex\\\\(")) {
                // sourceDelimL = "\\[";
                // sourceDelimR = "\\]";
                System.err.println("This delimiter option is not supported yet");
                System.exit(0);
            }
            String destDelimL = destDelim;
            String destDelimR = destDelim;
            if (destDelim.toLowerCase().equals("latex\\[")) {
                // destDelimL = "\\[";
                // destDelimR = "\\]";
                System.err.println("This delimiter option is not supported yet");
                System.exit(0);
            }
            if (destDelim.toLowerCase().equals("latex\\(")) {
                // destDelimL = "\\[";
                // destDelimR = "\\]";
                System.err.println("This delimiter option is not supported yet");
                System.exit(0);
            }
            if (destDelim.toLowerCase().equals("latex\\\\[")) {
                // destDelimL = "\\[";
                // destDelimR = "\\]";
                System.err.println("This delimiter option is not supported yet");
                System.exit(0);
            }
            if (destDelim.toLowerCase().equals("latex\\\\(")) {
                // destDelimL = "\\[";
                // destDelimR = "\\]";
                System.err.println("This delimiter option is not supported yet");
                System.exit(0);
            }
            replaceDelims(sourceDir, destDir, sourceDelimL, sourceDelimR, destDelimL, destDelimR);
        }
    }
    public static void simpleMode() {
        
    }
}
