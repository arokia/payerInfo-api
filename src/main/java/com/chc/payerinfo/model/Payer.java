package com.chc.payerinfo.model;

import javax.validation.constraints.NotBlank;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonProperty;

@Document(collection = "payer")
public class Payer {
	@Id
	private String id;
	@NotBlank
	private String name;
	private String address1;
	private String address2;
	private String city;
	private String state;
	private String zip;
	private String contactName;
	private String contactInfo;
	public enum PayerType {
        HOSTED,
        DIRECT;
    }
	private PayerType type;
	private String provider;
	private String region;
	
	
	

	public Payer(@JsonProperty("id") String id, @JsonProperty("name") String name, @JsonProperty("address1")String address1, 
			@JsonProperty("address2") String address2, @JsonProperty("city") String city, @JsonProperty("state") String state, @JsonProperty("zip")String zip,
			@JsonProperty("contactName") String contactName, @JsonProperty("contactInfo") String contactInfo, @JsonProperty("type") PayerType type,
			@JsonProperty("provider") String provider, @JsonProperty("region") String region) {
		super();
		this.id = id;
		this.name = name;
		this.address1 = address1;
		this.address2 = address2;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.contactName = contactName;
		this.contactInfo = contactInfo;
		this.type = type;
		this.provider = provider;
		this.region = region;
	}


	public String getId() {
		return id;
	}


	public String getName() {
		return name;
	}


	public String getAddress1() {
		return address1;
	}


	public String getAddress2() {
		return address2;
	}


	public String getCity() {
		return city;
	}


	public String getState() {
		return state;
	}


	public String getZip() {
		return zip;
	}


	public String getContactName() {
		return contactName;
	}


	public String getContactInfo() {
		return contactInfo;
	}


	public PayerType getType() {
		return type;
	}


	public void setId(String id) {
		this.id = id;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void setAddress1(String address1) {
		this.address1 = address1;
	}


	public void setAddress2(String address2) {
		this.address2 = address2;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public void setState(String state) {
		this.state = state;
	}


	public void setZip(String zip) {
		this.zip = zip;
	}


	public void setContactName(String contactName) {
		this.contactName = contactName;
	}


	public void setContactInfo(String contactInfo) {
		this.contactInfo = contactInfo;
	}


	public void setType(PayerType type) {
		this.type = type;
	}
	
	public String getProvider() {
		return provider;
	}


	public void setProvider(String provider) {
		this.provider = provider;
	}


	public String getRegion() {
		return region;
	}


	public void setRegion(String region) {
		this.region = region;
	}
	
	

}
