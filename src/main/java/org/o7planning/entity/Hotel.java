package org.o7planning.entity;
// Generated Dec 29, 2015 2:09:12 PM by Hibernate Tools 4.3.1.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Hotel generated by hbm2java
 */
@Entity
@Table(name = "hotel", schema = "public")
public class Hotel{

	private int idhotel;
	private String namehotel;
	private String namelocal;
	private String namecity;
	private Integer countreview;
	private Integer rank;
	private Float star;
	private String description;
	private String phone;
	private String website;
	private String address;
	private String email;
	private String status;
	private Integer quantityroom;
	private String cooperation1;
	private String cooperation2;
	private String cooperation3;
	private String cooperation4;
	private String cooperation5;
	private String cooperation6;

	public Hotel() {
	}

	public Hotel(int idhotel) {
		this.idhotel = idhotel;
	}

	public Hotel(int idhotel, String namehotel, String namelocal, String namecity, Integer countreview, Integer rank,
			Float star, String description, String phone, String website, String address, String email, String status,
			Integer quantityroom, String cooperation1, String cooperation2, String cooperation3, String cooperation4,
			String cooperation5, String cooperation6) {
		this.idhotel = idhotel;
		this.namehotel = namehotel;
		this.namelocal = namelocal;
		this.namecity = namecity;
		this.countreview = countreview;
		this.rank = rank;
		this.star = star;
		this.description = description;
		this.phone = phone;
		this.website = website;
		this.address = address;
		this.email = email;
		this.status = status;
		this.quantityroom = quantityroom;
		this.cooperation1 = cooperation1;
		this.cooperation2 = cooperation2;
		this.cooperation3 = cooperation3;
		this.cooperation4 = cooperation4;
		this.cooperation5 = cooperation5;
		this.cooperation6 = cooperation6;
	}

	@Id

	@Column(name = "idhotel", unique = true, nullable = false)
	public int getIdhotel() {
		return this.idhotel;
	}

	public void setIdhotel(int idhotel) {
		this.idhotel = idhotel;
	}

	@Column(name = "namehotel")
	public String getNamehotel() {
		return this.namehotel;
	}

	public void setNamehotel(String namehotel) {
		this.namehotel = namehotel;
	}

	@Column(name = "namelocal")
	public String getNamelocal() {
		return this.namelocal;
	}

	public void setNamelocal(String namelocal) {
		this.namelocal = namelocal;
	}

	@Column(name = "namecity")
	public String getNamecity() {
		return this.namecity;
	}

	public void setNamecity(String namecity) {
		this.namecity = namecity;
	}

	@Column(name = "countreview")
	public Integer getCountreview() {
		return this.countreview;
	}

	public void setCountreview(Integer countreview) {
		this.countreview = countreview;
	}

	@Column(name = "rank")
	public Integer getRank() {
		return this.rank;
	}

	public void setRank(Integer rank) {
		this.rank = rank;
	}

	@Column(name = "star", precision = 8, scale = 8)
	public Float getStar() {
		return this.star;
	}

	public void setStar(Float star) {
		this.star = star;
	}

	@Column(name = "description")
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "phone")
	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Column(name = "website")
	public String getWebsite() {
		return this.website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	@Column(name = "address")
	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Column(name = "email")
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "status")
	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Column(name = "quantityroom")
	public Integer getQuantityroom() {
		return this.quantityroom;
	}

	public void setQuantityroom(Integer quantityroom) {
		this.quantityroom = quantityroom;
	}

	@Column(name = "cooperation1")
	public String getCooperation1() {
		return this.cooperation1;
	}

	public void setCooperation1(String cooperation1) {
		this.cooperation1 = cooperation1;
	}

	@Column(name = "cooperation2")
	public String getCooperation2() {
		return this.cooperation2;
	}

	public void setCooperation2(String cooperation2) {
		this.cooperation2 = cooperation2;
	}

	@Column(name = "cooperation3")
	public String getCooperation3() {
		return this.cooperation3;
	}

	public void setCooperation3(String cooperation3) {
		this.cooperation3 = cooperation3;
	}

	@Column(name = "cooperation4")
	public String getCooperation4() {
		return this.cooperation4;
	}

	public void setCooperation4(String cooperation4) {
		this.cooperation4 = cooperation4;
	}

	@Column(name = "cooperation5")
	public String getCooperation5() {
		return this.cooperation5;
	}

	public void setCooperation5(String cooperation5) {
		this.cooperation5 = cooperation5;
	}

	@Column(name = "cooperation6")
	public String getCooperation6() {
		return this.cooperation6;
	}

	public void setCooperation6(String cooperation6) {
		this.cooperation6 = cooperation6;
	}

}