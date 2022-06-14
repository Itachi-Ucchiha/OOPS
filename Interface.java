interface Iplayer{
	void walk();
	void run();
	void jump();    // is same as abstract public void jump();
	void punch();
	void kick();
	void superkick();
}
interface IExtraPower{  
	void invisible();
}

abstract class CommonFeatures implements Iplayer{     // common features are initialized here
	public void walk() {
		
	}
	public void run() {
		
	}
	public void jump() {
	}
}

class King extends CommonFeatures implements Iplayer, IExtraPower{    // Java can use multiple interfaces

	@Override
	public void punch() {
	}

	@Override
	public void kick() {
	}

	@Override
	public void superkick() {
	}

	@Override
	public void invisible() {	
	}
	
}

class Law extends CommonFeatures implements Iplayer, IExtraPower{

	@Override
	public void invisible() {

	}

	@Override
	public void punch() {
	}

	@Override
	public void kick() {
	}

	@Override
	public void superkick() {	
	}
	 
}
public class InterfaceDemo {

	public static void main(String[] args) {	
	}

}
