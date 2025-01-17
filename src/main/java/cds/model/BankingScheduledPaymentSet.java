package cds.model;

import java.util.Objects;
import cds.model.BankingScheduledPaymentTo;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * The set of payment amounts and destination accounts for this payment accommodating multi-part payments. A single entry indicates a simple payment with one destination account. Must have at least one entry
 */
@ApiModel(description = "The set of payment amounts and destination accounts for this payment accommodating multi-part payments. A single entry indicates a simple payment with one destination account. Must have at least one entry")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-10-07T02:03:35.302Z")

public class BankingScheduledPaymentSet   {
  @JsonProperty("to")
  private BankingScheduledPaymentTo to = null;

  @JsonProperty("isAmountCalculated")
  private Boolean isAmountCalculated = null;

  @JsonProperty("amount")
  private String amount = null;

  @JsonProperty("currency")
  private String currency = null;

  public BankingScheduledPaymentSet to(BankingScheduledPaymentTo to) {
    this.to = to;
    return this;
  }

  /**
   * Get to
   * @return to
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public BankingScheduledPaymentTo getTo() {
    return to;
  }

  public void setTo(BankingScheduledPaymentTo to) {
    this.to = to;
  }

  public BankingScheduledPaymentSet isAmountCalculated(Boolean isAmountCalculated) {
    this.isAmountCalculated = isAmountCalculated;
    return this;
  }

  /**
   * Flag indicating whether the amount of the payment is calculated based on the context of the event. For instance a payment to reduce the balance of a credit card to zero. If absent then false is assumed
   * @return isAmountCalculated
  **/
  @ApiModelProperty(value = "Flag indicating whether the amount of the payment is calculated based on the context of the event. For instance a payment to reduce the balance of a credit card to zero. If absent then false is assumed")


  public Boolean isIsAmountCalculated() {
    return isAmountCalculated;
  }

  public void setIsAmountCalculated(Boolean isAmountCalculated) {
    this.isAmountCalculated = isAmountCalculated;
  }

  public BankingScheduledPaymentSet amount(String amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Flag indicating whether the amount of the payment is calculated based on the context of the event. For instance a payment to reduce the balance of a credit card to zero. If absent then false is assumed
   * @return amount
  **/
  @ApiModelProperty(value = "Flag indicating whether the amount of the payment is calculated based on the context of the event. For instance a payment to reduce the balance of a credit card to zero. If absent then false is assumed")


  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }

  public BankingScheduledPaymentSet currency(String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * The currency for the payment. AUD assumed if not present
   * @return currency
  **/
  @ApiModelProperty(value = "The currency for the payment. AUD assumed if not present")


  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BankingScheduledPaymentSet bankingScheduledPaymentSet = (BankingScheduledPaymentSet) o;
    return Objects.equals(this.to, bankingScheduledPaymentSet.to) &&
        Objects.equals(this.isAmountCalculated, bankingScheduledPaymentSet.isAmountCalculated) &&
        Objects.equals(this.amount, bankingScheduledPaymentSet.amount) &&
        Objects.equals(this.currency, bankingScheduledPaymentSet.currency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(to, isAmountCalculated, amount, currency);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BankingScheduledPaymentSet {\n");
    
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    isAmountCalculated: ").append(toIndentedString(isAmountCalculated)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
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

