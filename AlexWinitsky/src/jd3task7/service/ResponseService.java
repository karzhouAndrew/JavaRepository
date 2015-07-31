package jd3task7.service;

import jd3task7.dao.ReceiverDAO;
import jd3task7.dao.impl.JDBCReceiverDAOImpl;
import jd3task7.entity.Receiver;

import java.util.List;
import java.text.ParseException;

/**
 * Created by Master on 04.07.2015.
 */
public class ResponseService {
    ReceiverDAO receiverDAO = new JDBCReceiverDAOImpl();


    public List<Receiver> getReceivers() throws ClassNotFoundException {
        return receiverDAO.getReceivers();
    }

    public void addReceiver(Receiver receiver) throws ClassNotFoundException {
        receiverDAO.addReceiver(receiver);
    }
}
