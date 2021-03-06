package com.zafar.ImageUsingHibernate;

import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name = "file_INf")
public class FileInfo {
	@Id
	private int id;
	@Column(length =30,name="File_name" )
	private String fileName;
	@Lob

	private byte[] image;
	public byte[] getImage() {
		return image;
	}
	public void setImage(byte[] image) {
		this.image = image;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	@Override
	public String toString() {
		return "FileInfo [id=" + id + ", fileName=" + fileName + ", file=" + Arrays.toString(image) + "]";
	}
	
	

}
