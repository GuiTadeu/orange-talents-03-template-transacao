package com.orange.transaction.kafka;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class StartConsumerRequest {

    @NotNull
    private String id;

    @Email
    @NotBlank
    private String email;

    public StartConsumerRequest(@NotNull String id, @Email @NotBlank String email) {
        this.id = id;
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
