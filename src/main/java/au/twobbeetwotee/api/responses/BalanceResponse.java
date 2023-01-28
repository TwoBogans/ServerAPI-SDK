package au.twobbeetwotee.api.responses;

import com.google.gson.annotations.Expose;
import lombok.Getter;
import lombok.Setter;

public class BalanceResponse {
    @Getter
    @Setter
    @Expose
    private int wallet;
    @Getter
    @Setter
    @Expose
    private int costs;
    @Getter
    @Setter
    @Expose
    private String currency;
    @Getter
    @Setter
    @Expose
    private String month;
}
