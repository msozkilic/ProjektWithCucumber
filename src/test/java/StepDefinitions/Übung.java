package StepDefinitions;


import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Übung {
    public static void main(String[] args) {

      String[] kelime={"Ali","Ayse","Ahmet","3"};

        ArrayList<String> kelimeler=new ArrayList<>();
        kelimeler.add("ali");
        kelimeler.add(3,"o");


ArrayList<ArrayList<String>> ülke=new ArrayList<>();

ArrayList<String> ilce=new ArrayList<>();
ilce.add("bad berleburg");

ArrayList<String>plaka=new ArrayList<>();
plaka.add("5");

ülke.add(ilce);
ülke.add(plaka);
        System.out.println(ülke);


    }
}

