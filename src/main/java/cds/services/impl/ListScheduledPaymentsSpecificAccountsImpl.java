package cds.services.impl;
 
import java.util.*;
 
import cds.model.ListScheduledPaymentsSpecificAccountsP;
import cds.model.ListScheduledPaymentsSpecificAccountsResponseWrapper;
import cds.services.ListScheduledPaymentsSpecificAccountsI;
 
import org.springframework.stereotype.Service;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

 
@Service
public class ListScheduledPaymentsSpecificAccountsImpl implements ListScheduledPaymentsSpecificAccountsI {
 
    private static final Log logger = LogFactory.getLog(ListScheduledPaymentsSpecificAccountsImpl.class);
   
    public ListScheduledPaymentsSpecificAccountsResponseWrapper reliable(ListScheduledPaymentsSpecificAccountsP pojo){ 
		//TODO
		return new ListScheduledPaymentsSpecificAccountsResponseWrapper();
	}

	@Override
    @HystrixCommand(fallbackMethod = "reliable")	
	public ListScheduledPaymentsSpecificAccountsResponseWrapper execute(ListScheduledPaymentsSpecificAccountsP requestParams){
        //TODO
        return new ListScheduledPaymentsSpecificAccountsResponseWrapper();
    }

              
    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException {
        //TODO to write error response //NOSONAR
        return type.newInstance();
    }
              
  }
