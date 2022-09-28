package cn.wangliang181230.study.DesignPatterns.t1_CreateDesignPatterns_0_5.d04_Builder;

import lombok.Builder;

@Builder
class User2 {
	// 下面是“一堆”的属性
	private String name;
	private String password;
	private String nickName;
	private int age;

	// 构造方法私有化，不然客户端就会直接调用构造方法了
	private User2(String name, String password, String nickName, int age) {
		this.name = name;
		this.password = password;
		this.nickName = nickName;
		this.age = age;
	}

	public static class User2Builder {
		private String name;
		private String password;
		private String nickName;
		private int age;

		public User2 build() {
			return new User2(this.name, this.password, this.nickName, 0);
		}

		public String toString() {
			return "User2.User2Builder(name=" + this.name + ", password=" + this.password + ", nickName=" + this.nickName + ", age=" + this.age + ")";
		}
	}
}