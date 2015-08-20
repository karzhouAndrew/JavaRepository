package jd03.lab07.service;

import jd03.lab07.database.dao.ReceiversDAO;
import jd03.lab07.database.dao.ReceiversDAOImpl;
import jd03.lab07.entity.Receiver;

import java.util.List;

public class ReceiverService {
    ReceiversDAO receiversDAO = new ReceiversDAOImpl();

    public Receiver getReceiver(int num) {
        return receiversDAO.getReceiver(num);
    }

    public List<Receiver> getReceivers() {
        return receiversDAO.getReceivers();
    }

    public int addReceiver(Receiver receiver) {
        return receiversDAO.addReceiver(receiver);
    }

}
