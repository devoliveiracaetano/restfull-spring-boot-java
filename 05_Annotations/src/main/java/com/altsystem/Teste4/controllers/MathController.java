package com.altsystem.Teste4.controllers;

import com.altsystem.Teste4.exceptions.UnsuportedMathOperationException;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/math")
public class MathController {

    // http://localhost:8080/math/sum/5/7 -- SOMA
    @RequestMapping("/sum/{num01}/{num02}")
    public double sun(
            @PathVariable("num01")
            String num01,
            @PathVariable("num02")
            String num02) throws Exception {

        if(!isNumeric(num01) || (!isNumeric(num02)))
            throw new UnsuportedMathOperationException("Por favor insira um valor numérico!");
                return convertToDouble(num01) + convertToDouble(num02);
    }

    // http://localhost:8080/math/substraction/5/7 -- Subtração
    @RequestMapping("/substraction/{num01}/{num02}")
    public double substraction(
            @PathVariable("num01") String num01,
            @PathVariable("num02") String num02) throws UnsuportedMathOperationException {

        if(!isNumeric(num01) || (!isNumeric(num02)))
            throw new UnsuportedMathOperationException("Por favor, insira um número inteiro!");

        return convertToDouble(num01) - convertToDouble(num02);
    }

    // http://localhost:8080/math/multiplication/5/7 -- Multiplicação

    @RequestMapping("/multiplication/{num01}/{num02}")
    public double multiplication(
            @PathVariable("num01") String num01,
            @PathVariable("num02") String num02) throws UnsuportedMathOperationException {

         if(!isNumeric(num01) || (!isNumeric(num02)))
             throw new UnsuportedMathOperationException("Por favor Insira um número inteiro");

         return convertToDouble(num01) * convertToDouble(num02);
    }

    // http://localhost:8080/math/division/5/7 -- Divisão

    @RequestMapping("/division/{num01}/{num02}")
    public double division(
            @PathVariable("num01") String num01,
            @PathVariable("num02") String num02) throws UnsuportedMathOperationException {

        if(!isNumeric(num01) || (!isNumeric(num02)))
            throw new UnsuportedMathOperationException("insira um valor numerico!");

        return convertToDouble(num01) / convertToDouble(num02);
    }

    // http://localhost:8080/math/mean/5/7 -- Média
    @RequestMapping("/mean/{num01}/{num02}")
    public double mean(
            @PathVariable("num01") String num01,
            @PathVariable("num02") String num02){
        if(!isNumeric(num01) || (!isNumeric(num02)))
            throw new UnsuportedMathOperationException("Por favor, insira um valor numético!");

        return (convertToDouble(num01) + convertToDouble(num02)) /2;

    }

    // http://localhost:8080/math/squareRoot/5/7 -- Raiz Quadrada

    @RequestMapping("/squareroot/{num01}/{num02}")
    private Double squareRoot(
            @PathVariable("num01") String num01,
            @PathVariable("num02") String num02){

        if(!isNumeric(num01) || (!isNumeric(num02)))
            throw new UnsuportedMathOperationException("Insira um valor numérico!");
        return Math.sqrt(convertToDouble(num01) + convertToDouble(num02));

    }













    private Double convertToDouble(String strNumber) throws IllegalArgumentException {
       if(strNumber == null || strNumber.isEmpty())
           throw new UnsuportedMathOperationException("Por favor insira um valor numérico!");
       String number = strNumber.replace(".", ",");
        return Double.parseDouble(number);
    }

    private boolean isNumeric(String strNumber) {

        if(strNumber == null || strNumber.isEmpty())
            return false;
        String number = strNumber.replace(".", ",");
         return  number.matches("[-+]?[0-9]*\\.?[0-9]+");
    }


}
