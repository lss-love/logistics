package com.lian.entity;

/**
 * 4.29 城市扩充表
 * @author Lss
 */
public class CityExpand {
	
	private int id;

	private int cityId;

	private String rangeCity;

	public CityExpand() {

	}

	public CityExpand(int id, int cityId, String rangeCity) {
		super();
		this.id = id;
		this.cityId = cityId;
		this.rangeCity = rangeCity;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCityId() {
		return cityId;
	}

	public void setCityId(int cityId) {
		this.cityId = cityId;
	}

	public String getRangeCity() {
		return rangeCity;
	}

	public void setRangeCity(String rangeCity) {
		this.rangeCity = rangeCity;
	}

	@Override
	public String toString() {
		return "CityExpand [id=" + id + ", cityId=" + cityId + ", rangeCity=" + rangeCity + "]";
	}

}
