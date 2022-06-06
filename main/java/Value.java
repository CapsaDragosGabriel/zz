public interface Value {
    int value = 0;
    void processValue();
    default void setValue(int value){
    }
}
