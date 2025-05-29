package InternalPackage;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import static java.awt.print.Printable.NO_SUCH_PAGE;
import static java.awt.print.Printable.PAGE_EXISTS;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;

public class ReceiptPrinter implements Printable {

    private String receiptContent;
    private BufferedImage logo;

    public ReceiptPrinter(String content) {
        this.receiptContent = content;
        try {
            // Load logo from file path
            logo = ImageIO.read(new File("src/pfpimage/GrubGo.jpg"));

            if (logo == null) {
                System.out.println("Logo not found.");
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Failed to load logo: " + e.getMessage());
            logo = null;
        }
    }

    @Override
    public int print(Graphics g, PageFormat pf, int pageIndex) throws PrinterException {
        if (pageIndex > 0) return NO_SUCH_PAGE;

        Graphics2D g2d = (Graphics2D) g;
        g2d.translate(pf.getImageableX(), pf.getImageableY());

        int y = 20;

        if (logo != null) {
            g2d.drawImage(logo, 60, y, 100, 100, null);
            y += 110;
        }

        g2d.setFont(new Font("Monospaced", Font.PLAIN, 12));
        for (String line : receiptContent.split("\n")) {
            g2d.drawString(line, 10, y);
            y += 15;
        }

        return PAGE_EXISTS;
    }

    public void printReceipt() {
        PrinterJob job = PrinterJob.getPrinterJob();
        job.setPrintable(this); // no need to cast

        if (job.printDialog()) {
            try {
                job.print();
            } catch (PrinterException e) {
                JOptionPane.showMessageDialog(null, "Printing error: " + e.getMessage());
            }
        }
    }
}
