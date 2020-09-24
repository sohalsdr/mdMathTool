package com.github.sohalsdr.mdMathTool;
import java.io.FileNotFoundException;

import static com.github.sohalsdr.mdMathTool.helpCommands.modeHelp;

public class mdMathTool {
    public static void main(String[] args) throws FileNotFoundException {
        try {
            if ((args[0].equals("-a")) || (args[0].equals("-s"))) {
                String mode = args[0];
            } else if(args[0].equals("help")) {
                modeHelp();
                System.exit(0);
            } else {
                System.out.println("Please run with a mode argument");
                System.out.println("Run with argument \"help\" for more info");
            }

            
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Please run with a mode argument");
            System.out.println("Run with argument \"help\" for more info");
        }
    }
}
