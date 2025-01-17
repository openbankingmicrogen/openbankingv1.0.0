package cds.model;

import java.util.Objects;
import cds.model.BankingTransaction;
import cds.model.BankingTransactionDetailExtendedData;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BankingTransactionDetail
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-10-07T02:03:35.302Z")

public class BankingTransactionDetail   {
  @JsonProperty("accountId")
  private String accountId = null;

  @JsonProperty("transactionId")
  private String transactionId = null;

  @JsonProperty("isDetailAvailable")
  private Boolean isDetailAvailable = null;

  /**
   * The type of the transaction
   */
  public enum TypeEnum {
    FEE("FEE"),
    
    INTEREST_CHARGED("INTEREST_CHARGED"),
    
    INTEREST_PAID("INTEREST_PAID"),
    
    TRANSFER_OUTGOING("TRANSFER_OUTGOING"),
    
    TRANSFER_INCOMING("TRANSFER_INCOMING"),
    
    PAYMENT("PAYMENT"),
    
    DIRECT_DEBIT("DIRECT_DEBIT"),
    
    OTHER("OTHER");

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

  /**
   * Status of the transaction whether pending or posted. Note that there is currently no provision in the standards to guarantee the ability to correlate a pending transaction with an associated posted transaction
   */
  public enum StatusEnum {
    PENDING("PENDING"),
    
    POSTED("POSTED");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("status")
  private StatusEnum status = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("postingDateTime")
  private String postingDateTime = null;

  @JsonProperty("valueDateTime")
  private String valueDateTime = null;

  @JsonProperty("executionDateTime")
  private String executionDateTime = null;

  @JsonProperty("amount")
  private String amount = null;

  @JsonProperty("currency")
  private String currency = null;

  @JsonProperty("reference")
  private String reference = null;

  @JsonProperty("merchantName")
  private String merchantName = null;

  @JsonProperty("merchantCategoryCode")
  private String merchantCategoryCode = null;

  @JsonProperty("billerCode")
  private String billerCode = null;

  @JsonProperty("billerName")
  private String billerName = null;

  @JsonProperty("crn")
  private String crn = null;

  @JsonProperty("apcaNumber")
  private String apcaNumber = null;

  @JsonProperty("extendedData")
  private BankingTransactionDetailExtendedData extendedData = null;

  public BankingTransactionDetail accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * ID of the account for which transactions are provided
   * @return accountId
  **/
  @ApiModelProperty(required = true, value = "ID of the account for which transactions are provided")
  @NotNull


  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public BankingTransactionDetail transactionId(String transactionId) {
    this.transactionId = transactionId;
    return this;
  }

  /**
   * A unique ID of the transaction adhering to the standards for ID permanence.  This is mandatory (through hashing if necessary) unless there are specific and justifiable technical reasons why a transaction cannot be uniquely identified for a particular account type
   * @return transactionId
  **/
  @ApiModelProperty(value = "A unique ID of the transaction adhering to the standards for ID permanence.  This is mandatory (through hashing if necessary) unless there are specific and justifiable technical reasons why a transaction cannot be uniquely identified for a particular account type")


  public String getTransactionId() {
    return transactionId;
  }

  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }

  public BankingTransactionDetail isDetailAvailable(Boolean isDetailAvailable) {
    this.isDetailAvailable = isDetailAvailable;
    return this;
  }

  /**
   * True if extended information is available using the transaction detail end point. False if extended data is not available
   * @return isDetailAvailable
  **/
  @ApiModelProperty(required = true, value = "True if extended information is available using the transaction detail end point. False if extended data is not available")
  @NotNull


  public Boolean isIsDetailAvailable() {
    return isDetailAvailable;
  }

  public void setIsDetailAvailable(Boolean isDetailAvailable) {
    this.isDetailAvailable = isDetailAvailable;
  }

  public BankingTransactionDetail type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * The type of the transaction
   * @return type
  **/
  @ApiModelProperty(required = true, value = "The type of the transaction")
  @NotNull


  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public BankingTransactionDetail status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Status of the transaction whether pending or posted. Note that there is currently no provision in the standards to guarantee the ability to correlate a pending transaction with an associated posted transaction
   * @return status
  **/
  @ApiModelProperty(required = true, value = "Status of the transaction whether pending or posted. Note that there is currently no provision in the standards to guarantee the ability to correlate a pending transaction with an associated posted transaction")
  @NotNull


  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public BankingTransactionDetail description(String description) {
    this.description = description;
    return this;
  }

  /**
   * The transaction description as applied by the financial institution
   * @return description
  **/
  @ApiModelProperty(required = true, value = "The transaction description as applied by the financial institution")
  @NotNull


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public BankingTransactionDetail postingDateTime(String postingDateTime) {
    this.postingDateTime = postingDateTime;
    return this;
  }

  /**
   * The time the transaction was posted. This field is Mandatory if the transaction has status POSTED.  This is the time that appears on a standard statement
   * @return postingDateTime
  **/
  @ApiModelProperty(value = "The time the transaction was posted. This field is Mandatory if the transaction has status POSTED.  This is the time that appears on a standard statement")


  public String getPostingDateTime() {
    return postingDateTime;
  }

  public void setPostingDateTime(String postingDateTime) {
    this.postingDateTime = postingDateTime;
  }

  public BankingTransactionDetail valueDateTime(String valueDateTime) {
    this.valueDateTime = valueDateTime;
    return this;
  }

  /**
   * Date and time at which assets become available to the account owner in case of a credit entry, or cease to be available to the account owner in case of a debit transaction entry
   * @return valueDateTime
  **/
  @ApiModelProperty(value = "Date and time at which assets become available to the account owner in case of a credit entry, or cease to be available to the account owner in case of a debit transaction entry")


  public String getValueDateTime() {
    return valueDateTime;
  }

  public void setValueDateTime(String valueDateTime) {
    this.valueDateTime = valueDateTime;
  }

  public BankingTransactionDetail executionDateTime(String executionDateTime) {
    this.executionDateTime = executionDateTime;
    return this;
  }

  /**
   * The time the transaction was executed by the originating customer, if available
   * @return executionDateTime
  **/
  @ApiModelProperty(value = "The time the transaction was executed by the originating customer, if available")


  public String getExecutionDateTime() {
    return executionDateTime;
  }

  public void setExecutionDateTime(String executionDateTime) {
    this.executionDateTime = executionDateTime;
  }

  public BankingTransactionDetail amount(String amount) {
    this.amount = amount;
    return this;
  }

  /**
   * The value of the transaction. Negative values mean money was outgoing from the account
   * @return amount
  **/
  @ApiModelProperty(required = true, value = "The value of the transaction. Negative values mean money was outgoing from the account")
  @NotNull


  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }

  public BankingTransactionDetail currency(String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * The currency for the transaction amount. AUD assumed if not present
   * @return currency
  **/
  @ApiModelProperty(value = "The currency for the transaction amount. AUD assumed if not present")


  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public BankingTransactionDetail reference(String reference) {
    this.reference = reference;
    return this;
  }

  /**
   * The reference for the transaction provided by the originating institution. Empty string if no data provided
   * @return reference
  **/
  @ApiModelProperty(required = true, value = "The reference for the transaction provided by the originating institution. Empty string if no data provided")
  @NotNull


  public String getReference() {
    return reference;
  }

  public void setReference(String reference) {
    this.reference = reference;
  }

  public BankingTransactionDetail merchantName(String merchantName) {
    this.merchantName = merchantName;
    return this;
  }

  /**
   * Name of the merchant for an outgoing payment to a merchant
   * @return merchantName
  **/
  @ApiModelProperty(value = "Name of the merchant for an outgoing payment to a merchant")


  public String getMerchantName() {
    return merchantName;
  }

  public void setMerchantName(String merchantName) {
    this.merchantName = merchantName;
  }

  public BankingTransactionDetail merchantCategoryCode(String merchantCategoryCode) {
    this.merchantCategoryCode = merchantCategoryCode;
    return this;
  }

  /**
   * The merchant category code (or MCC) for an outgoing payment to a merchant
   * @return merchantCategoryCode
  **/
  @ApiModelProperty(value = "The merchant category code (or MCC) for an outgoing payment to a merchant")


  public String getMerchantCategoryCode() {
    return merchantCategoryCode;
  }

  public void setMerchantCategoryCode(String merchantCategoryCode) {
    this.merchantCategoryCode = merchantCategoryCode;
  }

  public BankingTransactionDetail billerCode(String billerCode) {
    this.billerCode = billerCode;
    return this;
  }

  /**
   * BPAY Biller Code for the transaction (if available)
   * @return billerCode
  **/
  @ApiModelProperty(value = "BPAY Biller Code for the transaction (if available)")


  public String getBillerCode() {
    return billerCode;
  }

  public void setBillerCode(String billerCode) {
    this.billerCode = billerCode;
  }

  public BankingTransactionDetail billerName(String billerName) {
    this.billerName = billerName;
    return this;
  }

  /**
   * Name of the BPAY biller for the transaction (if available)
   * @return billerName
  **/
  @ApiModelProperty(value = "Name of the BPAY biller for the transaction (if available)")


  public String getBillerName() {
    return billerName;
  }

  public void setBillerName(String billerName) {
    this.billerName = billerName;
  }

  public BankingTransactionDetail crn(String crn) {
    this.crn = crn;
    return this;
  }

  /**
   * BPAY CRN for the transaction (if available)
   * @return crn
  **/
  @ApiModelProperty(value = "BPAY CRN for the transaction (if available)")


  public String getCrn() {
    return crn;
  }

  public void setCrn(String crn) {
    this.crn = crn;
  }

  public BankingTransactionDetail apcaNumber(String apcaNumber) {
    this.apcaNumber = apcaNumber;
    return this;
  }

  /**
   * 6 Digit APCA number for the initiating institution
   * @return apcaNumber
  **/
  @ApiModelProperty(value = "6 Digit APCA number for the initiating institution")


  public String getApcaNumber() {
    return apcaNumber;
  }

  public void setApcaNumber(String apcaNumber) {
    this.apcaNumber = apcaNumber;
  }

  public BankingTransactionDetail extendedData(BankingTransactionDetailExtendedData extendedData) {
    this.extendedData = extendedData;
    return this;
  }

  /**
   * Get extendedData
   * @return extendedData
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public BankingTransactionDetailExtendedData getExtendedData() {
    return extendedData;
  }

  public void setExtendedData(BankingTransactionDetailExtendedData extendedData) {
    this.extendedData = extendedData;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BankingTransactionDetail bankingTransactionDetail = (BankingTransactionDetail) o;
    return Objects.equals(this.accountId, bankingTransactionDetail.accountId) &&
        Objects.equals(this.transactionId, bankingTransactionDetail.transactionId) &&
        Objects.equals(this.isDetailAvailable, bankingTransactionDetail.isDetailAvailable) &&
        Objects.equals(this.type, bankingTransactionDetail.type) &&
        Objects.equals(this.status, bankingTransactionDetail.status) &&
        Objects.equals(this.description, bankingTransactionDetail.description) &&
        Objects.equals(this.postingDateTime, bankingTransactionDetail.postingDateTime) &&
        Objects.equals(this.valueDateTime, bankingTransactionDetail.valueDateTime) &&
        Objects.equals(this.executionDateTime, bankingTransactionDetail.executionDateTime) &&
        Objects.equals(this.amount, bankingTransactionDetail.amount) &&
        Objects.equals(this.currency, bankingTransactionDetail.currency) &&
        Objects.equals(this.reference, bankingTransactionDetail.reference) &&
        Objects.equals(this.merchantName, bankingTransactionDetail.merchantName) &&
        Objects.equals(this.merchantCategoryCode, bankingTransactionDetail.merchantCategoryCode) &&
        Objects.equals(this.billerCode, bankingTransactionDetail.billerCode) &&
        Objects.equals(this.billerName, bankingTransactionDetail.billerName) &&
        Objects.equals(this.crn, bankingTransactionDetail.crn) &&
        Objects.equals(this.apcaNumber, bankingTransactionDetail.apcaNumber) &&
        Objects.equals(this.extendedData, bankingTransactionDetail.extendedData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, transactionId, isDetailAvailable, type, status, description, postingDateTime, valueDateTime, executionDateTime, amount, currency, reference, merchantName, merchantCategoryCode, billerCode, billerName, crn, apcaNumber, extendedData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BankingTransactionDetail {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    isDetailAvailable: ").append(toIndentedString(isDetailAvailable)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    postingDateTime: ").append(toIndentedString(postingDateTime)).append("\n");
    sb.append("    valueDateTime: ").append(toIndentedString(valueDateTime)).append("\n");
    sb.append("    executionDateTime: ").append(toIndentedString(executionDateTime)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    merchantName: ").append(toIndentedString(merchantName)).append("\n");
    sb.append("    merchantCategoryCode: ").append(toIndentedString(merchantCategoryCode)).append("\n");
    sb.append("    billerCode: ").append(toIndentedString(billerCode)).append("\n");
    sb.append("    billerName: ").append(toIndentedString(billerName)).append("\n");
    sb.append("    crn: ").append(toIndentedString(crn)).append("\n");
    sb.append("    apcaNumber: ").append(toIndentedString(apcaNumber)).append("\n");
    sb.append("    extendedData: ").append(toIndentedString(extendedData)).append("\n");
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

