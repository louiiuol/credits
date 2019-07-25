package loanSimulation.entities;

import java.time.LocalDate;

import loanSimulation.entities.LoanType;
/**
 * 
 */
public class Funding {

    private Double amount;
    private String type;
    private LocalDate refundStartingDate;
    private Integer duration; 
    private Double interestRate; 
    private Double assuranceRate;

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public LocalDate getRefundStartingDate() {
        return refundStartingDate;
    }

    public void setRefundStartingDate(LocalDate refundStartingDate) {
        this.refundStartingDate = refundStartingDate;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    public Double getAssuranceRate() {
        return assuranceRate;
    }

    public void setAssuranceRate(Double assuranceRate) {
        this.assuranceRate = assuranceRate;
    }

    public Funding(Double amount, String type, LocalDate starterDate, Integer duration, Double interestRate,
            Double assuranceRate) {
        this.amount = amount;
        this.type = type;
        this.refundStartingDate = starterDate;
        this.duration = duration;
        this.interestRate = interestRate;
        this.assuranceRate = assuranceRate;
    }

	@Override
	public String toString() {
		return "Funding [amount=" + amount + ", type=" + type + ", refundStartingDate=" + refundStartingDate
				+ ", duration=" + duration + ", interestRate=" + interestRate + ", assuranceRate=" + assuranceRate
				+ "]";
	}
    

}