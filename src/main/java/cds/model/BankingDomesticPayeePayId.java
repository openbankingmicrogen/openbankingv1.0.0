package cds.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BankingDomesticPayeePayId
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-10-07T02:03:35.302Z")

public class BankingDomesticPayeePayId   {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("identifier")
  private String identifier = null;

  /**
   * The type of the PayID
   */
  public enum TypeEnum {
    EMAIL("EMAIL"),
    
    TELEPHONE("TELEPHONE"),
    
    ABN("ABN"),
    
    ORG_IDENTIFIER("ORG_IDENTIFIER");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("type")
  private TypeEnum type = null;

  public BankingDomesticPayeePayId name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name assigned to the PayID by the owner of the PayID
   * @return name
  **/
  @ApiModelProperty(value = "The name assigned to the PayID by the owner of the PayID")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public BankingDomesticPayeePayId identifier(String identifier) {
    this.identifier = identifier;
    return this;
  }

  /**
   * The identifier of the PayID (dependent on type)
   * @return identifier
  **/
  @ApiModelProperty(required = true, value = "The identifier of the PayID (dependent on type)")
  @NotNull


  public String getIdentifier() {
    return identifier;
  }

  public void setIdentifier(String identifier) {
    this.identifier = identifier;
  }

  public BankingDomesticPayeePayId type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * The type of the PayID
   * @return type
  **/
  @ApiModelProperty(required = true, value = "The type of the PayID")
  @NotNull


  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BankingDomesticPayeePayId bankingDomesticPayeePayId = (BankingDomesticPayeePayId) o;
    return Objects.equals(this.name, bankingDomesticPayeePayId.name) &&
        Objects.equals(this.identifier, bankingDomesticPayeePayId.identifier) &&
        Objects.equals(this.type, bankingDomesticPayeePayId.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, identifier, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BankingDomesticPayeePayId {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

