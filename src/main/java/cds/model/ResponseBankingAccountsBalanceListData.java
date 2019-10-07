package cds.model;

import java.util.Objects;
import cds.model.BankingBalance;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ResponseBankingAccountsBalanceListData
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-10-07T02:03:35.302Z")

public class ResponseBankingAccountsBalanceListData   {
  @JsonProperty("balances")
  @Valid
  private List<BankingBalance> balances = new ArrayList<BankingBalance>();

  public ResponseBankingAccountsBalanceListData balances(List<BankingBalance> balances) {
    this.balances = balances;
    return this;
  }

  public ResponseBankingAccountsBalanceListData addBalancesItem(BankingBalance balancesItem) {
    this.balances.add(balancesItem);
    return this;
  }

  /**
   * The list of balances returned
   * @return balances
  **/
  @ApiModelProperty(required = true, value = "The list of balances returned")
  @NotNull

  @Valid

  public List<BankingBalance> getBalances() {
    return balances;
  }

  public void setBalances(List<BankingBalance> balances) {
    this.balances = balances;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseBankingAccountsBalanceListData responseBankingAccountsBalanceListData = (ResponseBankingAccountsBalanceListData) o;
    return Objects.equals(this.balances, responseBankingAccountsBalanceListData.balances);
  }

  @Override
  public int hashCode() {
    return Objects.hash(balances);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseBankingAccountsBalanceListData {\n");
    
    sb.append("    balances: ").append(toIndentedString(balances)).append("\n");
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

