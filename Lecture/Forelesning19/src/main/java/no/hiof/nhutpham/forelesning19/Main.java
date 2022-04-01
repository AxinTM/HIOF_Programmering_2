package no.hiof.nhutpham.forelesning19;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.module.kotlin.KotlinObjectSingletonDeserializerKt;
import no.hiof.nhutpham.forelesning19.models.Superhero;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Superhero> heroList = new ArrayList<>();
        heroList.add(new Superhero("Superman", "Clark Kent"));
        heroList.add(new Superhero("Hulk", "Bruce Banner"));
        heroList.add(new Superhero("Wonder Woman", "Diana Prince"));

        Superhero batman = new Superhero("Batman", "Bruce Wayne");
        batman.addSidekick(new Superhero("Robin", "Jason Todd"));

        heroList.add(batman);

        for (Superhero s : heroList) {
            System.out.println(s);
        }

        File JSONFil = new File("heroList.json");

        writeToJSONFil(heroList, JSONFil);

        pulic static ArrayList<Superhero> readFromJSONFil(File fil) {
            ArrayList<Superhero> returnList = new ArrayList<>();

            ObjectMapper objectMapper = new ObjectMapper();

            Superhero[] superheroesArray = objectMapper.readValue(fil, Superhero[].class);
        }
    }
    public static void writeToJSONFil(ArrayList<Superhero> superhero, File fil) {

        ObjectMapper objectMapper = new ObjectMapper();

       try{
           //objectMapper.writeValue(fil, superhero);
           objectMapper.writerWithDefaultPrettyPrinter().writeValue(fil, superhero);
       }
        catch (IOException ioException) {
            System.err.println(ioException.getMessage());
        }
    }
}
