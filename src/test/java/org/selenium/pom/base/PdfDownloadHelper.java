package org.selenium.pom.base;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class PdfDownloadHelper {
    private final WebDriver driver;

    public PdfDownloadHelper(WebDriver driver) {
        this.driver = driver;
    }

    public void downloadAndAssertPdf(String expectedText, int expectedNumberOfPages) {
        String pdfUrl = driver.getCurrentUrl();

        try {
            URL url = new URL(pdfUrl);
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.connect();

            try (InputStream inputStream = new BufferedInputStream(httpURLConnection.getInputStream())) {
                PDDocument document = PDDocument.load(inputStream);
                PDFTextStripper pdfStripper = new PDFTextStripper();
                String pdfText = pdfStripper.getText(document);

                int numberOfPages = document.getNumberOfPages();
                Assert.assertEquals(numberOfPages, expectedNumberOfPages);

                Assert.assertTrue(pdfText.contains(expectedText));
                document.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}