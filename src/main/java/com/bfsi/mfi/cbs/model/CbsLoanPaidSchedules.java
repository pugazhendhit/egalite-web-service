package com.bfsi.mfi.cbs.model;

import java.util.Date;

public class CbsLoanPaidSchedules {
	private String loanAcNo;
	private String branchCode;
	private String prntLoanAcNo;
	private String customerId;
	private String prntCustId;
	private String isprntLoan;
	private String isgroupLoan;		
	private String cbsGroupId;
	private Date schDueDate;
	private Date schPaidDate;
	private String settlementCcyCode;
	private long amtSettled;
	private String fullPartialInd;
	
	public String getLoanAcNo() {
		return loanAcNo;
	}
	public void setLoanAcNo(String loanAcNo) {
		this.loanAcNo = loanAcNo;
	}
	public String getBranchCode() {
		return branchCode;
	}
	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}
	public String getPrntLoanAcNo() {
		return prntLoanAcNo;
	}
	public void setPrntLoanAcNo(String prntLoanAcNo) {
		this.prntLoanAcNo = prntLoanAcNo;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getPrntCustId() {
		return prntCustId;
	}
	public void setPrntCustId(String prntCustId) {
		this.prntCustId = prntCustId;
	}
	public String getIsprntLoan() {
		return isprntLoan;
	}
	public void setIsprntLoan(String isprntLoan) {
		this.isprntLoan = isprntLoan;
	}
	public String getIsgroupLoan() {
		return isgroupLoan;
	}
	public void setIsgroupLoan(String isgroupLoan) {
		this.isgroupLoan = isgroupLoan;
	}
	public String getCbsGroupId() {
		return cbsGroupId;
	}
	public void setCbsGroupId(String cbsGroupId) {
		this.cbsGroupId = cbsGroupId;
	}
	public Date getSchDueDate() {
		return schDueDate;
	}
	public void setSchDueDate(Date schDueDate) {
		this.schDueDate = schDueDate;
	}
	public Date getSchPaidDate() {
		return schPaidDate;
	}
	public void setSchPaidDate(Date schPaidDate) {
		this.schPaidDate = schPaidDate;
	}
	public String getSettlementCcyCode() {
		return settlementCcyCode;
	}
	public void setSettlementCcyCode(String settlementCcyCode) {
		this.settlementCcyCode = settlementCcyCode;
	}
	public long getAmtSettled() {
		return amtSettled;
	}
	public void setAmtSettled(long amtSettled) {
		this.amtSettled = amtSettled;
	}
	public String getFullPartialInd() {
		return fullPartialInd;
	}
	public void setFullPartialInd(String fullPartialInd) {
		this.fullPartialInd = fullPartialInd;
	}	
	
}
