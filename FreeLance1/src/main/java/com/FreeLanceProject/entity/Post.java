package com.FreeLanceProject.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.*;

@Entity
public class Post {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String content;

    @Lob
    private byte[] imageData;  // This field stores the image data as a byte array

	public Post(Long id, String title, String content, byte[] imageData) {
		super();
		this.id = id;
		this.title = title;
		this.content = content;
		this.imageData = imageData;
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

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public byte[] getImageData() {
		return imageData;
	}

	public void setImageData(byte[] imageData) {
		this.imageData = imageData;
	}


}
