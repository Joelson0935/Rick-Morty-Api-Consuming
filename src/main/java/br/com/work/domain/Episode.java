package br.com.work.domain;

import java.util.List;

public class Episode {

	private String id;
	private String name;
	private String air_date;
	private String episode;
	private List<String> characters;
	private String url;
	private String created;

	public Episode() {
		super();
	}

	public Episode(String id, String name, String air_date, String episode, List<String> characters, String url,
			String created) {
		super();
		this.id = id;
		this.name = name;
		this.air_date = air_date;
		this.episode = episode;
		this.characters = characters;
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

	public String getAir_date() {
		return air_date;
	}

	public void setAir_date(String air_date) {
		this.air_date = air_date;
	}

	public String getEpisode() {
		return episode;
	}

	public void setEpisode(String episode) {
		this.episode = episode;
	}

	public List<String> getCharacters() {
		return characters;
	}

	public void setCharacters(List<String> characters) {
		this.characters = characters;
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
