import java.util.ArrayList;

public class Statistics{

    public static double mean( ArrayList<Double> data ){
        double ave = 0;
        for( Double i : data ) ave += i;
        return ave / data.size();
    }

    public static double geometricMean( ArrayList<Double> data ){
        double geo = data.get(0);
        for( int i = 1; i < data.size(); i++ )
        {
            geo *= data.get(i);
        }
        return Math.pow( geo, (double) 1 / data.size() );
    }

    public static double stdev( ArrayList<Double> data ){
        double dev = 0;
        double ave = mean( data );
        for( Double i : data ) dev += Math.pow( i - ave, 2 );
        return Math.sqrt(  dev  / ( data.size() - 1 ) );
    }

}
