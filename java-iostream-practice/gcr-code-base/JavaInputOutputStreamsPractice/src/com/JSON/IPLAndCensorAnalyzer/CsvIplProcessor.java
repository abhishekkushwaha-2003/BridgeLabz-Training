package com.JSON.IPLAndCensorAnalyzer;


import com.opencsv.*;
import java.io.*;
import java.util.*;

public class CsvIplProcessor {

    public static void processCsv(String input, String output) throws Exception {

        CSVReader reader = new CSVReader(new FileReader(input));
        List<String[]> rows = reader.readAll();
        reader.close();

        List<String[]> outputRows = new ArrayList<>();
        outputRows.add(rows.get(0)); 

        for (int i = 1; i < rows.size(); i++) {
            String[] r = rows.get(i);

            r[1] = IplCensorUtil.maskTeam(r[1]); // team1
            r[2] = IplCensorUtil.maskTeam(r[2]); // team2
            r[5] = IplCensorUtil.maskTeam(r[5]); // winner
            r[6] = IplCensorUtil.redactPlayer(); // player

            outputRows.add(r);
        }

        CSVWriter writer = new CSVWriter(new FileWriter(output));
        writer.writeAll(outputRows);
        writer.close();
    }
}
