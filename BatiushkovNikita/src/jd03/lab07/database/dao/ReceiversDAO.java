package jd03.lab07.database.dao;

import jd03.lab07.entity.Receiver;

import java.util.List;

public interface ReceiversDAO {
    Receiver getReceiver(int num);
    List<Receiver> getReceivers();
    int addReceiver(Receiver receiver);
}
