package com.github.sohalsdr.mdMathTool;
import org.apache.commons.text.StringEscapeUtils;

import java.io.*;
import java.util.Scanner;

import static com.github.sohalsdr.mdMathTool.changeDelims.replaceDelims;
import static com.github.sohalsdr.mdMathTool.convertGitHub.convertToGitHub;
import static com.github.sohalsdr.mdMathTool.printToTerminal.printOut;

public class mdMathTool {
    public static void main(String[] args) {
        //MAKE SURE TO CHANGE VERSION BEFORE RELEASE!!!
        String version = "1.1.2";
        try {
            if ((args[0].equals("-a")) || (args[0].equals("-s")) || (args[0].equals("-b"))) {
                String mode = args[0];
                if (mode.equals("-a")) {
                    try {
                        if ((args[1].substring(args[1].lastIndexOf(".")).equals(".md")) && (args[2].substring(args[2].lastIndexOf(".")).equals(".md"))) {
                            advancedMode(args[1], args[2], StringEscapeUtils.escapeJava(args[3]), args[4]);
                        } else{
                            System.out.println("Either your source or destination file are not .md files.");
                        }
                    } catch (ArrayIndexOutOfBoundsException e) {
                        e.printStackTrace();
                    }
                } else if (mode.equals("-s")) {
                    simpleMode();
                } else if (mode.equals("-b")) {
                    batchMode(args[1], args[2], StringEscapeUtils.escapeJava(args[3]), args[4]);
                }
            } else if(args[0].equals("version")) {
                System.out.println("mdMathTool release "+version);
            }else if(args[0].equals("help")) {
                // File modeHelp = new File("./modeHelp.txt");
                // printOut(modeHelp);
                System.out.print("----mdMathTool-----------------------------------------------\n" +
                        "Various utilities to make working with math in markdown easier\n" +
                        "https://github.com/sohalsdr/mdMathTool\n" +
                        "\n" +
                        "MODES\n" +
                        "    Simple: Prompts user through individual arguments\n" +
                        "    Advanced: Accepts all arguments at command start\n" +
                        "    Batch: Same as Advanced, but converts a whole folder\n" +
                        "\n" +
                        "USAGE\n" +
                        "    SIMPLE:     java -jar mdMathTool_<version>.jar -s\n" +
                        "    ADVANCED:   java -jar mdMathTool_<version>.jar -a <Source File> <Destination File> <Source Delimiter> <Destination Delimiter>\n" +
                        "    BATCH:      java -jar mdMathTool_<version>.jar -b <Source Folder> <Append To File Name> <Source Delimiter> <Destination Delimiter>\n" +
                        "\n" +
                        "FORMATS\n" +
                        "    Common math delimiters are $ and $$, although the program will accept any delimiter put in. In Advanced Mode, delimiters must be surrounded with ' '\n" +
                        "(e.g. '$'). Simple mode does not require the ' ' (for whatever reason).\n" +
                        "    If \"github\" is chosen as the destination delimiter, the program will render all detected equations into images for use with GitHub.\n" +
                        "    For Batch mode, the <Append To File Name> flag is a string that will be appended to the end of the filename, before the extension. For example, if a folder you passed through batchmode had \"test.md\" and \"anothertest.md\", and you put \"bananas\" as appendToFileName, the output files would be \"testbananas.md\" and \"anothertestbananas.md\". appendToFileName cannot have any spaces.\n" +
                        "-------------------------------------------------------------\n");

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
        if (destDir.equals(sourceDir)) {
            System.err.println("You have chosen the same file for both sources. Please choose a different destination file.");
            System.exit(0);
        }
        sourceDir = sourceDir.replace('~', '.');
        destDir = destDir.replace('~', '.');
        if (destDelim.toLowerCase().equals("github")) {
            File sourceFile = new File (sourceDir);
            File destFile = new File (destDir);
            if (!destFile.getParentFile().exists())
                destFile.getParentFile().mkdirs();
            if (!destFile.exists())
                destFile.createNewFile();
            if (destFile.createNewFile()) {
                System.out.println("File " + destDir + " Created");
            }
            convertToGitHub(sourceFile, destFile, sourceDelim);
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
            File sourceFile = new File (sourceDir);
            File destFile = new File (destDir);
            if (!destFile.getParentFile().exists())
                destFile.getParentFile().mkdirs();
            if (!destFile.exists())
                destFile.createNewFile();
            if (destFile.createNewFile()) {
                System.out.println("File " + destDir + " Created");
            }
            replaceDelims(sourceFile, destFile, sourceDelimL, sourceDelimR, destDelimL, destDelimR);
        }
    }
    public static void simpleMode() throws IOException {
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to mdMathTool Simple Mode.");
        System.out.print("Please enter the path to your source file. Note that it should either be an absolute path from root (e. g. /Users/sohalsdr/Desktop/example.md), or a relative path from home if on a UNIX-based system (~/Desktop/example.md).\n Source File: ");
        String sourceDir = in.nextLine().replace(" ", "");
        System.out.print("Please enter the path to your destination file. Note that it should either be an absolute path from root (e. g. /Users/sohalsdr/Desktop/exampleOutput.md), or a relative path from home if on a UNIX-based system (~/Desktop/exampleOutput.md).\n Destination File: ");
        String destDir = in.nextLine().replace(" ", "");
        sourceDir = sourceDir.replace('~', '.');
        destDir = destDir.replace('~', '.');
        if (destDir.equals(sourceDir)) {
            System.err.println("You have chosen the same file for both sources. Please choose a different destination file.");
            System.exit(0);
        }
        if (!(sourceDir.substring(sourceDir.lastIndexOf(".")).equals(".md")) || !(destDir.substring(destDir.lastIndexOf(".")).equals(".md")) ){
            System.out.println("Either your source or destination file was not a .md file. Please try again");
            System.exit(0);
        }
        System.out.print("Please enter your source delimiter.\nSource Delimiter: ");
        String sourceDelim = in.nextLine().replace(" ", "").replace("\'", "");
        System.out.print("Please enter your destination delimiter.\nDestination Delimiter: ");
        String destDelim = in.nextLine().replace(" ", "").replace("\'", "");
        System.out.println(sourceDelim);
        System.out.println(destDelim);
        if (destDelim.toLowerCase().equals("github")) {
            File sourceFile = new File (sourceDir);
            File destFile = new File (destDir);
            if (!destFile.getParentFile().exists())
                destFile.getParentFile().mkdirs();
            if (!destFile.exists())
                destFile.createNewFile();
            if (destFile.createNewFile()) {
                System.out.println("File " + destDir + " Created");
            }
            convertToGitHub(sourceFile, destFile, sourceDelim);
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
            File sourceFile = new File (sourceDir);
            File destFile = new File (destDir);
            if (!destFile.getParentFile().exists())
                destFile.getParentFile().mkdirs();
            if (!destFile.exists())
                destFile.createNewFile();
            if (destFile.createNewFile()) {
                System.out.println("File " + destDir + " Created");
            }
            replaceDelims(sourceFile, destFile, sourceDelimL, sourceDelimR, destDelimL, destDelimR);
        }

    }
    public static void batchMode(String sourceDirString, String appendToFilename, String sourceDelim, String destDelim) throws IOException {
        sourceDirString = sourceDirString.replace('~', '.');
        File sourceDir = new File(sourceDirString);
        if(sourceDir.isDirectory()) {
            for(File sourceFile : sourceDir.listFiles()) {
                String sourceFileString = sourceFile.toString();
                int lastIndex = sourceFileString.lastIndexOf(".");
                if(lastIndex != -1) {
                    if (sourceFileString.substring(sourceFileString.lastIndexOf(".")).equals(".md")) {
                        System.out.println(sourceFileString);
                        int lastDotIndex = sourceFileString.lastIndexOf(".");
                        String destFileString = sourceFileString.substring(0, lastDotIndex) + appendToFilename + sourceFileString.substring(lastDotIndex);
                        File destFile = new File(destFileString);
                        if (destFile.createNewFile()) {
                            System.out.println("File " + destFileString + " Created");
                        }
                        if (destDelim.toLowerCase().equals("github")) {
                            convertToGitHub(sourceFile, destFile, sourceDelim);
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
                            replaceDelims(sourceFile, destFile, sourceDelimL, sourceDelimR, destDelimL, destDelimR);
                        }
                    }
                }
            }

        }else {
            System.out.println(sourceDirString + " is not a valid folder. Either select a folder, or run with the -a argument to process a single file.");
            System.exit(0);
        }
    }
}
