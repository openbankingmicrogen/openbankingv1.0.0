package cds.model;

import java.util.Objects;
import cds.model.BankingScheduledPaymentInterval;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Indicates that the schedule of payments is defined by a series of intervals. Mandatory if recurrenceUType is set to intervalSchedule
 */
@ApiModel(description = "Indicates that the schedule of payments is defined by a series of intervals. Mandatory if recurrenceUType is set to intervalSchedule")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-10-07T02:03:35.302Z")

public class BankingScheduledPaymentRecurrenceIntervalSchedule   {
  @JsonProperty("finalPaymentDate")
  private String finalPaymentDate = null;

  @JsonProperty("paymentsRemaining")
  private Integer paymentsRemaining = null;

  /**
   * Enumerated field giving the treatment where a scheduled payment date is not a business day.  If absent assumed to be ON
   */
  public enum NonBusinessDayTreatmentEnum {
    AFTER("AFTER"),
    
    BEFORE("BEFORE"),
    
    ON("ON"),
    
    ONLY("ONLY");

    private String value;

    NonBusinessDayTreatmentEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static NonBusinessDayTreatmentEnum fromValue(String text) {
      for (NonBusinessDayTreatmentEnum b : NonBusinessDayTreatmentEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("nonBusinessDayTreatment")
  private NonBusinessDayTreatmentEnum nonBusinessDayTreatment = NonBusinessDayTreatmentEnum.ON;

  @JsonProperty("intervals")
  @Valid
  private List<BankingScheduledPaymentInterval> intervals = new ArrayList<BankingScheduledPaymentInterval>();

  public BankingScheduledPaymentRecurrenceIntervalSchedule finalPaymentDate(String finalPaymentDate) {
    this.finalPaymentDate = finalPaymentDate;
    return this;
  }

  /**
   * The limit date after which no more payments should be made using this schedule. If both finalPaymentDate and paymentsRemaining are present then payments will stop according to the most constraining value. If neither field is present the payments will continue indefinitely
   * @return finalPaymentDate
  **/
  @ApiModelProperty(value = "The limit date after which no more payments should be made using this schedule. If both finalPaymentDate and paymentsRemaining are present then payments will stop according to the most constraining value. If neither field is present the payments will continue indefinitely")


  public String getFinalPaymentDate() {
    return finalPaymentDate;
  }

  public void setFinalPaymentDate(String finalPaymentDate) {
    this.finalPaymentDate = finalPaymentDate;
  }

  public BankingScheduledPaymentRecurrenceIntervalSchedule paymentsRemaining(Integer paymentsRemaining) {
    this.paymentsRemaining = paymentsRemaining;
    return this;
  }

  /**
   * Indicates the number of payments remaining in the schedule. If both finalPaymentDate and paymentsRemaining are present then payments will stop according to the most constraining value, If neither field is present the payments will continue indefinitely
   * @return paymentsRemaining
  **/
  @ApiModelProperty(value = "Indicates the number of payments remaining in the schedule. If both finalPaymentDate and paymentsRemaining are present then payments will stop according to the most constraining value, If neither field is present the payments will continue indefinitely")


  public Integer getPaymentsRemaining() {
    return paymentsRemaining;
  }

  public void setPaymentsRemaining(Integer paymentsRemaining) {
    this.paymentsRemaining = paymentsRemaining;
  }

  public BankingScheduledPaymentRecurrenceIntervalSchedule nonBusinessDayTreatment(NonBusinessDayTreatmentEnum nonBusinessDayTreatment) {
    this.nonBusinessDayTreatment = nonBusinessDayTreatment;
    return this;
  }

  /**
   * Enumerated field giving the treatment where a scheduled payment date is not a business day.  If absent assumed to be ON
   * @return nonBusinessDayTreatment
  **/
  @ApiModelProperty(value = "Enumerated field giving the treatment where a scheduled payment date is not a business day.  If absent assumed to be ON")


  public NonBusinessDayTreatmentEnum getNonBusinessDayTreatment() {
    return nonBusinessDayTreatment;
  }

  public void setNonBusinessDayTreatment(NonBusinessDayTreatmentEnum nonBusinessDayTreatment) {
    this.nonBusinessDayTreatment = nonBusinessDayTreatment;
  }

  public BankingScheduledPaymentRecurrenceIntervalSchedule intervals(List<BankingScheduledPaymentInterval> intervals) {
    this.intervals = intervals;
    return this;
  }

  public BankingScheduledPaymentRecurrenceIntervalSchedule addIntervalsItem(BankingScheduledPaymentInterval intervalsItem) {
    this.intervals.add(intervalsItem);
    return this;
  }

  /**
   * An array of interval objects defining the payment schedule.  Each entry in the array is additive, in that it adds payments to the overall payment schedule.  If multiple intervals result in a payment on the same day then only one payment will be made. Must have at least one entry
   * @return intervals
  **/
  @ApiModelProperty(required = true, value = "An array of interval objects defining the payment schedule.  Each entry in the array is additive, in that it adds payments to the overall payment schedule.  If multiple intervals result in a payment on the same day then only one payment will be made. Must have at least one entry")
  @NotNull

  @Valid

  public List<BankingScheduledPaymentInterval> getIntervals() {
    return intervals;
  }

  public void setIntervals(List<BankingScheduledPaymentInterval> intervals) {
    this.intervals = intervals;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BankingScheduledPaymentRecurrenceIntervalSchedule bankingScheduledPaymentRecurrenceIntervalSchedule = (BankingScheduledPaymentRecurrenceIntervalSchedule) o;
    return Objects.equals(this.finalPaymentDate, bankingScheduledPaymentRecurrenceIntervalSchedule.finalPaymentDate) &&
        Objects.equals(this.paymentsRemaining, bankingScheduledPaymentRecurrenceIntervalSchedule.paymentsRemaining) &&
        Objects.equals(this.nonBusinessDayTreatment, bankingScheduledPaymentRecurrenceIntervalSchedule.nonBusinessDayTreatment) &&
        Objects.equals(this.intervals, bankingScheduledPaymentRecurrenceIntervalSchedule.intervals);
  }

  @Override
  public int hashCode() {
    return Objects.hash(finalPaymentDate, paymentsRemaining, nonBusinessDayTreatment, intervals);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BankingScheduledPaymentRecurrenceIntervalSchedule {\n");
    
    sb.append("    finalPaymentDate: ").append(toIndentedString(finalPaymentDate)).append("\n");
    sb.append("    paymentsRemaining: ").append(toIndentedString(paymentsRemaining)).append("\n");
    sb.append("    nonBusinessDayTreatment: ").append(toIndentedString(nonBusinessDayTreatment)).append("\n");
    sb.append("    intervals: ").append(toIndentedString(intervals)).append("\n");
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

