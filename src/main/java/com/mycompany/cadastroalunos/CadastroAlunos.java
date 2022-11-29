/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.cadastroalunos;

import view.TelaCadastro;
import view.TelaInteracao;

/**
 *
 * @author FonsecAd
 */
public class CadastroAlunos {

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
          public void run() {
               TelaInteracao frame = new TelaInteracao();
               frame.setVisible(true);
          }
        });
    }
}
