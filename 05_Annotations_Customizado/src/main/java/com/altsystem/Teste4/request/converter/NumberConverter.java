package com.altsystem.Teste4.request.converter;

import com.altsystem.Teste4.exceptions.UnsuportedMathOperationException;

public class NumberConverter {

    public static  Double convertToDouble(String strNumber) throws IllegalArgumentException {
        if(strNumber == null || strNumber.isEmpty())
            throw new UnsuportedMathOperationException("Por favor insira um valor numérico!");
        String number = strNumber.replace(".", ",");
        return Double.parseDouble(number);
    }

    public static boolean isNumeric(String strNumber) {

        if(strNumber == null || strNumber.isEmpty())
            return false;
        String number = strNumber.replace(".", ",");
        return  number.matches("[-+]?[0-9]*\\.?[0-9]+");
    }

}
