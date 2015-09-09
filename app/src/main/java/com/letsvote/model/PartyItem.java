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

/**
 * Created by Hein Htet on 9/8/15.
 */

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "_id",
        "party_name",
        "party_name_english",
        "abbreviation",
        "establishment_date",
        "member_count",
        "leadership",
        "establishment_approval_date",
        "registration_application_date",
        "registration_approval_date",
        "approved_party_number",
        "party_flag",
        "party_seal",
        "chairman",
        "region",
        "ST_PCODE",
        "DT_PCODE",
        "headquarters",
        "contact",
        "policy",
        "created_at",
        "updated_at"
})
public class PartyItem {


    @JsonProperty("_id")
    private String Id;
    @JsonProperty("party_name")
    private String partyName;
    @JsonProperty("party_name_english")
    private String partyNameEnglish;
    @JsonProperty("abbreviation")
    private String abbreviation;
    @JsonProperty("establishment_date")
    private String establishmentDate;
    @JsonProperty("member_count")
    private String memberCount;
    @JsonProperty("leadership")
    private List<String> leadership = new ArrayList<String>();
    @JsonProperty("establishment_approval_date")
    private String establishmentApprovalDate;
    @JsonProperty("registration_application_date")
    private String registrationApplicationDate;
    @JsonProperty("registration_approval_date")
    private String registrationApprovalDate;
    @JsonProperty("approved_party_number")
    private String approvedPartyNumber;
    @JsonProperty("party_flag")
    private String partyFlag;
    @JsonProperty("party_seal")
    private String partySeal;
    @JsonProperty("chairman")
    private List<String> chairman = new ArrayList<String>();
    @JsonProperty("region")
    private String region;
    @JsonProperty("ST_PCODE")
    private String STPCODE;
    @JsonProperty("DT_PCODE")
    private String DTPCODE;
    @JsonProperty("headquarters")
    private String headquarters;
    @JsonProperty("contact")
    private List<String> contact = new ArrayList<String>();
    @JsonProperty("policy")
    private String policy;
    @JsonProperty("created_at")
    private String createdAt;
    @JsonProperty("updated_at")
    private String updatedAt;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     * The Id
     */
    @JsonProperty("_id")
    public String getId() {
        return Id;
    }

    /**
     *
     * @param Id
     * The _id
     */
    @JsonProperty("_id")
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     *
     * @return
     * The partyName
     */
    @JsonProperty("party_name")
    public String getPartyName() {
        return partyName;
    }

    /**
     *
     * @param partyName
     * The party_name
     */
    @JsonProperty("party_name")
    public void setPartyName(String partyName) {
        this.partyName = partyName;
    }

    /**
     *
     * @return
     * The partyNameEnglish
     */
    @JsonProperty("party_name_english")
    public String getPartyNameEnglish() {
        return partyNameEnglish;
    }

    /**
     *
     * @param partyNameEnglish
     * The party_name_english
     */
    @JsonProperty("party_name_english")
    public void setPartyNameEnglish(String partyNameEnglish) {
        this.partyNameEnglish = partyNameEnglish;
    }

    /**
     *
     * @return
     * The abbreviation
     */
    @JsonProperty("abbreviation")
    public String getAbbreviation() {
        return abbreviation;
    }

    /**
     *
     * @param abbreviation
     * The abbreviation
     */
    @JsonProperty("abbreviation")
    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    /**
     *
     * @return
     * The establishmentDate
     */
    @JsonProperty("establishment_date")
    public String getEstablishmentDate() {
        return establishmentDate;
    }

    /**
     *
     * @param establishmentDate
     * The establishment_date
     */
    @JsonProperty("establishment_date")
    public void setEstablishmentDate(String establishmentDate) {
        this.establishmentDate = establishmentDate;
    }

    /**
     *
     * @return
     * The memberCount
     */
    @JsonProperty("member_count")
    public String getMemberCount() {
        return memberCount;
    }

    /**
     *
     * @param memberCount
     * The member_count
     */
    @JsonProperty("member_count")
    public void setMemberCount(String memberCount) {
        this.memberCount = memberCount;
    }

    /**
     *
     * @return
     * The leadership
     */
    @JsonProperty("leadership")
    public List<String> getLeadership() {
        return leadership;
    }

    /**
     *
     * @param leadership
     * The leadership
     */
    @JsonProperty("leadership")
    public void setLeadership(List<String> leadership) {
        this.leadership = leadership;
    }

    /**
     *
     * @return
     * The establishmentApprovalDate
     */
    @JsonProperty("establishment_approval_date")
    public String getEstablishmentApprovalDate() {
        return establishmentApprovalDate;
    }

    /**
     *
     * @param establishmentApprovalDate
     * The establishment_approval_date
     */
    @JsonProperty("establishment_approval_date")
    public void setEstablishmentApprovalDate(String establishmentApprovalDate) {
        this.establishmentApprovalDate = establishmentApprovalDate;
    }

    /**
     *
     * @return
     * The registrationApplicationDate
     */
    @JsonProperty("registration_application_date")
    public String getRegistrationApplicationDate() {
        return registrationApplicationDate;
    }

    /**
     *
     * @param registrationApplicationDate
     * The registration_application_date
     */
    @JsonProperty("registration_application_date")
    public void setRegistrationApplicationDate(String registrationApplicationDate) {
        this.registrationApplicationDate = registrationApplicationDate;
    }

    /**
     *
     * @return
     * The registrationApprovalDate
     */
    @JsonProperty("registration_approval_date")
    public String getRegistrationApprovalDate() {
        return registrationApprovalDate;
    }

    /**
     *
     * @param registrationApprovalDate
     * The registration_approval_date
     */
    @JsonProperty("registration_approval_date")
    public void setRegistrationApprovalDate(String registrationApprovalDate) {
        this.registrationApprovalDate = registrationApprovalDate;
    }

    /**
     *
     * @return
     * The approvedPartyNumber
     */
    @JsonProperty("approved_party_number")
    public String getApprovedPartyNumber() {
        return approvedPartyNumber;
    }

    /**
     *
     * @param approvedPartyNumber
     * The approved_party_number
     */
    @JsonProperty("approved_party_number")
    public void setApprovedPartyNumber(String approvedPartyNumber) {
        this.approvedPartyNumber = approvedPartyNumber;
    }

    /**
     *
     * @return
     * The partyFlag
     */
    @JsonProperty("party_flag")
    public String getPartyFlag() {
        return partyFlag;
    }

    /**
     *
     * @param partyFlag
     * The party_flag
     */
    @JsonProperty("party_flag")
    public void setPartyFlag(String partyFlag) {
        this.partyFlag = partyFlag;
    }

    /**
     *
     * @return
     * The partySeal
     */
    @JsonProperty("party_seal")
    public String getPartySeal() {
        return partySeal;
    }

    /**
     *
     * @param partySeal
     * The party_seal
     */
    @JsonProperty("party_seal")
    public void setPartySeal(String partySeal) {
        this.partySeal = partySeal;
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
     * The STPCODE
     */
    @JsonProperty("ST_PCODE")
    public String getSTPCODE() {
        return STPCODE;
    }

    /**
     *
     * @param STPCODE
     * The ST_PCODE
     */
    @JsonProperty("ST_PCODE")
    public void setSTPCODE(String STPCODE) {
        this.STPCODE = STPCODE;
    }

    /**
     *
     * @return
     * The DTPCODE
     */
    @JsonProperty("DT_PCODE")
    public String getDTPCODE() {
        return DTPCODE;
    }

    /**
     *
     * @param DTPCODE
     * The DT_PCODE
     */
    @JsonProperty("DT_PCODE")
    public void setDTPCODE(String DTPCODE) {
        this.DTPCODE = DTPCODE;
    }

    /**
     *
     * @return
     * The headquarters
     */
    @JsonProperty("headquarters")
    public String getHeadquarters() {
        return headquarters;
    }

    /**
     *
     * @param headquarters
     * The headquarters
     */
    @JsonProperty("headquarters")
    public void setHeadquarters(String headquarters) {
        this.headquarters = headquarters;
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

    /**
     *
     * @return
     * The createdAt
     */
    @JsonProperty("created_at")
    public String getCreatedAt() {
        return createdAt;
    }

    /**
     *
     * @param createdAt
     * The created_at
     */
    @JsonProperty("created_at")
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    /**
     *
     * @return
     * The updatedAt
     */
    @JsonProperty("updated_at")
    public String getUpdatedAt() {
        return updatedAt;
    }

    /**
     *
     * @param updatedAt
     * The updated_at
     */
    @JsonProperty("updated_at")
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
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
