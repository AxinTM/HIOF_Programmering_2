package no.hiof.nhutpham.forelesning18.tools;

import no.hiof.nhutpham.forelesning18.interfaces.FileHandler;

import java.io.*;

public class StringFileHandler implements FileHandler<String> {


    @Override
    public void writeToFile(String s, File file) {

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file))) {

            bufferedWriter.write(s);

         } catch (IOException ioException) {
            System.err.println(ioException.getMessage());
        }

    }

    @Override
    public String readFromFile(File file) {

        String returnString = "";

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))){

            String line;
            while ( (line = bufferedReader.readLine()) !=null) {
                returnString = returnString + "\n" + line;

            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return returnString;

    }
}
