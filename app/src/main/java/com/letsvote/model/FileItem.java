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
        "flat",
        "seal",
        "policy"
})
public class FileItem {

    @JsonProperty("flat")
    private String flat;
    @JsonProperty("seal")
    private String seal;
    @JsonProperty("policy")
    private String policy;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     * The flat
     */
    @JsonProperty("flat")
    public String getFlat() {
        return flat;
    }

    /**
     *
     * @param flat
     * The flat
     */
    @JsonProperty("flat")
    public void setFlat(String flat) {
        this.flat = flat;
    }

    /**
     *
     * @return
     * The seal
     */
    @JsonProperty("seal")
    public String getSeal() {
        return seal;
    }

    /**
     *
     * @param seal
     * The seal
     */
    @JsonProperty("seal")
    public void setSeal(String seal) {
        this.seal = seal;
    }

    /**
     *
     * @return
     * The policy
     */
    @JsonProperty("policy")
    public String getPolicy() {
        return policy;
    }

    /**
     *
     * @param policy
     * The policy
     */
    @JsonProperty("policy")
    public void setPolicy(String policy) {
        this.policy = policy;
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
