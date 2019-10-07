package cds.services.impl;
 
import java.util.*;
 
import cds.model.ListScheduledPaymentsP;
import cds.model.ListScheduledPaymentsResponseWrapper;
import cds.services.ListScheduledPaymentsI;
 
import org.springframework.stereotype.Service;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

 
@Service
public class ListScheduledPaymentsImpl implements ListScheduledPaymentsI {
 
    private static final Log logger = LogFactory.getLog(ListScheduledPaymentsImpl.class);
   
    public ListScheduledPaymentsResponseWrapper reliable(ListScheduledPaymentsP pojo){ 
		//TODO
		return new ListScheduledPaymentsResponseWrapper();
	}

	@Override
    @HystrixCommand(fallbackMethod = "reliable")	
	public ListScheduledPaymentsResponseWrapper execute(ListScheduledPaymentsP requestParams){
        //TODO
        return new ListScheduledPaymentsResponseWrapper();
    }

              
    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException {
        //TODO to write error response //NOSONAR
        return type.newInstance();
    }
              
  }
