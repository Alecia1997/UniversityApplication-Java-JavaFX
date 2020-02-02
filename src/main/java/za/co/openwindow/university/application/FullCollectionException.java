package za.co.openwindow.university.application;


public class FullCollectionException extends Exception {
    @Override
    public String getMessage() {
        return "This student is not allowed any more subjects";
    }

    @Override
    public String toString() {
        return getMessage();
    }


}
