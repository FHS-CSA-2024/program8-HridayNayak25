//import stuff here
import java.lang.Math;
//Your code here
public class math{
    public double number1;
    public double number2;
    public double list;
    
    
    public String math(double number1, double number2){
        String output = "";
        double sum = number1 + number2;
        double diff = number1 - number2;
        double product = number1 * number2;
        double average = ((number1 + number2)/2);
        double absVal = Math.abs(diff);
        double maxVal = Math.max(number1,number2);
        double minVal = Math.min(number1,number2);
        
        output = ("Sum: " + sum + "Difference: " + diff + "Product: "+ product +
        "Average: " + average + "Absoulute: " + absVal + "Maximum: " + maxVal +
        "Minimum: " + minVal);
        
        return output;
        
        
        
        
    }
    
       
    









}


//Paste console output below:
/*
    System.out.println(output);

*/

