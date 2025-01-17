package cds.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BankingInternationalPayeeBeneficiaryDetails
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-10-07T02:03:35.302Z")

public class BankingInternationalPayeeBeneficiaryDetails   {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("country")
  private String country = null;

  @JsonProperty("message")
  private String message = null;

  public BankingInternationalPayeeBeneficiaryDetails name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the beneficiary
   * @return name
  **/
  @ApiModelProperty(value = "Name of the beneficiary")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public BankingInternationalPayeeBeneficiaryDetails country(String country) {
    this.country = country;
    return this;
  }

  /**
   * Country where the beneficiary resides. A valid [ISO 3166 Alpha-3](https://www.iso.org/iso-3166-country-codes.html) country code
   * @return country
  **/
  @ApiModelProperty(required = true, value = "Country where the beneficiary resides. A valid [ISO 3166 Alpha-3](https://www.iso.org/iso-3166-country-codes.html) country code")
  @NotNull


  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public BankingInternationalPayeeBeneficiaryDetails message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Response message for the payment
   * @return message
  **/
  @ApiModelProperty(value = "Response message for the payment")


  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BankingInternationalPayeeBeneficiaryDetails bankingInternationalPayeeBeneficiaryDetails = (BankingInternationalPayeeBeneficiaryDetails) o;
    return Objects.equals(this.name, bankingInternationalPayeeBeneficiaryDetails.name) &&
        Objects.equals(this.country, bankingInternationalPayeeBeneficiaryDetails.country) &&
        Objects.equals(this.message, bankingInternationalPayeeBeneficiaryDetails.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, country, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BankingInternationalPayeeBeneficiaryDetails {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

