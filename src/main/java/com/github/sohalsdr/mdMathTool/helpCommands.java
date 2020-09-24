package com.github.sohalsdr.mdMathTool;
import java.io.File;
import java.io.FileNotFoundException;

import static com.github.sohalsdr.mdMathTool.printToTerminal.printOut;

public class helpCommands {
    public static void modeHelp() throws FileNotFoundException {
        try {
            File modeHelp = new File("src/main/java/com/github/sohalsdr/mdMathTool/helpMessages/modeHelp.txt");
            printOut(modeHelp);
        } catch (FileNotFoundException ex) {
            System.out.println("FILE modeHelp.txt NOT FOUND");
        }
    }
}
