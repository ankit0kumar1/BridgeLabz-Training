package com.streamapi.expiringmemberships;

import java.time.LocalDate;

public class Members {
	private String name;
	private int memberId;
	private LocalDate expiryDate;
	
	public Members(int memberId, String name, LocalDate expiryDate) {
		this.memberId = memberId;
		this.name = name;
		this.expiryDate = expiryDate;
	}

	public String getName() {
		return name;
	}

	public int getMemberId() {
		return memberId;
	}

	public LocalDate getExpiryDate() {
		return expiryDate;
	}
	@Override
    public String toString() {
        return "Member{id=" + memberId + ", name='" + name + "', expiryDate=" + expiryDate + "}";
    }
}
