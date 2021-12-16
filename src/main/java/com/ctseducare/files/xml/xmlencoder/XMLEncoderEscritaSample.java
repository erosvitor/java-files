package com.ctseducare.files.xml.xmlencoder;

import java.beans.XMLEncoder;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

public class XMLEncoderEscritaSample
{
  public static void main(String[] args)
  {
    List<Cliente> clientes = new ArrayList<Cliente>();
    clientes.add(new Cliente(1, "Pedro Gonçalves", 'M'));
    clientes.add(new Cliente(2, "Marieta da Penha", 'F'));

    FileOutputStream fos = null;
    XMLEncoder out = null;
    try {
      fos = new FileOutputStream("clientesXMLEncoder.xml");
      out = new XMLEncoder(fos);

      out.writeObject(clientes);

      out.flush();
    }
    catch (FileNotFoundException e) {
      e.printStackTrace();
    } finally {
      out.close();
    }
  }
}
