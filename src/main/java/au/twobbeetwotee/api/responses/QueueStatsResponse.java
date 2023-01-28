package au.twobbeetwotee.api.responses;

import com.google.gson.annotations.Expose;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class QueueStatsResponse {
    @Expose private int regular;
    @Expose private int priority;
    @Expose private int veteran;
}
