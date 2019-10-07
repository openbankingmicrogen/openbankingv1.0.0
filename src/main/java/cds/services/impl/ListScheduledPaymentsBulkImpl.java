package cds.services.impl;
 
import java.util.*;
 
import cds.model.ListScheduledPaymentsBulkP;
import cds.model.ListScheduledPaymentsBulkResponseWrapper;
import cds.services.ListScheduledPaymentsBulkI;
 
import org.springframework.stereotype.Service;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

 
@Service
public class ListScheduledPaymentsBulkImpl implements ListScheduledPaymentsBulkI {
 
    private static final Log logger = LogFactory.getLog(ListScheduledPaymentsBulkImpl.class);
   
    public ListScheduledPaymentsBulkResponseWrapper reliable(ListScheduledPaymentsBulkP pojo){ 
		//TODO
		return new ListScheduledPaymentsBulkResponseWrapper();
	}

	@Override
    @HystrixCommand(fallbackMethod = "reliable")	
	public ListScheduledPaymentsBulkResponseWrapper execute(ListScheduledPaymentsBulkP requestParams){
        //TODO
        return new ListScheduledPaymentsBulkResponseWrapper();
    }

              
    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException {
        //TODO to write error response //NOSONAR
        return type.newInstance();
    }
              
  }
