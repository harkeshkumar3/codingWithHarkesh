package org.example.Problems.FeeCalculator;

public class Transaction {
    private String externalTransactionID;
    private String clientId;
    private String securityId;
    private Integer transactionType;
    private java.util.Date transactionDate;
    private Double marketValue;
    private Boolean priority;
    private Double transactionFees;

	public String getExternalTransactionID() {
		return this.externalTransactionID;
	}

	public void setExternalTransactionID(String externalTransactionID) {
		this.externalTransactionID = externalTransactionID;
	}

	public String getClientId() {
		return this.clientId;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	public String getSecurityId() {
		return this.securityId;
	}

	public void setSecurityId(String securityId) {
		this.securityId = securityId;
	}

	public Integer getTransactionType() {
		return this.transactionType;
	}

	public void setTransactionType(Integer transactionType) {
		this.transactionType = transactionType;
	}

	public java.util.Date getTransactionDate() {
		return this.transactionDate;
	}

	public void setTransactionDate(java.util.Date transactionDate) {
		this.transactionDate = transactionDate;
	}

	public Double getMarketValue() {
		return this.marketValue;
	}

	public void setMarketValue(Double marketValue) {
		this.marketValue = marketValue;
	}

	public Boolean getPriority() {
		return this.priority;
	}

	public void setPriority(Boolean priority) {
		this.priority = priority;
	}

	public Double getTransactionFees() {
		return this.transactionFees;
	}

	public void setTransactionFees(Double transactionFees) {
		this.transactionFees = transactionFees;
	}



}
