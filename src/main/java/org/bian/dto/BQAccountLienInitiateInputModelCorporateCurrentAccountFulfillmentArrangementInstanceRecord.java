package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQAccountLienInitiateInputModelCorporateCurrentAccountFulfillmentArrangementInstanceRecordPositionLimits;
import org.bian.dto.CRCorporateCurrentAccountFulfillmentArrangementInitiateInputModelCorporateCurrentAccountFulfillmentArrangementInstanceRecordDateType;
import org.bian.dto.CRCorporateCurrentAccountFulfillmentArrangementInitiateInputModelCorporateCurrentAccountFulfillmentArrangementInstanceRecordLinkedAccounts;

import javax.validation.Valid;
  
/**
 * BQAccountLienInitiateInputModelCorporateCurrentAccountFulfillmentArrangementInstanceRecord
 */
public class BQAccountLienInitiateInputModelCorporateCurrentAccountFulfillmentArrangementInstanceRecord   {
  private String productInstanceReference = null;

  private String corporateCurrentAccountNumber = null;

  private String customerReference = null;

  private String bankBranchLocationReference = null;

  private String accountType = null;

  private String entitlementOptionSetting = null;

  private String restrictionOptionSetting = null;

  private CRCorporateCurrentAccountFulfillmentArrangementInitiateInputModelCorporateCurrentAccountFulfillmentArrangementInstanceRecordLinkedAccounts linkedAccounts = null;

  private BQAccountLienInitiateInputModelCorporateCurrentAccountFulfillmentArrangementInstanceRecordPositionLimits positionLimits = null;

  private CRCorporateCurrentAccountFulfillmentArrangementInitiateInputModelCorporateCurrentAccountFulfillmentArrangementInstanceRecordDateType dateType = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the corporate current account product instance 
   * @return productInstanceReference
  **/

  public String getProductInstanceReference() {
    return productInstanceReference;
  }

  public void setProductInstanceReference(String productInstanceReference) {
    this.productInstanceReference = productInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The associated account number in any suitable format (e.g. IBAN) 
   * @return corporateCurrentAccountNumber
  **/

  public String getCorporateCurrentAccountNumber() {
    return corporateCurrentAccountNumber;
  }

  public void setCorporateCurrentAccountNumber(String corporateCurrentAccountNumber) {
    this.corporateCurrentAccountNumber = corporateCurrentAccountNumber;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the account primary party/owner 
   * @return customerReference
  **/

  public String getCustomerReference() {
    return customerReference;
  }

  public void setCustomerReference(String customerReference) {
    this.customerReference = customerReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Bank branch associated with the account for booking purposes 
   * @return bankBranchLocationReference
  **/

  public String getBankBranchLocationReference() {
    return bankBranchLocationReference;
  }

  public void setBankBranchLocationReference(String bankBranchLocationReference) {
    this.bankBranchLocationReference = bankBranchLocationReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of corporate current account (e.g. corporate, small business) 
   * @return accountType
  **/

  public String getAccountType() {
    return accountType;
  }

  public void setAccountType(String accountType) {
    this.accountType = accountType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The setting for the entitlement option 
   * @return entitlementOptionSetting
  **/

  public String getEntitlementOptionSetting() {
    return entitlementOptionSetting;
  }

  public void setEntitlementOptionSetting(String entitlementOptionSetting) {
    this.entitlementOptionSetting = entitlementOptionSetting;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The setting for the restriction option 
   * @return restrictionOptionSetting
  **/

  public String getRestrictionOptionSetting() {
    return restrictionOptionSetting;
  }

  public void setRestrictionOptionSetting(String restrictionOptionSetting) {
    this.restrictionOptionSetting = restrictionOptionSetting;
  }


  /**
   * Get linkedAccounts
   * @return linkedAccounts
  **/

  public CRCorporateCurrentAccountFulfillmentArrangementInitiateInputModelCorporateCurrentAccountFulfillmentArrangementInstanceRecordLinkedAccounts getLinkedAccounts() {
    return linkedAccounts;
  }

  public void setLinkedAccounts(CRCorporateCurrentAccountFulfillmentArrangementInitiateInputModelCorporateCurrentAccountFulfillmentArrangementInstanceRecordLinkedAccounts linkedAccounts) {
    this.linkedAccounts = linkedAccounts;
  }


  /**
   * Get positionLimits
   * @return positionLimits
  **/

  public BQAccountLienInitiateInputModelCorporateCurrentAccountFulfillmentArrangementInstanceRecordPositionLimits getPositionLimits() {
    return positionLimits;
  }

  public void setPositionLimits(BQAccountLienInitiateInputModelCorporateCurrentAccountFulfillmentArrangementInstanceRecordPositionLimits positionLimits) {
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

