package cds.model;

import java.util.Objects;
import cds.model.CommonOrganisation;
import cds.model.CommonPerson;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ResponseCommonCustomerData
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-10-07T02:03:35.302Z")

public class ResponseCommonCustomerData   {
  /**
   * The type of customer object that is present
   */
  public enum CustomerUTypeEnum {
    PERSON("person"),
    
    ORGANISATION("organisation");

    private String value;

    CustomerUTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static CustomerUTypeEnum fromValue(String text) {
      for (CustomerUTypeEnum b : CustomerUTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("customerUType")
  private CustomerUTypeEnum customerUType = null;

  @JsonProperty("person")
  private CommonPerson person = null;

  @JsonProperty("organisation")
  private CommonOrganisation organisation = null;

  public ResponseCommonCustomerData customerUType(CustomerUTypeEnum customerUType) {
    this.customerUType = customerUType;
    return this;
  }

  /**
   * The type of customer object that is present
   * @return customerUType
  **/
  @ApiModelProperty(required = true, value = "The type of customer object that is present")
  @NotNull


  public CustomerUTypeEnum getCustomerUType() {
    return customerUType;
  }

  public void setCustomerUType(CustomerUTypeEnum customerUType) {
    this.customerUType = customerUType;
  }

  public ResponseCommonCustomerData person(CommonPerson person) {
    this.person = person;
    return this;
  }

  /**
   * Get person
   * @return person
  **/
  @ApiModelProperty(value = "")

  @Valid

  public CommonPerson getPerson() {
    return person;
  }

  public void setPerson(CommonPerson person) {
    this.person = person;
  }

  public ResponseCommonCustomerData organisation(CommonOrganisation organisation) {
    this.organisation = organisation;
    return this;
  }

  /**
   * Get organisation
   * @return organisation
  **/
  @ApiModelProperty(value = "")

  @Valid

  public CommonOrganisation getOrganisation() {
    return organisation;
  }

  public void setOrganisation(CommonOrganisation organisation) {
    this.organisation = organisation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseCommonCustomerData responseCommonCustomerData = (ResponseCommonCustomerData) o;
    return Objects.equals(this.customerUType, responseCommonCustomerData.customerUType) &&
        Objects.equals(this.person, responseCommonCustomerData.person) &&
        Objects.equals(this.organisation, responseCommonCustomerData.organisation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerUType, person, organisation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseCommonCustomerData {\n");
    
    sb.append("    customerUType: ").append(toIndentedString(customerUType)).append("\n");
    sb.append("    person: ").append(toIndentedString(person)).append("\n");
    sb.append("    organisation: ").append(toIndentedString(organisation)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

