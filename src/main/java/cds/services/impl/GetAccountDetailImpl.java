package cds.services.impl;
 
import java.util.*;
 
import cds.model.GetAccountDetailP;
import cds.model.GetAccountDetailResponseWrapper;
import cds.services.GetAccountDetailI;
 
import org.springframework.stereotype.Service;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

 
@Service
public class GetAccountDetailImpl implements GetAccountDetailI {
 
    private static final Log logger = LogFactory.getLog(GetAccountDetailImpl.class);
   
    public GetAccountDetailResponseWrapper reliable(GetAccountDetailP pojo){ 
		//TODO
		return new GetAccountDetailResponseWrapper();
	}

	@Override
    @HystrixCommand(fallbackMethod = "reliable")	
	public GetAccountDetailResponseWrapper execute(GetAccountDetailP requestParams){
        //TODO
        return new GetAccountDetailResponseWrapper();
    }

              
    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException {
        //TODO to write error response //NOSONAR
        return type.newInstance();
    }
              
  }
