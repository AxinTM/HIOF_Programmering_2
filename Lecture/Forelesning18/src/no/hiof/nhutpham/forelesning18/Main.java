package no.hiof.nhutpham.forelesning18;

import no.hiof.nhutpham.forelesning18.tools.StringFileHandler;

import java.io.File;

public class Main {
    public static void main(String[] args) {

        String randomTxt = "Hei, dette er en tilfeldig text. \n" +
                "Kult, er det ikke? \n";

        StringFileHandler stringFileHandler = new StringFileHandler();

        File file = new File("Random-text.txt");
        stringFileHandler.writeToFile(randomTxt, file);

        System.out.println(stringFileHandler.readFromFile(file));
    }

}
