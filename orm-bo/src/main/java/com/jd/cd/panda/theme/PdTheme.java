package com.jd.cd.panda.theme;

import java.util.Date;

/**
 * @author： CD-YEQ
 * @date： 2015年12月8日 下午2:38:31
 * @desc： 表PD_THEME
 */
public class PdTheme {

	private int id;

	private String name;

	private String description;

	private int type;

	private int style_type;

	private int status;

	private String icon_path;

	private int user_id;

	private String version;

	private Date gmt_modified;

	private Date gmt_create;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public int getStyle_type() {
		return style_type;
	}

	public void setStyle_type(int style_type) {
		this.style_type = style_type;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getIcon_path() {
		return icon_path;
	}

	public void setIcon_path(String icon_path) {
		this.icon_path = icon_path;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public Date getGmt_modified() {
		return gmt_modified;
	}

	public void setGmt_modified(Date gmt_modified) {
		this.gmt_modified = gmt_modified;
	}

	public Date getGmt_create() {
		return gmt_create;
	}

	public void setGmt_create(Date gmt_create) {
		this.gmt_create = gmt_create;
	}


	
}
