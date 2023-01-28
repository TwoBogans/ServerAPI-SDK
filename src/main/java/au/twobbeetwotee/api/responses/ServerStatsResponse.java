package au.twobbeetwotee.api.responses;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ServerStatsResponse {
    @Expose private String name;
    @Expose private String version;
    @Expose private String uptime;
    @Expose private int online;
    @Expose private ServerPerformance performance;

    @Getter
    @Setter
    public static class ServerPerformance {
        @Expose private int tps;
        @Expose private long uptimeLong;
        @Expose private long totalMemory;
        @Expose private long maxMemory;
        @Expose private long freeMemory;
        @Expose private int cpus;
    }
}
