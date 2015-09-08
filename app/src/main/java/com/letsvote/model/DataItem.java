package com.letsvote.model;


import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "name",
        "name_eng",
        "members",
        "leader",
        "chairman",
        "founded",
        "register",
        "number",
        "contact",
        "address",
        "region",
        "files"
})
public class DataItem {

    @JsonProperty("name")
    private String name;
    @JsonProperty("name_eng")
    private String nameEng;
    @JsonProperty("members")
    private Integer members;
    @JsonProperty("leader")
    private List<String> leader = new ArrayList<String>();
    @JsonProperty("chairman")
    private List<String> chairman = new ArrayList<String>();
    @JsonProperty("founded")
    private FoundedItem founded;
    @JsonProperty("register")
    private RegisterItem register;
    @JsonProperty("number")
    private String number;
    @JsonProperty("contact")
    private List<String> contact = new ArrayList<String>();
    @JsonProperty("address")
    private String address;
    @JsonProperty("region")
    private String region;
    @JsonProperty("files")
    private FileItem files;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     * The name
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     * The name
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return
     * The nameEng
     */
    @JsonProperty("name_eng")
    public String getNameEng() {
        return nameEng;
    }

    /**
     *
     * @param nameEng
     * The name_eng
     */
    @JsonProperty("name_eng")
    public void setNameEng(String nameEng) {
        this.nameEng = nameEng;
    }

    /**
     *
     * @return
     * The members
     */
    @JsonProperty("members")
    public Integer getMembers() {
        return members;
    }

    /**
     *
     * @param members
     * The members
     */
    @JsonProperty("members")
    public void setMembers(Integer members) {
        this.members = members;
    }

    /**
     *
     * @return
     * The leader
     */
    @JsonProperty("leader")
    public List<String> getLeader() {
        return leader;
    }

    /**
     *
     * @param leader
     * The leader
     */
    @JsonProperty("leader")
    public void setLeader(List<String> leader) {
        this.leader = leader;
    }

    /**
     *
     * @return
     * The chairman
     */
    @JsonProperty("chairman")
    public List<String> getChairman() {
        return chairman;
    }

    /**
     *
     * @param chairman
     * The chairman
     */
    @JsonProperty("chairman")
    public void setChairman(List<String> chairman) {
        this.chairman = chairman;
    }

    /**
     *
     * @return
     * The founded
     */
    @JsonProperty("founded")
    public FoundedItem getFounded() {
        return founded;
    }

    /**
     *
     * @param founded
     * The founded
     */
    @JsonProperty("founded")
    public void setFounded(FoundedItem founded) {
        this.founded = founded;
    }

    /**
     *
     * @return
     * The register
     */
    @JsonProperty("register")
    public RegisterItem getRegister() {
        return register;
    }

    /**
     *
     * @param register
     * The register
     */
    @JsonProperty("register")
    public void setRegister(RegisterItem register) {
        this.register = register;
    }

    /**
     *
     * @return
     * The number
     */
    @JsonProperty("number")
    public String getNumber() {
        return number;
    }

    /**
     *
     * @param number
     * The number
     */
    @JsonProperty("number")
    public void setNumber(String number) {
        this.number = number;
    }

    /**
     *
     * @return
     * The contact
     */
    @JsonProperty("contact")
    public List<String> getContact() {
        return contact;
    }

    /**
     *
     * @param contact
     * The contact
     */
    @JsonProperty("contact")
    public void setContact(List<String> contact) {
        this.contact = contact;
    }

    /**
     *
     * @return
     * The address
     */
    @JsonProperty("address")
    public String getAddress() {
        return address;
    }

    /**
     *
     * @param address
     * The address
     */
    @JsonProperty("address")
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     *
     * @return
     * The region
     */
    @JsonProperty("region")
    public String getRegion() {
        return region;
    }

    /**
     *
     * @param region
     * The region
     */
    @JsonProperty("region")
    public void setRegion(String region) {
        this.region = region;
    }

    /**
     *
     * @return
     * The files
     */
    @JsonProperty("files")
    public FileItem getFiles() {
        return files;
    }

    /**
     *
     * @param files
     * The files
     */
    @JsonProperty("files")
    public void setFiles(FileItem files) {
        this.files = files;
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
