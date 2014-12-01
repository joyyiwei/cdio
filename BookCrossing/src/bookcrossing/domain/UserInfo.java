/**
 * 
 */
package bookcrossing.domain;

/**
 * 用户信息
 * @author 林燕  2014-11-25
 * 
 */
public class UserInfo {
	
	/** 用户名 */
	private String userName;
	
	/** 密码 */
	private String password;
	
	/** 头像的URL */
	private String iconUrl;
	
	/** 性别 */
	private String sex;
	
	/** 地址 */
	private String address;
	
	/** 积分 */
	private int integral;
	
	/** 爱好 */
	private String hobbies;
	
	public UserInfo(){
		
	}
	
	public UserInfo(String username, String password){
		this.userName = username;
		this.password = password;
		this.iconUrl = "";
		this.sex = "";
		this.address = "";
		this.integral = 0;
		this.hobbies = "";
	}

	public UserInfo(String userName, String password, String iconUrl,
			String sex, String address, int integral, String hobbies) {
		this.userName = userName;
		this.password = password;
		this.iconUrl = iconUrl;
		this.sex = sex;
		this.address = address;
		this.integral = integral;
		this.hobbies = hobbies;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getIconUrl() {
		return iconUrl;
	}

	public void setIconUrl(String iconUrl) {
		this.iconUrl = iconUrl;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getIntegral() {
		return integral;
	}

	public void setIntegral(int integral) {
		this.integral = integral;
	}

	public String getHobbies() {
		return hobbies;
	}

	public void setHobbies(String hobbies) {
		this.hobbies = hobbies;
	}
	
     
}
