package au.twobbeetwotee.api.responses;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

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
    @Expose private Statistics statistics;

    @Getter
    @Setter
    @ToString
    public static class Statistics {
        @Expose private int playerKills;
        @Expose private int mobKills;
        @Expose private int deaths;
        @Expose private Mined mined;
        @Expose private Placed placed;

        @Getter
        @Setter
        @ToString
        public static class Mined {
            @Expose private int obsidian;
            @Expose private int enderChest;
        }

        @Getter
        @Setter
        @ToString
        public static class Placed {
            @Expose private int obsidian;
            @Expose private int enderChest;
        }
    }
}
