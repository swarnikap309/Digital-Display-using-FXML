/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package converttodigitalform_javafx;

import com.sun.javafx.binding.Logging;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 *
 * @author swarnika
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private TextField textfield;
    @FXML
    private TextArea textArea;

    @FXML
    public void display(ActionEvent event) {
        try{
        String a = textfield.getText().toString();
        Pattern pattern = Pattern.compile("[a-zA-Z0-9]*");
        Matcher matcher = pattern.matcher(a);
 
            if (!matcher.matches()) {
           System.out.println("string '"+ a + "' contains special character");
            } else {
                takeInput(a);
            }

        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    // Function to print *
    static void print(List<String> ls) {
        for (int i = 0; i < 8; i++) {
            String temp[] = ls.get(i).split(",");
            for (int j = 0; j < temp.length; j++) {
                if (temp[j].equals("1")) {
                    System.out.print("*");
                } 
            else if (temp[j].equals("0")) {
                    System.out.print(" ");
                } else if (temp[j].equals("$")) {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }

    // Methods digit0()-digit9() for numbers
    static int[][] digit0() {
        int mat[][] = {{0, 1, 1, 1, 0},
        {1, 0, 0, 0, 1},
        {1, 0, 0, 0, 1},
        {1, 0, 0, 0, 1},
        {1, 0, 0, 0, 1},
        {1, 0, 0, 0, 1},
        {1, 0, 0, 0, 1},
        {0, 1, 0, 1, 0}};
        return mat;
    }

    static int[][] digit1() {
        int mat[][] = {{0, 0, 1, 0, 0},
        {0, 1, 1, 0, 0},
        {1, 0, 1, 0, 0},
        {0, 0, 1, 0, 0},
        {0, 0, 1, 0, 0},
        {0, 0, 1, 0, 0},
        {0, 0, 1, 0, 0},
        {1, 1, 1, 1, 1}};
        return mat;
    }

    static int[][] digit2() {
        int mat[][] = {{1, 1, 1, 1, 1},
        {0, 0, 0, 0, 1},
        {0, 0, 0, 0, 1},
        {0, 0, 0, 0, 1},
        {1, 1, 1, 1, 1},
        {1, 0, 0, 0, 0},
        {1, 0, 0, 0, 0},
        {1, 1, 1, 1, 1}};
        return mat;
    }

    static int[][] digit3() {
        int mat[][] = {{1, 1, 1, 1, 1},
        {0, 0, 0, 0, 1},
        {0, 0, 0, 0, 1},
        {0, 0, 0, 0, 1},
        {1, 1, 1, 1, 0},
        {0, 0, 0, 0, 1},
        {0, 0, 0, 0, 1},
        {1, 1, 1, 1, 1}};
        return mat;
    }

    static int[][] digit4() {
        int mat[][] = {{1, 0, 0, 0, 1},
        {1, 0, 0, 0, 1},
        {1, 0, 0, 0, 1},
        {1, 0, 0, 0, 1},
        {1, 1, 1, 1, 1},
        {0, 0, 0, 0, 1},
        {0, 0, 0, 0, 1},
        {0, 0, 0, 0, 1}};
        return mat;
    }

    static int[][] digit5() {
        int mat[][] = {{1, 1, 1, 1, 1},
        {1, 0, 0, 0, 0},
        {1, 0, 0, 0, 0},
        {1, 1, 1, 1, 1},
        {0, 0, 0, 0, 1},
        {0, 0, 0, 0, 1},
        {0, 0, 0, 0, 1},
        {1, 1, 1, 1, 1}};
        return mat;
    }

    static int[][] digit6() {
        int mat[][] = {{1, 1, 1, 1, 1},
        {1, 0, 0, 0, 0},
        {1, 0, 0, 0, 0},
        {1, 1, 1, 1, 1},
        {1, 0, 0, 0, 1},
        {1, 0, 0, 0, 1},
        {1, 0, 0, 0, 1},
        {1, 1, 1, 1, 1}};
        return mat;
    }

    static int[][] digit7() {
        int mat[][] = {{1, 1, 1, 1, 1},
        {0, 0, 0, 0, 1},
        {0, 0, 0, 0, 1},
        {0, 0, 0, 0, 1},
        {0, 0, 0, 0, 1},
        {0, 0, 0, 0, 1},
        {0, 0, 0, 0, 1},
        {0, 0, 0, 0, 1}};
        return mat;
    }

    static int[][] digit8() {
        int mat[][] = {{1, 1, 1, 1, 1},
        {1, 0, 0, 0, 1},
        {1, 0, 0, 0, 1},
        {1, 0, 0, 0, 1},
        {0, 1, 1, 1, 0},
        {1, 0, 0, 0, 1},
        {1, 0, 0, 0, 1},
        {1, 1, 1, 1, 1}};
        return mat;
    }

    static int[][] digit9() {
        int mat[][] = {{1, 1, 1, 1, 1},
        {1, 0, 0, 0, 1},
        {1, 0, 0, 0, 1},
        {1, 0, 0, 0, 1},
        {1, 1, 1, 1, 1},
        {0, 0, 0, 0, 1},
        {0, 0, 0, 0, 1},
        {1, 1, 1, 1, 1}};
        return mat;
    }

    // Methods smalla()-smallz() for  small letters from a-z
    static int[][] smalla() {
        int mat[][] = {{1, 1, 1, 1, 0},
        {1, 0, 0, 1, 0},
        {1, 0, 0, 1, 0},
        {1, 0, 0, 1, 0},
        {1, 0, 0, 1, 0},
        {1, 0, 0, 1, 1},
        {1, 0, 0, 1, 1},
        {1, 1, 1, 1, 1}};
        //return mat;
        return mat;
    }

    static int[][] smallb() {
        int mat[][] = {{1, 0, 0, 0, 0},
        {1, 0, 0, 0, 0},
        {1, 0, 0, 0, 0},
        {1, 0, 0, 0, 0},
        {1, 1, 1, 1, 1},
        {1, 0, 0, 0, 1},
        {1, 0, 0, 0, 1},
        {1, 1, 1, 1, 1}};
        //return mat;
        return mat;
    }

    static int[][] smallc() {
        int mat[][] = {{1, 1, 1, 1, 1},
        {1, 0, 0, 0, 0},
        {1, 0, 0, 0, 0},
        {1, 0, 0, 0, 0},
        {1, 0, 0, 0, 0},
        {1, 0, 0, 0, 0},
        {1, 0, 0, 0, 0},
        {1, 1, 1, 1, 1}};
        return mat;
    }

    static int[][] smalld() {
        int mat[][] = {{0, 0, 0, 0, 1},
        {0, 0, 0, 0, 1},
        {0, 0, 0, 0, 1},
        {1, 1, 1, 1, 1},
        {1, 0, 0, 0, 1},
        {1, 0, 0, 0, 1},
        {1, 0, 0, 0, 1},
        {1, 1, 1, 1, 1}};
        return mat;
    }

    static int[][] smalle() {
        int mat[][] = {{1, 1, 1, 1, 1},
        {1, 0, 0, 0, 1},
        {1, 0, 0, 0, 1},
        {1, 0, 0, 0, 1},
        {1, 1, 1, 1, 1},
        {1, 0, 0, 0, 0},
        {1, 0, 0, 0, 0},
        {1, 1, 1, 1, 1}};
        return mat;
    }

    static int[][] smallf() {
        int mat[][] = {{0, 0, 1, 1, 1},
        {0, 0, 1, 0, 0},
        {0, 0, 1, 0, 0},
        {0, 0, 1, 0, 0},
        {1, 1, 1, 1, 1},
        {0, 0, 1, 0, 0},
        {0, 0, 1, 0, 0},
        {0, 0, 1, 0, 0}};
        return mat;
    }

    static int[][] smallg() {
        int mat[][] = {{1, 1, 1, 1, 1},
        {1, 0, 0, 0, 1},
        {1, 0, 0, 0, 1},
        {1, 0, 0, 0, 1},
        {1, 1, 1, 1, 1},
        {0, 0, 0, 0, 1},
        {1, 0, 0, 0, 1},
        {1, 1, 1, 1, 1}};
        return mat;
    }

    static int[][] smallh() {
        int mat[][] = {{1, 0, 0, 0, 0},
        {1, 0, 0, 0, 0},
        {1, 0, 0, 0, 0},
        {1, 1, 1, 1, 1},
        {1, 0, 0, 0, 1},
        {1, 0, 0, 0, 1},
        {1, 0, 0, 0, 1},
        {1, 0, 0, 0, 1}};
        return mat;
    }

    static int[][] smalli() {
        int mat[][] = {{0, 0, 1, 0, 0},
        {0, 0, 0, 0, 0},
        {0, 0, 1, 0, 0},
        {0, 0, 1, 0, 0},
        {0, 0, 1, 0, 0},
        {0, 0, 1, 0, 0},
        {0, 0, 1, 0, 0},
        {0, 0, 1, 0, 0}};
        return mat;
    }

    static int[][] smallj() {
        int mat[][] = {{0, 0, 1, 0, 0},
        {0, 0, 0, 0, 0},
        {0, 0, 1, 0, 0},
        {0, 0, 1, 0, 0},
        {0, 0, 1, 0, 0},
        {0, 0, 1, 0, 0},
        {1, 0, 1, 0, 0},
        {1, 1, 1, 0, 0}};
        return mat;
    }

    static int[][] smallk() {
        int mat[][] = {{1, 0, 0, 0, 0},
        {1, 0, 0, 0, 1},
        {1, 0, 0, 1, 0},
        {1, 0, 1, 0, 0},
        {1, 1, 0, 0, 0},
        {1, 0, 1, 0, 0},
        {1, 0, 0, 1, 0},
        {1, 0, 0, 0, 1}};
        return mat;
    }

    static int[][] smalll() {
        int mat[][] = {{0, 1, 1, 0, 0},
        {0, 0, 1, 0, 0},
        {0, 0, 1, 0, 0},
        {0, 0, 1, 0, 0},
        {0, 0, 1, 0, 0},
        {0, 0, 1, 0, 0},
        {0, 0, 1, 0, 0},
        {0, 1, 1, 1, 0}};
        return mat;
    }

    static int[][] smallm() {
        int mat[][] = {{1, 0, 0, 0, 0},
        {1, 1, 1, 1, 1},
        {1, 0, 1, 0, 1},
        {1, 0, 1, 0, 1},
        {1, 0, 1, 0, 1},
        {1, 0, 1, 0, 1},
        {1, 0, 1, 0, 1},
        {1, 0, 1, 0, 1}};
        return mat;
    }

    static int[][] smalln() {
        int mat[][] = {{1, 0, 0, 0, 0},
        {1, 1, 1, 1, 1},
        {1, 0, 0, 0, 1},
        {1, 0, 0, 0, 1},
        {1, 0, 0, 0, 1},
        {1, 0, 0, 0, 1},
        {1, 0, 0, 0, 1},
        {1, 0, 0, 0, 1}};
        return mat;
    }

    static int[][] smallo() {
        int mat[][] = {{1, 1, 1, 1, 1},
        {1, 0, 0, 0, 1},
        {1, 0, 0, 0, 1},
        {1, 0, 0, 0, 1},
        {1, 0, 0, 0, 1},
        {1, 0, 0, 0, 1},
        {1, 0, 0, 0, 1},
        {1, 1, 1, 1, 1}};
        return mat;
    }

    static int[][] smallp() {
        int mat[][] = {
            
        {1, 1, 1, 1, 1},
        {1, 0, 0, 0, 1},
        {1, 0, 0, 0, 1},
        {1, 0, 0, 0, 1},
        {1, 1, 1, 1, 1},
        {1, 0, 0, 0, 0},
        {1, 0, 0, 0, 0},
        {1, 0, 0, 0, 0}};
        return mat;
    }

    static int[][] smallq() {
        int mat[][] = {{0, 1, 1, 0, 0},
        {1, 0, 1, 0, 0},
        {1, 0, 1, 0, 0},
        {1, 0, 1, 0, 0},
        {1, 1, 1, 0, 0},
        {0, 0, 1, 0, 1},
        {0, 0, 1, 1, 0},
        {0, 0, 1, 0, 0}};
        return mat;
    }

    static int[][] smallr() {
        int mat[][] = {{1, 0, 1, 1, 1},
        {1, 1, 0, 0, 0},
        {1, 0, 0, 0, 0},
        {1, 0, 0, 0, 0},
        {1, 0, 0, 0, 0},
        {1, 0, 0, 0, 0},
        {1, 0, 0, 0, 0},
        {1, 0, 0, 0, 0}};
        return mat;
    }

    static int[][] smalls() {
        int mat[][] = {{1, 1, 1, 1, 1},
        {1, 0, 0, 0, 0},
        {1, 0, 0, 0, 0},
        {1, 0, 0, 0, 0},
        {1, 1, 1, 1, 1},
        {0, 0, 0, 0, 1},
        {0, 0, 0, 0, 1},
        {1, 1, 1, 1, 1}};
        return mat;
    }

    static int[][] smallt() {
        int mat[][] = {{0, 0, 1, 0, 0},
        {0, 0, 1, 0, 0},
        {0, 0, 1, 0, 0},
        {1, 1, 1, 1, 1},
        {0, 0, 1, 0, 0},
        {0, 0, 1, 0, 0},
        {0, 0, 1, 0, 0},
        {0, 0, 1, 1, 1}};
        return mat;
    }

    static int[][] smallu() {
        int mat[][] = {{1, 0, 0, 0, 1},
        {1, 0, 0, 0, 1},
        {1, 0, 0, 0, 1},
        {1, 0, 0, 0, 1},
        {1, 0, 0, 0, 1},
        {1, 0, 0, 0, 1},
        {1, 0, 0, 1, 1},
        {1, 1, 1, 0, 1}};
        return mat;
    }

    static int[][] smallv() {
        int mat[][] = {{1, 0, 0, 0, 1},
        {1, 0, 0, 0, 1},
        {1, 0, 0, 0, 1},
        {1, 0, 0, 0, 1},
        {1, 0, 0, 0, 1},
        {1, 0, 0, 0, 1},
        {0, 1, 0, 1, 0},
        {0, 0, 1, 0, 0}};
        return mat;
    }

    static int[][] smallw() {
        int mat[][] = {{1, 0, 0, 0, 1},
        {1, 0, 0, 0, 1},
        {1, 0, 0, 0, 1},
        {1, 0, 0, 0, 1},
        {1, 0, 0, 0, 1},
        {1, 0, 1, 0, 1},
        {1, 1, 0, 1, 1},
        {1, 0, 0, 0, 1}};
        return mat;
    }

    static int[][] smallx() {
        int mat[][] = {{1, 0, 0, 0, 1},
        {1, 0, 0, 0, 1},
        {0, 1, 0, 1, 0},
        {0, 0, 1, 0, 0},
        {0, 0, 1, 0, 0},
        {0, 1, 0, 1, 0},
        {1, 0, 0, 0, 1},
        {1, 0, 0, 0, 1}};
        return mat;
    }

    static int[][] smally() {
        int mat[][] = {{1, 0, 0, 0, 1},
        {1, 0, 0, 0, 1},
        {0, 1, 0, 0, 1},
        {0, 0, 1, 0, 1},
        {0, 0, 0, 1, 1},
        {0, 0, 0, 0, 1},
        {1, 0, 0, 0, 1},
        {1, 1, 1, 1, 1}};
        return mat;
    }

    static int[][] smallz() {
        int mat[][] = {{1, 1, 1, 1, 1},
        {0, 0, 0, 0, 1},
        {0, 0, 0, 1, 0},
        {0, 0, 1, 0, 0},
        {0, 0, 1, 0, 0},
        {0, 1, 0, 0, 0},
        {1, 0, 0, 0, 0},
        {1, 1, 1, 1, 1}};
        return mat;
    }

    // Methods capA()-capZ() for  capital letters from A-Z
    static int[][] capA() {
        int mat[][] = {{0, 1, 1, 1, 0},
        {1, 0, 0, 0, 1},
        {1, 0, 0, 0, 1},
        {1, 0, 0, 0, 1},
        {1, 1, 1, 1, 1},
        {1, 0, 0, 0, 1},
        {1, 0, 0, 0, 1},
        {1, 0, 0, 0, 1}};
        return mat;
    }

    static int[][] capB() {
        int mat[][] = {{1, 1, 1, 1, 1},
        {1, 0, 0, 0, 1},
        {1, 0, 0, 0, 1},
        {1, 0, 0, 0, 1},
        {1, 1, 1, 1, 0},
        {1, 0, 0, 0, 1},
        {1, 0, 0, 0, 1},
        {1, 1, 1, 1, 1}};
        return mat;
    }

    static int[][] capC() {
        int mat[][] = {{1, 1, 1, 1, 1},
        {1, 0, 0, 0, 0},
        {1, 0, 0, 0, 0},
        {1, 0, 0, 0, 0},
        {1, 0, 0, 0, 0},
        {1, 0, 0, 0, 0},
        {1, 0, 0, 0, 0},
        {1, 1, 1, 1, 1}};
        return mat;
    }

    static int[][] capD() {
        int mat[][] = {{1, 1, 1, 1, 0},
        {1, 0, 0, 0, 1},
        {1, 0, 0, 0, 1},
        {1, 0, 0, 0, 1},
        {1, 0, 0, 0, 1},
        {1, 0, 0, 0, 1},
        {1, 0, 0, 0, 1},
        {1, 1, 1, 1, 0}};
        return mat;
    }

    static int[][] capE() {
        int mat[][] = {{1, 1, 1, 1, 1},
        {1, 0, 0, 0, 0},
        {1, 0, 0, 0, 0},
        {1, 0, 0, 0, 0},
        {1, 1, 1, 1, 1},
        {1, 0, 0, 0, 0},
        {1, 0, 0, 0, 0},
        {1, 1, 1, 1, 1}};
        return mat;
    }

    static int[][] capF() {
        int mat[][] = {{1, 1, 1, 1, 1},
        {1, 0, 0, 0, 0},
        {1, 0, 0, 0, 0},
        {1, 0, 0, 0, 0},
        {1, 1, 1, 1, 1},
        {1, 0, 0, 0, 0},
        {1, 0, 0, 0, 0},
        {1, 0, 0, 0, 0}};
        return mat;
    }

    static int[][] capG() {
        int mat[][] = {{1, 1, 1, 1, 1},
        {1, 0, 0, 0, 0},
        {1, 0, 0, 0, 0},
        {1, 0, 0, 0, 0},
        {1, 0, 1, 1, 1},
        {1, 0, 0, 0, 1},
        {1, 0, 0, 0, 1},
        {1, 1, 1, 1, 1}};
        return mat;
    }

    static int[][] capH() {
        int mat[][] = {{1, 0, 0, 0, 1},
        {1, 0, 0, 0, 1},
        {1, 0, 0, 0, 1},
        {1, 0, 0, 0, 1},
        {1, 1, 1, 1, 1},
        {1, 0, 0, 0, 1},
        {1, 0, 0, 0, 1},
        {1, 0, 0, 0, 1}};
        return mat;
    }

    static int[][] capI() {
        int mat[][] = {{1, 1, 1, 1, 1},
        {0, 0, 1, 0, 0},
        {0, 0, 1, 0, 0},
        {0, 0, 1, 0, 0},
        {0, 0, 1, 0, 0},
        {0, 0, 1, 0, 0},
        {0, 0, 1, 0, 0},
        {1, 1, 1, 1, 1}};
        return mat;
    }

    static int[][] capJ() {
        int mat[][] = {{1, 1, 1, 1, 1},
        {0, 0, 1, 0, 0},
        {0, 0, 1, 0, 0},
        {0, 0, 1, 0, 0},
        {0, 0, 1, 0, 0},
        {0, 0, 1, 0, 0},
        {1, 0, 1, 0, 0},
        {1, 1, 1, 0, 0}};
        return mat;
    }

    static int[][] capK() {
        int mat[][] = {{1, 0, 0, 0, 1},
        {1, 0, 0, 1, 0},
        {1, 0, 1, 0, 0},
        {1, 1, 0, 0, 0},
        {1, 0, 1, 0, 0},
        {1, 0, 0, 1, 0},
        {1, 0, 0, 0, 1},
        {1, 0, 0, 0, 1}};
        return mat;
    }

    static int[][] capL() {
        int mat[][] = {{1, 0, 0, 0, 0},
        {1, 0, 0, 0, 0},
        {1, 0, 0, 0, 0},
        {1, 0, 0, 0, 0},
        {1, 0, 0, 0, 0},
        {1, 0, 0, 0, 0},
        {1, 0, 0, 0, 0},
        {1, 1, 1, 1, 1}};
        return mat;
    }

    static int[][] capM() {
        int mat[][] = {{1, 0, 0, 0, 1},
        {1, 1, 0, 1, 1},
        {1, 1, 0, 1, 1},
        {1, 1, 0, 1, 1},
        {1, 0, 1, 0, 1},
        {1, 0, 0, 0, 1},
        {1, 0, 0, 0, 1},
        {1, 0, 0, 0, 1}};
        return mat;
    }

    static int[][] capN() {
        int mat[][] = {{1, 0, 0, 0, 1},
        {1, 1, 0, 0, 1},
        {1, 1, 0, 0, 1},
        {1, 0, 1, 0, 1},
        {1, 0, 1, 0, 1},
        {1, 0, 0, 1, 1},
        {1, 0, 0, 1, 1},
        {1, 0, 0, 0, 1}};
        return mat;
    }

    static int[][] capO() {
        int mat[][] = {{1, 1, 1, 1, 1},
        {1, 0, 0, 0, 1},
        {1, 0, 0, 0, 1},
        {1, 0, 0, 0, 1},
        {1, 0, 0, 0, 1},
        {1, 0, 0, 0, 1},
        {1, 0, 0, 0, 1},
        {1, 1, 1, 1, 1}};
        return mat;
    }

    static int[][] capP() {
        int mat[][] = {{1, 1, 1, 1, 1},
        {1, 0, 0, 0, 1},
        {1, 0, 0, 0, 1},
        {1, 0, 0, 0, 1},
        {1, 1, 1, 1, 1},
        {1, 0, 0, 0, 0},
        {1, 0, 0, 0, 0},
        {1, 0, 0, 0, 0}};
        return mat;
    }

    static int[][] capQ() {
        int mat[][] = {{0, 1, 1, 1, 0},
        {1, 0, 0, 0, 1},
        {1, 0, 0, 0, 1},
        {1, 0, 0, 0, 1},
        {1, 0, 0, 0, 1},
        {1, 0, 1, 0, 1},
        {0, 1, 1, 1, 0},
        {0, 0, 0, 0, 1}};
        return mat;
    }

    static int[][] capR() {
        int mat[][] = {{1, 1, 1, 1, 1},
        {1, 0, 0, 0, 1},
        {1, 0, 0, 0, 1},
        {1, 0, 0, 0, 1},
        {1, 1, 1, 1, 1},
        {1, 0, 1, 0, 0},
        {1, 0, 0, 1, 0},
        {1, 0, 0, 0, 1}};
        return mat;
    }

    static int[][] capS() {
        int mat[][] = {{1, 1, 1, 1, 1},
        {1, 0, 0, 0, 0},
        {1, 0, 0, 0, 0},
        {1, 0, 0, 0, 0},
        {1, 1, 1, 1, 0},
        {0, 0, 0, 0, 1},
        {0, 0, 0, 0, 1},
        {1, 1, 1, 1, 1}};
        return mat;
    }

    static int[][] capT() {
        int mat[][] = {{1, 1, 1, 1, 1},
        {0, 0, 1, 0, 0},
        {0, 0, 1, 0, 0},
        {0, 0, 1, 0, 0},
        {0, 0, 1, 0, 0},
        {0, 0, 1, 0, 0},
        {0, 0, 1, 0, 0},
        {0, 0, 1, 0, 0}};
        return mat;
    }

    static int[][] capU() {
        int mat[][] = {{1, 0, 0, 0, 1},
        {1, 0, 0, 0, 1},
        {1, 0, 0, 0, 1},
        {1, 0, 0, 0, 1},
        {1, 0, 0, 0, 1},
        {1, 0, 0, 0, 1},
        {1, 0, 0, 0, 1},
        {1, 1, 1, 1, 1}};
        return mat;
    }

    static int[][] capV() {
        int mat[][] = {{1, 0, 0, 0, 1},
        {1, 0, 0, 0, 1},
        {1, 0, 0, 0, 1},
        {1, 0, 0, 0, 1},
        {1, 0, 0, 0, 1},
        {1, 0, 0, 0, 1},
        {0, 1, 0, 1, 0},
        {0, 0, 1, 0, 0}};
        return mat;
    }

    static int[][] capW() {
        int mat[][] = {{1, 0, 0, 0, 1},
        {1, 0, 0, 0, 1},
        {1, 0, 0, 0, 1},
        {1, 0, 1, 0, 1},
        {1, 0, 1, 0, 1},
        {1, 1, 0, 1, 1},
        {1, 1, 0, 1, 1},
        {1, 0, 0, 0, 1}};
        return mat;
    }

    static int[][] capX() {
        int mat[][] = {{1, 0, 0, 0, 1},
        {1, 0, 0, 0, 1},
        {0, 1, 0, 1, 0},
        {0, 0, 1, 0, 0},
        {0, 0, 1, 0, 0},
        {0, 1, 0, 1, 0},
        {1, 0, 0, 0, 1},
        {1, 0, 0, 0, 1}};
        return mat;
    }

    static int[][] capY() {
        int mat[][] = {{1, 0, 0, 0, 1},
        {1, 0, 0, 0, 1},
        {0, 1, 0, 1, 0},
        {0, 0, 1, 0, 0},
        {0, 0, 1, 0, 0},
        {0, 0, 1, 0, 0},
        {0, 0, 1, 0, 0},
        {0, 0, 1, 0, 0}};
        return mat;
    }

    static int[][] capZ() {
        int mat[][] = {{1, 1, 1, 1, 1},
        {0, 0, 0, 0, 1},
        {0, 0, 0, 1, 0},
        {0, 0, 1, 0, 0},
        {0, 0, 1, 0, 0},
        {0, 1, 0, 0, 0},
        {1, 0, 0, 0, 0},
        {1, 1, 1, 1, 1}};
        return mat;
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try{
        OutputStream out = new OutputStream() {
            @Override
            public void write(int b) throws IOException {
                appendText(String.valueOf((char) b));
            }
        };
        System.setOut(new PrintStream(out, true));
    }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    public void appendText(String str) {
        textArea.clear();
        Platform.runLater(() -> textArea.appendText("\t" + str));
    }

    public static void takeInput(String inputValue) {
        String input[] = inputValue.split("");
        if(input.length >20)
        {
            System.out.println("Invalid \nInput!!");
        }
        else{
        int numberOfCharacters = input.length;
        List<String> ls = new ArrayList<String>();
        List<String> finalMat = new ArrayList<String>();
        for (int k = 0; k < numberOfCharacters; k++) {
            boolean flag = k == numberOfCharacters - 1 ? true : false;
            createList(selectMethod(input[k]), ls, flag);
        }
        
        int count = ls.size() / numberOfCharacters;
        int some = 0;
        int totalCount = 0;
        for (int i = 0; i < ls.size(); i++) {
            int z = i;
            some = 0;
            String temp = "";
            while (some < numberOfCharacters) {
                if (z > ls.size() - 1) {
                    break;
                }
                temp = temp + ls.get(z);
                z = z + count;
                some++;
            }
            System.out.println();
            finalMat.add(temp);
            totalCount++;
            if (totalCount > 7) {
                break;
            }
          }
         /* for(String s:finalMat){		
	            System.out.println(s);		
        }*/
        print(finalMat);
    }
    }
    public static void createList(int[][] a, List<String> ls, boolean flag) {
        for (int i = 0; i < a.length; i++) {
            String temp = "";
            for (int j = 0; j < a[i].length; j++) {
                if (j == a[i].length - 1 && flag) {
                    temp = temp + a[i][j];
                } else if (j == 4) {
                    temp = temp + a[i][j] + ",$,";
                } else {
                    temp = temp + a[i][j] + ",";
                }
            }
            ls.add(temp);
        }
    }

    public static  int[][] selectMethod(String value) {
     //Printing of Letters
     //Small Letters
             try{

        if (value.equals("a")) {
            return smalla();
        }
        if (value.equals("b")) {
            return smallb();
        }
        if (value.equals("c")) {
            return smallc();
        }
        if (value.equals("d")) {
            return smalld();
        }
        if (value.equals("e")) {
            return smalle();
        }
        if (value.equals("f")) {
            return smallf();
        }
        if (value.equals("g")) {
            return smallg();
        }
        if (value.equals("h")) {
            return smallh();
        }
        if (value.equals("i")) {
            return smalli();
        }
        if (value.equals("j")) {
            return smallj();
        }
        if (value.equals("k")) {
            return smallk();
        }
        if (value.equals("l")) {
            return smalll();
        }
        if (value.equals("m")) {
            return smallm();
        }
        if (value.equals("n")) {
            return smalln();
        }
        if (value.equals("0")) {
            return smallo();
        }
        if (value.equals("p")) {
            return smallp();
        }
        if (value.equals("q")) {
            return smallq();
        }
        if (value.equals("r")) {
            return smallr();
        }
        if (value.equals("s")) {
            return smalls();
        }
        if (value.equals("t")) {
            return smallt();
        }
        if (value.equals("u")) {
            return smallu();
        }
        if (value.equals("v")) {
            return smallv();
        }
        if (value.equals("w")) {
            return smallw();
        }
        if (value.equals("x")) {
            return smallx();
        }
        if (value.equals("y")) {
            return smally();
        }
        if (value.equals("z")) {
            return smallz();
        }
        
        //Digits

        if (value.equals("1")) {
            return digit1();
        }
        if (value.equals("2")) {
            return digit2();
        }
        if (value.equals("3")) {
            return digit3();
        }
        if (value.equals("4")) {
            return digit4();
        }
        if (value.equals("5")) {
            return digit5();
        }
        if (value.equals("6")) {
            return digit6();
        }
        if (value.equals("7")) {
            return digit7();
        }
        if (value.equals("8")) {
            return digit8();
        }
        if (value.equals("9")) {
            return digit9();
        }
        if (value.equals("0")) {
            return digit0();
        }
        //Capital Letters 
        if (value.equals("A")) {
            return capA();
        }
        if (value.equals("B")) {
            return capB();
        }
        if (value.equals("C")) {
            return capC();
        }
        if (value.equals("D")) {
            return capD();
        }
        if (value.equals("E")) {
            return capE();
        }
        if (value.equals("F")) {
            return capF();
        }
        if (value.equals("G")) {
            return capG();
        }
        if (value.equals("H")) {
            return capH();
        }
        if (value.equals("I")) {
            return capI();
        }
        if (value.equals("J")) {
            return capJ();
        }
        if (value.equals("K")) {
            return capK();
        }
        if (value.equals("L")) {
            return capL();
        }
        if (value.equals("M")) {
            return capM();
        }
        if (value.equals("N")) {
            return capN();
        }
        if (value.equals("O")) {
            return capO();
        }
        if (value.equals("P")) {
            return capP();
        }
        if (value.equals("Q")) {
            return capQ();
        }
        if (value.equals("R")) {
            return capR();
        }
        if (value.equals("S")) {
            return capS();
        }
        if (value.equals("T")) {
            return capT();
        }
        if (value.equals("U")) {
            return capU();
        }
        if (value.equals("V")) {
            return capV();
        }
        if (value.equals("W")) {
            return capW();
        }
        if (value.equals("X")) {
            return capX();
        }
        if (value.equals("Y")) {
            return capY();
        }
        if (value.equals("Z")) {
            return capZ();
        }
        else
        {
            System.out.println("Special \ncharacters \nare \nnot \nallowed");
        }
             }
        catch(Exception e)
        {
          e.printStackTrace();
        }
             

        return null;

    }
}
