package com.ctseducare.files.pdf.itextpdf;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.ColumnText;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfPageEventHelper;
import com.itextpdf.text.pdf.PdfWriter;

public class PDFGenerator {

  public static void main(String[] args) {

    Font tableBodyFont_Bold = FontFactory.getFont("calibri");
    tableBodyFont_Bold.setSize(9);
    tableBodyFont_Bold.setStyle(Font.BOLD);

    Font tableBodyFont = FontFactory.getFont("calibri");
    tableBodyFont.setSize(9);

    Document doc = new Document();
    doc.setPageSize(PageSize.A4);
    doc.setMargins(15, 15, 15, 15);

    try {
      PdfWriter writer = PdfWriter.getInstance(doc, new FileOutputStream("teste.pdf"));
      HeaderFooter event = new HeaderFooter();
      writer.setPageEvent(event);

      doc.open();

      Paragraph paragraph = new Paragraph();
      paragraph.setAlignment(Element.ALIGN_LEFT);
      paragraph.add("Relatório em PDF");
      doc.add(paragraph);

      doc.add(Chunk.NEWLINE);
      doc.add(Chunk.NEWLINE);

      PdfPTable table = null;
      PdfPCell cell = null;

      table = new PdfPTable(3);
      table.setWidthPercentage(100);
      table.setWidths(new float[] { 10f, 20f, 20f });

      cell = new PdfPCell(new Phrase("Titulo1", tableBodyFont_Bold));
      cell.setHorizontalAlignment(Element.ALIGN_LEFT);
      cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
      cell.setBackgroundColor(BaseColor.LIGHT_GRAY);
      // cell.setRowspan(2);
      table.addCell(cell);
      cell = new PdfPCell(new Phrase("Titulo2", tableBodyFont_Bold));
      cell.setHorizontalAlignment(Element.ALIGN_LEFT);
      cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
      cell.setBackgroundColor(BaseColor.LIGHT_GRAY);
      // cell.setRowspan(2);
      table.addCell(cell);
      cell = new PdfPCell(new Phrase("Titulo3", tableBodyFont_Bold));
      cell.setHorizontalAlignment(Element.ALIGN_LEFT);
      cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
      cell.setBackgroundColor(BaseColor.LIGHT_GRAY);
      // cell.setRowspan(2);
      table.addCell(cell);

      for (int i = 0; i < 100; i++) {
        cell = new PdfPCell(new Phrase("Texto1", tableBodyFont));
        cell.setHorizontalAlignment(Element.ALIGN_LEFT);
        cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
        table.addCell(cell);
        cell = new PdfPCell(new Phrase("Texto2", tableBodyFont));
        cell.setHorizontalAlignment(Element.ALIGN_LEFT);
        cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
        table.addCell(cell);
        cell = new PdfPCell(new Phrase("Texto3", tableBodyFont));
        cell.setHorizontalAlignment(Element.ALIGN_LEFT);
        cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
        table.addCell(cell);
      }

      doc.add(table);

    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (DocumentException e) {
      e.printStackTrace();
    } finally {
      doc.close();
    }
  }

}

class HeaderFooter extends PdfPageEventHelper {
  int pagenumber = 0;

  @Override
  public void onStartPage(PdfWriter writer, Document document) {
    pagenumber++;
  }

  @Override
  public void onEndPage(PdfWriter writer, Document document) {
    ColumnText.showTextAligned(writer.getDirectContent(), Element.ALIGN_CENTER,
        new Phrase(String.format("%d", pagenumber)), document.getPageSize().getWidth() / 2, 12, 0);
  }
}
