package com.calculatorExcep;

import com.calculatorExcep.ExceptionsNew.NullException;

import java.util.List;

public class Calculator {

    private List<Integer> inputs;


    public void sum(List<Integer> input) throws NullException {

        this.inputs = input;

        if(inputs.size()==0){
            throw new NullException("Array is Empty");
        }else{
            int sum=0;

            for(int i=0; i<input.size(); i++){
                sum=sum+input.get(i);
            }

            System.out.println(sum);
        }


    }
}
