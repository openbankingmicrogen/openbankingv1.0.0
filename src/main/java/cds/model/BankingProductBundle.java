package cds.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BankingProductBundle
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-10-07T02:03:35.302Z")

public class BankingProductBundle   {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("additionalInfo")
  private String additionalInfo = null;

  @JsonProperty("additionalInfoUri")
  private String additionalInfoUri = null;

  @JsonProperty("productIds")
  @Valid
  private List<String> productIds = null;

  public BankingProductBundle name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the bundle
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name of the bundle")
  @NotNull


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public BankingProductBundle description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Description of the bundle
   * @return description
  **/
  @ApiModelProperty(required = true, value = "Description of the bundle")
  @NotNull


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public BankingProductBundle additionalInfo(String additionalInfo) {
    this.additionalInfo = additionalInfo;
    return this;
  }

  /**
   * Display text providing more information on the bundle
   * @return additionalInfo
  **/
  @ApiModelProperty(value = "Display text providing more information on the bundle")


  public String getAdditionalInfo() {
    return additionalInfo;
  }

  public void setAdditionalInfo(String additionalInfo) {
    this.additionalInfo = additionalInfo;
  }

  public BankingProductBundle additionalInfoUri(String additionalInfoUri) {
    this.additionalInfoUri = additionalInfoUri;
    return this;
  }

  /**
   * Link to a web page with more information on the bundle criteria and benefits
   * @return additionalInfoUri
  **/
  @ApiModelProperty(value = "Link to a web page with more information on the bundle criteria and benefits")


  public String getAdditionalInfoUri() {
    return additionalInfoUri;
  }

  public void setAdditionalInfoUri(String additionalInfoUri) {
    this.additionalInfoUri = additionalInfoUri;
  }

  public BankingProductBundle productIds(List<String> productIds) {
    this.productIds = productIds;
    return this;
  }

  public BankingProductBundle addProductIdsItem(String productIdsItem) {
    if (this.productIds == null) {
      this.productIds = new ArrayList<String>();
    }
    this.productIds.add(productIdsItem);
    return this;
  }

  /**
   * Array of product IDs for products included in the bundle that are available via the product end points.  Note that this array is not intended to represent a comprehensive model of the products included in the bundle and some products available for the bundle may not be available via the product reference end points
   * @return productIds
  **/
  @ApiModelProperty(value = "Array of product IDs for products included in the bundle that are available via the product end points.  Note that this array is not intended to represent a comprehensive model of the products included in the bundle and some products available for the bundle may not be available via the product reference end points")


  public List<String> getProductIds() {
    return productIds;
  }

  public void setProductIds(List<String> productIds) {
    this.productIds = productIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BankingProductBundle bankingProductBundle = (BankingProductBundle) o;
    return Objects.equals(this.name, bankingProductBundle.name) &&
        Objects.equals(this.description, bankingProductBundle.description) &&
        Objects.equals(this.additionalInfo, bankingProductBundle.additionalInfo) &&
        Objects.equals(this.additionalInfoUri, bankingProductBundle.additionalInfoUri) &&
        Objects.equals(this.productIds, bankingProductBundle.productIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, additionalInfo, additionalInfoUri, productIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BankingProductBundle {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    additionalInfo: ").append(toIndentedString(additionalInfo)).append("\n");
    sb.append("    additionalInfoUri: ").append(toIndentedString(additionalInfoUri)).append("\n");
    sb.append("    productIds: ").append(toIndentedString(productIds)).append("\n");
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

