package shoppingManagement;

import java.time.LocalDateTime;


public class Customer {
	
	private int CustomerId;

	private String Name;
	
	private long MobNo;
	
	private int prefDress;
	
	private String allocatedDress;
	
	private int paidAmt;
	
	private LocalDateTime ld;
	
	private LocalDateTime rntm;
	
	Customer(int CustomerId,String Name,long MobNo,int prefDress){
		this.CustomerId=CustomerId;
		this.Name=Name;
		this.MobNo=MobNo;
		this.prefDress=prefDress;
	}

	public LocalDateTime getRntm() {
		return rntm;
	}

	public void setRntm(LocalDateTime rntm) {
		this.rntm = rntm;
	}

	public LocalDateTime getLd() {
		return ld;
	}

	public void setLd(LocalDateTime ld) {
		this.ld = ld;
	}

	public int getPaidAmt() {
		return paidAmt;
	}

	public void setPaidAmt(int paidAmt) {
		this.paidAmt = paidAmt;
	}

	public int getCustomerId() {
		return CustomerId;
	}

	public void setCustomerId(int customerId) {
		CustomerId = customerId;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public long getMobNo() {
		return MobNo;
	}

	public void setMobNo(long mobNo) {
		MobNo = mobNo;
	}

	public int getPrefDress() {
		return prefDress;
	}

	public void setPrefDress(int prefDress) {
		this.prefDress = prefDress;
	}

	public String getAllocatedDress() {
		return allocatedDress;
	}

	public void setAllocatedDress(String allocatedDress) {
		this.allocatedDress = allocatedDress;
	}

}
