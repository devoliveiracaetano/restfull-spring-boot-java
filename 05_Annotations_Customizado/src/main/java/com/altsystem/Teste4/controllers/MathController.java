package com.altsystem.Teste4.controllers;

import com.altsystem.Teste4.exceptions.UnsuportedMathOperationException;
import com.altsystem.Teste4.math.SimpleMath;
import com.altsystem.Teste4.request.converter.NumberConverter;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/math")
public class MathController {

    public SimpleMath math = new SimpleMath();

    // http://localhost:8080/math/sum/5/7 -- SOMA
    @RequestMapping("/sum/{num01}/{num02}")
    public double sun(
            @PathVariable("num01")
            String num01,
            @PathVariable("num02")
            String num02) throws Exception {

        if(!NumberConverter.isNumeric(num01) || (!NumberConverter.isNumeric(num02)))
            throw new UnsuportedMathOperationException("Por favor insira um valor numérico!");

        return math.sun(NumberConverter.convertToDouble(num01),NumberConverter.convertToDouble(num02));
   }

    // http://localhost:8080/math/substraction/5/7 -- Subtração
    @RequestMapping("/substraction/{num01}/{num02}")
    public double substraction(
            @PathVariable("num01") String num01,
            @PathVariable("num02") String num02) throws UnsuportedMathOperationException {

        if(!NumberConverter.isNumeric(num01) || (!NumberConverter.isNumeric(num02)))
            throw new UnsuportedMathOperationException("Por favor, insira um número inteiro!");

        return math.substraction(NumberConverter.convertToDouble(num01),NumberConverter.convertToDouble(num02));
    }

    // http://localhost:8080/math/multiplication/5/7 -- Multiplicação

    @RequestMapping("/multiplication/{num01}/{num02}")
    public double multiplication(
            @PathVariable("num01") String num01,
            @PathVariable("num02") String num02) throws UnsuportedMathOperationException {

        if(!NumberConverter.isNumeric(num01) || (!NumberConverter.isNumeric(num02)))
             throw new UnsuportedMathOperationException("Por favor Insira um número inteiro");

         return math.multiplication(NumberConverter.convertToDouble(num01), NumberConverter.convertToDouble(num02));
    }

    // http://localhost:8080/math/division/5/7 -- Divisão

    @RequestMapping("/division/{num01}/{num02}")
    public double division(
            @PathVariable("num01") String num01,
            @PathVariable("num02") String num02) throws UnsuportedMathOperationException {

        if(!NumberConverter.isNumeric(num01) || (!NumberConverter.isNumeric(num02)))
            throw new UnsuportedMathOperationException("insira um valor numerico!");

        return math.division(NumberConverter.convertToDouble(num01),NumberConverter.convertToDouble(num02));
    }

    // http://localhost:8080/math/mean/5/7 -- Média
    @RequestMapping("/mean/{num01}/{num02}")
    public double mean(
            @PathVariable("num01") String num01,
            @PathVariable("num02") String num02){
        if(!NumberConverter.isNumeric(num01) || (!NumberConverter.isNumeric(num02)))
            throw new UnsuportedMathOperationException("Por favor, insira um valor numético!");

        return math.mean(NumberConverter.convertToDouble(num01),NumberConverter.convertToDouble(num02));
    }

    // http://localhost:8080/math/squareRoot/5/7 -- Raiz Quadrada

    @RequestMapping("/squareroot/{num01}/{num02}")
    private Double squareRoot(
            @PathVariable("num01") String num01,
            @PathVariable("num02") String num02){

        if(!NumberConverter.isNumeric(num01) || (!NumberConverter.isNumeric(num02)))
            throw new UnsuportedMathOperationException("Insira um valor numérico!");
        return math.squareRoot( NumberConverter.convertToDouble(num01),NumberConverter.convertToDouble(num02));

    }















}
