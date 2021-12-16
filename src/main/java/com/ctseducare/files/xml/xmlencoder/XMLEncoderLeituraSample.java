package com.ctseducare.files.xml.xmlencoder;

import java.beans.XMLDecoder;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public class XMLEncoderLeituraSample {
  public static void main(String[] args) {
    List<Cliente> clientes;

    FileInputStream fis = null;
    XMLDecoder in = null;
    try {
      fis = new FileInputStream("clientesXMLEncoder.xml");
      in = new XMLDecoder(fis);

      clientes = (List<Cliente>) in.readObject();

      for (Cliente c : clientes) {
        System.out.println("Código...: " + c.getCodigo());
        System.out.println("Nome.....: " + c.getNome());
        System.out.println("");
      }

    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } finally {
      in.close();
      try {
        fis.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }
}
