package observer;

//Ruft die Methode quack() auf.
public interface Quackable extends QuackObservable {
	public void quack();
}
