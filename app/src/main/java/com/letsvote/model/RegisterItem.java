package com.letsvote.model;


import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "register",
        "approved"
})
public class RegisterItem {

    @JsonProperty("register")
    private Integer register;
    @JsonProperty("approved")
    private Integer approved;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     * The register
     */
    @JsonProperty("register")
    public Integer getRegister() {
        return register;
    }

    /**
     *
     * @param register
     * The register
     */
    @JsonProperty("register")
    public void setRegister(Integer register) {
        this.register = register;
    }

    /**
     *
     * @return
     * The approved
     */
    @JsonProperty("approved")
    public Integer getApproved() {
        return approved;
    }

    /**
     *
     * @param approved
     * The approved
     */
    @JsonProperty("approved")
    public void setApproved(Integer approved) {
        this.approved = approved;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
