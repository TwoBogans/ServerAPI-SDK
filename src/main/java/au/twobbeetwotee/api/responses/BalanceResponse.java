package au.twobbeetwotee.api.responses;

import com.google.gson.annotations.Expose;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class BalanceResponse {
    @Expose private int wallet;
    @Expose private int costs;
    @Expose private String currency;
    @Expose private String month;
}
