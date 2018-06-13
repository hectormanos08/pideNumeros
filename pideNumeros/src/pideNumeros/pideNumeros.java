/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pideNumeros;

import javax.swing.JOptionPane;

/**
 *
 * @author HECTOR MANUEL GRAZIOSI CACERES
 */
public class pideNumeros {

    public static void pideNums() {
        int contadorNums;
        int[] numeros1 = new int[100];
        boolean pedir = true;

        for (contadorNums = 0; pedir == true; contadorNums++) {
            if (pedir) {
                String pregunta = JOptionPane.showInputDialog("Introduce tu num");
                if (!"".equals(pregunta)) {
                    int respuesta = Integer.parseInt(pregunta);
                    numeros1[contadorNums] = respuesta;

                } else {
                    int respuesta1 = JOptionPane.showConfirmDialog(null, "Desea seguir añadiendo numeros?");
                    if (respuesta1 == 0) {
                        pedir = true;
                    }
                    if (respuesta1 == 1) {
                        pedir = false;
                    }
                    if (respuesta1 == 2) {
                        pedir = true;
                    }
                }
            }
        }

        analizaArray(numeros1, contadorNums - 1);
    }

    private static void analizaArray(int[] numeros1, int contadorNums) {
        int valorMax = 0, valorMin = 0, sumaTotal = 0, sumaPos = 0, sumaNeg = 0, mediaSuma = 0;

        int[] numeros2 = new int[contadorNums];

        System.arraycopy(numeros1, 0, numeros2, 0, contadorNums);

        for (int i = 0; i < numeros2.length; i++) {
            if (numeros2[i] > valorMax) {
                valorMax = numeros2[i];
            }
        }

        for (int i = 0; i < numeros2.length; i++) {
            if (numeros2[i] < valorMin) {
                valorMin = numeros2[i];
            }
        }

        for (int i = 0; i < numeros2.length; i++) {
            sumaTotal += numeros2[i];
        }

        for (int i = 0; i < numeros2.length; i++) {
            if (numeros2[i] > 0) {
                sumaPos += numeros2[i];

            }
        }

        for (int i = 0; i < numeros2.length; i++) {
            if (numeros2[i] < 0) {
                sumaNeg += numeros2[i];

            }
        }

        for (int i = 0; i < numeros2.length; i++) {

            mediaSuma = sumaTotal / numeros2.length;

        }

        System.out.println("Valor Maximo = " + valorMax + ". Valor minimo= " + valorMin + ". Suma total= " + sumaTotal
                + ". Suma pos= " + sumaPos + ". Suma neg= " + sumaNeg + ". Media total= " + mediaSuma + ".");
    }

    public static void main(String[] args) {
        // TODO code application logic here
        pideNums();
    }

}
