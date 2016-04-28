package lab50;

import java.util.ArrayList;

public interface ReceiverDao {
    Receiver getReceiver(int num) throws ClassNotFoundException;

    ArrayList<Receiver> getReceivers() throws ClassNotFoundException;

    void addReceiver(Receiver receiver) throws ClassNotFoundException;
}
