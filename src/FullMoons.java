import static java.lang.System.out;
import java.io.*;
import java.util.*;

public class FullMoons {
    public static void main (String[] args) {

        Calendar c = Calendar.getInstance();

        c.set(2004,0,7,15,40);

        long day1 = c.getTimeInMillis();

        int DAY_IM = 1000 *60*60*24;

        day1+=(DAY_IM*29.52);
        

        out.println((String.format("full moon on %tc", c)));
    }
}
