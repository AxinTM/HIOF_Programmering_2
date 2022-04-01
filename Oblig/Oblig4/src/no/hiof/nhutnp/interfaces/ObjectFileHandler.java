package no.hiof.nhutnp.interfaces;

import java.io.File;
import java.util.ArrayList;

public interface ObjectFileHandler<T extends Object > {

    void writeObjectsToFile(ArrayList<T> t, String fil_name);

    ArrayList<T> readObjectFromFile(String fil_name);
 }

