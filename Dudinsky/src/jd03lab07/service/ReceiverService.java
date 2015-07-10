package jd03lab07.service;

import jd03lab07.db.dao.ReceiverDAO;
import jd03lab07.db.dao.impl.JDBCReceiverDAOImpl;
import jd03lab07.entities.Receiver;

import java.util.List;

public class ReceiverService {

    private ReceiverDAO receiverDAO = new JDBCReceiverDAOImpl();

    public Receiver retrieveReceiver(final int num) {
        return receiverDAO.retrieveReceiver(num);
    }

    public List<Receiver> retrieveAllReceivers() {
        return receiverDAO.retrieveAllReceivers();
    }

    public int insertReceiver(final Receiver receiver) {
        return receiverDAO.insertReceiver(receiver);
    }
}