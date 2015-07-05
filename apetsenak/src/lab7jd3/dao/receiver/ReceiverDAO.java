package lab7jd3.dao.receiver;


import lab7jd3.entities.Receiver;

import java.util.List;

public interface ReceiverDAO {
    public void addReceiver(Receiver receiver);

    public List<Receiver> getReceivers();
}
