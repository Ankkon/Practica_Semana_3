package com.mycompany.tarea_programacion;

import javax.swing.JOptionPane;

public class Calculos {

    private int anosAnt;
    private int cantHoras;
    private float pagoHora;
    private float salarioBruto;

    public String Calculo() {
        float salarioNeto = 0;
        float bono = 0;

        anosAnt = Integer.parseInt(JOptionPane.showInputDialog(
                "Ingrese los años de antiguedad en la empresa: "));
        cantHoras = Integer.parseInt(JOptionPane.showInputDialog(
                "Ingrese las horas laboradas por semana: "));
        pagoHora = Integer.parseInt(JOptionPane.showInputDialog(
                "Ingrese el pago por hora: "));

        salarioBruto = cantHoras * pagoHora;

        if (anosAnt > 10) {
            bono = (float) (salarioBruto * 0.20);
            salarioBruto = salarioBruto + bono;

            if (salarioBruto > 1000 && salarioBruto < 2000) {
                salarioNeto = (float) (salarioBruto - (salarioBruto * 0.10));

                return "El salario bruto semanal con el bono es de: " + salarioBruto + " El bono correspondiente es de: "
                        + bono + " El salario neto semanal es de: " + salarioNeto;

            } else if (salarioBruto > 2000) {

                salarioNeto = (float) (salarioBruto - (salarioBruto * 0.15));
                return "El salario bruto semanal con el bono es de: " + salarioBruto + " El bono correspondiente es de: "
                        + bono + " El salario neto semanal es de: " + salarioNeto;
            } else {
                return "El salario bruto no es mayor a 1000";
            }

        } else {
            return "El salario bruto es de: " + salarioBruto;

        }

    }

}
