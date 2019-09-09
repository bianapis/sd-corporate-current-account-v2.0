package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQIssuedDeviceInitiateOutputModelCorporateCurrentAccountFulfillmentArrangementInstanceRecordAssociations;
import org.bian.dto.CRCorporateCurrentAccountFulfillmentArrangementInitiateInputModelCorporateCurrentAccountFulfillmentArrangementInstanceRecordDateType;
import org.bian.dto.CRCorporateCurrentAccountFulfillmentArrangementInitiateInputModelCorporateCurrentAccountFulfillmentArrangementInstanceRecordPositionLimits;

import javax.validation.Valid;
  
/**
 * BQIssuedDeviceInitiateOutputModelCorporateCurrentAccountFulfillmentArrangementInstanceRecord
 */
public class BQIssuedDeviceInitiateOutputModelCorporateCurrentAccountFulfillmentArrangementInstanceRecord   {
  private BQIssuedDeviceInitiateOutputModelCorporateCurrentAccountFulfillmentArrangementInstanceRecordAssociations associations = null;

  private CRCorporateCurrentAccountFulfillmentArrangementInitiateInputModelCorporateCurrentAccountFulfillmentArrangementInstanceRecordPositionLimits positionLimits = null;

  private CRCorporateCurrentAccountFulfillmentArrangementInitiateInputModelCorporateCurrentAccountFulfillmentArrangementInstanceRecordDateType dateType = null;


  /**
   * Get associations
   * @return associations
  **/

  public BQIssuedDeviceInitiateOutputModelCorporateCurrentAccountFulfillmentArrangementInstanceRecordAssociations getAssociations() {
    return associations;
  }

  public void setAssociations(BQIssuedDeviceInitiateOutputModelCorporateCurrentAccountFulfillmentArrangementInstanceRecordAssociations associations) {
    this.associations = associations;
  }


  /**
   * Get positionLimits
   * @return positionLimits
  **/

  public CRCorporateCurrentAccountFulfillmentArrangementInitiateInputModelCorporateCurrentAccountFulfillmentArrangementInstanceRecordPositionLimits getPositionLimits() {
    return positionLimits;
  }

  public void setPositionLimits(CRCorporateCurrentAccountFulfillmentArrangementInitiateInputModelCorporateCurrentAccountFulfillmentArrangementInstanceRecordPositionLimits positionLimits) {
    this.positionLimits = positionLimits;
  }


  /**
   * Get dateType
   * @return dateType
  **/

  public CRCorporateCurrentAccountFulfillmentArrangementInitiateInputModelCorporateCurrentAccountFulfillmentArrangementInstanceRecordDateType getDateType() {
    return dateType;
  }

  public void setDateType(CRCorporateCurrentAccountFulfillmentArrangementInitiateInputModelCorporateCurrentAccountFulfillmentArrangementInstanceRecordDateType dateType) {
    this.dateType = dateType;
  }


}

