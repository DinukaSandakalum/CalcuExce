import com.calculatorExcep.Calculator;
import com.calculatorExcep.ExceptionsNew.NullException;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> a = List.of(1,2,3,4,5,6);
        List<Integer> b = List.of();

        try {
            Calculator cal = new Calculator(b);
        }
        catch (NullException ne){
            System.out.println(ne.getMessage());
        }

        try{
            Calculator cal1 = new Calculator(a);
        }
        catch (NullException ne){
            System.out.println(ne.getMessage());
        }

    }
}