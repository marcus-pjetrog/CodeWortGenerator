/* That was my first Project, it is for create and demontrate Code-Words
 * 2021-05-28
 * marcus.pjetrog.2020@gmail.com
 */

package com.pjetrog;

import java.util.Random;
import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        // Datensatz
        String alphabetL = "abcdefghijklmnopqrstuvwxyz";
        String alphabetU = alphabetL.toUpperCase();
        String  numbers = "1234567890";

        String allData = alphabetL + alphabetU + numbers;

        String codewort = "Das Codewort lautet: ";
        int codeWortLaenge = 0;

        while(true){
            try{
                codeWortLaenge = Integer.parseInt(JOptionPane.showInputDialog("Länge des Codeworts: "));
                if(codeWortLaenge < 6) continue;
                break;
            }catch (Exception ex){

            }
        }

        // Objekt für Zufallszahl
        Random rd = new Random();
        int index = 0;

        for(int i = 0; i < codeWortLaenge; i++){
            // Zufallsindex wird erzeugt
            index = rd.nextInt(allData.length());
            codewort += allData.charAt(index);
            //System.out.print(allData.charAt(index));
        }

        JOptionPane.showMessageDialog(null, codewort);

        System.exit(0);

    }
}
