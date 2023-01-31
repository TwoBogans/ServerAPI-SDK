package au.twobbeetwotee.api.responses;

import com.google.gson.annotations.Expose;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.UUID;

@Getter
@Setter
@ToString
public class SeenUUIDResponse {
    @Expose private UUID uuid;
    @Expose private String name;
    @Expose private String lastSeen;
    @Expose private long firstPlayed;
    @Expose private long lastPlayed;
}
