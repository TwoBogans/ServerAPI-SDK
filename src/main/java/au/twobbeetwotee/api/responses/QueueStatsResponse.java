package au.twobbeetwotee.api.responses;

import com.google.gson.annotations.Expose;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class QueueStatsResponse {
    @Expose private int regular;
    @Expose private int priority;
    @Expose private int veteran;
}
