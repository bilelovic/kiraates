package com.bilelovic.warsh.kiraate.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * فئة القراءات و نعني بها هنا الطرق و ليس  الروايات 
 * مثلا ورش عن طريق الأصبهاني تعتبر قراءة
 * ورش عن طريق الأزرق بقصر البدل تعتبر قراءة
 *   
 * @author bmemdouh
 *
 */

@Document
public class Kiraa {

	@Id
	private String id;
	
	private String shortName;
	private String name;
	private String description;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getShortName() {
		return shortName;
	}
	public void setShortName(String shortName) {
		this.shortName = shortName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	@Override
	public String toString() {
		return "Kiraa [id=" + id + ", shortName=" + shortName + ", name=" + name + ", description=" + description + "]";
	}
	
	
}
