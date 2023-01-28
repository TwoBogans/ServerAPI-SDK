package au.twobbeetwotee.api;

import au.twobbeetwotee.api.responses.*;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import lombok.Getter;

import java.io.IOException;
import java.util.UUID;

public class API {

    @Getter
    private final Gson gson = new GsonBuilder().setPrettyPrinting().create();

    public API() {

    }

    public BalanceResponse getBalance() throws IOException {
        return gson.fromJson(Http.GET(String.format(Endpoints.BALANCE)), BalanceResponse.class);
    }

    public PlayerUUIDResponse getPlayerUUID(UUID uuid) throws IOException {
        return getPlayerUUID(uuid.toString());
    }

    public PlayerUUIDResponse getPlayerUUID(String uuid) throws IOException {
        return gson.fromJson(Http.GET(String.format(Endpoints.PLAYER_UUID, uuid)), PlayerUUIDResponse.class);
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

}
