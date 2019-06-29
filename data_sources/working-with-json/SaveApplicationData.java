import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;

public class SaveApplicationData {

    public static void main(String... args) {

        JSONObject obj = new JSONObject();
        obj.put("firstname", "Bob");
        obj.put("lastname", "Mustermann");
        obj.put("strasse", "Wilhelmstraße 8");
        obj.put("stadt", "Ilsheim");
        obj.put("plz", "74564");
        obj.put("land", "Deutschland");
        //obj.put("age", new Integer(100));

        double[] _hoursWorked = { 2.30, 4.20, 1.30, 1.15 };
        JSONArray list = new JSONArray();

        for (int i=0; i < 4; i++ ) {
          JSONObject objLineItem = new JSONObject();
          objLineItem.put("itemId", i);
          objLineItem.put("jobDescription", "Painting the company conference room.");
          objLineItem.put("jobHour", _hoursWorked[i]);
          objLineItem.put("jobCostPerHour", 25.00);
          list.add(objLineItem);
          obj.put("lineItems", list);
        }

        // list.add("msg 2");
        // list.add("msg 3");
        try (FileWriter file = new FileWriter("test.json")) {
          file.write(obj.toJSONString());
          file.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.print(obj);
    }
}
