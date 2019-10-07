package cds.services.impl;
 
import java.util.*;
 
import cds.model.GetCustomerP;
import cds.model.GetCustomerResponseWrapper;
import cds.services.GetCustomerI;
 
import org.springframework.stereotype.Service;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

 
@Service
public class GetCustomerImpl implements GetCustomerI {
 
    private static final Log logger = LogFactory.getLog(GetCustomerImpl.class);
   
    public GetCustomerResponseWrapper reliable(GetCustomerP pojo){ 
		//TODO
		return new GetCustomerResponseWrapper();
	}

	@Override
    @HystrixCommand(fallbackMethod = "reliable")	
	public GetCustomerResponseWrapper execute(GetCustomerP requestParams){
        //TODO
        return new GetCustomerResponseWrapper();
    }

              
    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException {
        //TODO to write error response //NOSONAR
        return type.newInstance();
    }
              
  }
