package cds.model;

import java.util.Objects;
import cds.model.BankingInternationalPayeeBankDetails;
import cds.model.BankingInternationalPayeeBeneficiaryDetails;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BankingInternationalPayee
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-10-07T02:03:35.302Z")

public class BankingInternationalPayee   {
  @JsonProperty("beneficiaryDetails")
  private BankingInternationalPayeeBeneficiaryDetails beneficiaryDetails = null;

  @JsonProperty("bankDetails")
  private BankingInternationalPayeeBankDetails bankDetails = null;

  public BankingInternationalPayee beneficiaryDetails(BankingInternationalPayeeBeneficiaryDetails beneficiaryDetails) {
    this.beneficiaryDetails = beneficiaryDetails;
    return this;
  }

  /**
   * Get beneficiaryDetails
   * @return beneficiaryDetails
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public BankingInternationalPayeeBeneficiaryDetails getBeneficiaryDetails() {
    return beneficiaryDetails;
  }

  public void setBeneficiaryDetails(BankingInternationalPayeeBeneficiaryDetails beneficiaryDetails) {
    this.beneficiaryDetails = beneficiaryDetails;
  }

  public BankingInternationalPayee bankDetails(BankingInternationalPayeeBankDetails bankDetails) {
    this.bankDetails = bankDetails;
    return this;
  }

  /**
   * Get bankDetails
   * @return bankDetails
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public BankingInternationalPayeeBankDetails getBankDetails() {
    return bankDetails;
  }

  public void setBankDetails(BankingInternationalPayeeBankDetails bankDetails) {
    this.bankDetails = bankDetails;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BankingInternationalPayee bankingInternationalPayee = (BankingInternationalPayee) o;
    return Objects.equals(this.beneficiaryDetails, bankingInternationalPayee.beneficiaryDetails) &&
        Objects.equals(this.bankDetails, bankingInternationalPayee.bankDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(beneficiaryDetails, bankDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BankingInternationalPayee {\n");
    
    sb.append("    beneficiaryDetails: ").append(toIndentedString(beneficiaryDetails)).append("\n");
    sb.append("    bankDetails: ").append(toIndentedString(bankDetails)).append("\n");
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

