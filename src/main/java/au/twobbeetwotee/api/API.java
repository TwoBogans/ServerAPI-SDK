package au.twobbeetwotee.api;

import au.twobbeetwotee.api.responses.*;
import au.twobbeetwotee.api.responses.discord.DiscordGetUUIDResponse;
import au.twobbeetwotee.api.responses.discord.DiscordRegisteredResponse;
import au.twobbeetwotee.api.responses.discord.MinecraftGetIDResponse;
import au.twobbeetwotee.api.responses.discord.MinecraftRegisteredResponse;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import lombok.Getter;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

public class API {

    @Getter
    private final Gson gson;

    public API() {
        gson = new GsonBuilder().setPrettyPrinting().create();
    }

    public BalanceResponse getBalance() throws IOException {
        return gson.fromJson(Http.GET(String.format(Endpoints.BALANCE)), BalanceResponse.class);
    }

    public HashMap<Integer, ChatMessage> getChat() throws IOException {
        return gson.fromJson(Http.GET(String.format(Endpoints.CHAT)), new TypeToken<HashMap<Integer, ChatMessage>>(){}.getType());
    }

    public List<PlayerUUIDResponse> getOnlinePlayers() throws IOException {
        return gson.fromJson(Http.GET(String.format(Endpoints.PLAYERS)), new TypeToken<List<PlayerUUIDResponse>>(){}.getType());
    }

    public PlayerUUIDResponse getOnlinePlayer(UUID uuid) throws IOException {
        return getOnlinePlayer(uuid.toString());
    }

    public PlayerUUIDResponse getOnlinePlayer(String uuid) throws IOException {
        return gson.fromJson(Http.GET(String.format(Endpoints.PLAYER_UUID, uuid)), PlayerUUIDResponse.class);
    }

    public SeenUUIDResponse getOfflinePlayer(UUID uuid) throws IOException {
        return getOfflinePlayer(uuid.toString());
    }

    public SeenUUIDResponse getOfflinePlayer(String uuid) throws IOException {
        return gson.fromJson(Http.GET(String.format(Endpoints.SEEN_UUID, uuid)), SeenUUIDResponse.class);
    }

    public QueueStatsResponse getQueueStats() throws IOException {
        return gson.fromJson(Http.GET(String.format(Endpoints.QUEUE)), QueueStatsResponse.class);
    }

    public ServerStatsResponse getServerStats() throws IOException {
        return gson.fromJson(Http.GET(String.format(Endpoints.SERVER)), ServerStatsResponse.class);
    }

    public WorldStatsResponse getWorldStats() throws IOException {
        return gson.fromJson(Http.GET(String.format(Endpoints.STATS)), WorldStatsResponse.class);
    }

    // Discord <-> Minecraft Verification API
    public DiscordRegisteredResponse getDiscordRegistered(long id) throws IOException {
        return gson.fromJson(Http.GET(String.format(Endpoints.DISCORD_REGISTERED, id)), DiscordRegisteredResponse.class);
    }

    public DiscordGetUUIDResponse getDiscordUUID(long id) throws IOException {
        return gson.fromJson(Http.GET(String.format(Endpoints.DISCORD_GET_UUID, id)), DiscordGetUUIDResponse.class);
    }

    public MinecraftGetIDResponse getMinecraftDiscordID(String uuid) throws IOException {
        return gson.fromJson(Http.GET(String.format(Endpoints.MINECRAFT_GET_ID, uuid)), MinecraftGetIDResponse.class);
    }

    public MinecraftRegisteredResponse getMinecraftRegistered(String uuid) throws IOException {
        return gson.fromJson(Http.GET(String.format(Endpoints.MINECRAFT_REGISTERED, uuid)), MinecraftRegisteredResponse.class);
    }

    public MinecraftGetIDResponse getMinecraftDiscordID(UUID uuid) throws IOException {
        return getMinecraftDiscordID(uuid.toString());
    }

    public MinecraftRegisteredResponse getMinecraftRegistered(UUID uuid) throws IOException {
        return getMinecraftRegistered(uuid.toString());
    }


}
