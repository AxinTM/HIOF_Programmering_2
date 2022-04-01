package no.hiof.nhutpham.forelesning18.interfaces;

import java.io.File;

public interface FileHandler<T> {

    // metode for å skrive tekst til fil
    void writeToFile(T t, File file);


    // metode for å lese tekst fra fil og returnere den
    T readFromFile(File file);


}
