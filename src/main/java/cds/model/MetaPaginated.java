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
 * MetaPaginated
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-10-07T02:03:35.302Z")

public class MetaPaginated   {
  @JsonProperty("totalRecords")
  private Integer totalRecords = null;

  @JsonProperty("totalPages")
  private Integer totalPages = null;

  public MetaPaginated totalRecords(Integer totalRecords) {
    this.totalRecords = totalRecords;
    return this;
  }

  /**
   * The total number of records in the full set. See [pagination](#pagination).
   * @return totalRecords
  **/
  @ApiModelProperty(required = true, value = "The total number of records in the full set. See [pagination](#pagination).")
  @NotNull


  public Integer getTotalRecords() {
    return totalRecords;
  }

  public void setTotalRecords(Integer totalRecords) {
    this.totalRecords = totalRecords;
  }

  public MetaPaginated totalPages(Integer totalPages) {
    this.totalPages = totalPages;
    return this;
  }

  /**
   * The total number of pages in the full set. See [pagination](#pagination).
   * @return totalPages
  **/
  @ApiModelProperty(required = true, value = "The total number of pages in the full set. See [pagination](#pagination).")
  @NotNull


  public Integer getTotalPages() {
    return totalPages;
  }

  public void setTotalPages(Integer totalPages) {
    this.totalPages = totalPages;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MetaPaginated metaPaginated = (MetaPaginated) o;
    return Objects.equals(this.totalRecords, metaPaginated.totalRecords) &&
        Objects.equals(this.totalPages, metaPaginated.totalPages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalRecords, totalPages);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MetaPaginated {\n");
    
    sb.append("    totalRecords: ").append(toIndentedString(totalRecords)).append("\n");
    sb.append("    totalPages: ").append(toIndentedString(totalPages)).append("\n");
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

