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
        "founded",
        "approved"
})
public class FoundedItem {

    @JsonProperty("founded")
    private Integer founded;
    @JsonProperty("approved")
    private Integer approved;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     * The founded
     */
    @JsonProperty("founded")
    public Integer getFounded() {
        return founded;
    }

    /**
     *
     * @param founded
     * The founded
     */
    @JsonProperty("founded")
    public void setFounded(Integer founded) {
        this.founded = founded;
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
