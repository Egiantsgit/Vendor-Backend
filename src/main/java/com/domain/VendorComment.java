package com.domain;



import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "vendor_comments")
public class VendorComment {
	@Id
	@Column(name = "comment_id")
	private int comment_id;
	@Column(name = "vendor_id")
	private int vendor_id;
	@Column(name = "vendor_comments")
	private String vendor_comments;
	@Column(name = "commented_by")
	private String commented_by;
	@Column(name = "Comment_date")
    @Temporal(TemporalType.DATE)
	private Date Comment_date;

	public int getComment_id() {
		return comment_id;
	}

	public void setComment_id(int comment_id) {
		this.comment_id = comment_id;
	}

	public int getVendor_id() {
		return vendor_id;
	}

	public void setVendor_id(int vendor_id) {
		this.vendor_id = vendor_id;
	}

	public String getVendor_comments() {
		return vendor_comments;
	}

	public void setVendor_comments(String vendor_comments) {
		this.vendor_comments = vendor_comments;
	}

	public String getCommented_by() {
		return commented_by;
	}

	public void setCommented_byl(String commented_by) {
		this.commented_by = commented_by;
	}

	public Date getComment_date() {
		return Comment_date;
	}

	public void setComment_date(Date comment_date) {
		Comment_date = comment_date;
	}
}
