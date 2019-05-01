package qis.Transaction;

import javax.persistence.*;

@Entity @Table(name="qpd_trans")
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int transactionId;

    @Column(name="PatientID")
    private int patientId;
    @Column(name="TransactionRef")
    private String transactionRef;
    @Column(name="TransactionType")
    private String transactionType;
   // private String itemId;
    private String biller;
    @Column(name="TransactionDate")
    private String transactionDate;
	@Column(name="userID")
    private int userId;
    @Column(name="TotalPrice")
    private String totalPrice;
    @Column(name="PaidIn")
    private double paidIn;
    @Column(name="PaidOut")
    private double paidOut;
    @Column(name="GrandTotal")
    private double grandTotal;
    @Column(name="status")
    private int status;
    @Column(name="SalesType")
    private String salesType;
    @Column(name="LOE")
    private String loe;
    @Column(name="AN")
    private String an;
    @Column(name="AC")
    private String ac;
    @Column(name="Notes")
    private String notes;
   
    
    public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(String totalPrice) {
		this.totalPrice = totalPrice;
	}

	public double getPaidIn() {
		return paidIn;
	}

	public void setPaidIn(double paidIn) {
		this.paidIn = paidIn;
	}

	public double getPaidOut() {
		return paidOut;
	}

	public void setPaidOut(double paidOut) {
		this.paidOut = paidOut;
	}

	public double getGrandTotal() {
		return grandTotal;
	}

	public void setGrandTotal(double grandTotal) {
		this.grandTotal = grandTotal;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getSalesType() {
		return salesType;
	}

	public void setSalesType(String salesType) {
		this.salesType = salesType;
	}

	public String getLoe() {
		return loe;
	}

	public void setLoe(String loe) {
		this.loe = loe;
	}

	public String getAn() {
		return an;
	}

	public void setAn(String an) {
		this.an = an;
	}

	public String getAc() {
		return ac;
	}

	public void setAc(String ac) {
		this.ac = ac;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

    public int getPatientId() {
		return patientId;
	}

	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}

	public String getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(String transactionDate) {
		this.transactionDate = transactionDate;
	}

	public String getTransactionRef() {
		return transactionRef;
	}

	public void setTransactionRef(String transactionRef) {
		this.transactionRef = transactionRef;
	}

	public String getBiller() {
		return biller;
	}

	public void setBiller(String biller) {
		this.biller = biller;
	}

	public Transaction() {  }

    public Transaction(int patientId, String transactionRef, String transactionType, String biller, String transactionDate, int userId, String totalPrice, double paidIn, double paidOut, double grandTotal, int status, String salesType, String loe, String an, String ac, String notes)
    {
    	this.setPatientId(patientId);
        this.setTransactionRef(transactionRef);
        this.setTransactionType(transactionType);
        this.setBiller(biller);
        this.setTransactionDate(transactionDate);
        this.setUserId(userId);
        this.setTotalPrice(totalPrice);
        this.setPaidIn(paidIn);
        this.setPaidOut(paidOut);
        this.setGrandTotal(grandTotal);
        this.setStatus(status);
        this.setSalesType(salesType);
        this.setLoe(loe);
        this.setAn(an);
        this.setAc(ac);
        this.setNotes(notes);
    }

    public int getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(int id) {
        this.transactionId = id;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String title) {
        this.transactionType = title;
    }
}
