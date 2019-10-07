package cds.services.impl;
 
import java.util.*;
 
import cds.model.ListBalancesSpecificAccountsP;
import cds.model.ListBalancesSpecificAccountsResponseWrapper;
import cds.services.ListBalancesSpecificAccountsI;
 
import org.springframework.stereotype.Service;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

 
@Service
public class ListBalancesSpecificAccountsImpl implements ListBalancesSpecificAccountsI {
 
    private static final Log logger = LogFactory.getLog(ListBalancesSpecificAccountsImpl.class);
   
    public ListBalancesSpecificAccountsResponseWrapper reliable(ListBalancesSpecificAccountsP pojo){ 
		//TODO
		return new ListBalancesSpecificAccountsResponseWrapper();
	}

	@Override
    @HystrixCommand(fallbackMethod = "reliable")	
	public ListBalancesSpecificAccountsResponseWrapper execute(ListBalancesSpecificAccountsP requestParams){
        //TODO
        return new ListBalancesSpecificAccountsResponseWrapper();
    }

              
    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException {
        //TODO to write error response //NOSONAR
        return type.newInstance();
    }
              
  }
