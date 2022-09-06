package com.calculatorExcep;

import com.calculatorExcep.ExceptionsNew.NullException;

import java.util.List;

public class Calculator {

    private List<Integer> inputs;

    public Calculator(List<Integer> inputs) throws NullException {

        this.inputs = inputs;

        if(inputs.size()==0){
            throw new NullException("Array is Empty");
        }else{
            System.out.println(sum(inputs));
        }


    }

    public int sum(List<Integer> input){

        int sum=0;

        for(int i=0; i<input.size(); i++){
            sum=sum+input.get(i);
        }

        return sum;
    }
}
