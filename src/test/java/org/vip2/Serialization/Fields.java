package org.vip2.Serialization;

public class Fields {

	private Project project;
	private String summary;
	private String description;
	private IssueType issuetype;
	public void setProject(Project project) {
		this.project = project;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public void setIssuetype(IssueType issuetype) {
		this.issuetype = issuetype;
	}
	public Project getProject() {
		return project;
	}
	public String getSummary() {
		return summary;
	}
	public String getDescription() {
		return description;
	}
	public IssueType getIssuetype() {
		return issuetype;
	}
	
}
