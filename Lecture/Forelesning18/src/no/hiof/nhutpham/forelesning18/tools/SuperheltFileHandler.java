package no.hiof.nhutpham.forelesning18.tools;

import no.hiof.nhutpham.forelesning18.interfaces.FileHandler;
import no.hiof.nhutpham.forelesning18.models.Superhelt;

import java.io.File;

public class SuperheltFileHandler implements FileHandler<Superhelt> {

    @Override
    public void writeToFile(Superhelt superhelt, File file) {

    }

    @Override
    public Superhelt readFromFile(File file) {
        return null;
    }
}
