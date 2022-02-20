
package com.example.demo.data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.processing.Generated;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "basicInfo",
    "education",
    "work",
    "topics",
    "address"
})
@Generated("jsonschema2pojo")
public class Resume {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("basicInfo")
    private BasicInfo basicInfo;
    @JsonProperty("education")
    private List<Education> education = new ArrayList<Education>();
    @JsonProperty("work")
    private List<Work> work = new ArrayList<Work>();
    @JsonProperty("topics")
    private List<String> topics = new ArrayList<String>();
    @JsonProperty("address")
    private Address address;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    public Resume withId(Integer id) {
        this.id = id;
        return this;
    }

    @JsonProperty("basicInfo")
    public BasicInfo getBasicInfo() {
        return basicInfo;
    }

    @JsonProperty("basicInfo")
    public void setBasicInfo(BasicInfo basicInfo) {
        this.basicInfo = basicInfo;
    }

    public Resume withBasicInfo(BasicInfo basicInfo) {
        this.basicInfo = basicInfo;
        return this;
    }

    @JsonProperty("education")
    public List<Education> getEducation() {
        return education;
    }

    @JsonProperty("education")
    public void setEducation(List<Education> education) {
        this.education = education;
    }

    public Resume withEducation(List<Education> education) {
        this.education = education;
        return this;
    }

    @JsonProperty("work")
    public List<Work> getWork() {
        return work;
    }

    @JsonProperty("work")
    public void setWork(List<Work> work) {
        this.work = work;
    }

    public Resume withWork(List<Work> work) {
        this.work = work;
        return this;
    }

    @JsonProperty("topics")
    public List<String> getTopics() {
        return topics;
    }

    @JsonProperty("topics")
    public void setTopics(List<String> topics) {
        this.topics = topics;
    }

    public Resume withTopics(List<String> topics) {
        this.topics = topics;
        return this;
    }

    @JsonProperty("address")
    public Address getAddress() {
        return address;
    }

    @JsonProperty("address")
    public void setAddress(Address address) {
        this.address = address;
    }

    public Resume withAddress(Address address) {
        this.address = address;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Resume withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Resume.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("basicInfo");
        sb.append('=');
        sb.append(((this.basicInfo == null)?"<null>":this.basicInfo));
        sb.append(',');
        sb.append("education");
        sb.append('=');
        sb.append(((this.education == null)?"<null>":this.education));
        sb.append(',');
        sb.append("work");
        sb.append('=');
        sb.append(((this.work == null)?"<null>":this.work));
        sb.append(',');
        sb.append("topics");
        sb.append('=');
        sb.append(((this.topics == null)?"<null>":this.topics));
        sb.append(',');
        sb.append("address");
        sb.append('=');
        sb.append(((this.address == null)?"<null>":this.address));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.education == null)? 0 :this.education.hashCode()));
        result = ((result* 31)+((this.address == null)? 0 :this.address.hashCode()));
        result = ((result* 31)+((this.work == null)? 0 :this.work.hashCode()));
        result = ((result* 31)+((this.topics == null)? 0 :this.topics.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.basicInfo == null)? 0 :this.basicInfo.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Resume) == false) {
            return false;
        }
        Resume rhs = ((Resume) other);
        return ((((((((this.education == rhs.education)||((this.education!= null)&&this.education.equals(rhs.education)))&&((this.address == rhs.address)||((this.address!= null)&&this.address.equals(rhs.address))))&&((this.work == rhs.work)||((this.work!= null)&&this.work.equals(rhs.work))))&&((this.topics == rhs.topics)||((this.topics!= null)&&this.topics.equals(rhs.topics))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.basicInfo == rhs.basicInfo)||((this.basicInfo!= null)&&this.basicInfo.equals(rhs.basicInfo))));
    }

}
