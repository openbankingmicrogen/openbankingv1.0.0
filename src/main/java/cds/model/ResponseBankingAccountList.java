package cds.model;

import java.util.Objects;
import cds.model.LinksPaginated;
import cds.model.MetaPaginated;
import cds.model.ResponseBankingAccountListData;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ResponseBankingAccountList
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-10-07T02:03:35.302Z")

public class ResponseBankingAccountList   {
  @JsonProperty("data")
  private ResponseBankingAccountListData data = null;

  @JsonProperty("links")
  private LinksPaginated links = null;

  @JsonProperty("meta")
  private MetaPaginated meta = null;

  public ResponseBankingAccountList data(ResponseBankingAccountListData data) {
    this.data = data;
    return this;
  }

  /**
   * Get data
   * @return data
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public ResponseBankingAccountListData getData() {
    return data;
  }

  public void setData(ResponseBankingAccountListData data) {
    this.data = data;
  }

  public ResponseBankingAccountList links(LinksPaginated links) {
    this.links = links;
    return this;
  }

  /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public LinksPaginated getLinks() {
    return links;
  }

  public void setLinks(LinksPaginated links) {
    this.links = links;
  }

  public ResponseBankingAccountList meta(MetaPaginated meta) {
    this.meta = meta;
    return this;
  }

  /**
   * Get meta
   * @return meta
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public MetaPaginated getMeta() {
    return meta;
  }

  public void setMeta(MetaPaginated meta) {
    this.meta = meta;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseBankingAccountList responseBankingAccountList = (ResponseBankingAccountList) o;
    return Objects.equals(this.data, responseBankingAccountList.data) &&
        Objects.equals(this.links, responseBankingAccountList.links) &&
        Objects.equals(this.meta, responseBankingAccountList.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, links, meta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseBankingAccountList {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
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

