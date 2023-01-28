package au.twobbeetwotee.api.responses;

import com.google.gson.annotations.Expose;
import lombok.Getter;
import lombok.Setter;

public class QueueStatsResponse {
    @Getter
    @Setter
    @Expose
    private int regular;
    @Getter
    @Setter
    @Expose
    private int priority;
    @Getter
    @Setter
    @Expose
    private int veteran;
}
