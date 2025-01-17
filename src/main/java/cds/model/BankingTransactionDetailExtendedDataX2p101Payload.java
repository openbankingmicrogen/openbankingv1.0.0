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
 * BankingTransactionDetailExtendedDataX2p101Payload
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-10-07T02:03:35.302Z")

public class BankingTransactionDetailExtendedDataX2p101Payload   {
  @JsonProperty("extendedDescription")
  private String extendedDescription = null;

  @JsonProperty("endToEndId")
  private String endToEndId = null;

  @JsonProperty("purposeCode")
  private String purposeCode = null;

  public BankingTransactionDetailExtendedDataX2p101Payload extendedDescription(String extendedDescription) {
    this.extendedDescription = extendedDescription;
    return this;
  }

  /**
   * An extended string description. Only present if specified by the extensionUType field
   * @return extendedDescription
  **/
  @ApiModelProperty(required = true, value = "An extended string description. Only present if specified by the extensionUType field")
  @NotNull


  public String getExtendedDescription() {
    return extendedDescription;
  }

  public void setExtendedDescription(String extendedDescription) {
    this.extendedDescription = extendedDescription;
  }

  public BankingTransactionDetailExtendedDataX2p101Payload endToEndId(String endToEndId) {
    this.endToEndId = endToEndId;
    return this;
  }

  /**
   * An end to end ID for the payment created at initiation
   * @return endToEndId
  **/
  @ApiModelProperty(value = "An end to end ID for the payment created at initiation")


  public String getEndToEndId() {
    return endToEndId;
  }

  public void setEndToEndId(String endToEndId) {
    this.endToEndId = endToEndId;
  }

  public BankingTransactionDetailExtendedDataX2p101Payload purposeCode(String purposeCode) {
    this.purposeCode = purposeCode;
    return this;
  }

  /**
   * Purpose of the payment.  Format is defined by NPP standards for the x2p1.01 overlay service
   * @return purposeCode
  **/
  @ApiModelProperty(value = "Purpose of the payment.  Format is defined by NPP standards for the x2p1.01 overlay service")


  public String getPurposeCode() {
    return purposeCode;
  }

  public void setPurposeCode(String purposeCode) {
    this.purposeCode = purposeCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BankingTransactionDetailExtendedDataX2p101Payload bankingTransactionDetailExtendedDataX2p101Payload = (BankingTransactionDetailExtendedDataX2p101Payload) o;
    return Objects.equals(this.extendedDescription, bankingTransactionDetailExtendedDataX2p101Payload.extendedDescription) &&
        Objects.equals(this.endToEndId, bankingTransactionDetailExtendedDataX2p101Payload.endToEndId) &&
        Objects.equals(this.purposeCode, bankingTransactionDetailExtendedDataX2p101Payload.purposeCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extendedDescription, endToEndId, purposeCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BankingTransactionDetailExtendedDataX2p101Payload {\n");
    
    sb.append("    extendedDescription: ").append(toIndentedString(extendedDescription)).append("\n");
    sb.append("    endToEndId: ").append(toIndentedString(endToEndId)).append("\n");
    sb.append("    purposeCode: ").append(toIndentedString(purposeCode)).append("\n");
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

