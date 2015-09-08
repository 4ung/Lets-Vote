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
        "question",
        "answer",
        "type",
        "basis",
        "sections",
        "url"
})
public class FAQItem {

    @JsonProperty("id")
    private String id;
    @JsonProperty("question")
    private String question;
    @JsonProperty("answer")
    private String answer;
    @JsonProperty("type")
    private String type;
    @JsonProperty("basis")
    private String basis;
    @JsonProperty("sections")
    private List<String> sections = new ArrayList<String>();
    @JsonProperty("url")
    private String url;
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
     * The question
     */
    @JsonProperty("question")
    public String getQuestion() {
        return question;
    }

    /**
     *
     * @param question
     * The question
     */
    @JsonProperty("question")
    public void setQuestion(String question) {
        this.question = question;
    }

    /**
     *
     * @return
     * The answer
     */
    @JsonProperty("answer")
    public String getAnswer() {
        return answer;
    }

    /**
     *
     * @param answer
     * The answer
     */
    @JsonProperty("answer")
    public void setAnswer(String answer) {
        this.answer = answer;
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
     * The basis
     */
    @JsonProperty("basis")
    public String getBasis() {
        return basis;
    }

    /**
     *
     * @param basis
     * The basis
     */
    @JsonProperty("basis")
    public void setBasis(String basis) {
        this.basis = basis;
    }

    /**
     *
     * @return
     * The sections
     */
    @JsonProperty("sections")
    public List<String> getSections() {
        return sections;
    }

    /**
     *
     * @param sections
     * The sections
     */
    @JsonProperty("sections")
    public void setSections(List<String> sections) {
        this.sections = sections;
    }

    /**
     *
     * @return
     * The url
     */
    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    /**
     *
     * @param url
     * The url
     */
    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
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
