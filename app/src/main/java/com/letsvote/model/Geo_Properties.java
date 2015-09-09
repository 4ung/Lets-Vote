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
        "OBJECTID",
        "ST",
        "ST_PCODE",
        "DT",
        "DT_PCODE",
        "Shape_Leng",
        "Shape_Area",
        "DT_Mya"
})
public class Geo_Properties {

    @JsonProperty("OBJECTID")
    private Integer OBJECTID;
    @JsonProperty("ST")
    private String ST;
    @JsonProperty("ST_PCODE")
    private String STPCODE;
    @JsonProperty("DT")
    private String DT;
    @JsonProperty("DT_PCODE")
    private String DTPCODE;
    @JsonProperty("Shape_Leng")
    private Double ShapeLeng;
    @JsonProperty("Shape_Area")
    private Double ShapeArea;
    @JsonProperty("DT_Mya")
    private String DTMya;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * @return The OBJECTID
     */
    @JsonProperty("OBJECTID")
    public Integer getOBJECTID() {
        return OBJECTID;
    }

    /**
     * @param OBJECTID The OBJECTID
     */
    @JsonProperty("OBJECTID")
    public void setOBJECTID(Integer OBJECTID) {
        this.OBJECTID = OBJECTID;
    }

    /**
     * @return The ST
     */
    @JsonProperty("ST")
    public String getST() {
        return ST;
    }

    /**
     * @param ST The ST
     */
    @JsonProperty("ST")
    public void setST(String ST) {
        this.ST = ST;
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
     * @return The DT
     */
    @JsonProperty("DT")
    public String getDT() {
        return DT;
    }

    /**
     * @param DT The DT
     */
    @JsonProperty("DT")
    public void setDT(String DT) {
        this.DT = DT;
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
     * @return The ShapeLeng
     */
    @JsonProperty("Shape_Leng")
    public Double getShapeLeng() {
        return ShapeLeng;
    }

    /**
     * @param ShapeLeng The Shape_Leng
     */
    @JsonProperty("Shape_Leng")
    public void setShapeLeng(Double ShapeLeng) {
        this.ShapeLeng = ShapeLeng;
    }

    /**
     * @return The ShapeArea
     */
    @JsonProperty("Shape_Area")
    public Double getShapeArea() {
        return ShapeArea;
    }

    /**
     * @param ShapeArea The Shape_Area
     */
    @JsonProperty("Shape_Area")
    public void setShapeArea(Double ShapeArea) {
        this.ShapeArea = ShapeArea;
    }

    /**
     * @return The DTMya
     */
    @JsonProperty("DT_Mya")
    public String getDTMya() {
        return DTMya;
    }

    /**
     * @param DTMya The DT_Mya
     */
    @JsonProperty("DT_Mya")
    public void setDTMya(String DTMya) {
        this.DTMya = DTMya;
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
