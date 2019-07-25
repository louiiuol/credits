package loanSimulation.entities;

/**
 * 
 */
public class AmortizationTable {
    private Integer year;
    private Double captitalAmortized;
    private Double captitalToAmortize;
    private Integer interestRate;
    private Integer assuranceRate;
    private Integer Annuity;
    private Double total;

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Double getCaptitalAmortized() {
        return captitalAmortized;
    }

    public void setCaptitalAmortized(Double captitalAmortized) {
        this.captitalAmortized = captitalAmortized;
    }

    public Double getCaptitalToAmortize() {
        return captitalToAmortize;
    }

    public void setCaptitalToAmortize(Double captitalToAmortize) {
        this.captitalToAmortize = captitalToAmortize;
    }

    public Integer getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Integer interestRate) {
        this.interestRate = interestRate;
    }

    public Integer getAssuranceRate() {
        return assuranceRate;
    }

    public void setAssuranceRate(Integer assuranceRate) {
        this.assuranceRate = assuranceRate;
    }

    public Integer getAnnuity() {
        return Annuity;
    }

    public void setAnnuity(Integer annuity) {
        Annuity = annuity;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public AmortizationTable(Integer year, Double captitalAmortized, Double captitalToAmortize, Integer interestRate,
            Integer assuranceRate, Integer annuity, Double total) {
        this.year = year;
        this.captitalAmortized = captitalAmortized;
        this.captitalToAmortize = captitalToAmortize;
        this.interestRate = interestRate;
        this.assuranceRate = assuranceRate;
        Annuity = annuity;
        this.total = total;
    }
    public void displayTable(Funding funding) {
    	for(int i = 0; i < this.year; i++) {
    		System.out.println("| Year | Refunded capital | Remaining capital | Interests | Insurance | Annuity |");
    		System.out.println("| "+ (this.year + i) +" |"+ this.captitalAmortized +" | " + this.captitalAmortized + " | " + Interests | Insurance | Annuity |");
    	}
    }

    @Override
    public String toString() {
        return "AmortizationTable [Annuity=" + Annuity + ", assuranceRate=" + assuranceRate + ", captitalAmortized="
                + captitalAmortized + ", captitalToAmortize=" + captitalToAmortize + ", interestRate=" + interestRate
                + ", total=" + total + ", year=" + year + "]";
    }

    
    
}