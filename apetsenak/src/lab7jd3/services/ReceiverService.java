package lab7jd3.services;


import lab7jd3.dao.receiver.ReceiverDAO;
import lab7jd3.dao.receiver.impl.ReceiverDAOImpl;
import lab7jd3.entities.Receiver;

import java.util.List;

public class ReceiverService {
    private ReceiverDAO receiverDAO = new ReceiverDAOImpl();

    public void addReceiver(Receiver receiver) {
        receiverDAO.addReceiver(receiver);
    }

    public List<Receiver> getReceivers() {
        return receiverDAO.getReceivers();
    }
}
