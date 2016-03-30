package pl.dmichalski.crm.web.presentation.user.entity;

public class UserDTO {

    private Integer id;
    private String name;

    private UserDTO() {
    }

    private UserDTO(Builder builder) {
        id = builder.id;
        name = builder.name;
    }

    public static Builder create() {
        return new Builder();
    }

    public static Builder create(UserDTO copy) {
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

        public UserDTO build() {
            return new UserDTO(this);
        }
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
