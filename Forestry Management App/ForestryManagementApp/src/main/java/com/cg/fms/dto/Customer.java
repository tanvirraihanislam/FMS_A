package com.cg.fms.dto;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="customerDetails")
public class Customer {
	
	@Id
	@Column(name="customerId")
	private String customerId;
	
	@Column(name="customerName")
	private String customerName;
	
	@Column(name="customerType")
	private String customerType;
	

	@Column(name="customerPassword")
	private String customerPassword;

	@Column(name="customerEmail")
	private String customerEmail;
	
	@Column(name="customerAddress")
	private String customerAddress;

	@Column(name="customerTown")
	private String customerTown;	

	@Column(name="customerPostalCode")
	private String customerPostalCode;
	
	@Column(name="customerContact")
	private String customerContact;

	@OneToMany(mappedBy="customer")
	private Set<Contract> contract;

	@OneToMany(mappedBy="customer")
	private Set<Order> order;

	

	public Customer(String customerId, String customerName, String customerType, String customerPassword,
			String customerEmail, String customerAddress, String customerTown, String customerPostalCode,
			String customerContact, Set<Contract> contract, Set<Order> order) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerType = customerType;
		this.customerPassword = customerPassword;
		this.customerEmail = customerEmail;
		this.customerAddress = customerAddress;
		this.customerTown = customerTown;
		this.customerPostalCode = customerPostalCode;
		this.customerContact = customerContact;
		this.contract = contract;
		this.order = order;
	}

	public Customer() {
		super();
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerPassword() {
		return customerPassword;
	}

	public void setCustomerPassword(String customerPassword) {
		this.customerPassword = customerPassword;
	}

	public String getCustomerEmail() {
		return customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	public String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	public String getCustomerTown() {
		return customerTown;
	}

	public void setCustomerTown(String customerTown) {
		this.customerTown = customerTown;
	}

	public String getCustomerPostalCode() {
		return customerPostalCode;
	}

	public void setCustomerPostalCode(String customerPostalCode) {
		this.customerPostalCode = customerPostalCode;
	}

	public String getCustomerContact() {
		return customerContact;
	}

	public void setCustomerContact(String customerContact) {
		this.customerContact = customerContact;
	}

	public Set<Contract> getContract() {
		return contract;
	}

	public void setContract(Set<Contract> contract) {
		this.contract = contract;
	}

	public Set<Order> getOrder() {
		return order;
	}

	public void setOrder(Set<Order> order) {
		this.order = order;
	}
	
	

	public String getCustomerType() {
		return customerType;
	}

	public void setCustomerType(String customerType) {
		this.customerType = customerType;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((contract == null) ? 0 : contract.hashCode());
		result = prime * result + ((customerAddress == null) ? 0 : customerAddress.hashCode());
		result = prime * result + ((customerContact == null) ? 0 : customerContact.hashCode());
		result = prime * result + ((customerEmail == null) ? 0 : customerEmail.hashCode());
		result = prime * result + ((customerId == null) ? 0 : customerId.hashCode());
		result = prime * result + ((customerName == null) ? 0 : customerName.hashCode());
		result = prime * result + ((customerPassword == null) ? 0 : customerPassword.hashCode());
		result = prime * result + ((customerPostalCode == null) ? 0 : customerPostalCode.hashCode());
		result = prime * result + ((customerTown == null) ? 0 : customerTown.hashCode());
		result = prime * result + ((customerType == null) ? 0 : customerType.hashCode());
		result = prime * result + ((order == null) ? 0 : order.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		if (contract == null) {
			if (other.contract != null)
				return false;
		} else if (!contract.equals(other.contract))
			return false;
		if (customerAddress == null) {
			if (other.customerAddress != null)
				return false;
		} else if (!customerAddress.equals(other.customerAddress))
			return false;
		if (customerContact == null) {
			if (other.customerContact != null)
				return false;
		} else if (!customerContact.equals(other.customerContact))
			return false;
		if (customerEmail == null) {
			if (other.customerEmail != null)
				return false;
		} else if (!customerEmail.equals(other.customerEmail))
			return false;
		if (customerId == null) {
			if (other.customerId != null)
				return false;
		} else if (!customerId.equals(other.customerId))
			return false;
		if (customerName == null) {
			if (other.customerName != null)
				return false;
		} else if (!customerName.equals(other.customerName))
			return false;
		if (customerPassword == null) {
			if (other.customerPassword != null)
				return false;
		} else if (!customerPassword.equals(other.customerPassword))
			return false;
		if (customerPostalCode == null) {
			if (other.customerPostalCode != null)
				return false;
		} else if (!customerPostalCode.equals(other.customerPostalCode))
			return false;
		if (customerTown == null) {
			if (other.customerTown != null)
				return false;
		} else if (!customerTown.equals(other.customerTown))
			return false;
		if (customerType == null) {
			if (other.customerType != null)
				return false;
		} else if (!customerType.equals(other.customerType))
			return false;
		if (order == null) {
			if (other.order != null)
				return false;
		} else if (!order.equals(other.order))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerType="
				+ customerType + ", customerPassword=" + customerPassword + ", customerEmail=" + customerEmail
				+ ", customerAddress=" + customerAddress + ", customerTown=" + customerTown + ", customerPostalCode="
				+ customerPostalCode + ", customerContact=" + customerContact + ", contract=" + contract + ", order="
				+ order + "]";
	}

	
	
	
	
	
}
