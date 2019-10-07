package cds.model;

import java.util.Objects;
import cds.model.BankingProduct;
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
 * ResponseBankingProductListData
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-10-07T02:03:35.302Z")

public class ResponseBankingProductListData   {
  @JsonProperty("products")
  @Valid
  private List<BankingProduct> products = new ArrayList<BankingProduct>();

  public ResponseBankingProductListData products(List<BankingProduct> products) {
    this.products = products;
    return this;
  }

  public ResponseBankingProductListData addProductsItem(BankingProduct productsItem) {
    this.products.add(productsItem);
    return this;
  }

  /**
   * The list of products returned.  If the filter results in an empty set then this array may have no records
   * @return products
  **/
  @ApiModelProperty(required = true, value = "The list of products returned.  If the filter results in an empty set then this array may have no records")
  @NotNull

  @Valid

  public List<BankingProduct> getProducts() {
    return products;
  }

  public void setProducts(List<BankingProduct> products) {
    this.products = products;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseBankingProductListData responseBankingProductListData = (ResponseBankingProductListData) o;
    return Objects.equals(this.products, responseBankingProductListData.products);
  }

  @Override
  public int hashCode() {
    return Objects.hash(products);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseBankingProductListData {\n");
    
    sb.append("    products: ").append(toIndentedString(products)).append("\n");
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

