public class Certificate {
    private String CertificatedID;
    private String CertificateName;
    private String CertificateRank;
    private String CertificatedDate;


    public Certificate() {
    }

    public Certificate(String CertificatedID, String CertificateName, String CertificateRank, String CertificatedDate) {
        this.CertificatedID = CertificatedID;
        this.CertificateName = CertificateName;
        this.CertificateRank = CertificateRank;
        this.CertificatedDate = CertificatedDate;
    }

    public String getCertificatedID() {
        return this.CertificatedID;
    }

    public void setCertificatedID(String CertificatedID) {
        this.CertificatedID = CertificatedID;
    }

    public String getCertificateName() {
        return this.CertificateName;
    }

    public void setCertificateName(String CertificateName) {
        this.CertificateName = CertificateName;
    }

    public String getCertificateRank() {
        return this.CertificateRank;
    }

    public void setCertificateRank(String CertificateRank) {
        this.CertificateRank = CertificateRank;
    }

    public String getCertificatedDate() {
        return this.CertificatedDate;
    }

    public void setCertificatedDate(String CertificatedDate) {
        this.CertificatedDate = CertificatedDate;
    }

    public Certificate CertificatedID(String CertificatedID) {
        setCertificatedID(CertificatedID);
        return this;
    }

    public Certificate CertificateName(String CertificateName) {
        setCertificateName(CertificateName);
        return this;
    }

    public Certificate CertificateRank(String CertificateRank) {
        setCertificateRank(CertificateRank);
        return this;
    }

    public Certificate CertificatedDate(String CertificatedDate) {
        setCertificatedDate(CertificatedDate);
        return this;
    }


    @Override
    public String toString() {
        return "{" +
            " CertificatedID='" + getCertificatedID() + "'" +
            ", CertificateName='" + getCertificateName() + "'" +
            ", CertificateRank='" + getCertificateRank() + "'" +
            ", CertificatedDate='" + getCertificatedDate() + "'" +
            "}";
    }

}
