package com.umiitkose.strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // Veritabanı tablosundaki verileri içeren Map nesnesi
        Map<String, String> veriler = new HashMap<>();
        veriler.put("1", "001");
        veriler.put("2", "002");
        veriler.put("3", "001");
        veriler.put("4", "003");

        // Dosya isimlerini içeren liste
        List<String> dosyalar = Arrays.asList("001-a.rpc", "002-b.rpc", "003-c.rpc");

        // Gruplama işlemi
        Map<String, List<String>> gruplar = dosyalar.stream()
                .filter(dosya -> veriler.containsKey(dosya.substring(0, 3))) // DosyaId var mı kontrolü
                .collect(Collectors.groupingBy(dosya -> veriler.get(dosya.substring(0, 3))));

        // Grupları yazdırma işlemi
        gruplar.forEach((groupId, dosyaListesi) -> {
            System.out.println("Group " + groupId + ": " + dosyaListesi);
        });


    }


}