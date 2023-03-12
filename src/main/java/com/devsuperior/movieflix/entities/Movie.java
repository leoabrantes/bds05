package com.devsuperior.movieflix.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tb_movie")
public class Movie implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String title;
	private String subTitle;
	private Integer year;
	private String imgUrl;
	private String synopsis;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinTable(name = "tb_movie_genre",
		joinColumns = @JoinColumn(name = "movie_id"),
		inverseJoinColumns = @JoinColumn(name = "genre_id"))	
	private Set<Genre> roles = new HashSet<>();
	
	@OneToMany(mappedBy = "movie")
	private List<Review> notifications = new ArrayList<>();
	
	public Movie() {
	}

	public Movie(Long id, String title, String subTitle, Integer year, String imgUrl, String synopsis, Set<Genre> roles,
			List<Review> notifications) {
		super();
		this.id = id;
		this.title = title;
		this.subTitle = subTitle;
		this.year = year;
		this.imgUrl = imgUrl;
		this.synopsis = synopsis;
		this.roles = roles;
		this.notifications = notifications;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSubTitle() {
		return subTitle;
	}

	public void setSubTitle(String subTitle) {
		this.subTitle = subTitle;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public String getSynopsis() {
		return synopsis;
	}

	public void setSynopsis(String synopsis) {
		this.synopsis = synopsis;
	}

	public Set<Genre> getRoles() {
		return roles;
	}

	public void setRoles(Set<Genre> roles) {
		this.roles = roles;
	}

	public List<Review> getNotifications() {
		return notifications;
	}

	public void setNotifications(List<Review> notifications) {
		this.notifications = notifications;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, imgUrl, notifications, roles, subTitle, synopsis, title, year);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Movie other = (Movie) obj;
		return Objects.equals(id, other.id) && Objects.equals(imgUrl, other.imgUrl)
				&& Objects.equals(notifications, other.notifications) && Objects.equals(roles, other.roles)
				&& Objects.equals(subTitle, other.subTitle) && Objects.equals(synopsis, other.synopsis)
				&& Objects.equals(title, other.title) && Objects.equals(year, other.year);
	}

	
	
	
}
