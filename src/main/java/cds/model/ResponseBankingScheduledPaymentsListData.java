package cds.model;

import java.util.Objects;
import cds.model.BankingScheduledPayment;
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
 * ResponseBankingScheduledPaymentsListData
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-10-07T02:03:35.302Z")

public class ResponseBankingScheduledPaymentsListData   {
  @JsonProperty("scheduledPayments")
  @Valid
  private List<BankingScheduledPayment> scheduledPayments = new ArrayList<BankingScheduledPayment>();

  public ResponseBankingScheduledPaymentsListData scheduledPayments(List<BankingScheduledPayment> scheduledPayments) {
    this.scheduledPayments = scheduledPayments;
    return this;
  }

  public ResponseBankingScheduledPaymentsListData addScheduledPaymentsItem(BankingScheduledPayment scheduledPaymentsItem) {
    this.scheduledPayments.add(scheduledPaymentsItem);
    return this;
  }

  /**
   * The list of scheduled payments to return
   * @return scheduledPayments
  **/
  @ApiModelProperty(required = true, value = "The list of scheduled payments to return")
  @NotNull

  @Valid

  public List<BankingScheduledPayment> getScheduledPayments() {
    return scheduledPayments;
  }

  public void setScheduledPayments(List<BankingScheduledPayment> scheduledPayments) {
    this.scheduledPayments = scheduledPayments;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseBankingScheduledPaymentsListData responseBankingScheduledPaymentsListData = (ResponseBankingScheduledPaymentsListData) o;
    return Objects.equals(this.scheduledPayments, responseBankingScheduledPaymentsListData.scheduledPayments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scheduledPayments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseBankingScheduledPaymentsListData {\n");
    
    sb.append("    scheduledPayments: ").append(toIndentedString(scheduledPayments)).append("\n");
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

