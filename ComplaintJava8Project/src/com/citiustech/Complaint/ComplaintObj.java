package com.citiustech.Complaint;

import java.time.LocalDate;

public class ComplaintObj {

	private String dateRecieved;
	private String Product;
	private String Subproduct;
	public ComplaintObj() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ComplaintObj(String dateRecieved, String product, String subproduct, String issue, String subissue,
			String company, String state, int zIPcode, String submittedvia, String Dateclosed,
			String companyResponseToConsumer, String timelyResponse, String consumerDisputed, int complaintID) {
		super();
		this.dateRecieved = dateRecieved;
		Product = product;
		Subproduct = subproduct;
		Issue = issue;
		Subissue = subissue;
		Company = company;
		State = state;
		ZIPcode = zIPcode;
		Submittedvia = submittedvia;
		Dateclosed = Dateclosed;
		CompanyResponseToConsumer = companyResponseToConsumer;
		TimelyResponse = timelyResponse;
		ConsumerDisputed = consumerDisputed;
		ComplaintID = complaintID;
	}
	private String Issue;
	@Override
	public String toString() {
		return "ComplaintObj [dateRecieved=" + dateRecieved + ", Product=" + Product + ", Subproduct=" + Subproduct
				+ ", Issue=" + Issue + ", Subissue=" + Subissue + ", Company=" + Company + ", State=" + State
				+ ", ZIPcode=" + ZIPcode + ", Submittedvia=" + Submittedvia + ", Dateclosed=" + Dateclosed
				+ ", CompanyResponseToConsumer=" + CompanyResponseToConsumer + ", TimelyResponse=" + TimelyResponse
				+ ", ConsumerDisputed=" + ConsumerDisputed + ", ComplaintID=" + ComplaintID + "]";
	}
	private String Subissue;
	public String getDateRecieved() {
		return dateRecieved;
	}
	public void setDateRecieved(String dateRecieved) {
		this.dateRecieved = dateRecieved;
	}
	public String getProduct() {
		return Product;
	}
	public void setProduct(String product) {
		Product = product;
	}
	public String getSubproduct() {
		return Subproduct;
	}
	public void setSubproduct(String subproduct) {
		Subproduct = subproduct;
	}
	public String getIssue() {
		return Issue;
	}
	public void setIssue(String issue) {
		Issue = issue;
	}
	public String getSubissue() {
		return Subissue;
	}
	public void setSubissue(String subissue) {
		Subissue = subissue;
	}
	public String getCompany() {
		return Company;
	}
	public void setCompany(String company) {
		Company = company;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public int getZIPcode() {
		return ZIPcode;
	}
	public void setZIPcode(int zIPcode) {
		ZIPcode = zIPcode;
	}
	public String getSubmittedvia() {
		return Submittedvia;
	}
	public void setSubmittedvia(String submittedvia) {
		Submittedvia = submittedvia;
	}
	public String getDateclosed() {
		return Dateclosed;
	}
	public void setDateclosed(String dateclosed) {
		Dateclosed = dateclosed;
	}
	public String getCompanyResponseToConsumer() {
		return CompanyResponseToConsumer;
	}
	public void setCompanyResponseToConsumer(String companyResponseToConsumer) {
		CompanyResponseToConsumer = companyResponseToConsumer;
	}
	public String getTimelyResponse() {
		return TimelyResponse;
	}
	public void setTimelyResponse(String timelyResponse) {
		TimelyResponse = timelyResponse;
	}
	public String getConsumerDisputed() {
		return ConsumerDisputed;
	}
	public void setConsumerDisputed(String consumerDisputed) {
		ConsumerDisputed = consumerDisputed;
	}
	public int getComplaintID() {
		return ComplaintID;
	}
	public void setComplaintID(int complaintID) {
		ComplaintID = complaintID;
	}
	private String Company;
	private String State;
	private int ZIPcode;
	private String Submittedvia;
	private String Dateclosed;
	private String CompanyResponseToConsumer;
	private String TimelyResponse;
	private String ConsumerDisputed;
	private int ComplaintID;


}

	