package cds.services.impl;
 
import java.util.*;
 
import cds.model.GetStatusP;
import cds.model.GetStatusResponseWrapper;
import cds.services.GetStatusI;
 
import org.springframework.stereotype.Service;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

 
@Service
public class GetStatusImpl implements GetStatusI {
 
    private static final Log logger = LogFactory.getLog(GetStatusImpl.class);
   
    public GetStatusResponseWrapper reliable(GetStatusP pojo){ 
		//TODO
		return new GetStatusResponseWrapper();
	}

	@Override
    @HystrixCommand(fallbackMethod = "reliable")	
	public GetStatusResponseWrapper execute(GetStatusP requestParams){
        //TODO
        return new GetStatusResponseWrapper();
    }

              
    public <T> T error(int statusCode, Class<T> type,Exception exception) throws InstantiationException, IllegalAccessException {
        //TODO to write error response //NOSONAR
        return type.newInstance();
    }
              
  }
