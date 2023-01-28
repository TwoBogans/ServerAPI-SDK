package au.twobbeetwotee.api.responses;

import com.google.gson.annotations.Expose;
import lombok.Getter;
import lombok.Setter;

public class WorldStatsResponse {
    @Getter
    @Setter
    @Expose
    private double size;
    @Getter
    @Setter
    @Expose
    private int players;
    @Getter
    @Setter
    @Expose
    private long age;
    @Getter
    @Setter
    @Expose
    private int years;
    @Getter
    @Setter
    @Expose
    private int months;
    @Getter
    @Setter
    @Expose
    private int days;
}
