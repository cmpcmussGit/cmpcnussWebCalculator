/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cmpcmss.calculator.web;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.model.SelectItem;

/**
 *
 * @author cmpcmuss
 */
@Named(value = "calculatorController")
@SessionScoped
public class CalculatorController implements Serializable {

    private int a;
    private int b;
    private int c;
    private int d;
    private int e;

    private int result;
    private String calculationType;

    private static String Addition = "Addition";
    private static String AdditionSubtraction = "AdditionSubtraction";
    private static String AdditionDivision = "AdditionDivision";
    private static String AdditionMultiplication = "AdditionMultiplication";
    private static String AdditionSubtractionDivision = "AdditionSubtractionDivision";
    private static String AdditionSubtractionMultiplication = "AdditionSubtractionMultiplication";
    private static String AdditionSubtractionDivisionMultiplication = "AdditionSubtractionDivisionMultiplication";
    private static String AdditionSubtractionDivisionAddition = "AdditionSubtractionDivisionAddition";
    private static String AdditionSubtractionDivisionSubtraction = "AdditionSubtractionDivisionSubtraction";
    private static String AdditionSubtractionMultiplicationDivision = "AdditionSubtractionMultiplicationDivision";
    private static String AdditionSubtractionMultiplicationAddition = "AdditionSubtractionMultiplicationAddition";
    private static String AdditionSubtractionMultiplicationSubtraction = "AdditionSubtractionMultiplicationSubtraction";

    private static String Subtraction = "Subtraction";
    private static String SubtractionAddition = "SubtractionAddition";
    private static String SubtractionDivision = "SubtractionDivision";
    private static String SubtractionMultiplication = "SubtractionMultiplication";
    private static String SubtractionAdditionDivision = "SubtractionAdditionDivision";
    private static String SubtractionAdditionMultiplication = "SubtractionAdditionMultiplication";
    private static String SubtractionAdditionDivisionMultiplication = "SubtractionAdditionDivisionMultiplication";
    private static String SubtractionAdditionMultiplicationDivision = "SubtractionAdditionMultiplicationDivision";
    private static String SubtractionAdditionDivisionAddition = "SubtractionAdditionDivisionAddition";
    private static String SubtractionAdditionDivisionSubtraction = "SubtractionAdditionDivisionSubtraction";
    private static String SubtractionAdditionMultiplicationAddition = "SubtractionAdditionMultiplicationAddition";
    private static String SubtractionAdditionMultiplicationSubtraction = "SubtractionAdditionMultiplicationSubtraction";

    private static String Division = "Division";
    private static String DivisionAddition = "DivisionAddition";
    private static String DivisionSubtraction = "DivisionSubtraction";
    private static String DivisionMultiplication = "DivisionMultiplication";
    private static String DivisionMultiplicationSubtractionAddition = "DivisionMultiplicationSubtractionAddition";
    private static String DivisionMultiplicationAddition = "DivisionMultiplicationAddition";
    private static String DivisionMultiplicationAdditionSubtraction = "DivisionMultiplicationAdditionSubtraction";
    private static String DivisionMultiplicationAdditionDivition = "DivisionMultiplicationAdditionDivition";
    private static String DivisionMultiplicationAdditionMultiplication = "DivisionMultiplicationAdditionMultiplication";
    private static String DivisionMultiplicationSubtraction = "DivisionMultiplicationSubtraction";
    private static String DivisionMultiplicationSubtractionDivition = "DivisionMultiplicationSubtractionDivition";
    private static String DivisionMultiplicationSubtractionMultiplication = "DivisionMultiplicationSubtractionMultiplication";

    private static String Multiplication = "Multiplication";
    private static String MultiplicationAddition = "MultiplicationAddition";
    private static String MultiplicationSubtraction = "MultiplicationSubtraction";
    private static String MultiplicationDivision = "MultiplicationDivision";
    private static String MultiplicationDivisionAddition = "MultiplicationDivisionAddition";
    private static String MultiplicationDivisionSubtraction = "MultiplicationDivisionSubtraction";
    private static String MultiplicationDivisionAdditionSubtraction = "MultiplicationDivisionAdditionSubtraction";
    private static String MultiplicationDivisionAdditionDivision = "MultiplicationDivisionAdditionDivision";
    private static String MultiplicationDivisionAdditionMultiplication = "MultiplicationDivisionAdditionMultiplication";
    private static String MultiplicationDivisionSubtractionAddition = "MultiplicationDivisionSubtractionAddition";
    private static String MultiplicationDivisionSubtractionDivision = "MultiplicationDivisionSubtractionDivision";
    private static String MultiplicationDivisionSubtractionMultiplicantion = "MultiplicationDivisionSubtractionMultiplicantion";

    List<SelectItem> calculationList;

    /**
     * Creates a new instance of CalculatorController
     */
    public CalculatorController() {
        //Initialize variables
        a = 0;
        b = 0;
        c = 0;
        d = 0;
        e = 0;
        result = 0;
        calculationType = null;
        // Initialize the list of values for the SelectOneMenu
        populateCalculationList();
    }

    /**
     * @return the num1
     */
    public int getA() {
        return a;
    }

    /**
     * @param num1 the num1 to set
     */
    public void setA(int a) {
        this.a = a;
    }

    /**
     * @return the num2
     */
    public int getB() {
        return b;
    }

    /**
     * @param num2 the num2 to set
     */
    public void setB(int b) {
        this.b = b;
    }

    /**
     * @return the num2
     */
    public int getC() {
        return c;
    }

    /**
     * @param num2 the num2 to set
     */
    public void setC(int c) {
        this.c = c;
    }

    /**
     * @return the num2
     */
    public int getD() {
        return d;
    }

    /**
     * @param num4 the num2 to set
     */
    public void setD(int d) {
        this.d = d;
    }

    /**
     * @return the num5
     */
    public int getE() {
        return e;
    }

    /**
     * @param num5 the num5 to set
     */
    public void setE(int e) {
        this.e = e;
    }

    /**
     * @return the result
     */
    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public String getCalculationType() {
        return calculationType;
    }

    public void setCalculationType(String calculationType) {
        this.calculationType = calculationType;
    }

    public List<SelectItem> getCalculationList() {
        return calculationList;
    }

    private void populateCalculationList() {
        calculationList = new ArrayList<SelectItem>();

        calculationList.add(new SelectItem(Addition));
        calculationList.add(new SelectItem(AdditionSubtraction));
        calculationList.add(new SelectItem(AdditionDivision));
        calculationList.add(new SelectItem(AdditionMultiplication));
        calculationList.add(new SelectItem(AdditionSubtractionDivision));
        calculationList.add(new SelectItem(AdditionSubtractionMultiplication));
        calculationList.add(new SelectItem(AdditionSubtractionDivisionMultiplication));
        calculationList.add(new SelectItem(AdditionSubtractionDivisionAddition));
        calculationList.add(new SelectItem(AdditionSubtractionDivisionSubtraction));
        calculationList.add(new SelectItem(AdditionSubtractionMultiplicationDivision));
        calculationList.add(new SelectItem(AdditionSubtractionMultiplicationAddition));
        calculationList.add(new SelectItem(AdditionSubtractionMultiplicationSubtraction));

        calculationList.add(new SelectItem(Subtraction));
        calculationList.add(new SelectItem(SubtractionAddition));
        calculationList.add(new SelectItem(SubtractionDivision));
        calculationList.add(new SelectItem(SubtractionMultiplication));
        calculationList.add(new SelectItem(SubtractionAdditionDivision));
        calculationList.add(new SelectItem(SubtractionAdditionMultiplication));
        calculationList.add(new SelectItem(SubtractionAdditionDivisionMultiplication));
        calculationList.add(new SelectItem(SubtractionAdditionMultiplicationDivision));
        calculationList.add(new SelectItem(SubtractionAdditionDivisionAddition));
        calculationList.add(new SelectItem(SubtractionAdditionDivisionSubtraction));
        calculationList.add(new SelectItem(SubtractionAdditionMultiplicationAddition));
        calculationList.add(new SelectItem(SubtractionAdditionMultiplicationSubtraction));

        calculationList.add(new SelectItem(Division));
        calculationList.add(new SelectItem(DivisionAddition));
        calculationList.add(new SelectItem(DivisionSubtraction));
        calculationList.add(new SelectItem(DivisionMultiplication));
        calculationList.add(new SelectItem(DivisionMultiplicationSubtractionAddition));
        calculationList.add(new SelectItem(DivisionMultiplicationAddition));
        calculationList.add(new SelectItem(DivisionMultiplicationAdditionSubtraction));
        calculationList.add(new SelectItem(DivisionMultiplicationAdditionDivition));
        calculationList.add(new SelectItem(DivisionMultiplicationAdditionMultiplication));
        calculationList.add(new SelectItem(DivisionMultiplicationSubtraction));
        calculationList.add(new SelectItem(DivisionMultiplicationSubtractionDivition));
        calculationList.add(new SelectItem(DivisionMultiplicationSubtractionMultiplication));

        calculationList.add(new SelectItem(Multiplication));
        calculationList.add(new SelectItem(MultiplicationAddition));
        calculationList.add(new SelectItem(MultiplicationSubtraction));
        calculationList.add(new SelectItem(MultiplicationDivision));
        calculationList.add(new SelectItem(MultiplicationDivisionAddition));
        calculationList.add(new SelectItem(MultiplicationDivisionSubtraction));
        calculationList.add(new SelectItem(MultiplicationDivisionAdditionSubtraction));
        calculationList.add(new SelectItem(MultiplicationDivisionAdditionDivision));
        calculationList.add(new SelectItem(MultiplicationDivisionAdditionMultiplication));
        calculationList.add(new SelectItem(MultiplicationDivisionSubtractionAddition));
        calculationList.add(new SelectItem(MultiplicationDivisionSubtractionDivision));
        calculationList.add(new SelectItem(MultiplicationDivisionSubtractionMultiplicantion));
    }

    public void performCalculation() {
        if (getCalculationType().equals(Addition)) {
            setResult(a + b);
        } else if (getCalculationType().equals(AdditionSubtraction)) {
            setResult(a + b - c);
        } else if (getCalculationType().equals(AdditionDivision)) {
            setResult((a + b) / c);
        } else if (getCalculationType().equals(AdditionMultiplication)) {
            setResult((a + b) * c);
        } else if (getCalculationType().equals(AdditionSubtractionDivision)) {
            setResult(((a + b) - c) / d);
        } else if (getCalculationType().equals(AdditionSubtractionMultiplication)) {
            setResult(((a + b) - c) * d);
        } else if (getCalculationType().equals(AdditionSubtractionDivisionMultiplication)) {
            setResult((((a + b) - c) / d) * e);
        } else if (getCalculationType().equals(AdditionSubtractionDivisionAddition)) {
            setResult((((a + b) - c) / d) + e);
        } else if (getCalculationType().equals(AdditionSubtractionDivisionSubtraction)) {
            setResult((((a + b) - c) / d) - e);
        } else if (getCalculationType().equals(AdditionSubtractionMultiplicationDivision)) {
            setResult((((a + b) - c) * d) / e);
        } else if (getCalculationType().equals(AdditionSubtractionMultiplicationAddition)) {
            setResult((((a + b) - c) * d) + e);
        } else if (getCalculationType().equals(AdditionSubtractionMultiplicationSubtraction)) {
            setResult((((a + b) - c) * d) - e);
//subtraction
        } else if (getCalculationType().equals(Subtraction)) {
            setResult(a - b);
        } else if (getCalculationType().equals(SubtractionAddition)) {
            setResult((a - b) + c);
        } else if (getCalculationType().equals(SubtractionDivision)) {
            setResult((a - b) / c);
        } else if (getCalculationType().equals(SubtractionMultiplication)) {
            setResult((a - b) * c);
        } else if (getCalculationType().equals(SubtractionAdditionDivision)) {
            setResult(((a - b) + c) / d);
        } else if (getCalculationType().equals(SubtractionAdditionMultiplication)) {
            setResult(((a - b) + c) * d);
        } else if (getCalculationType().equals(SubtractionAdditionDivisionMultiplication)) {
            setResult((((a - b) + c) / d) * e);
        } else if (getCalculationType().equals(SubtractionAdditionMultiplicationDivision)) {
            setResult((((a - b) + c) * d) / e);
        } else if (getCalculationType().equals(SubtractionAdditionDivisionAddition)) {
            setResult((((a - b) + c) / d) + e);
        } else if (getCalculationType().equals(SubtractionAdditionDivisionSubtraction)) {
            setResult((((a - b) + c) / d) - e);
        } else if (getCalculationType().equals(SubtractionAdditionMultiplicationAddition)) {
            setResult((((a - b) + c) * d) + e);
        } else if (getCalculationType().equals(SubtractionAdditionMultiplicationSubtraction)) {
            setResult((((a - b) + c) * d) - e);
//division            
        } else if (getCalculationType().equals(Division)) {
            setResult(a / b );
        } else if (getCalculationType().equals(DivisionAddition)) {
            setResult(a / b + c);
        } else if (getCalculationType().equals(DivisionSubtraction)) {
            setResult(a / b - c);
        } else if (getCalculationType().equals(DivisionMultiplication)) {
            setResult((a / b) * c);
        } else if (getCalculationType().equals(DivisionMultiplicationSubtractionAddition)) {
            setResult((((a / b) * c) - d) + e);
        } else if (getCalculationType().equals(DivisionMultiplicationAddition)) {
            setResult(((a / b) * c) + d);
        } else if (getCalculationType().equals(DivisionMultiplicationSubtraction)) {
            setResult(((a / b) * c) - d);            
        } else if (getCalculationType().equals(DivisionMultiplicationAdditionSubtraction)) {
            setResult((((a / b) * c) + d) - e);
        } else if (getCalculationType().equals(DivisionMultiplicationAdditionDivition)) {
            setResult((((a / b) * c) + d) / e);
        } else if (getCalculationType().equals(DivisionMultiplicationAdditionMultiplication)) {
            setResult((((a / b) * c) + d) * e);
        } else if (getCalculationType().equals(DivisionMultiplicationSubtractionDivition)) {
            setResult((((a / b) * c) - d) / e);
        } else if (getCalculationType().equals(DivisionMultiplicationSubtractionMultiplication)) {
            setResult((((a / b) * c) - d) * e);

//Multiplication           
        } else if (getCalculationType().equals(Multiplication)) {
            setResult(a * b);
        } else if (getCalculationType().equals(MultiplicationAddition)) {
            setResult(a * b + c);
        } else if (getCalculationType().equals(MultiplicationSubtraction)) {
            setResult(a * b - c);
        } else if (getCalculationType().equals(MultiplicationDivision)) {
            setResult(a * b / c);
        } else if (getCalculationType().equals(MultiplicationDivisionAddition)) {
            setResult(a * b / c + d);
        } else if (getCalculationType().equals(MultiplicationDivisionSubtraction)) {
            setResult(a * b / c - d);
        } else if (getCalculationType().equals(MultiplicationDivisionAdditionSubtraction)) {
            setResult(a * b / c + d - e);
        } else if (getCalculationType().equals(MultiplicationDivisionAdditionDivision)) {
            setResult((((a * b) /c ) + d) / e);
        } else if (getCalculationType().equals(MultiplicationDivisionAdditionMultiplication)) {
            setResult((((a * b) /c ) + d)*e);
        } else if (getCalculationType().equals(MultiplicationDivisionSubtractionAddition)) {
            setResult((((a * b) /c ) - d) + e);
        } else if (getCalculationType().equals(MultiplicationDivisionSubtractionDivision)) {
            setResult((((a * b) /c ) - d) / e);
        } else if (getCalculationType().equals(MultiplicationDivisionSubtractionMultiplicantion)) {
            try {

                setResult((((a * b) /c ) - d) * e);

            } catch (Exception ex) {
                FacesMessage facesMsg = new FacesMessage(FacesMessage.SEVERITY_ERROR,
                        "Invalid Calculation", "Invalid Calculation");
                FacesContext.getCurrentInstance().addMessage(null, facesMsg);
            }
        }
    }
}
