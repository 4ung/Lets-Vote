package com.letsvote.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Admin on 9/8/15.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "type",
        "name",
        "ST_PCODE",
        "DT_PCODE",
        "count"
})
public class ResidencyItem {

    @JsonProperty("type")
    private String type;
    @JsonProperty("name")
    private String name;
    @JsonProperty("ST_PCODE")
    private String STPCODE;
    @JsonProperty("DT_PCODE")
    private String DTPCODE;
    @JsonProperty("count")
    private Integer count;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * @return The type
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     * @param type The type
     */
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return The name
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * @param name The name
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return The STPCODE
     */
    @JsonProperty("ST_PCODE")
    public String getSTPCODE() {
        return STPCODE;
    }

    /**
     * @param STPCODE The ST_PCODE
     */
    @JsonProperty("ST_PCODE")
    public void setSTPCODE(String STPCODE) {
        this.STPCODE = STPCODE;
    }

    /**
     * @return The DTPCODE
     */
    @JsonProperty("DT_PCODE")
    public String getDTPCODE() {
        return DTPCODE;
    }

    /**
     * @param DTPCODE The DT_PCODE
     */
    @JsonProperty("DT_PCODE")
    public void setDTPCODE(String DTPCODE) {
        this.DTPCODE = DTPCODE;
    }

    /**
     * @return The count
     */
    @JsonProperty("count")
    public Integer getCount() {
        return count;
    }

    /**
     * @param count The count
     */
    @JsonProperty("count")
    public void setCount(Integer count) {
        this.count = count;
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