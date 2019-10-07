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
 * BankingDomesticPayeeAccount
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-10-07T02:03:35.302Z")

public class BankingDomesticPayeeAccount   {
  @JsonProperty("accountName")
  private String accountName = null;

  @JsonProperty("bsb")
  private String bsb = null;

  @JsonProperty("accountNumber")
  private String accountNumber = null;

  public BankingDomesticPayeeAccount accountName(String accountName) {
    this.accountName = accountName;
    return this;
  }

  /**
   * Name of the account to pay to
   * @return accountName
  **/
  @ApiModelProperty(required = true, value = "Name of the account to pay to")
  @NotNull


  public String getAccountName() {
    return accountName;
  }

  public void setAccountName(String accountName) {
    this.accountName = accountName;
  }

  public BankingDomesticPayeeAccount bsb(String bsb) {
    this.bsb = bsb;
    return this;
  }

  /**
   * BSB of the account to pay to
   * @return bsb
  **/
  @ApiModelProperty(required = true, value = "BSB of the account to pay to")
  @NotNull


  public String getBsb() {
    return bsb;
  }

  public void setBsb(String bsb) {
    this.bsb = bsb;
  }

  public BankingDomesticPayeeAccount accountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
    return this;
  }

  /**
   * Number of the account to pay to
   * @return accountNumber
  **/
  @ApiModelProperty(required = true, value = "Number of the account to pay to")
  @NotNull


  public String getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BankingDomesticPayeeAccount bankingDomesticPayeeAccount = (BankingDomesticPayeeAccount) o;
    return Objects.equals(this.accountName, bankingDomesticPayeeAccount.accountName) &&
        Objects.equals(this.bsb, bankingDomesticPayeeAccount.bsb) &&
        Objects.equals(this.accountNumber, bankingDomesticPayeeAccount.accountNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountName, bsb, accountNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BankingDomesticPayeeAccount {\n");
    
    sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
    sb.append("    bsb: ").append(toIndentedString(bsb)).append("\n");
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
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

