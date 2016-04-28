package lab50;

import java.util.ArrayList;

public class ReceiversService {
    private ReceiverDao receiverDao = new ReceiverDaoImpl();

    public void addReceiver(Receiver receiver) throws ClassNotFoundException {
        receiverDao.addReceiver(receiver);
    }

    public ArrayList<Receiver> getReceivers() throws ClassNotFoundException {
        return receiverDao.getReceivers();
    }

    public Receiver getReceiver(int num) throws ClassNotFoundException {
        return receiverDao.getReceiver(num);
    }
}

