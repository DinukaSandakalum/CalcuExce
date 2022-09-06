import com.calculatorExcep.Calculator;
import com.calculatorExcep.ExceptionsNew.NullException;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> a = List.of(1,2,3,4,5,6);
        List<Integer> b = List.of();

        Calculator cal = new Calculator();

        try {
            cal.sum(a);
        }
        catch (NullException ne){
            System.out.println(ne.getMessage());
        }

        try{
            cal.sum(b);
        }
        catch (NullException ne){
            System.out.println(ne.getMessage());
        }

    }
}