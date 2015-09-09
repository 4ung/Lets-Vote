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
            "id",
            "name",
            "gender",
            "legislature",
            "national_id",
            "birthdate",
            "education",
            "occupation",
            "nationality_religion",
            "residency",
            "constituency",
            "party_id",
            "mother",
            "father",
            "party"
    })
    public class CandidateItem {

        @JsonProperty("id")
        private String id;
        @JsonProperty("name")
        private String name;
        @JsonProperty("gender")
        private String gender;
        @JsonProperty("legislature")
        private String legislature;
        @JsonProperty("national_id")
        private String nationalId;
        @JsonProperty("birthdate")
        private Integer birthdate;
        @JsonProperty("education")
        private List<Object> education = new ArrayList<Object>();
        @JsonProperty("occupation")
        private List<String> occupation = new ArrayList<String>();
        @JsonProperty("nationality_religion")
        private String nationalityReligion;
        @JsonProperty("residency")
        private ResidencyItem residency;
        @JsonProperty("constituency")
        private ConstituencyItem constituency;
        @JsonProperty("party_id")
        private String partyId;
        @JsonProperty("mother")
        private MotherItem mother;
        @JsonProperty("father")
        private FatherItem father;
        @JsonProperty("party")
        private PartyItem party;
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
         * The gender
         */
        @JsonProperty("gender")
        public String getGender() {
            return gender;
        }

        /**
         *
         * @param gender
         * The gender
         */
        @JsonProperty("gender")
        public void setGender(String gender) {
            this.gender = gender;
        }

        /**
         *
         * @return
         * The legislature
         */
        @JsonProperty("legislature")
        public String getLegislature() {
            return legislature;
        }

        /**
         *
         * @param legislature
         * The legislature
         */
        @JsonProperty("legislature")
        public void setLegislature(String legislature) {
            this.legislature = legislature;
        }

        /**
         *
         * @return
         * The nationalId
         */
        @JsonProperty("national_id")
        public String getNationalId() {
            return nationalId;
        }

        /**
         *
         * @param nationalId
         * The national_id
         */
        @JsonProperty("national_id")
        public void setNationalId(String nationalId) {
            this.nationalId = nationalId;
        }

        /**
         *
         * @return
         * The birthdate
         */
        @JsonProperty("birthdate")
        public Integer getBirthdate() {
            return birthdate;
        }

        /**
         *
         * @param birthdate
         * The birthdate
         */
        @JsonProperty("birthdate")
        public void setBirthdate(Integer birthdate) {
            this.birthdate = birthdate;
        }

        /**
         *
         * @return
         * The education
         */
        @JsonProperty("education")
        public List<Object> getEducation() {
            return education;
        }

        /**
         *
         * @param education
         * The education
         */
        @JsonProperty("education")
        public void setEducation(List<Object> education) {
            this.education = education;
        }

        /**
         *
         * @return
         * The occupation
         */
        @JsonProperty("occupation")
        public List<String> getOccupation() {
            return occupation;
        }

        /**
         *
         * @param occupation
         * The occupation
         */
        @JsonProperty("occupation")
        public void setOccupation(List<String> occupation) {
            this.occupation = occupation;
        }

        /**
         *
         * @return
         * The nationalityReligion
         */
        @JsonProperty("nationality_religion")
        public String getNationalityReligion() {
            return nationalityReligion;
        }

        /**
         *
         * @param nationalityReligion
         * The nationality_religion
         */
        @JsonProperty("nationality_religion")
        public void setNationalityReligion(String nationalityReligion) {
            this.nationalityReligion = nationalityReligion;
        }

        /**
         *
         * @return
         * The residency
         */
        @JsonProperty("residency")
        public ResidencyItem getResidency() {
            return residency;
        }

        /**
         *
         * @param residency
         * The residency
         */
        @JsonProperty("residency")
        public void setResidency(ResidencyItem residency) {
            this.residency = residency;
        }

        /**
         *
         * @return
         * The constituency
         */
        @JsonProperty("constituency")
        public ConstituencyItem getConstituency() {
            return constituency;
        }

        /**
         *
         * @param constituency
         * The constituency
         */
        @JsonProperty("constituency")
        public void setConstituency(ConstituencyItem constituency) {
            this.constituency = constituency;
        }

        /**
         *
         * @return
         * The partyId
         */
        @JsonProperty("party_id")
        public String getPartyId() {
            return partyId;
        }

        /**
         *
         * @param partyId
         * The party_id
         */
        @JsonProperty("party_id")
        public void setPartyId(String partyId) {
            this.partyId = partyId;
        }

        /**
         *
         * @return
         * The mother
         */
        @JsonProperty("mother")
        public MotherItem getMother() {
            return mother;
        }

        /**
         *
         * @param mother
         * The mother
         */
        @JsonProperty("mother")
        public void setMother(MotherItem mother) {
            this.mother = mother;
        }

        /**
         *
         * @return
         * The father
         */
        @JsonProperty("father")
        public FatherItem getFather() {
            return father;
        }

        /**
         *
         * @param father
         * The father
         */
        @JsonProperty("father")
        public void setFather(FatherItem father) {
            this.father = father;
        }

        /**
         *
         * @return
         * The party
         */
        @JsonProperty("party")
        public PartyItem getParty() {
            return party;
        }

        /**
         *
         * @param party
         * The party
         */
        @JsonProperty("party")
        public void setParty(PartyItem party) {
            this.party = party;
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
