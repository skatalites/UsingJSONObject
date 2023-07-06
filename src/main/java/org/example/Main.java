package org.example;

import lombok.extern.slf4j.Slf4j;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;

@Slf4j
public class Main {

    /**
     * JsonObject class represents an immutable JSON object value
     * this simple examples uses of JSONObjects from package org.json
     * Dependency <a href="https://mvnrepository.com/artifact/org.json/json">...</a>
     * this one are used to parse and manipulate JSON in Java.
     *
     * @param args, arguments in the main
     */
    public static void main(String[] args) {

        var jsonObject = getJsonObject();
        var jsonString = getJsonString();
        var jsonObjectFromAList = getJsonObjectFromAList();
        var jsonObjectFromAMap = getJsonObjectFromAMap();

        log.info("jsonObject: {}", jsonObject);
        log.info("jsonString: {}", jsonString);
        log.info("jsonObjectFromAList: {}", jsonObjectFromAList);
        log.info("jsonObjectFromAMap: {}", jsonObjectFromAMap);

    }

    private static HashMap<String, String> getJsonObjectFromAMap() {
        var moreInfo = new HashMap<String, String>();
        moreInfo.put("Pac-Man Official Website.", "https://pacman.com/en/history/");
        moreInfo.put("Wikipedia", "https://en.wikipedia.org/wiki/Pac-Man");
        moreInfo.put("Museum of the game", "https://www.arcade-museum.com/game_detail.php?game_id=7179");
        return moreInfo;
    }

    private static JSONArray getJsonObjectFromAList() {
        var pacmanFavoriteActivities = new ArrayList<String>();

        pacmanFavoriteActivities.add("eat energizers");
        pacmanFavoriteActivities.add("eat blue Ghosts");
        pacmanFavoriteActivities.add("eat yellow cookies");
        pacmanFavoriteActivities.add("run in the tunnel");
        pacmanFavoriteActivities.add("scape from the ghosts");

        return new JSONArray(pacmanFavoriteActivities);
    }

    private static JSONObject getJsonObject() {
        var jsonObject = new JSONObject();
        jsonObject.put("name", "Pac-Man");
        jsonObject.put("enemies", "Ghosts");
        jsonObject.put("favorite_food", "Power Pellets(cookies)");
        jsonObject.put("favorite_activity", "eat yellow cookies");
        return jsonObject;
    }

    /**
     * Get a simple json String using Java 15 text blocks
     *
     * @return json as String
     */
    private static String getJsonString() {
        return """
                {
                  "name": "Pac-Man",
                  "enemies": "Ghosts",
                  "enemy_list": [
                    "Blinky (red)",
                    "Pinky (pink)",
                    "Inky (cyan)",
                    "Clyde (orange)"
                  ],
                  "favorite_food": "yellow cookies",
                  "favorite_activity": [
                    "eat energizers",
                    "eat blue Ghosts"
                  ]
                }
                """;
    }
}