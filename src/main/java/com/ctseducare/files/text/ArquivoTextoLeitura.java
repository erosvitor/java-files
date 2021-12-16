package com.ctseducare.files.text;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ArquivoTextoLeitura {

  public static void main(String[] args) {

    // Lendo caractere por caractere
    //--------------------------------------------------------------------------------
    File file = new File("dadoslinguagem.txt");
    try {
      FileReader fr = new FileReader(file);
      int c;
      while ((c = fr.read()) != -1) {
        System.out.print((char)c);
      }
      fr.close();
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
    
    
    // Lendo linha por linha
    //--------------------------------------------------------------------------------
    File file2 = new File("linuxdistros.txt");
    Reader r = null;
    BufferedReader br = null;
    try {
      r = new FileReader(file2);
      br = new BufferedReader(r);
      String line;
      while ((line = br.readLine()) != null) {
        System.out.println(line);
      }
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      if (br != null) {
        try {
          br.close();
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
      try {
        r.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
    
  }

}
