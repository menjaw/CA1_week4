package rest;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import entity.CityInfo;
import entity.Person;
import java.util.List;

public class JsonConverter {

    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();

    public Person getPersonFromJson(String javascript) {
        return GSON.fromJson(javascript, Person.class);
    }

    public String getJSONFromPerson(Person person) {
        return GSON.toJson(person);
    }

    public String getJSONFromPersons(List<Person> persons) {
        return GSON.toJson(persons);
    }
    
    public CityInfo getZipFromJson(String javascript) {
        return GSON.fromJson(javascript, CityInfo.class);
    }

    public String getJSONFromCityInfo(CityInfo zip) {
        return GSON.toJson(zip);
    }

    public String getJSONFromCityInfos(List<CityInfo> zips) {
        return GSON.toJson(zips);
    }
}
