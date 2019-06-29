import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.io.File;

public class LoadApplicationData {
    static boolean completedRetrieval = false;

    public LoadApplicationData(){ }

    public boolean fileExists(String fileName){
      File fp = new File(fileName);

      if ( fp.exists()){
          return true;
      } else {
        return false;
      }
    }

    public static void retrieveData(String fName){
      JSONParser parser = new JSONParser();

      try {

          Object obj = parser.parse(new FileReader(fName));

          JSONObject jsonObject = (JSONObject) obj;
          System.out.println(jsonObject);

          String firstname = (String) jsonObject.get("firstname");
          String lastname = (String) jsonObject.get("lastname");
          String strasse = (String) jsonObject.get("strasse");
          String stadt = (String) jsonObject.get("stadt");
          String plz = (String) jsonObject.get("plz");
          String land = (String) jsonObject.get("land");

          System.out.println(firstname);
          System.out.println(lastname);
          System.out.println(strasse);
          System.out.println(stadt);
          System.out.println(plz);
          System.out.println(land);
          // long age = (Long) jsonObject.get("age");
          // System.out.println(age);
          // loop array
          JSONArray msg = (JSONArray) jsonObject.get("lineItems");
          Iterator<String[]> iterator = msg.iterator();
          while (iterator.hasNext()) {
              System.out.println(iterator.next());
          }

      } catch (FileNotFoundException e) {
          e.printStackTrace();
      } catch (IOException e) {
          e.printStackTrace();
      } catch (ParseException e) {
          e.printStackTrace();
      }

    }


    public static void main(String... args) {
      String fileName = "test.json";
      LoadApplicationData lad = new LoadApplicationData();

      if (lad.fileExists(fileName)){
          retrieveData(fileName);
      } else {
        System.out.println("File Doesn't exist!");
      }


    }

}
