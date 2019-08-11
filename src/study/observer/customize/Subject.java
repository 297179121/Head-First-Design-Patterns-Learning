package study.observer.customize;


public interface Subject {

    void registerObserver( Observer o );
    void removeObserver(Observer o);
    void notifyObserver();

}
