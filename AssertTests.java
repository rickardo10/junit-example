import java.util.*;
import org.junit.*;

/**
 *  Test for {@link Statistics}
 *
 *   @author r.ocampo.vega@gmail.com (Ricardo Ocampo)
 */

public class AssertTests{

    @Test
    public void AssertMean(){
        ArrayList<ArrayList<Double>> data_test = ReadFile.readFile("data.csv");
        double means[] = {401.2898890532, 0.0005554669, 0.000048556093, 3.4658859959};

        for( int i = 0; i < data_test.size(); i++ ){
            Assert.assertEquals( means[i], Statistics.mean( data_test.get(i) ), .0000000001 );
        }
    }

    @Test
    public void AssertGeo(){
        ArrayList<ArrayList<Double>> data_test = ReadFile.readFile("data.csv");
        double geos[] = {294.4666090867, 0.0004247887, .0000349097421955421, 1.0868103662};

        for( int i = 0; i < data_test.size(); i++ ){
            Assert.assertEquals( geos[i], Statistics.geometricMean( data_test.get(i) ), .0000000001 );
        }
    }

    @Test
    public void AssertStdev(){
        ArrayList<ArrayList<Double>> data_test = ReadFile.readFile("data.csv");
        double stdevs[] = {249.5346447581, 0.0003229984, 0.0000307414610965944, 13.1985104821486};

        for( int i = 0; i < data_test.size(); i++ ){
            Assert.assertEquals( stdevs[i], Statistics.stdev( data_test.get(i) ), .0000000001 );
        }
    }
}
