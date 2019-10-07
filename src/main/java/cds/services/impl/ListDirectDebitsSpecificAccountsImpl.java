package cds.services.impl;
 
import java.util.*;
 
import cds.model.ListDirectDebitsSpecificAccountsP;
import cds.model.ListDirectDebitsSpecificAccountsResponseWrapper;
import cds.services.ListDirectDebitsSpecificAccountsI;
 
import org.springframework.stereotype.Service;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

 
@Service
public class ListDirectDebitsSpecificAccountsImpl implements ListDirectDebitsSpecificAccountsI {
 
    private static final Log logger = LogFactory.getLog(ListDirectDebitsSpecificAccountsImpl.class);
   
    public ListDirectDebitsSpecificAccountsResponseWrapper reliable(ListDirectDebitsSpecificAccountsP pojo){ 
		//TODO
		return new ListDirectDebitsSpecificAccountsResponseWrapper();
	}

	@Override
    @HystrixCommand(fallbackMethod = "reliable")	
	public ListDirectDebitsSpecificAccountsResponseWrapper execute(ListDirectDebitsSpecificAccountsP requestParams){
        //TODO
        return new ListDirectDebitsSpecificAccountsResponseWrapper();
    }

              
    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException {
        //TODO to write error response //NOSONAR
        return type.newInstance();
    }
              
  }
