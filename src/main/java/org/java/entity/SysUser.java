package org.java.entity;

import java.io.Serializable;

public class SysUser implements Serializable {
    private Integer id;

    private String loginAccount;

    private String userName;

    private String loginPassword;

    private Long createTime;

    private Byte isActive;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLoginAccount() {
        return loginAccount;
    }

    public void setLoginAccount(String loginAccount) {
        this.loginAccount = loginAccount;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getLoginPassword() {
        return loginPassword;
    }

    public void setLoginPassword(String loginPassword) {
        this.loginPassword = loginPassword;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public Byte getIsActive() {
        return isActive;
    }

    public void setIsActive(Byte isActive) {
        this.isActive = isActive;
    }

	@Override
	public String toString() {
		return "SysUser [id=" + id + ", loginAccount=" + loginAccount + ", userName=" + userName + ", loginPassword="
				+ loginPassword + ", createTime=" + createTime + ", isActive=" + isActive + "]";
	}
    
    
}