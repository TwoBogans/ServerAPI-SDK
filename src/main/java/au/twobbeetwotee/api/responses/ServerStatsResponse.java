package au.twobbeetwotee.api.responses;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;

public class ServerStatsResponse {
    @Getter
    @Setter
    @Expose
    private String name;
    @Getter
    @Setter
    @Expose
    private String version;
    @Getter
    @Setter
    @Expose
    private String uptime;
    @Getter
    @Setter
    @Expose
    private int online;
    @Getter
    @Setter
    @Expose
    @SerializedName("performance")
    private ServerPerformance serverPerformance;

    private static class ServerPerformance {
        @Getter
        @Setter
        @Expose
        private int tps;
        @Getter
        @Setter
        @Expose
        private long uptimeLong;
        @Getter
        @Setter
        @Expose
        private long totalMemory;
        @Getter
        @Setter
        @Expose
        private long maxMemory;
        @Getter
        @Setter
        @Expose
        private long freeMemory;
        @Getter
        @Setter
        @Expose
        private int cpus;
    }
}
