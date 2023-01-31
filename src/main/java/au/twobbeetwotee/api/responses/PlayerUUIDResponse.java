package au.twobbeetwotee.api.responses;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.HashMap;

@Getter
@Setter
@ToString
public class PlayerUUIDResponse {
    @Expose private String uuid;
    @Expose private String displayName;
    @Expose private int ticksAlive;
    @Expose private long joinDateMillis;
    @Expose private String joinDate;
    @Expose private String playTime;
    @Expose private String lastDeath;
    @Expose private HashMap<String, Integer> statistics;
}
