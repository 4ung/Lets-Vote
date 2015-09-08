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
 * Created by Hein Htet on 9/8/15.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "type",
        "properties",
        "geometry"
})
public class GeoItem {

    @JsonProperty("id")
    private String id;
    @JsonProperty("type")
    private String type;
    @JsonProperty("properties")
    private Geo_Properties properties;
    @JsonProperty("geometry")
    private GeometryItem geometry;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     * The id
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     *
     * @param id
     * The id
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     *
     * @return
     * The type
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     *
     * @param type
     * The type
     */
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    /**
     *
     * @return
     * The properties
     */
    @JsonProperty("properties")
    public Geo_Properties getProperties() {
        return properties;
    }

    /**
     *
     * @param properties
     * The properties
     */
    @JsonProperty("properties")
    public void setProperties(Geo_Properties properties) {
        this.properties = properties;
    }

    /**
     *
     * @return
     * The geometry
     */
    @JsonProperty("geometry")
    public GeometryItem getGeometry() {
        return geometry;
    }

    /**
     *
     * @param geometry
     * The GeometryItem
     */
    @JsonProperty("geometry")
    public void setGeometry(GeometryItem geometry) {
        this.geometry = geometry;
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
