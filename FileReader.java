package configPractice;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TheReader {

    public void readText(){
        File theFile = new File ("ENTER FILE LOCATION HERE");
        try {
            Scanner docScan = new Scanner(theFile);
            while (docScan.hasNextLine()) {
                String line = docScan.nextLine();
                System.out.println(line);
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("Can't Find File");
            }
        }
    }
