package codecademy.collections.takeoutproject;

public interface IntUserInputRetriever <T>{
    public T produceOutputOnUserInput(int selection) throws IllegalArgumentException;
}
