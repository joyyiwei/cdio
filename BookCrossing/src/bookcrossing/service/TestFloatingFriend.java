package bookcrossing.service;

import bookcrossing.domain.UserInfo;
import bookcrossing.service.impl.FloatingFriendImpl;

public class TestFloatingFriend {

	public static void main(String[] args) {
		FloatingFriendImpl test = new FloatingFriendImpl();
		UserInfo user = new UserInfo("yiwei", "123", "C://hello.jpg", "m", "福建", 10, "pingpong");
		//System.out.println(test.login("yiwei", "321"));
		test.modifyUserInfo(user);
		//System.out.println(test.judegNotFirst("yuanjie"));
	}
}
