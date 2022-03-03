package metodosGenericos;

public class SafeBox<T, K> {
	
	T info;
	K password;
	
	public SafeBox(T info, K password) {
		this.info = info;
		this.password = password;
	}
	
	public T getInfo(K password) {
		if(this.password.equals(password)) {
			return info;
		} else {
			return null;
		}
	}

}
