/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface CorporateCurrentAccountApiService {

	SDCorporateCurrentAccountActivateOutputModel activate(SDCorporateCurrentAccountActivateInputModel request);
	
	SDCorporateCurrentAccountConfigureOutputModel configure(String sdReferenceId, SDCorporateCurrentAccountConfigureInputModel request);
	
	CRCorporateCurrentAccountFulfillmentArrangementControlOutputModel control(String sdReferenceId, String crReferenceId, CRCorporateCurrentAccountFulfillmentArrangementControlInputModel request);
	
	BQAccountLienExchangeOutputModel exchangeAccountlien(String sdReferenceId, String crReferenceId, String bqReferenceId, BQAccountLienExchangeInputModel request);
	
	BQPaymentsExchangeOutputModel exchangePayments(String sdReferenceId, String crReferenceId, String bqReferenceId, BQPaymentsExchangeInputModel request);
	
	BQAccountSweepExecuteOutputModel executeAccountsweep(String sdReferenceId, String crReferenceId, String bqReferenceId, BQAccountSweepExecuteInputModel request);
	
	BQDepositsandWithdrawalsExecuteOutputModel executeDepositsandwithdrawals(String sdReferenceId, String crReferenceId, String bqReferenceId, BQDepositsandWithdrawalsExecuteInputModel request);
	
	BQPaymentsExecuteOutputModel executePayments(String sdReferenceId, String crReferenceId, String bqReferenceId, BQPaymentsExecuteInputModel request);
	
	BQServiceFeesExecuteOutputModel executeServicefees(String sdReferenceId, String crReferenceId, String bqReferenceId, BQServiceFeesExecuteInputModel request);
	
	SDCorporateCurrentAccountFeedbackOutputModel feedback(String sdReferenceId, SDCorporateCurrentAccountFeedbackInputModel request);
	
	CRCorporateCurrentAccountFulfillmentArrangementInitiateOutputModel initiate(String sdReferenceId, CRCorporateCurrentAccountFulfillmentArrangementInitiateInputModel request);
	
	BQAccountLienInitiateOutputModel initiateAccountlien(String sdReferenceId, String crReferenceId, BQAccountLienInitiateInputModel request);
	
	BQAccountSweepInitiateOutputModel initiateAccountsweep(String sdReferenceId, String crReferenceId, BQAccountSweepInitiateInputModel request);
	
	BQDepositsandWithdrawalsInitiateOutputModel initiateDepositsandwithdrawals(String sdReferenceId, String crReferenceId, BQDepositsandWithdrawalsInitiateInputModel request);
	
	BQIssuedDeviceInitiateOutputModel initiateIssueddevice(String sdReferenceId, String crReferenceId, BQIssuedDeviceInitiateInputModel request);
	
	BQPaymentsInitiateOutputModel initiatePayments(String sdReferenceId, String crReferenceId, BQPaymentsInitiateInputModel request);
	
	BQServiceFeesInitiateOutputModel initiateServicefees(String sdReferenceId, String crReferenceId, BQServiceFeesInitiateInputModel request);
	
	BQIssuedDeviceRequestOutputModel requestIssueddevice(String sdReferenceId, String crReferenceId, String bqReferenceId, BQIssuedDeviceRequestInputModel request);
	
	CRCorporateCurrentAccountFulfillmentArrangementRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId);
	
	List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	BQAccountLienRetrieveOutputModel retrieveAccountlien(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQAccountSweepRetrieveOutputModel retrieveAccountsweep(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQDepositsandWithdrawalsRetrieveOutputModel retrieveDepositsandwithdrawals(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQInterestRetrieveOutputModel retrieveInterest(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQIssuedDeviceRetrieveOutputModel retrieveIssueddevice(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQPaymentsRetrieveOutputModel retrievePayments(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQServiceFeesRetrieveOutputModel retrieveServicefees(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	List<String> retrieveRefIds(String sdReferenceId);
	
	SDCorporateCurrentAccountRetrieveOutputModel retrieveSD(String sdReferenceId);
	
	CRCorporateCurrentAccountFulfillmentArrangementUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRCorporateCurrentAccountFulfillmentArrangementUpdateInputModel request);
	
	BQAccountLienUpdateOutputModel updateAccountlien(String sdReferenceId, String crReferenceId, String bqReferenceId, BQAccountLienUpdateInputModel request);
	
	BQAccountSweepUpdateOutputModel updateAccountsweep(String sdReferenceId, String crReferenceId, String bqReferenceId, BQAccountSweepUpdateInputModel request);
	
	BQDepositsandWithdrawalsUpdateOutputModel updateDepositsandwithdrawals(String sdReferenceId, String crReferenceId, String bqReferenceId, BQDepositsandWithdrawalsUpdateInputModel request);
	
	BQIssuedDeviceUpdateOutputModel updateIssueddevice(String sdReferenceId, String crReferenceId, String bqReferenceId, BQIssuedDeviceUpdateInputModel request);
	
	BQPaymentsUpdateOutputModel updatePayments(String sdReferenceId, String crReferenceId, String bqReferenceId, BQPaymentsUpdateInputModel request);
	
}
