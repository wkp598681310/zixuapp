package com.zixuapp.entity;

public class WechatAuthorizer {

	private int id;
	private String appid;
	private String refreshToken;
	private String nickName;
	private String headImg;
	private String serviceTypeInfo;
	private String verifyTypeInfo;
	private String userName;
	private String signature;
	private String principalName;
	private String alias;
	private String qrcodeUrl;
	private boolean isMiniApp;
	private String funcInfo;
	private boolean status;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAppid() {
		return appid;
	}
	public void setAppid(String appid) {
		this.appid = appid;
	}
	public String getRefreshToken() {
		return refreshToken;
	}
	public void setRefreshToken(String refreshToken) {
		this.refreshToken = refreshToken;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getHeadImg() {
		return headImg;
	}
	public void setHeadImg(String headImg) {
		this.headImg = headImg;
	}
	public String getServiceTypeInfo() {
		return serviceTypeInfo;
	}
	public void setServiceTypeInfo(String serviceTypeInfo) {
		this.serviceTypeInfo = serviceTypeInfo;
	}
	public String getVerifyTypeInfo() {
		return verifyTypeInfo;
	}
	public void setVerifyTypeInfo(String verifyTypeInfo) {
		this.verifyTypeInfo = verifyTypeInfo;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getSignature() {
		return signature;
	}
	public void setSignature(String signature) {
		this.signature = signature;
	}
	public String getPrincipalName() {
		return principalName;
	}
	public void setPrincipalName(String principalName) {
		this.principalName = principalName;
	}
	public String getAlias() {
		return alias;
	}
	public void setAlias(String alias) {
		this.alias = alias;
	}
	public String getQrcodeUrl() {
		return qrcodeUrl;
	}
	public void setQrcodeUrl(String qrcodeUrl) {
		this.qrcodeUrl = qrcodeUrl;
	}
	public boolean isMiniApp() {
		return isMiniApp;
	}
	public void setMiniApp(boolean isMiniApp) {
		this.isMiniApp = isMiniApp;
	}
	public String getFuncInfo() {
		return funcInfo;
	}
	public void setFuncInfo(String funcInfo) {
		this.funcInfo = funcInfo;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	

}
