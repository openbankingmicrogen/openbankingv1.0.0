package cds.services.impl;
 
import java.util.*;
 
import cds.model.GetCustomerDetailP;
import cds.model.GetCustomerDetailResponseWrapper;
import cds.services.GetCustomerDetailI;
 
import org.springframework.stereotype.Service;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

 
@Service
public class GetCustomerDetailImpl implements GetCustomerDetailI {
 
    private static final Log logger = LogFactory.getLog(GetCustomerDetailImpl.class);
   
    public GetCustomerDetailResponseWrapper reliable(GetCustomerDetailP pojo){ 
		//TODO
		return new GetCustomerDetailResponseWrapper();
	}

	@Override
    @HystrixCommand(fallbackMethod = "reliable")	
	public GetCustomerDetailResponseWrapper execute(GetCustomerDetailP requestParams){
        //TODO
        return new GetCustomerDetailResponseWrapper();
    }

              
    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException {
        //TODO to write error response //NOSONAR
        return type.newInstance();
    }
              
  }
