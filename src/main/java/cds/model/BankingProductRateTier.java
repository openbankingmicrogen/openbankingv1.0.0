package cds.model;

import java.util.Objects;
import cds.model.BankingProductRateCondition;
import cds.model.BankingProductRateTierSubTier;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Defines the criteria and conditions for which a rate applies
 */
@ApiModel(description = "Defines the criteria and conditions for which a rate applies")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-10-07T02:03:35.302Z")

public class BankingProductRateTier   {
  @JsonProperty("name")
  private String name = null;

  /**
   * The unit of measure that applies to the tierValueMinimum and tierValueMaximum values e.g. 'DOLLAR', 'MONTH' (in the case of term deposit tiers), 'PERCENT' (in the case of loan-to-value ratio or LVR)
   */
  public enum UnitOfMeasureEnum {
    DOLLAR("DOLLAR"),
    
    PERCENT("PERCENT"),
    
    MONTH("MONTH"),
    
    DAY("DAY");

    private String value;

    UnitOfMeasureEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static UnitOfMeasureEnum fromValue(String text) {
      for (UnitOfMeasureEnum b : UnitOfMeasureEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("unitOfMeasure")
  private UnitOfMeasureEnum unitOfMeasure = null;

  @JsonProperty("minimumValue")
  private BigDecimal minimumValue = null;

  @JsonProperty("maximumValue")
  private BigDecimal maximumValue = null;

  /**
   * The method used to calculate the amount to be applied using one or more tiers. A single rate may be applied to the entire balance or each applicable tier rate is applied to the portion of the balance that falls into that tier (referred to as 'bands' or 'steps')
   */
  public enum RateApplicationMethodEnum {
    WHOLE_BALANCE("WHOLE_BALANCE"),
    
    PER_TIER("PER_TIER");

    private String value;

    RateApplicationMethodEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static RateApplicationMethodEnum fromValue(String text) {
      for (RateApplicationMethodEnum b : RateApplicationMethodEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("rateApplicationMethod")
  private RateApplicationMethodEnum rateApplicationMethod = null;

  @JsonProperty("applicabilityConditions")
  private BankingProductRateCondition applicabilityConditions = null;

  @JsonProperty("subTier")
  private BankingProductRateTierSubTier subTier = null;

  public BankingProductRateTier name(String name) {
    this.name = name;
    return this;
  }

  /**
   * A display name for the tier
   * @return name
  **/
  @ApiModelProperty(required = true, value = "A display name for the tier")
  @NotNull


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public BankingProductRateTier unitOfMeasure(UnitOfMeasureEnum unitOfMeasure) {
    this.unitOfMeasure = unitOfMeasure;
    return this;
  }

  /**
   * The unit of measure that applies to the tierValueMinimum and tierValueMaximum values e.g. 'DOLLAR', 'MONTH' (in the case of term deposit tiers), 'PERCENT' (in the case of loan-to-value ratio or LVR)
   * @return unitOfMeasure
  **/
  @ApiModelProperty(required = true, value = "The unit of measure that applies to the tierValueMinimum and tierValueMaximum values e.g. 'DOLLAR', 'MONTH' (in the case of term deposit tiers), 'PERCENT' (in the case of loan-to-value ratio or LVR)")
  @NotNull


  public UnitOfMeasureEnum getUnitOfMeasure() {
    return unitOfMeasure;
  }

  public void setUnitOfMeasure(UnitOfMeasureEnum unitOfMeasure) {
    this.unitOfMeasure = unitOfMeasure;
  }

  public BankingProductRateTier minimumValue(BigDecimal minimumValue) {
    this.minimumValue = minimumValue;
    return this;
  }

  /**
   * The number of tierUnitOfMeasure units that form the lower bound of the tier. The tier should be inclusive of this value
   * @return minimumValue
  **/
  @ApiModelProperty(required = true, value = "The number of tierUnitOfMeasure units that form the lower bound of the tier. The tier should be inclusive of this value")
  @NotNull

  @Valid

  public BigDecimal getMinimumValue() {
    return minimumValue;
  }

  public void setMinimumValue(BigDecimal minimumValue) {
    this.minimumValue = minimumValue;
  }

  public BankingProductRateTier maximumValue(BigDecimal maximumValue) {
    this.maximumValue = maximumValue;
    return this;
  }

  /**
   * The number of tierUnitOfMeasure units that form the upper bound of the tier or band. For a tier with a discrete value (as opposed to a range of values e.g. 1 month) this must be the same as tierValueMinimum. Where this is the same as the tierValueMinimum value of the next-higher tier the referenced tier should be exclusive of this value. For example a term deposit of 2 months falls into the upper tier of the following tiers: (1 – 2 months, 2 – 3 months). If absent the tier's range has no upper bound.
   * @return maximumValue
  **/
  @ApiModelProperty(value = "The number of tierUnitOfMeasure units that form the upper bound of the tier or band. For a tier with a discrete value (as opposed to a range of values e.g. 1 month) this must be the same as tierValueMinimum. Where this is the same as the tierValueMinimum value of the next-higher tier the referenced tier should be exclusive of this value. For example a term deposit of 2 months falls into the upper tier of the following tiers: (1 – 2 months, 2 – 3 months). If absent the tier's range has no upper bound.")

  @Valid

  public BigDecimal getMaximumValue() {
    return maximumValue;
  }

  public void setMaximumValue(BigDecimal maximumValue) {
    this.maximumValue = maximumValue;
  }

  public BankingProductRateTier rateApplicationMethod(RateApplicationMethodEnum rateApplicationMethod) {
    this.rateApplicationMethod = rateApplicationMethod;
    return this;
  }

  /**
   * The method used to calculate the amount to be applied using one or more tiers. A single rate may be applied to the entire balance or each applicable tier rate is applied to the portion of the balance that falls into that tier (referred to as 'bands' or 'steps')
   * @return rateApplicationMethod
  **/
  @ApiModelProperty(value = "The method used to calculate the amount to be applied using one or more tiers. A single rate may be applied to the entire balance or each applicable tier rate is applied to the portion of the balance that falls into that tier (referred to as 'bands' or 'steps')")


  public RateApplicationMethodEnum getRateApplicationMethod() {
    return rateApplicationMethod;
  }

  public void setRateApplicationMethod(RateApplicationMethodEnum rateApplicationMethod) {
    this.rateApplicationMethod = rateApplicationMethod;
  }

  public BankingProductRateTier applicabilityConditions(BankingProductRateCondition applicabilityConditions) {
    this.applicabilityConditions = applicabilityConditions;
    return this;
  }

  /**
   * Get applicabilityConditions
   * @return applicabilityConditions
  **/
  @ApiModelProperty(value = "")

  @Valid

  public BankingProductRateCondition getApplicabilityConditions() {
    return applicabilityConditions;
  }

  public void setApplicabilityConditions(BankingProductRateCondition applicabilityConditions) {
    this.applicabilityConditions = applicabilityConditions;
  }

  public BankingProductRateTier subTier(BankingProductRateTierSubTier subTier) {
    this.subTier = subTier;
    return this;
  }

  /**
   * Get subTier
   * @return subTier
  **/
  @ApiModelProperty(value = "")

  @Valid

  public BankingProductRateTierSubTier getSubTier() {
    return subTier;
  }

  public void setSubTier(BankingProductRateTierSubTier subTier) {
    this.subTier = subTier;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BankingProductRateTier bankingProductRateTier = (BankingProductRateTier) o;
    return Objects.equals(this.name, bankingProductRateTier.name) &&
        Objects.equals(this.unitOfMeasure, bankingProductRateTier.unitOfMeasure) &&
        Objects.equals(this.minimumValue, bankingProductRateTier.minimumValue) &&
        Objects.equals(this.maximumValue, bankingProductRateTier.maximumValue) &&
        Objects.equals(this.rateApplicationMethod, bankingProductRateTier.rateApplicationMethod) &&
        Objects.equals(this.applicabilityConditions, bankingProductRateTier.applicabilityConditions) &&
        Objects.equals(this.subTier, bankingProductRateTier.subTier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, unitOfMeasure, minimumValue, maximumValue, rateApplicationMethod, applicabilityConditions, subTier);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BankingProductRateTier {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    unitOfMeasure: ").append(toIndentedString(unitOfMeasure)).append("\n");
    sb.append("    minimumValue: ").append(toIndentedString(minimumValue)).append("\n");
    sb.append("    maximumValue: ").append(toIndentedString(maximumValue)).append("\n");
    sb.append("    rateApplicationMethod: ").append(toIndentedString(rateApplicationMethod)).append("\n");
    sb.append("    applicabilityConditions: ").append(toIndentedString(applicabilityConditions)).append("\n");
    sb.append("    subTier: ").append(toIndentedString(subTier)).append("\n");
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

