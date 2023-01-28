package au.twobbeetwotee.api.responses;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ServerStatsResponse {
    @Expose private String name;
    @Expose private String version;
    @Expose private String uptime;
    @Expose private int online;
    @Expose private Performance performance;

    @Getter
    @Setter
    @ToString
    public static class Performance {
        @Expose private double tps;
        @Expose private long uptimeLong;
        @Expose private long totalMemory;
        @Expose private long maxMemory;
        @Expose private long freeMemory;
        @Expose private int cpus;
    }
}
