package co.jueyi.geekshop.service.args;

import co.jueyi.geekshop.common.RequestContext;
import co.jueyi.geekshop.types.history.HistoryEntryType;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;

/**
 * Created on Nov, 2020 by @author bobo
 */
@Data
public class CreateCustomerHistoryEntryArgs {
    private Long customerId;
    private RequestContext ctx;
    private HistoryEntryType type;
    private Map<String, String> data = new HashMap<>();
}