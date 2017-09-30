package csv.converter.sfedu;

import javax.persistence.*;

@Entity
@Table(name = "Provider", schema = "Provide", catalog = "")
public class ProviderEntity {
    private String customerName;
    private int id;
    private String accountName;
    private Integer traffic;
    private String adress;

    @Basic
    @Column(name = "CustomerName")
    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "AccountName")
    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    @Basic
    @Column(name = "Traffic")
    public Integer getTraffic() {
        return traffic;
    }

    public void setTraffic(Integer traffic) {
        this.traffic = traffic;
    }

    @Basic
    @Column(name = "Adress")
    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProviderEntity that = (ProviderEntity) o;

        if (id != that.id) return false;
        if (customerName != null ? !customerName.equals(that.customerName) : that.customerName != null) return false;
        if (accountName != null ? !accountName.equals(that.accountName) : that.accountName != null) return false;
        if (traffic != null ? !traffic.equals(that.traffic) : that.traffic != null) return false;
        if (adress != null ? !adress.equals(that.adress) : that.adress != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = customerName != null ? customerName.hashCode() : 0;
        result = 31 * result + id;
        result = 31 * result + (accountName != null ? accountName.hashCode() : 0);
        result = 31 * result + (traffic != null ? traffic.hashCode() : 0);
        result = 31 * result + (adress != null ? adress.hashCode() : 0);
        return result;
    }
}
