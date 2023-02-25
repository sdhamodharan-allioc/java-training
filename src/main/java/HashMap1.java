
import java.util.HashMap;

public class HashMap1 {
    public static void main(String[] args) {
        HashMap<String,String>  cap = new HashMap<String , String>();
            cap.put("TamilNadu","Chennai");
           // System.out.println(cap);
            cap.put("Andhra Pradesh", "Hyderabad");
            cap.put("kerala", "cochin");
            cap.size();
           for (String i : cap.keySet())
          //  for (String i :cap.values())
            {
                System.out.println( "key:"     +i+      "values:" +cap.get(i));
            }
    }
}
