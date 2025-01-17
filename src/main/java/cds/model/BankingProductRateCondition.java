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
 * Defines a condition for the applicability of a tiered rate
 */
@ApiModel(description = "Defines a condition for the applicability of a tiered rate")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-10-07T02:03:35.302Z")

public class BankingProductRateCondition   {
  @JsonProperty("additionalInfo")
  private String additionalInfo = null;

  @JsonProperty("additionalInfoUri")
  private String additionalInfoUri = null;

  public BankingProductRateCondition additionalInfo(String additionalInfo) {
    this.additionalInfo = additionalInfo;
    return this;
  }

  /**
   * Display text providing more information on the condition
   * @return additionalInfo
  **/
  @ApiModelProperty(value = "Display text providing more information on the condition")


  public String getAdditionalInfo() {
    return additionalInfo;
  }

  public void setAdditionalInfo(String additionalInfo) {
    this.additionalInfo = additionalInfo;
  }

  public BankingProductRateCondition additionalInfoUri(String additionalInfoUri) {
    this.additionalInfoUri = additionalInfoUri;
    return this;
  }

  /**
   * Link to a web page with more information on this condition
   * @return additionalInfoUri
  **/
  @ApiModelProperty(value = "Link to a web page with more information on this condition")


  public String getAdditionalInfoUri() {
    return additionalInfoUri;
  }

  public void setAdditionalInfoUri(String additionalInfoUri) {
    this.additionalInfoUri = additionalInfoUri;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BankingProductRateCondition bankingProductRateCondition = (BankingProductRateCondition) o;
    return Objects.equals(this.additionalInfo, bankingProductRateCondition.additionalInfo) &&
        Objects.equals(this.additionalInfoUri, bankingProductRateCondition.additionalInfoUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalInfo, additionalInfoUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BankingProductRateCondition {\n");
    
    sb.append("    additionalInfo: ").append(toIndentedString(additionalInfo)).append("\n");
    sb.append("    additionalInfoUri: ").append(toIndentedString(additionalInfoUri)).append("\n");
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

