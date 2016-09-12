package com.jd.cd.panda.theme;

import java.io.Serializable;
import java.util.Date;

public class AppPackage implements Serializable {

	private static final long serialVersionUID = 7365892684047975767L;
	private Integer id;

	private String appName;

	private Integer platformId;
	private String clientVersion; // svn版本，形如“ build1234”
	private String parentVersion; // 父版本的svn版本，形如“ build1234”
	private Integer upgradeStrategy;

	private Integer status;

	private String downloadPath;

	private Float size;

	private String description;

	private Date created;

	private Date modified;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getPlatformId() {
		return platformId;
	}

	public void setPlatformId(Integer platformId) {
		this.platformId = platformId;
	}

	public Integer getUpgradeStrategy() {
		return upgradeStrategy;
	}

	public void setUpgradeStrategy(Integer upgradeStrategy) {
		this.upgradeStrategy = upgradeStrategy;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getDownloadPath() {
		return downloadPath;
	}

	public void setDownloadPath(String downloadPath) {
		this.downloadPath = downloadPath;
	}

	public Float getSize() {
		return size;
	}

	public void setSize(Float size) {
		this.size = size;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public Date getModified() {
		return modified;
	}

	public void setModified(Date modified) {
		this.modified = modified;
	}

	public String getClientVersion() {
		return clientVersion;
	}

	public void setClientVersion(String clientVersion) {
		this.clientVersion = clientVersion;
	}

	@Override
	public String toString() {
		return "AppVersion{" + "id=" + id + ", appName=" + appName + ", platformId=" + platformId + ", downloadPath='"
				+ downloadPath + '\'' + ", status=" + status + '}';
	}

	public String getAppName() {
		return appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}

	public String getParentVersion() {
		return parentVersion;
	}

	public void setParentVersion(String parentVersion) {
		this.parentVersion = parentVersion;
	}
}