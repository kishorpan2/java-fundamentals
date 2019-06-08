/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linter;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {
    public String getGreeting() {
        return "Hello world.";
    }

    public static int main(String[] args) {

        return readFile(args[0]);
    }

public static int readFile(String path) {
    int errorCount = 0;
    try {
        File file = new File(path);
        int lineCount = 1;

        Scanner sc = new Scanner(file);
        while(sc.hasNextLine()) {
            String line =sc.nextLine();
        if ((line.endsWith("{")) || (line.endsWith("}"))){
            lineCount ++;
        }
        else if ((line.contains("if"))||(line.contains("else")) ){
            lineCount ++;
        }
        else if (line.isEmpty()){
            lineCount ++;
            }
        else {
                if (!line.endsWith(";")) {
                    lineCount ++;
                    errorCount++;
                }
                lineCount++;
            }
        }
        System.out.println(errorCount);

        }

    catch (FileNotFoundException e) {
        System.out.println(e);

    }
    return errorCount;
    }
}

