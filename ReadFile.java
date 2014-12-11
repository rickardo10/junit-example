import java.io.*;
import java.util.*;

public class ReadFile
{
    public static void main( String args[] )
    {
        System.out.println( "Hello!" );
    }
        
    public static ArrayList<ArrayList<Double>> readFile( String path )
    {
        BufferedReader br = null;
        String line = "";
        ArrayList<ArrayList<Double>> lines = new ArrayList<ArrayList<Double>>();
        for( int i = 0; i < 4; i++ ) lines.add( new ArrayList<Double>() );

        try
        {
            br = new BufferedReader( new FileReader(path) );
            while( ( line = br.readLine() ) != null )
            {
                String doubles[] = line.split(",");
                for( int i = 0; i < doubles.length; i++ )
                {
                    if( !doubles[i].isEmpty() )
                    {
                        lines.get(i).add( new Double( doubles[i] ) );
                    }
                }
            }
        } 
        catch( FileNotFoundException e )
        {
            e.printStackTrace();
        } 
        catch( IOException e )
        {
            e.printStackTrace();
        } 
        finally
        {
            try
            {
                br.close();
            } 
            catch( IOException e )
            {
                e.printStackTrace();
            }
        }
        return lines;
    }
}
