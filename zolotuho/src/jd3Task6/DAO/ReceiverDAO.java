package jd3Task6.DAO;

import jd3Task6.DTO.Receiver;

import java.util.List;

public interface ReceiverDAO {
    void addReceiver(Receiver receiver);

    List<Receiver> obtainReceivers();

    Receiver obtainReceiver(int id);
}
