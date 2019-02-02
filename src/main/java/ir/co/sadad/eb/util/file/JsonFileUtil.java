package ir.co.sadad.eb.util.file;

import javax.json.*;
import java.io.*;
import java.net.URISyntaxException;
import java.util.Map;
import java.util.Set;

public class JsonFileUtil {

    public JsonValue parseDtoMeta(String className) {
        ClassLoader classLoader = getClass().getClassLoader();
        try(InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(new File(classLoader.getResource("WEB-INF/dto-meta.json").toURI())),"UTF-8");
            JsonReader reader = Json.createReader(new FileReader(classLoader.getResource("WEB-INF/dto-meta.json").getFile()))) {

            JsonObject jsonObject = reader.readObject();
            //class which want to get its meta info
            Set<Map.Entry<String, JsonValue>> entries = jsonObject.entrySet();
            JsonValue jsonValue = jsonObject.get(className);
            JsonArray jsonValues = jsonValue.asJsonArray();
            JsonValue map = null;
            for (int i = 0; i < jsonValues.size(); i++) {
                map = jsonValues.get(i);
            }
            return map;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return null;
        } catch (URISyntaxException e) {
            e.printStackTrace();
            return null;
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return null;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

}
