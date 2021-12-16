package com.ctseducare.files.text;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ArquivoTextoEscrita {

  public static void main(String[] args) {
    
    File file = new File("dadoslinguagem.txt");
    try {
      FileWriter fw = new FileWriter(file);
      fw.write("Linguagem Java");
      fw.write("\n");
      fw.write("1995");
      fw.write("\n");
      fw.write("James Gosling");
      fw.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
    
    File file2 = new File("linuxdistros.txt");
    try {
      PrintWriter pw = new PrintWriter(file2);
      pw.println("Slackware");
      pw.println("Debian");
      pw.println("Red Hat");
      pw.close();
    } catch (IOException e) {
      e.printStackTrace();
    }    

  }

}
