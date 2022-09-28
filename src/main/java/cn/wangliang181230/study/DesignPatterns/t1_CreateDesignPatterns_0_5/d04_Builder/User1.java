package cn.wangliang181230.study.DesignPatterns.t1_CreateDesignPatterns_0_5.d04_Builder;

class User1 {
	// 下面是“一堆”的属性
	private String name;
	private String password;
	private String nickName;
	private int age;

	// 构造方法私有化，不然客户端就会直接调用构造方法了
	private User1(String name, String password, String nickName, int age) {
		this.name = name;
		this.password = password;
		this.nickName = nickName;
		this.age = age;
	}


	// 静态方法，用于生成一个 Builder，这个不一定要有，不过写这个方法是一个很好的习惯，
	// 有些代码要求别人写 new User.UserBuilder().a()...build() 看上去就没那么好
	public static User1Builder builder() {
		return new User1Builder();
	}


	public static class User1Builder {
		// 下面是和 User 一模一样的一堆属性
		private String name;
		private String password;
		private String nickName;
		private int age;

		private User1Builder() {
		}

		// 链式调用设置各个属性值，返回 this，即 UserBuilder
		public User1Builder name(String name) {
			this.name = name;
			return this;
		}

		public User1Builder password(String password) {
			this.password = password;
			return this;
		}

		public User1Builder nickName(String nickName) {
			this.nickName = nickName;
			return this;
		}

		public User1Builder age(int age) {
			this.age = age;
			return this;
		}

		// build() 方法负责将 UserBuilder 中设置好的属性“复制”到 User 中。
		// 当然，可以在 “复制” 之前做点检验
		public User1 build() {
			if (name == null || password == null) {
				throw new RuntimeException("用户名和密码必填");
			}
			if (age <= 0 || age >= 150) {
				throw new RuntimeException("年龄不合法");
			}
			// 还可以做赋予”默认值“的功能
			if (nickName == null) {
				nickName = name;
			}
			return new User1(name, password, nickName, age);
		}
	}
}