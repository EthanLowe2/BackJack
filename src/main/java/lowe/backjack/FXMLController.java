package lowe.backjack;

/*
Put header here


 */

import java.net.URL;
import java.util.HashSet;
import java.util.ResourceBundle;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class FXMLController implements Initializable {

    @FXML
    private ImageView imgCCard1, imgCCard2, imgPCard1, imgPCard2, imgPCard3, imgPCard4;

    int CCard1;
    int CCard2;
    int PCard1;
    int PCard2;
    int PCard3;
    int PCard4;

    void generateCasinoCardNumber() {
        CCard1 = ThreadLocalRandom.current().nextInt(1, 52 + 1);
        CCard2 = ThreadLocalRandom.current().nextInt(1, 52 + 1);
        while (CCard1 == CCard2) {
            CCard2 = ThreadLocalRandom.current().nextInt(1, 52 + 1);
        }
        placeCards(CCard1, imgCCard1);
        placeCards(CCard2, imgCCard2);
    }

    void generatePlayerCardNumber() {
        PCard1 = ThreadLocalRandom.current().nextInt(1, 52 + 1);
        PCard2 = ThreadLocalRandom.current().nextInt(1, 52 + 1);
        PCard3 = ThreadLocalRandom.current().nextInt(1, 52 + 1);
        PCard4 = ThreadLocalRandom.current().nextInt(1, 52 + 1);
        while (PCard1 == PCard2) {
            PCard2 = ThreadLocalRandom.current().nextInt(1, 52 + 1);
        }
        while (PCard1 == PCard3) {
            PCard3 = ThreadLocalRandom.current().nextInt(1, 52 + 1);
        }
        while (PCard1 == PCard4) {
            PCard4 = ThreadLocalRandom.current().nextInt(1, 52 + 1);
        }
        while (PCard2 == PCard3) {
            PCard3 = ThreadLocalRandom.current().nextInt(1, 52 + 1);
        }
        while (PCard2 == PCard4) {
            PCard4 = ThreadLocalRandom.current().nextInt(1, 52 + 1);
        }
        while (PCard3 == PCard4) {
            PCard4 = ThreadLocalRandom.current().nextInt(1, 52 + 1);
        }
       
    }
    @FXML
    void MClick(MouseEvent event) {
        ImageView img = (ImageView) event.getSource();
            if (img.getAccessibleText().equals("AC")){
                img.setImage(new Image(getClass().getResource("/AC.png").toString()));
            }if (img.getAccessibleText().equals("2C")){
                img.setImage(new Image(getClass().getResource("/2C.png").toString()));
            }if (img.getAccessibleText().equals("3C")){
                img.setImage(new Image(getClass().getResource("/3C.png").toString()));
            }if (img.getAccessibleText().equals("4C")){
                img.setImage(new Image(getClass().getResource("/4C.png").toString()));
            }if (img.getAccessibleText().equals("5C")){
                img.setImage(new Image(getClass().getResource("/5C.png").toString()));
            }if (img.getAccessibleText().equals("6C")){
                img.setImage(new Image(getClass().getResource("/6C.png").toString()));
            }if (img.getAccessibleText().equals("7C")){
                img.setImage(new Image(getClass().getResource("/7C.png").toString()));
            }if (img.getAccessibleText().equals("8C")){
                img.setImage(new Image(getClass().getResource("/8C.png").toString()));
            }if (img.getAccessibleText().equals("9C")){
                img.setImage(new Image(getClass().getResource("/9C.png").toString()));
            }if (img.getAccessibleText().equals("10C")){
                img.setImage(new Image(getClass().getResource("/10C.png").toString()));
            }if (img.getAccessibleText().equals("JC")){
                img.setImage(new Image(getClass().getResource("/JC.png").toString()));
            }if (img.getAccessibleText().equals("QC")){
                img.setImage(new Image(getClass().getResource("/QC.png").toString()));
            }if (img.getAccessibleText().equals("KC")){
                img.setImage(new Image(getClass().getResource("/KC.png").toString()));
            }if (img.getAccessibleText().equals("AS")){
                img.setImage(new Image(getClass().getResource("/AS.png").toString()));
            }if (img.getAccessibleText().equals("2S")){
                img.setImage(new Image(getClass().getResource("/2S.png").toString()));
            }if (img.getAccessibleText().equals("3S")){
                img.setImage(new Image(getClass().getResource("/3S.png").toString()));
            }if (img.getAccessibleText().equals("4S")){
                img.setImage(new Image(getClass().getResource("/4S.png").toString()));
            }if (img.getAccessibleText().equals("5S")){
                img.setImage(new Image(getClass().getResource("/5S.png").toString()));
            }if (img.getAccessibleText().equals("6S")){
                img.setImage(new Image(getClass().getResource("/6S.png").toString()));
            }if (img.getAccessibleText().equals("7S")){
                img.setImage(new Image(getClass().getResource("/7S.png").toString()));
            }if (img.getAccessibleText().equals("8S")){
                img.setImage(new Image(getClass().getResource("/8S.png").toString()));
            }if (img.getAccessibleText().equals("9S")){
                img.setImage(new Image(getClass().getResource("/9S.png").toString()));
            }if (img.getAccessibleText().equals("10S")){
                img.setImage(new Image(getClass().getResource("/10S.png").toString()));
            }if (img.getAccessibleText().equals("JS")){
                img.setImage(new Image(getClass().getResource("/JS.png").toString()));
            }if (img.getAccessibleText().equals("QS")){
                img.setImage(new Image(getClass().getResource("/QS.png").toString()));
            }if (img.getAccessibleText().equals("KS")){
                img.setImage(new Image(getClass().getResource("/KS.png").toString()));
            }if (img.getAccessibleText().equals("AH")){
                img.setImage(new Image(getClass().getResource("/AH.png").toString()));
            }if (img.getAccessibleText().equals("2H")){
                img.setImage(new Image(getClass().getResource("/2H.png").toString()));
            }if (img.getAccessibleText().equals("3H")){
                img.setImage(new Image(getClass().getResource("/3H.png").toString()));
            }if (img.getAccessibleText().equals("4H")){
                img.setImage(new Image(getClass().getResource("/4H.png").toString()));
            }if (img.getAccessibleText().equals("5H")){
                img.setImage(new Image(getClass().getResource("/5H.png").toString()));
            }if (img.getAccessibleText().equals("6H")){
                img.setImage(new Image(getClass().getResource("/6H.png").toString()));
            }if (img.getAccessibleText().equals("7H")){
                img.setImage(new Image(getClass().getResource("/7H.png").toString()));
            }if (img.getAccessibleText().equals("8H")){
                img.setImage(new Image(getClass().getResource("/8H.png").toString()));
            }if (img.getAccessibleText().equals("9H")){
                img.setImage(new Image(getClass().getResource("/9H.png").toString()));
            }if (img.getAccessibleText().equals("10H")){
                img.setImage(new Image(getClass().getResource("/10H.png").toString()));
            }if (img.getAccessibleText().equals("JH")){
                img.setImage(new Image(getClass().getResource("/JH.png").toString()));
            }if (img.getAccessibleText().equals("QH")){
                img.setImage(new Image(getClass().getResource("/QH.png").toString()));
            }if (img.getAccessibleText().equals("KH")){
                img.setImage(new Image(getClass().getResource("/KH.png").toString()));
            }if (img.getAccessibleText().equals("AD")){
                img.setImage(new Image(getClass().getResource("/AD.png").toString()));
            }if (img.getAccessibleText().equals("2D")){
                img.setImage(new Image(getClass().getResource("/2D.png").toString()));
            }if (img.getAccessibleText().equals("3D")){
                img.setImage(new Image(getClass().getResource("/3D.png").toString()));
            }if (img.getAccessibleText().equals("4D")){
                img.setImage(new Image(getClass().getResource("/4D.png").toString()));
            }if (img.getAccessibleText().equals("5D")){
                img.setImage(new Image(getClass().getResource("/5D.png").toString()));
            }if (img.getAccessibleText().equals("6D")){
                img.setImage(new Image(getClass().getResource("/6D.png").toString()));
            }if (img.getAccessibleText().equals("7D")){
                img.setImage(new Image(getClass().getResource("/7D.png").toString()));
            }if (img.getAccessibleText().equals("8D")){
                img.setImage(new Image(getClass().getResource("/8D.png").toString()));
            }if (img.getAccessibleText().equals("9D")){
                img.setImage(new Image(getClass().getResource("/9D.png").toString()));
            }if (img.getAccessibleText().equals("10D")){
                img.setImage(new Image(getClass().getResource("/10D.png").toString()));
            }if (img.getAccessibleText().equals("JD")){
                img.setImage(new Image(getClass().getResource("/JD.png").toString()));
            }if (img.getAccessibleText().equals("QD")){
                img.setImage(new Image(getClass().getResource("/QD.png").toString()));
            }if (img.getAccessibleText().equals("KD")){
                img.setImage(new Image(getClass().getResource("/KD.png").toString()));
            }
           }
    public void placeCards(int Card,ImageView Fxid) { //Places Ships based on values made in Slots (Method above)
        if (Card ==  1) {
            Fxid.setAccessibleText("AC");
        } if (Card == 2 ) {
            Fxid.setAccessibleText("2C");
        } if (Card == 3 ) {
            Fxid.setAccessibleText("3C");
        } if (Card == 4 ) {
            Fxid.setAccessibleText("4C");
        } if (Card == 5 ) {
            Fxid.setAccessibleText("5C");
        } if (Card == 6 ) {
            Fxid.setAccessibleText("6C");
        } if (Card == 7 ) {
            Fxid.setAccessibleText("7C");
        } if (Card == 8 ) {
            Fxid.setAccessibleText("8C");
        } if (Card == 9 ) {
            Fxid.setAccessibleText("9C");
        } if (Card == 10) {
            Fxid.setAccessibleText("10C");
        } if (Card == 11) {
            Fxid.setAccessibleText("JC");
        } if (Card == 12) {
            Fxid.setAccessibleText("QC");
        } if (Card == 13) {
            Fxid.setAccessibleText("KC");
        } if (Card == 14) {
            Fxid.setAccessibleText("AS");
        } if (Card == 15 ) {
            Fxid.setAccessibleText("2S");
        } if (Card == 16 ) {
            Fxid.setAccessibleText("3S");
        } if (Card == 17 ) {
            Fxid.setAccessibleText("4S");
        } if (Card == 18 ) {
            Fxid.setAccessibleText("5S");
        } if (Card == 19 ) {
            Fxid.setAccessibleText("6S");
        } if (Card == 20 ) {
            Fxid.setAccessibleText("7S");
        } if (Card == 21 ) {
            Fxid.setAccessibleText("8S");
        } if (Card == 22 ) {
            Fxid.setAccessibleText("9S");
        } if (Card == 23) {
            Fxid.setAccessibleText("10S");
        } if (Card == 24) {
            Fxid.setAccessibleText("JS");
        } if (Card == 25) {
            Fxid.setAccessibleText("QS");
        } if (Card == 26) {
            Fxid.setAccessibleText("KS");
        } if (Card == 27) {
            Fxid.setAccessibleText("AH");
        } if (Card == 28) {
            Fxid.setAccessibleText("2H");
        } if (Card == 29) {
            Fxid.setAccessibleText("3H");
        } if (Card == 30) {
            Fxid.setAccessibleText("4H");
        } if (Card == 31) {
            Fxid.setAccessibleText("5H");
        } if (Card == 32) {
            Fxid.setAccessibleText("6H");
        } if (Card == 33) {
            Fxid.setAccessibleText("7H");
        } if (Card == 34) {
            Fxid.setAccessibleText("8H");
        } if (Card == 35) {
            Fxid.setAccessibleText("9H");
        } if (Card == 36) {
            Fxid.setAccessibleText("10H");
        } if (Card == 37) {
            Fxid.setAccessibleText("JH");
        } if (Card == 38) {
            Fxid.setAccessibleText("QH");
        } if (Card == 39) {
            Fxid.setAccessibleText("KH");
        } if (Card == 40) {
            Fxid.setAccessibleText("AD");
        } if (Card == 41) {
            Fxid.setAccessibleText("2D");
        } if (Card == 42) {
            Fxid.setAccessibleText("3D");
        } if (Card == 43) {
            Fxid.setAccessibleText("4D");
        } if (Card == 44) {
            Fxid.setAccessibleText("5D");
        } if (Card == 45) {
            Fxid.setAccessibleText("6D");
        } if (Card == 46) {
            Fxid.setAccessibleText("7D");
        } if (Card == 47) {
            Fxid.setAccessibleText("8D");
        } if (Card == 48) {
            Fxid.setAccessibleText("9D");
        } if (Card == 49) {
            Fxid.setAccessibleText("10D");
        } if (Card == 50) {
            Fxid.setAccessibleText("JD");
        } if (Card == 51) {
            Fxid.setAccessibleText("QD");
        } if (Card == 52) {
            Fxid.setAccessibleText("KD");
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        generateCasinoCardNumber();
        
    }
}
