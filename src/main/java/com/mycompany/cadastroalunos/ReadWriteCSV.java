package com.mycompany.cadastroalunos;

import com.opencsv.CSVWriter;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class ReadWriteCSV {
    static void writeCSV(List<Aluno> alunos, String pathToCsv) throws IOException {
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
