package jd3Task6.service;


import jd3Task6.DAO.impl.ReceiverDAOImp;
import jd3Task6.DTO.Receiver;

import java.util.List;

public class ReceiverService {
    private ReceiverDAOImp receiverDAOImp = new ReceiverDAOImp();

    public void addReceiver(Receiver receiver) {
        receiverDAOImp.addReceiver(receiver);
    }

    public List<Receiver> obtainReceivers() {
        return receiverDAOImp.obtainReceivers();
    }

    public Receiver obtainReceiver(int id) throws IndexOutOfBoundsException {
        return receiverDAOImp.obtainReceiver(id);
    }
}

