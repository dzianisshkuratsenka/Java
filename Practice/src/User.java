public class User {

	String name;
	short age;
	int height;

	// напишите ваш код здесь
	public User( String name,short age, int height) {
		
		this.name = name;
		this.age = age;
		this.height = height;
	}

	public User(short age, int height, String name) {
		this.age = age;
		this.height = height;
		this.name = name;
	}

	public User(int height, String name, short age) {
		this.height = height;
		this.name = name;
		this.age = age;
	}

	public User(int height, short age, String name) {
		this.height = height;
		this.age = age;
		this.name = name;

	}

	public User(String name, int height, short age) {
		this.name = name;
		this.height = height;
		this.age = age;
	}

	public User(short age, String name, int height) {
		this.age = age;
		this.name = name;
		this.height = height;
	}

	/*
	 * Вы создаете базу данных пользователей для сайта знакомств. Да вот беда — вы
	 * подзабыли в каком порядке их нужно указывать, а технического задания под
	 * рукой нет. Спроектируйте класс User, у которого будут поля — имя (String)
	 * возраст (short) и рост (int). Создайте для него неоходимое количество
	 * конструкторов, чтобы имя, возраст и рост можно было указывать в любом
	 * порядке.
	 * 
	 */
	public static void main(String[] args) {

		User John = new User((short) 23, 187, "John");
		User Ali = new User("Ali", (short) 3, 180);
		User Hey = new User(172, "Hey", (short) 32);

		System.out.println(John.name + " " + John.age + " лет" + " рост " + John.height);
		System.out.println(Hey.name + " " + Hey.age + " лет" + " рост " + Hey.height);
		System.out.println(Ali.name + " " + Ali.age + " лет" + " рост " + Ali.height);

	}

}