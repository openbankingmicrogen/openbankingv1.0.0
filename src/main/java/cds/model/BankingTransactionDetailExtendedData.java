package cds.model;

import java.util.Objects;
import cds.model.BankingTransactionDetailExtendedDataX2p101Payload;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BankingTransactionDetailExtendedData
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-10-07T02:03:35.302Z")

public class BankingTransactionDetailExtendedData   {
  @JsonProperty("payer")
  private String payer = null;

  @JsonProperty("payee")
  private String payee = null;

  /**
   * Optional extended data provided specific to transaction originated via NPP
   */
  public enum ExtensionUTypeEnum {
    X2P101PAYLOAD("x2p101Payload");

    private String value;

    ExtensionUTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ExtensionUTypeEnum fromValue(String text) {
      for (ExtensionUTypeEnum b : ExtensionUTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("extensionUType")
  private ExtensionUTypeEnum extensionUType = null;

  @JsonProperty("x2p101Payload")
  private BankingTransactionDetailExtendedDataX2p101Payload x2p101Payload = null;

  /**
   * Identifier of the applicable overlay service. Valid values are: X2P1.01
   */
  public enum ServiceEnum {
    _01("X2P1.01");

    private String value;

    ServiceEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ServiceEnum fromValue(String text) {
      for (ServiceEnum b : ServiceEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("service")
  private ServiceEnum service = null;

  public BankingTransactionDetailExtendedData payer(String payer) {
    this.payer = payer;
    return this;
  }

  /**
   * Label of the originating payer. Mandatory for inbound payment
   * @return payer
  **/
  @ApiModelProperty(value = "Label of the originating payer. Mandatory for inbound payment")


  public String getPayer() {
    return payer;
  }

  public void setPayer(String payer) {
    this.payer = payer;
  }

  public BankingTransactionDetailExtendedData payee(String payee) {
    this.payee = payee;
    return this;
  }

  /**
   * Label of the target PayID.  Mandatory for an outbound payment. The name assigned to the BSB/Account Number or PayID (by the owner of the PayID)
   * @return payee
  **/
  @ApiModelProperty(value = "Label of the target PayID.  Mandatory for an outbound payment. The name assigned to the BSB/Account Number or PayID (by the owner of the PayID)")


  public String getPayee() {
    return payee;
  }

  public void setPayee(String payee) {
    this.payee = payee;
  }

  public BankingTransactionDetailExtendedData extensionUType(ExtensionUTypeEnum extensionUType) {
    this.extensionUType = extensionUType;
    return this;
  }

  /**
   * Optional extended data provided specific to transaction originated via NPP
   * @return extensionUType
  **/
  @ApiModelProperty(value = "Optional extended data provided specific to transaction originated via NPP")


  public ExtensionUTypeEnum getExtensionUType() {
    return extensionUType;
  }

  public void setExtensionUType(ExtensionUTypeEnum extensionUType) {
    this.extensionUType = extensionUType;
  }

  public BankingTransactionDetailExtendedData x2p101Payload(BankingTransactionDetailExtendedDataX2p101Payload x2p101Payload) {
    this.x2p101Payload = x2p101Payload;
    return this;
  }

  /**
   * Get x2p101Payload
   * @return x2p101Payload
  **/
  @ApiModelProperty(value = "")

  @Valid

  public BankingTransactionDetailExtendedDataX2p101Payload getX2p101Payload() {
    return x2p101Payload;
  }

  public void setX2p101Payload(BankingTransactionDetailExtendedDataX2p101Payload x2p101Payload) {
    this.x2p101Payload = x2p101Payload;
  }

  public BankingTransactionDetailExtendedData service(ServiceEnum service) {
    this.service = service;
    return this;
  }

  /**
   * Identifier of the applicable overlay service. Valid values are: X2P1.01
   * @return service
  **/
  @ApiModelProperty(required = true, value = "Identifier of the applicable overlay service. Valid values are: X2P1.01")
  @NotNull


  public ServiceEnum getService() {
    return service;
  }

  public void setService(ServiceEnum service) {
    this.service = service;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BankingTransactionDetailExtendedData bankingTransactionDetailExtendedData = (BankingTransactionDetailExtendedData) o;
    return Objects.equals(this.payer, bankingTransactionDetailExtendedData.payer) &&
        Objects.equals(this.payee, bankingTransactionDetailExtendedData.payee) &&
        Objects.equals(this.extensionUType, bankingTransactionDetailExtendedData.extensionUType) &&
        Objects.equals(this.x2p101Payload, bankingTransactionDetailExtendedData.x2p101Payload) &&
        Objects.equals(this.service, bankingTransactionDetailExtendedData.service);
  }

  @Override
  public int hashCode() {
    return Objects.hash(payer, payee, extensionUType, x2p101Payload, service);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BankingTransactionDetailExtendedData {\n");
    
    sb.append("    payer: ").append(toIndentedString(payer)).append("\n");
    sb.append("    payee: ").append(toIndentedString(payee)).append("\n");
    sb.append("    extensionUType: ").append(toIndentedString(extensionUType)).append("\n");
    sb.append("    x2p101Payload: ").append(toIndentedString(x2p101Payload)).append("\n");
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
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

