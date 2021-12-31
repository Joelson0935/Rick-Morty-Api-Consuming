package br.com.work.domain;

import java.util.List;

public class Location {

	private String id;
	private String name;
	private String type;
	private String dimension;
	private List<String> residents;
	private String url;
	private String created;

	public Location() {
		super();
	}

	public Location(String id, String name, String type, String dimension, List<String> residents, String url,
			String created) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.dimension = dimension;
		this.residents = residents;
		this.url = url;
		this.created = created;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDimension() {
		return dimension;
	}

	public void setDimension(String dimension) {
		this.dimension = dimension;
	}

	public List<String> getResidents() {
		return residents;
	}

	public void setResidents(List<String> residents) {
		this.residents = residents;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getCreated() {
		return created;
	}

	public void setCreated(String created) {
		this.created = created;
	}

}