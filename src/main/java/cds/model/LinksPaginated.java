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
 * LinksPaginated
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-10-07T02:03:35.302Z")

public class LinksPaginated   {
  @JsonProperty("self")
  private String self = null;

  @JsonProperty("first")
  private String first = null;

  @JsonProperty("prev")
  private String prev = null;

  @JsonProperty("next")
  private String next = null;

  @JsonProperty("last")
  private String last = null;

  public LinksPaginated self(String self) {
    this.self = self;
    return this;
  }

  /**
   * Fully qualified link that generated the current response document
   * @return self
  **/
  @ApiModelProperty(required = true, value = "Fully qualified link that generated the current response document")
  @NotNull


  public String getSelf() {
    return self;
  }

  public void setSelf(String self) {
    this.self = self;
  }

  public LinksPaginated first(String first) {
    this.first = first;
    return this;
  }

  /**
   * URI to the first page of this set. Mandatory if this response is not the first page
   * @return first
  **/
  @ApiModelProperty(value = "URI to the first page of this set. Mandatory if this response is not the first page")


  public String getFirst() {
    return first;
  }

  public void setFirst(String first) {
    this.first = first;
  }

  public LinksPaginated prev(String prev) {
    this.prev = prev;
    return this;
  }

  /**
   * URI to the previous page of this set. Mandatory if this response is not the first page
   * @return prev
  **/
  @ApiModelProperty(value = "URI to the previous page of this set. Mandatory if this response is not the first page")


  public String getPrev() {
    return prev;
  }

  public void setPrev(String prev) {
    this.prev = prev;
  }

  public LinksPaginated next(String next) {
    this.next = next;
    return this;
  }

  /**
   * URI to the next page of this set. Mandatory if this response is not the last page
   * @return next
  **/
  @ApiModelProperty(value = "URI to the next page of this set. Mandatory if this response is not the last page")


  public String getNext() {
    return next;
  }

  public void setNext(String next) {
    this.next = next;
  }

  public LinksPaginated last(String last) {
    this.last = last;
    return this;
  }

  /**
   * URI to the last page of this set. Mandatory if this response is not the last page
   * @return last
  **/
  @ApiModelProperty(value = "URI to the last page of this set. Mandatory if this response is not the last page")


  public String getLast() {
    return last;
  }

  public void setLast(String last) {
    this.last = last;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinksPaginated linksPaginated = (LinksPaginated) o;
    return Objects.equals(this.self, linksPaginated.self) &&
        Objects.equals(this.first, linksPaginated.first) &&
        Objects.equals(this.prev, linksPaginated.prev) &&
        Objects.equals(this.next, linksPaginated.next) &&
        Objects.equals(this.last, linksPaginated.last);
  }

  @Override
  public int hashCode() {
    return Objects.hash(self, first, prev, next, last);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinksPaginated {\n");
    
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    first: ").append(toIndentedString(first)).append("\n");
    sb.append("    prev: ").append(toIndentedString(prev)).append("\n");
    sb.append("    next: ").append(toIndentedString(next)).append("\n");
    sb.append("    last: ").append(toIndentedString(last)).append("\n");
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

