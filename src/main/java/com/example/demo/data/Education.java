
package com.example.demo.data;

import java.util.HashMap;
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
    "school",
    "from",
    "till",
    "level"
})
@Generated("jsonschema2pojo")
public class Education {

    @JsonProperty("school")
    private String school;
    @JsonProperty("from")
    private String from;
    @JsonProperty("till")
    private String till;
    @JsonProperty("level")
    private String level;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    
    

    /**
	 * @param school
	 * @param from
	 * @param till
	 * @param level
	 */
	public Education(String school, String level, String from, String till) {
		super();
		this.school = school;
		this.from = from;
		this.till = till;
		this.level = level;
	}

	@JsonProperty("school")
    public String getSchool() {
        return school;
    }

    @JsonProperty("school")
    public void setSchool(String school) {
        this.school = school;
    }

    public Education withSchool(String school) {
        this.school = school;
        return this;
    }

    @JsonProperty("from")
    public String getFrom() {
        return from;
    }

    @JsonProperty("from")
    public void setFrom(String from) {
        this.from = from;
    }

    public Education withFrom(String from) {
        this.from = from;
        return this;
    }

    @JsonProperty("till")
    public String getTill() {
        return till;
    }

    @JsonProperty("till")
    public void setTill(String till) {
        this.till = till;
    }

    public Education withTill(String till) {
        this.till = till;
        return this;
    }

    @JsonProperty("level")
    public String getLevel() {
        return level;
    }

    @JsonProperty("level")
    public void setLevel(String level) {
        this.level = level;
    }

    public Education withLevel(String level) {
        this.level = level;
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

    public Education withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Education.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("school");
        sb.append('=');
        sb.append(((this.school == null)?"<null>":this.school));
        sb.append(',');
        sb.append("from");
        sb.append('=');
        sb.append(((this.from == null)?"<null>":this.from));
        sb.append(',');
        sb.append("till");
        sb.append('=');
        sb.append(((this.till == null)?"<null>":this.till));
        sb.append(',');
        sb.append("level");
        sb.append('=');
        sb.append(((this.level == null)?"<null>":this.level));
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
        result = ((result* 31)+((this.from == null)? 0 :this.from.hashCode()));
        result = ((result* 31)+((this.till == null)? 0 :this.till.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.school == null)? 0 :this.school.hashCode()));
        result = ((result* 31)+((this.level == null)? 0 :this.level.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Education) == false) {
            return false;
        }
        Education rhs = ((Education) other);
        return ((((((this.from == rhs.from)||((this.from!= null)&&this.from.equals(rhs.from)))&&((this.till == rhs.till)||((this.till!= null)&&this.till.equals(rhs.till))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.school == rhs.school)||((this.school!= null)&&this.school.equals(rhs.school))))&&((this.level == rhs.level)||((this.level!= null)&&this.level.equals(rhs.level))));
    }

}
