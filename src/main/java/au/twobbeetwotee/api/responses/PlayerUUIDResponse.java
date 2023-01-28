package au.twobbeetwotee.api.responses;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;

public class PlayerUUIDResponse {
    @Getter
    @Setter
    @Expose
    private String uuid;
    @Getter
    @Setter
    @Expose
    private String displayName;
    @Getter
    @Setter
    @Expose
    private int ticksAlive;
    @Getter
    @Setter
    @Expose
    private long joinDateMillis;
    @Getter
    @Setter
    @Expose
    private String joinDate;
    @Getter
    @Setter
    @Expose
    private String playTime;
    @Getter
    @Setter
    @Expose
    private String lastDeath;
    @Getter
    @Setter
    @Expose
    @SerializedName("statistics")
    private PlayerStatistics playerStatistics;

    private static class PlayerStatistics {
        @Getter
        @Setter
        @Expose
        private int playerKills;
        @Getter
        @Setter
        @Expose
        private int mobKills;
        @Getter
        @Setter
        @Expose
        private int deaths;
        @Getter
        @Setter
        @Expose
        private Mined mined;
        @Getter
        @Setter
        @Expose
        private Placed placed;

        private static class Mined {
            @Getter
            @Setter
            @Expose
            private int obsidian;
            @Getter
            @Setter
            @Expose
            private int enderChest;
        }

        private static class Placed {
            @Getter
            @Setter
            @Expose
            private int obsidian;
            @Getter
            @Setter
            @Expose
            private int enderChest;
        }
    }
}
