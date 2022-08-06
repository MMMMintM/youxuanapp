package cn.edu.guet.youxuanapp.bean;

import java.util.List;

/**
 * @Author Liwei
 * @Date 2021-08-13 17:38
 */
public class SysMenu /* extends cn.edu.guet.youxuanapp.bean.BaseModel */{
	private Integer id;
	private String name;
	private Integer parentId;
	private String url;
	private String perms;
	private Integer type;
	private String icon;
	private Integer orderNum;
	private Boolean show;

	// 非数据库字段
	private String parentName;
	// 非数据库字段
	private Integer level;
	// 非数据库字段
	private List<SysMenu> children;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getParentId() {
		return parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getPerms() {
		return perms;
	}

	public void setPerms(String perms) {
		this.perms = perms;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public Integer getOrderNum() {
		return orderNum;
	}

	public void setOrderNum(int orderNum) {
		this.orderNum = orderNum;
	}

	public Boolean getShow() {
		return show;
	}

	public void setShow(Boolean show) {
		this.show = show;
	}

	public List<SysMenu> getChildren() {
		return children;
	}

	public void setChildren(List<SysMenu> children) {
		this.children = children;
	}

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	public String getParentName() {
		return parentName;
	}

	public void setParentName(String parentName) {
		this.parentName = parentName;
	}
}