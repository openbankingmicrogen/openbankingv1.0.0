package cds.model;

import java.util.Objects;
import cds.model.BankingDomesticPayeeAccount;
import cds.model.BankingDomesticPayeeCard;
import cds.model.BankingDomesticPayeePayId;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BankingDomesticPayee
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-10-07T02:03:35.302Z")

public class BankingDomesticPayee   {
  /**
   * Type of account object included. Valid values are: { payeeAccountUType - - account A standard Australian account defined by BSB/Account Number payId A PayID recognised by NPP
   */
  public enum PayeeAccountUTypeEnum {
    ACCOUNT("account"),
    
    CARD("card"),
    
    PAYID("payId");

    private String value;

    PayeeAccountUTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static PayeeAccountUTypeEnum fromValue(String text) {
      for (PayeeAccountUTypeEnum b : PayeeAccountUTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("payeeAccountUType")
  private PayeeAccountUTypeEnum payeeAccountUType = null;

  @JsonProperty("account")
  private BankingDomesticPayeeAccount account = null;

  @JsonProperty("card")
  private BankingDomesticPayeeCard card = null;

  @JsonProperty("payId")
  private BankingDomesticPayeePayId payId = null;

  public BankingDomesticPayee payeeAccountUType(PayeeAccountUTypeEnum payeeAccountUType) {
    this.payeeAccountUType = payeeAccountUType;
    return this;
  }

  /**
   * Type of account object included. Valid values are: { payeeAccountUType - - account A standard Australian account defined by BSB/Account Number payId A PayID recognised by NPP
   * @return payeeAccountUType
  **/
  @ApiModelProperty(required = true, value = "Type of account object included. Valid values are: { payeeAccountUType - - account A standard Australian account defined by BSB/Account Number payId A PayID recognised by NPP")
  @NotNull


  public PayeeAccountUTypeEnum getPayeeAccountUType() {
    return payeeAccountUType;
  }

  public void setPayeeAccountUType(PayeeAccountUTypeEnum payeeAccountUType) {
    this.payeeAccountUType = payeeAccountUType;
  }

  public BankingDomesticPayee account(BankingDomesticPayeeAccount account) {
    this.account = account;
    return this;
  }

  /**
   * Get account
   * @return account
  **/
  @ApiModelProperty(value = "")

  @Valid

  public BankingDomesticPayeeAccount getAccount() {
    return account;
  }

  public void setAccount(BankingDomesticPayeeAccount account) {
    this.account = account;
  }

  public BankingDomesticPayee card(BankingDomesticPayeeCard card) {
    this.card = card;
    return this;
  }

  /**
   * Get card
   * @return card
  **/
  @ApiModelProperty(value = "")

  @Valid

  public BankingDomesticPayeeCard getCard() {
    return card;
  }

  public void setCard(BankingDomesticPayeeCard card) {
    this.card = card;
  }

  public BankingDomesticPayee payId(BankingDomesticPayeePayId payId) {
    this.payId = payId;
    return this;
  }

  /**
   * Get payId
   * @return payId
  **/
  @ApiModelProperty(value = "")

  @Valid

  public BankingDomesticPayeePayId getPayId() {
    return payId;
  }

  public void setPayId(BankingDomesticPayeePayId payId) {
    this.payId = payId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BankingDomesticPayee bankingDomesticPayee = (BankingDomesticPayee) o;
    return Objects.equals(this.payeeAccountUType, bankingDomesticPayee.payeeAccountUType) &&
        Objects.equals(this.account, bankingDomesticPayee.account) &&
        Objects.equals(this.card, bankingDomesticPayee.card) &&
        Objects.equals(this.payId, bankingDomesticPayee.payId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(payeeAccountUType, account, card, payId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BankingDomesticPayee {\n");
    
    sb.append("    payeeAccountUType: ").append(toIndentedString(payeeAccountUType)).append("\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    card: ").append(toIndentedString(card)).append("\n");
    sb.append("    payId: ").append(toIndentedString(payId)).append("\n");
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

