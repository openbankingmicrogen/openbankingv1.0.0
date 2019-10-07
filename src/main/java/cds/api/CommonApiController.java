package cds.api;

import cds.model.ResponseCommonCustomer;
import cds.model.ResponseCommonCustomerDetail;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import cds.services.GetCustomerI;
import cds.model.GetCustomerP;
import cds.model.GetCustomerResponseWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import cds.services.GetCustomerDetailI;
import cds.model.GetCustomerDetailP;
import cds.model.GetCustomerDetailResponseWrapper;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-10-07T02:03:35.302Z")

@Controller
public class CommonApiController implements CommonApi {

	@Autowired
	GetCustomerDetailI getCustomerDetailI;


	@Autowired
	GetCustomerI getCustomerI;


    private static final Logger log = LoggerFactory.getLogger(CommonApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public CommonApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<ResponseCommonCustomer> getCustomer(@ApiParam(value = "Version of the API end point requested by the client. Must be set to a positive integer. The data holder should respond with the highest supported version between [x-min-v](#request-headers) and [x-v](#request-headers). If the value of [x-min-v](#request-headers) is equal to or higher than the value of [x-v](#request-headers) then the [x-min-v](#request-headers) header should be treated as absent. If all versions requested are not supported then the data holder should respond with a 406 Not Acceptable. See [HTTP Headers](#request-headers)" ,required=true) @RequestHeader(value="x-v", required=true) String xV,@ApiParam(value = "Minimum version of the API end point requested by the client. Must be set to a positive integer if provided. The data holder should respond with the highest supported version between [x-min-v](#request-headers) and [x-v](#request-headers). If all versions requested are not supported then the data holder should respond with a 406 Not Acceptable." ) @RequestHeader(value="x-min-v", required=false) String xMinV,@ApiParam(value = "An [RFC4122](https://tools.ietf.org/html/rfc4122) UID used as a correlation id. If provided, the data holder must play back this value in the x-fapi-interaction-id response header. If not provided a [RFC4122] UUID value is required to be provided in the response header to track the interaction." ) @RequestHeader(value="x-fapi-interaction-id", required=false) String xFapiInteractionId,@ApiParam(value = "The time when the customer last logged in to the data recipient. Required for all resource calls (customer present and unattended). Not to be included for unauthenticated calls." ) @RequestHeader(value="x-fapi-auth-date", required=false) String xFapiAuthDate,@ApiParam(value = "The customer's original IP address if the customer is currently logged in to the data recipient. The presence of this header indicates that the API is being called in a customer present context. Not to be included for unauthenticated calls." ) @RequestHeader(value="x-fapi-customer-ip-address", required=false) String xFapiCustomerIpAddress,@ApiParam(value = "The customer's original standard http headers [Base64](#common-field-types) encoded, including the original User Agent header, if the customer is currently logged in to the data recipient. Mandatory for customer present calls.  Not required for unattended or unauthenticated calls." ) @RequestHeader(value="x-cds-User-Agent", required=false) String xCdsUserAgent,@ApiParam(value = "Subject identifier. Locally unique and never reassigned identifier within the Holder for the End-User. Mandatory for authenticated calls. Not required for unattended or unauthenticated calls." ) @RequestHeader(value="x-cds-subject", required=false) String xCdsSubject) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ResponseCommonCustomer>(objectMapper.readValue("{  \"data\" : {    \"person\" : {      \"middleNames\" : [ \"middleNames\", \"middleNames\" ],      \"firstName\" : \"firstName\",      \"lastName\" : \"lastName\",      \"occupationCode\" : \"occupationCode\",      \"prefix\" : \"prefix\",      \"suffix\" : \"suffix\",      \"lastUpdateTime\" : \"lastUpdateTime\"    },    \"organisation\" : {      \"agentRole\" : \"agentRole\",      \"agentLastName\" : \"agentLastName\",      \"establishmentDate\" : \"establishmentDate\",      \"businessName\" : \"businessName\",      \"registeredCountry\" : \"registeredCountry\",      \"abn\" : \"abn\",      \"acn\" : \"acn\",      \"industryCode\" : \"industryCode\",      \"organisationType\" : \"SOLE_TRADER\",      \"legalName\" : \"legalName\",      \"isACNCRegistered\" : true,      \"agentFirstName\" : \"agentFirstName\",      \"shortName\" : \"shortName\",      \"lastUpdateTime\" : \"lastUpdateTime\"    },    \"customerUType\" : \"person\"  },  \"meta\" : { },  \"links\" : {    \"self\" : \"self\"  }}", ResponseCommonCustomer.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ResponseCommonCustomer>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ResponseCommonCustomer>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ResponseCommonCustomerDetail> getCustomerDetail(@ApiParam(value = "Version of the API end point requested by the client. Must be set to a positive integer. The data holder should respond with the highest supported version between [x-min-v](#request-headers) and [x-v](#request-headers). If the value of [x-min-v](#request-headers) is equal to or higher than the value of [x-v](#request-headers) then the [x-min-v](#request-headers) header should be treated as absent. If all versions requested are not supported then the data holder should respond with a 406 Not Acceptable. See [HTTP Headers](#request-headers)" ,required=true) @RequestHeader(value="x-v", required=true) String xV,@ApiParam(value = "Minimum version of the API end point requested by the client. Must be set to a positive integer if provided. The data holder should respond with the highest supported version between [x-min-v](#request-headers) and [x-v](#request-headers). If all versions requested are not supported then the data holder should respond with a 406 Not Acceptable." ) @RequestHeader(value="x-min-v", required=false) String xMinV,@ApiParam(value = "An [RFC4122](https://tools.ietf.org/html/rfc4122) UID used as a correlation id. If provided, the data holder must play back this value in the x-fapi-interaction-id response header. If not provided a [RFC4122] UUID value is required to be provided in the response header to track the interaction." ) @RequestHeader(value="x-fapi-interaction-id", required=false) String xFapiInteractionId,@ApiParam(value = "The time when the customer last logged in to the data recipient. Required for all resource calls (customer present and unattended). Not to be included for unauthenticated calls." ) @RequestHeader(value="x-fapi-auth-date", required=false) String xFapiAuthDate,@ApiParam(value = "The customer's original IP address if the customer is currently logged in to the data recipient. The presence of this header indicates that the API is being called in a customer present context. Not to be included for unauthenticated calls." ) @RequestHeader(value="x-fapi-customer-ip-address", required=false) String xFapiCustomerIpAddress,@ApiParam(value = "The customer's original standard http headers [Base64](#common-field-types) encoded, including the original User Agent header, if the customer is currently logged in to the data recipient. Mandatory for customer present calls.  Not required for unattended or unauthenticated calls." ) @RequestHeader(value="x-cds-User-Agent", required=false) String xCdsUserAgent,@ApiParam(value = "Subject identifier. Locally unique and never reassigned identifier within the Holder for the End-User. Mandatory for authenticated calls. Not required for unattended or unauthenticated calls." ) @RequestHeader(value="x-cds-subject", required=false) String xCdsSubject) {
        
        GetCustomerDetailResponseWrapper res  = getCustomerDetailI.execute(new GetCustomerDetailP(xV, xMinV, xFapiInteractionId, xFapiAuthDate, xFapiCustomerIpAddress, xCdsUserAgent, xCdsSubject));

        return new ResponseEntity<>(res.getResponse(),res.getHeaders(), HttpStatus.OK);
	} 
}
