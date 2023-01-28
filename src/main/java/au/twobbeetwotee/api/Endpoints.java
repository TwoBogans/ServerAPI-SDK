package au.twobbeetwotee.api;

public class Endpoints {
    private static final String BASE_URL = "https://api.2b2t.au/v1";
    public static final String BALANCE = BASE_URL.concat("/balance");
    public static final String SERVER = BASE_URL.concat("/server");
    public static final String STATS = BASE_URL.concat("/stats");
    public static final String QUEUE = BASE_URL.concat("/queue");
    public static final String PLAYER_UUID = BASE_URL.concat("/player/%s");
}