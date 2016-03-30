package pl.dmichalski.crm.web.presentation.company_sector.entity;

public class CompanySectorDTO {

    private Integer id;
    private String name;

    private CompanySectorDTO() {
    }

    private CompanySectorDTO(Builder builder) {
        id = builder.id;
        name = builder.name;
    }

    public static Builder create() {
        return new Builder();
    }

    public static Builder create(CompanySectorDTO copy) {
        Builder builder = new Builder();
        builder.id = copy.id;
        builder.name = copy.name;
        return builder;
    }

    public static final class Builder {
        private Integer id;
        private String name;

        private Builder() {
        }

        public Builder id(Integer id) {
            this.id = id;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public CompanySectorDTO build() {
            return new CompanySectorDTO(this);
        }
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
