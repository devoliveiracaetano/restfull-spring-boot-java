package com.altsystem.Teste4.math;

import com.altsystem.Teste4.exceptions.UnsuportedMathOperationException;
import org.springframework.web.bind.annotation.PathVariable;

public class SimpleMath {
    public Double sun(Double num01, Double num02) {
        return num01 + num02;
    }

    public Double substraction(Double num01, Double num02) {
        return num01 - num02;
    }

    public Double multiplication(Double num01, Double num02) {
        return num01 - num02;
    }

    public Double division(Double num01, Double num02) {
        return num01 / num02;
    }

    public Double mean(Double num01, Double num02) {
        return (num01 + num02) /2;
    }

    public Double squareRoot(Double num01, Double num02) {
        return Math.sqrt (num01 + num02);
    }








}
