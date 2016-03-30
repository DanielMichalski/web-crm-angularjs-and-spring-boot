package pl.dmichalski.crm.web.presentation.client.entity;

public class ClientDTO {

    private Integer id;
    private String companyName;
    private String contactName;
    private String contactPhone;
    private String contactEmail;
    private String userName;
    private String notes;
    private String companySectorName;

    private ClientDTO() {
    }

    private ClientDTO(Builder builder) {
        id = builder.id;
        contactName = builder.contactName;
        companyName = builder.companyName;
        contactPhone = builder.contactPhone;
        contactEmail = builder.contactEmail;
        userName = builder.userName;
        notes = builder.notes;
        companySectorName = builder.companySectorName;
    }

    public static Builder create() {
        return new Builder();
    }

    public static Builder create(ClientDTO copy) {
        Builder builder = new Builder();
        builder.contactName = copy.contactName;
        builder.companyName = copy.companyName;
        builder.contactPhone = copy.contactPhone;
        builder.contactEmail = copy.contactEmail;
        builder.userName = copy.userName;
        builder.notes = copy.notes;
        builder.companySectorName = copy.companySectorName;
        return builder;
    }

    public static final class Builder {
        private Integer id;
        private String companyName;
        private String contactName;
        private String contactPhone;
        private String contactEmail;
        private String userName;
        private String notes;
        private String companySectorName;

        private Builder() {
        }

        public Builder id(Integer id) {
            this.id = id;
            return this;
        }

        public Builder companyName(String companyName) {
            this.companyName = companyName;
            return this;
        }

        public Builder contactName(String contactName) {
            this.contactName = contactName;
            return this;
        }

        public Builder contactPhone(String contactPhone) {
            this.contactPhone = contactPhone;
            return this;
        }

        public Builder contactEmail(String contactEmail) {
            this.contactEmail = contactEmail;
            return this;
        }

        public Builder userName(String userName) {
            this.userName = userName;
            return this;
        }

        public Builder notes(String notes) {
            this.notes = notes;
            return this;
        }

        public Builder companySectorName(String companySectorName) {
            this.companySectorName = companySectorName;
            return this;
        }

        public ClientDTO build() {
            return new ClientDTO(this);
        }
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getCompanySectorName() {
        return companySectorName;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public String getContactName() {
        return contactName;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public Integer getId() {
        return id;
    }

    public String getNotes() {
        return notes;
    }

    public String getUserName() {
        return userName;
    }

}
