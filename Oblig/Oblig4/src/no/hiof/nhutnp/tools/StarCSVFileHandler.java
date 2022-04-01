package no.hiof.nhutnp.tools;

import no.hiof.nhutnp.interfaces.ObjectFileHandler;
import no.hiof.nhutnp.models.Star;

import java.io.*;
import java.nio.Buffer;
import java.util.ArrayList;

public class StarCSVFileHandler implements ObjectFileHandler<Star> {


    @Override
    public void writeObjectsToFile(ArrayList<Star> t, String fil_name) {

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(new File(fil_name)))) {
            String x;
            for (Star s : t){
                x = s.getName() + ";" + s.getRadius() + ";" + s.getMass() + ";" + s.getEffectiveTemp();
                bufferedWriter.write(x);
                bufferedWriter.newLine();
            }

        }
        catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    @Override
    public ArrayList<Star> readObjectFromFile(String fil_name) {

        ArrayList<Star> starArrayList = new ArrayList<>();

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(new File(fil_name)))) {
            String line;
            while ((line = bufferedReader.readLine()) != null){
                String[] x = line.split(";");
                Star star = new Star(x[0], Double.parseDouble(x[1]), Double.parseDouble(x[2]), Integer.parseInt(x[3]));
                starArrayList.add(star);
            }
        }

        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return starArrayList;
    }
}
