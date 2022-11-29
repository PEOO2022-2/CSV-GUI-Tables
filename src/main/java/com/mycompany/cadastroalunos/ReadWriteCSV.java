package com.mycompany.cadastroalunos;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class ReadWriteCSV {
    public static List<Aluno> readCSV(String pathToCsv) throws IOException {
        List<Aluno> alunos = new ArrayList<>();
        try {
            FileReader filereader = new FileReader(pathToCsv);
            CSVReader csvReader = new CSVReader(filereader);
            String[] nextRecord;

            
            boolean ehCabecalho = true;
            while ((nextRecord = csvReader.readNext()) != null) {
                if (ehCabecalho) {
                    ehCabecalho = false;
                    continue;
                }
                Aluno alunoLinha = new Aluno(nextRecord[0], Integer.valueOf(nextRecord[1]), nextRecord[2], nextRecord[3]);
                alunos.add(alunoLinha);
            }
            return alunos;
        } catch(Exception e) {
            return alunos;
        }
    }
    
    
    public static void writeCSV(List<Aluno> alunos, String pathToCsv) throws IOException {
        FileWriter outputfile = new FileWriter(pathToCsv);
        CSVWriter writer = new CSVWriter(outputfile);

        String[] header = { "nome", "idade", "curso", "matricula" };
        writer.writeNext(header);
        for (Aluno aluno: alunos) {
            String[] linha = { aluno.nome, String.valueOf(aluno.idade), aluno.curso, aluno.matricula };
            writer.writeNext(linha);
        }
        writer.close();
    }
}
