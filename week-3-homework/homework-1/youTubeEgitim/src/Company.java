public class Company extends Customer { // şirket müşteri nesnesinden inherit olur.
    private String compamyName;
    private String taxNumber;

    public String getCompamyName() {
        return compamyName;
    }

    public void setCompamyName(String compamyName) {
        this.compamyName = compamyName;
    }

    public String getTaxNumber() {
        return taxNumber;
    }
    public void setTaxNumber(String taxNumber) {
        this.taxNumber = taxNumber;
    }
}
