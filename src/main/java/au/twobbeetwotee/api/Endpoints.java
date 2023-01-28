package au.twobbeetwotee.api;

public class Endpoints {

    // Regular 2b2t Australia API
    private static final String API_URL = "https://api.2b2t.au/v1";
    public static final String BALANCE = API_URL.concat("/balance");
    public static final String SERVER = API_URL.concat("/server");
    public static final String STATS = API_URL.concat("/stats");
    public static final String QUEUE = API_URL.concat("/queue");
    public static final String PLAYER_UUID = API_URL.concat("/player/%s");

    // Discord <-> Minecraft Verification API
    // TODO Nicer Endpoints?
    private static final String VERIFY_API = "https://discord.2b2t.au/api";
    public static final String DISCORD = VERIFY_API.concat("/discord");
    public static final String MINECRAFT = VERIFY_API.concat("/minecraft");
    public static final String DISCORD_REGISTERED = DISCORD.concat("/isregistered?id=%s");
    public static final String DISCORD_GET_UUID = DISCORD.concat("/getuuid?id=%s");
    public static final String MINECRAFT_REGISTERED = MINECRAFT.concat("/isregistered?uuid=%s");
    public static final String MINECRAFT_GET_ID = MINECRAFT.concat("/getid?uuid=%s");
}