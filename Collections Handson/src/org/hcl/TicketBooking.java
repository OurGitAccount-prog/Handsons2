package org.hcl;

public class TicketBooking implements Comparable<TicketBooking> {

	private String customerName;
	private Long price;

	public TicketBooking() {

	}

	public TicketBooking(String customerName, Long price) {
		this.customerName = customerName;
		this.price = price;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public Long getPrice() {
		return price;
	}

	public void setPrice(Long price) {
		this.price = price;
	}

	public int compareTo(TicketBooking tb) {
		return this.getPrice().compareTo(tb.getPrice());
	}

	public String toString() {
		return customerName + "  " + price;
	}
}
