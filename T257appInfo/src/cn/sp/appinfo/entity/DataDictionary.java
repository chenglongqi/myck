package cn.sp.appinfo.entity;

import java.sql.Date;

public class DataDictionary {	//数据字典实体类
	private Integer id; //主键ID
	private String typeCode; //类型编码
	private String typeName; //类型名称
	private Integer valueId; //类型值ID
	private String valueName; //类型值Name
	private Integer createdBy; //创建者（来源于backend_user用户表的用户id）
	private Date creationDate; //创建时间
	private Integer modifyBy; //更新者（来源于backend_user用户表的用户id）
	private Date modifyDate; //最新更新时间
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTypeCode() {
		return typeCode;
	}
	public void setTypeCode(String typeCode) {
		this.typeCode = typeCode;
	}
	public String getTypeName() {
		return typeName;
	}
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	public Integer getValueId() {
		return valueId;
	}
	public void setValueId(Integer valueId) {
		this.valueId = valueId;
	}
	public String getValueName() {
		return valueName;
	}
	public void setValueName(String valueName) {
		this.valueName = valueName;
	}
	public Integer getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(Integer createdBy) {
		this.createdBy = createdBy;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	public Integer getModifyBy() {
		return modifyBy;
	}
	public void setModifyBy(Integer modifyBy) {
		this.modifyBy = modifyBy;
	}
	public Date getModifyDate() {
		return modifyDate;
	}
	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
	}
	
	public DataDictionary(Integer id, String typeCode, String typeName, Integer valueId, String valueName,
			Integer createdBy, Date creationDate, Integer modifyBy, Date modifyDate) {
		super();
		this.id = id;
		this.typeCode = typeCode;
		this.typeName = typeName;
		this.valueId = valueId;
		this.valueName = valueName;
		this.createdBy = createdBy;
		this.creationDate = creationDate;
		this.modifyBy = modifyBy;
		this.modifyDate = modifyDate;
	}
	
	public DataDictionary() {
		super();
	}
}
