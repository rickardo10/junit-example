import java.util.*;

public class main{
    public static void main( String args[] ){
        ArrayList<ArrayList<Double>> data = readCSV.readFile("data.csv");
        for( ArrayList<Double> list : data ) System.out.println(list);    
    }
}
